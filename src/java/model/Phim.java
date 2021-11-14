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
public class Phim {
    private int id;
    private String tenPhim;
    private int namSX;
    private String theLoai;
    private String dienVien;
    private String moTa;
    private String nuocSanXuat;
    private String thumb;
    private Date ngayCongChieu;
    private float diemDanhGia;

    public Phim() {
    }

    public Phim(int id, String tenPhim, int namSX, String theLoai, String dienVien, String moTa, String nuocSanXuat, String thumb, Date ngayCongChieu, float diemDanhGia) {
        this.id = id;
        this.tenPhim = tenPhim;
        this.namSX = namSX;
        this.theLoai = theLoai;
        this.dienVien = dienVien;
        this.moTa = moTa;
        this.nuocSanXuat = nuocSanXuat;
        this.thumb = thumb;
        this.ngayCongChieu = ngayCongChieu;
        this.diemDanhGia = diemDanhGia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getDienVien() {
        return dienVien;
    }

    public void setDienVien(String dienVien) {
        this.dienVien = dienVien;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNuocSanXuat() {
        return nuocSanXuat;
    }

    public void setNuocSanXuat(String nuocSanXuat) {
        this.nuocSanXuat = nuocSanXuat;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Date getNgayCongChieu() {
        return ngayCongChieu;
    }

    public void setNgayCongChieu(Date ngayCongChieu) {
        this.ngayCongChieu = ngayCongChieu;
    }

    public float getDiemDanhGia() {
        return diemDanhGia;
    }

    public void setDiemDanhGia(float diemDanhGia) {
        this.diemDanhGia = diemDanhGia;
    }
    
    
    
}
