/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.HoaDon;

/**
 *
 * @author ADMIN
 */
public interface IHoaDonDAO {
    int save(HoaDon hoaDon);
    
    HoaDon findByThongTinDatVe(int idTTDV);
}
