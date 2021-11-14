/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.imp;

import dao.ILichChieuDAO;
import java.util.Date;
import java.util.List;
import model.LichChieu;

/**
 *
 * @author ADMIN
 */
public class LichChieuDAO extends DAO implements ILichChieuDAO {

    @Override
    public List<LichChieu> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LichChieu> findByTimeAndPhim(Date time, int idPhim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LichChieu> findByPhongChieuAndNgay(int idPhongChieu, Date ngay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void autoGenerateLichChieuForPhongChieuByDay(int idPhongChieu, Date ngay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(LichChieu lichChieu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
