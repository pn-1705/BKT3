package com.example.bkt3_vophongnha;

import java.io.Serializable;

public class Actor implements Serializable {
    String ten, mota, id;
    int hinhAnh;
    float sao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public float getSao() {
        return sao;
    }

    public void setSao(float sao) {
        this.sao = sao;
    }

    public Actor(String id, String ten, String mota, int hinhAnh, float sao) {
        this.ten = ten;
        this.mota = mota;
        this.hinhAnh = hinhAnh;
        this.sao = sao;
    }

}
