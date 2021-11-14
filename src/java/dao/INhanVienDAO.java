/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.NhanVienRap;

/**
 *
 * @author ADMIN
 */
public interface INhanVienDAO {
    NhanVienRap findByID(int id);
    
    List<NhanVienRap> findAll();
    
    void delete(int id);
    
    int save(NhanVienRap nhanVienRap);
    
    int update(NhanVienRap nhanVienRap);
}
