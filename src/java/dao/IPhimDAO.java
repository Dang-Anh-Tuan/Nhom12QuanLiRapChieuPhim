/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Phim;

/**
 *
 * @author ADMIN
 */
public interface IPhimDAO {
    List<Phim> findAll();
    
    Phim findByID(int id);
    
    int save(Phim phim);
    
    int update(Phim phim);
    
    void delete(int id);
    
    List<Phim> findByTenPhim(String tenPhim);
}
