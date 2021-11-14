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
public class PhongChieu {
    private int id;
    private Ghe[] ghe;

    public PhongChieu() {
    }

    public PhongChieu(int id, Ghe[] ghe) {
        this.id = id;
        this.ghe = ghe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ghe[] getGhe() {
        return ghe;
    }

    public void setGhe(Ghe[] ghe) {
        this.ghe = ghe;
    }
    
    
}
