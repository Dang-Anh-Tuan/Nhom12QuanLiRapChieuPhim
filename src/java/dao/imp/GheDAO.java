/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.imp;

import dao.IGheDAO;
import java.util.List;
import model.Ghe;

/**
 *
 * @author ADMIN
 */
public class GheDAO extends DAO implements IGheDAO{

    @Override
    public Ghe findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ghe> findByPhongChieu(int idPhongChieu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
