/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.IHoaDonDAO;
import dao.IThongTinDatVeDAO;
import dao.IVeDAO;
import dao.imp.HoaDonDAO;
import dao.imp.ThongTinDatVeDAO;
import dao.imp.VeDAO;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import model.HoaDon;
import model.Phim;
import model.ThongTinDatVe;
import model.Ve;

/**
 *
 * @author ADMIN
 */
public class ThongKeTheoPhimService {

    private IThongTinDatVeDAO thongTinDatVeDAO;
    private IHoaDonDAO hoaDonDAO;
    private IVeDAO veDAO;

    public ThongKeTheoPhimService() {
        this.thongTinDatVeDAO = new ThongTinDatVeDAO();
        this.hoaDonDAO = new HoaDonDAO();
        this.veDAO = new VeDAO();
    }

    public HashMap<Phim, Integer> statisticByPhim(Date from, Date to) {

        HashMap<Phim, Integer> result = new HashMap<>();
        List<ThongTinDatVe> thongTinDatVes = thongTinDatVeDAO.findByDate(from, to);

        for (ThongTinDatVe ttdv : thongTinDatVes) {
            
            List<Ve> veTTDV = Arrays.asList(ttdv.getVe());

            for (Ve ve : veTTDV) {

                Phim phim = ve.getPhim();
                
                if (result.containsKey(phim)){

                    HoaDon hoaDon = hoaDonDAO.findByThongTinDatVe(ttdv.getId());

                    result.put(
                            phim,
                            result.get(phim) + ve.getGiaVe()
                    );
                } else {
                    result.put(phim, 0);
                }

            }

        }

        return result;
    }
}
