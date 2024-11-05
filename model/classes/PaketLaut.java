package model.classes;

import model.enumeration.TipeBarang;
import model.enumeration.TipeModaTransportasi;

public class PaketLaut extends Paket {
    private double panjang;
    private double lebar;
    private double tinggi;
    private boolean asuransi;

    public PaketLaut(TipeModaTransportasi tipeModaTransportasi, TipeBarang tipeBarang, double beratPaket, double panjang, double lebar, double tinggi, boolean asuransi) {
        super(tipeModaTransportasi, tipeBarang, beratPaket);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.asuransi = asuransi;
    }

    public PaketLaut(double panjang, double lebar, double tinggi, boolean asuransi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.asuransi = asuransi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public boolean isAsuransi() {
        return asuransi;
    }

    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }
}
