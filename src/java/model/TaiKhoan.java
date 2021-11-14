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
public class TaiKhoan {

    private int id;
    private String tenDangNhap;
    private String matKhau;
    private String email;
    private String vaiTro;
    private Date ngayTao;
    private Date ngayChinhSua;
    private KhachHang khachHang;
    private QuanLiRap quanLiRap;
    private NhanVienRap nhanVienRap;

    public TaiKhoan() {
    }

    public TaiKhoan(int id, String tenDangNhap, String matKhau, String email, String vaiTro, Date ngayTao, Date ngayChinhSua, KhachHang khachHang, QuanLiRap quanLiRap, NhanVienRap nhanVienRap) {
        this.id = id;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.email = email;
        this.vaiTro = vaiTro;
        this.ngayTao = ngayTao;
        this.ngayChinhSua = ngayChinhSua;
        this.khachHang = khachHang;
        this.quanLiRap = quanLiRap;
        this.nhanVienRap = nhanVienRap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayChinhSua() {
        return ngayChinhSua;
    }

    public void setNgayChinhSua(Date ngayChinhSua) {
        this.ngayChinhSua = ngayChinhSua;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public QuanLiRap getQuanLiRap() {
        return quanLiRap;
    }

    public void setQuanLiRap(QuanLiRap quanLiRap) {
        this.quanLiRap = quanLiRap;
    }

    public NhanVienRap getNhanVienRap() {
        return nhanVienRap;
    }

    public void setNhanVienRap(NhanVienRap nhanVienRap) {
        this.nhanVienRap = nhanVienRap;
    }

}
