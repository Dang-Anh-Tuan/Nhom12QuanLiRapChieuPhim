/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    private int id;
    private ThongTinDatVe ttdv;
    private int thanhTien;

    public HoaDon() {
    }

    public HoaDon(int id, ThongTinDatVe ttdv, int thanhTien) {
        this.id = id;
        this.ttdv = ttdv;
        this.thanhTien = thanhTien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ThongTinDatVe getTtdv() {
        return ttdv;
    }

    public void setTtdv(ThongTinDatVe ttdv) {
        this.ttdv = ttdv;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    
}
