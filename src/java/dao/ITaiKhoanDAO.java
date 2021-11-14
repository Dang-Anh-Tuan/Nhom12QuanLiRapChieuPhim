/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.TaiKhoan;

/**
 *
 * @author ADMIN
 */
public interface ITaiKhoanDAO {
    TaiKhoan findByTenDangNhap(String tenDangNhap);
    
    int save(TaiKhoan taiKhoan);
    
    List<TaiKhoan> findByThongTinDatVe(int idTTDV);
}
