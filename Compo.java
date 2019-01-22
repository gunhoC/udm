package com.example.choi.udm;

public class Compo {
    private String name;
    private int a;
    private int p;
    private int q;
    private int oee;

    public Compo(String name, int a, int p, int q, int oee) {
        this.name = name;
        this.a = a;
        this.p = p;
        this.q = q;
        this.oee = oee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public int getOee() {
        return oee;
    }

    public void setOee(int oee) {
        this.oee = oee;
    }
}
