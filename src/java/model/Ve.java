/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;

/**
 *
 * @author ADMIN
 */
public class Ve {
    private int id;
    private String tenVe;
    private final int giaVe = 60000;
    private Phim phim;
    private Ghe ghe;
    private LichChieu lichChieu;

    public Ve() {
    }

    public Ve(int id, Phim phim, Ghe ghe, LichChieu lichChieu) {
        this.id = id;
        this.tenVe = generateTenVe();
        this.phim = phim;
        this.ghe = ghe;
        this.lichChieu = lichChieu;
    }
    
    private String generateTenVe(){
        return phim.getTenPhim() 
                + "-" + lichChieu.getPhongChieu() 
                + "-" + new SimpleDateFormat("HH:mm:ss dd-MM-yyyy").format(lichChieu.getGioChieu()); 
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenVe() {
        return tenVe;
    }

    public void setTenVe(String tenVe) {
        this.tenVe = tenVe;
    }

    public Phim getPhim() {
        return phim;
    }

    public void setPhim(Phim phim) {
        this.phim = phim;
    }

    public Ghe getGhe() {
        return ghe;
    }

    public void setGhe(Ghe ghe) {
        this.ghe = ghe;
    }

    public LichChieu getLichChieu() {
        return lichChieu;
    }

    public void setLichChieu(LichChieu lichChieu) {
        this.lichChieu = lichChieu;
    }

    public int getGiaVe() {
        return giaVe;
    }
    
    
    
    
}
