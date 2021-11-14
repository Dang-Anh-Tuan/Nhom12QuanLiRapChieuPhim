/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.RapPhim;

/**
 *
 * @author ADMIN
 */
public interface IRapPhimDAO {
    RapPhim findByID(int id);
    
    List<RapPhim> findAll();
    
    RapPhim findByTenRap(String tenRap);
}
