/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Ve;

/**
 *
 * @author ADMIN
 */
public interface IVeDAO {
    Ve findByID(int id);
    
    List<Ve> findByThongTinDatVe(int idTTDV);
    
    List<Ve> findByLichChieu(int idLC);   
    
    void autoGenForLichChieu(int idLC);
}
