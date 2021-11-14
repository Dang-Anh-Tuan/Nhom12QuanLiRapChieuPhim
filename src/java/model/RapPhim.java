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
public class RapPhim {
    private int id;
    private String tenRap;
    private String diaChi;
    private PhongChieu[] phongChieu;

    public RapPhim() {
    }

    public RapPhim(int id, String tenRap, String diaChi, PhongChieu[] phongChieu) {
        this.id = id;
        this.tenRap = tenRap;
        this.diaChi = diaChi;
        this.phongChieu = phongChieu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenRap() {
        return tenRap;
    }

    public void setTenRap(String tenRap) {
        this.tenRap = tenRap;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public PhongChieu[] getPhongChieu() {
        return phongChieu;
    }

    public void setPhongChieu(PhongChieu[] phongChieu) {
        this.phongChieu = phongChieu;
    }
    
    
}
