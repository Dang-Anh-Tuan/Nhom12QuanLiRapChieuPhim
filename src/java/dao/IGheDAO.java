/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Ghe;

/**
 *
 * @author ADMIN
 */
public interface IGheDAO {
    Ghe findByID(int id);
    
    List<Ghe> findByPhongChieu(int idPhongChieu);
}
