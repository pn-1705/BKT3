package com.example.bkt3_vophongnha;

public class TacPham {
    String name, idTg, nd;
    float sao;

    public TacPham(String name, String idTg, String nd, float sao) {
        this.idTg = idTg;
        this.nd = nd;
        this.sao = sao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdTg() {
        return idTg;
    }

    public void setIdTg(String idTg) {
        this.idTg = idTg;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public float getSao() {
        return sao;
    }

    public void setSao(float sao) {
        this.sao = sao;
    }
}
