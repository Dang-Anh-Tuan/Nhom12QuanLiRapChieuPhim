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
public class ThongTinDatVe {
    private int id;
    private Ve[] ve;
    private String kieuDat;
    private String phuongThucThanhToan;
    private boolean trangThaiDatVeOnline;
    private Date thoiGianDat;
    private TaiKhoan[] taiKhoanThamGia;

    public ThongTinDatVe() {
    }

    // for online ticket
    public ThongTinDatVe(int id, Ve[] ve, String kieuDat, String phuongThucThanhToan, Date thoiGianDat, TaiKhoan[] taiKhoanThamGia) {
        this.id = id;
        this.ve = ve;
        this.kieuDat = kieuDat;
        this.phuongThucThanhToan = phuongThucThanhToan;
        this.trangThaiDatVeOnline = false;
        this.thoiGianDat = thoiGianDat;
        this.taiKhoanThamGia = taiKhoanThamGia;
    }
    
    // for offlien ticket

    public ThongTinDatVe(int id, Ve[] ve, String kieuDat, Date thoiGianDat, TaiKhoan[] taiKhoanThamGia) {
        this.id = id;
        this.ve = ve;
        this.kieuDat = kieuDat;
        this.thoiGianDat = thoiGianDat;
        this.taiKhoanThamGia = taiKhoanThamGia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ve[] getVe() {
        return ve;
    }

    public void setVe(Ve[] ve) {
        this.ve = ve;
    }

    public String getKieuDat() {
        return kieuDat;
    }

    public void setKieuDat(String kieuDat) {
        this.kieuDat = kieuDat;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public boolean isTrangThaiDatVeOnline() {
        return trangThaiDatVeOnline;
    }

    public void setTrangThaiDatVeOnline(boolean trangThaiDatVeOnline) {
        this.trangThaiDatVeOnline = trangThaiDatVeOnline;
    }

    public Date getThoiGianDat() {
        return thoiGianDat;
    }

    public void setThoiGianDat(Date thoiGianDat) {
        this.thoiGianDat = thoiGianDat;
    }

    public TaiKhoan[] getTaiKhoanThamGia() {
        return taiKhoanThamGia;
    }

    public void setTaiKhoanThamGia(TaiKhoan[] taiKhoanThamGia) {
        this.taiKhoanThamGia = taiKhoanThamGia;
    }
    
    
    
}
