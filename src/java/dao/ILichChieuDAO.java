/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Date;
import java.util.List;
import model.LichChieu;

/**
 *
 * @author ADMIN
 */
public interface ILichChieuDAO {

    List<LichChieu> findAll();

    List<LichChieu> findByTimeAndPhim(Date time, int idPhim);

    List<LichChieu> findByPhongChieuAndNgay(int idPhongChieu, Date ngay);

    void autoGenForDate(int idPhongChieu, Date ngay);

    int update(LichChieu lichChieu);

}
