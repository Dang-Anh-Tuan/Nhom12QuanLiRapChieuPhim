/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.IHoaDonDAO;
import dao.IThongTinDatVeDAO;
import dao.imp.HoaDonDAO;
import dao.imp.ThongTinDatVeDAO;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import model.HoaDon;
import model.KhachHang;
import model.TaiKhoan;
import model.ThongTinDatVe;

/**
 *
 * @author ADMIN
 */
public class ThongKeTheoKhachService {

    private IThongTinDatVeDAO thongTinDatVeDAO;
    private IHoaDonDAO hoaDonDAO;

    public ThongKeTheoKhachService() {
        this.thongTinDatVeDAO = new ThongTinDatVeDAO();
        this.hoaDonDAO = new HoaDonDAO();
    }

    public HashMap<KhachHang, Integer> statisticByKhach(Date from, Date to) {
        
        HashMap<KhachHang, Integer> result = new HashMap<>();
        List<ThongTinDatVe> thongTinDatVes = thongTinDatVeDAO.findByDate(from, to);

        for (ThongTinDatVe ttdv : thongTinDatVes) {
            
            List<TaiKhoan> taiKhoangTTDV = Arrays.asList(ttdv.getTaiKhoanThamGia());
            
            for (TaiKhoan tk : taiKhoangTTDV) {
                if (tk.getVaiTro().equals("KhachHang")) {
                    
                    KhachHang khachHang = tk.getKhachHang();
                    
                    if (result.containsKey(khachHang)) {
                        
                        HoaDon hoaDon = hoaDonDAO.findByThongTinDatVe(ttdv.getId());
                        
                        result.put(
                                khachHang, 
                                result.get(khachHang) + hoaDon.getThanhTien()
                        );
                    } else {
                        result.put(khachHang, 0);
                    }
                }

            }
        }

        return result;
    }
        
}
