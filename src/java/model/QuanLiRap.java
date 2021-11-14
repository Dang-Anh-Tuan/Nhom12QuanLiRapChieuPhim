/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class QuanLiRap extends Nguoi{
    int id;

    public QuanLiRap() {
    }

    public QuanLiRap(int id, int idNguoi, String hoTen, Date ngaySinh, String diaChi, String sdt) {
        super(idNguoi, hoTen, ngaySinh, diaChi, sdt);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
    
    
}
