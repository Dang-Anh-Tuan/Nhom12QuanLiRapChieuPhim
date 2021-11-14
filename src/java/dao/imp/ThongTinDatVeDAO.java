/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.imp;

import dao.IThongTinDatVeDAO;
import java.util.Date;
import java.util.List;
import model.ThongTinDatVe;

/**
 *
 * @author ADMIN
 */
public class ThongTinDatVeDAO implements IThongTinDatVeDAO{

    @Override
    public ThongTinDatVe findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int save(ThongTinDatVe thongTinDatVe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateTrangThai(int idTTDV) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ThongTinDatVe> findByDate(Date from, Date to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
