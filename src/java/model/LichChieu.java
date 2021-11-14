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
public class LichChieu {
    private int id;
    private Date gioChieu;
    private PhongChieu phongChieu;
    private Phim phim;

    public LichChieu() {
    }

    public LichChieu(int id, Date gioChieu, PhongChieu phongChieu, Phim phim) {
        this.id = id;
        this.gioChieu = gioChieu;
        this.phongChieu = phongChieu;
        this.phim = phim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getGioChieu() {
        return gioChieu;
    }

    public void setGioChieu(Date gioChieu) {
        this.gioChieu = gioChieu;
    }

    public PhongChieu getPhongChieu() {
        return phongChieu;
    }

    public void setPhongChieu(PhongChieu phongChieu) {
        this.phongChieu = phongChieu;
    }

    public Phim getPhim() {
        return phim;
    }

    public void setPhim(Phim phim) {
        this.phim = phim;
    }
    
    
}
