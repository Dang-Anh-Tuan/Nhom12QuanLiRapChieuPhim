/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Date;
import java.util.List;
import model.ThongTinDatVe;

/**
 *
 * @author ADMIN
 */
public interface IThongTinDatVeDAO {
    ThongTinDatVe findByID(int id);
    
    int save(ThongTinDatVe thongTinDatVe);
    
    int updateTrangThai(int idTTDV);
    
    List<ThongTinDatVe> findByDate(Date from, Date to);
}
