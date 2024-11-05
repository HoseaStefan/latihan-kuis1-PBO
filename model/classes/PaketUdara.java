package model.classes;

import model.enumeration.*;

public class PaketUdara extends Paket {
    private double panjang;
    private double tinggi;
    private double lebar;
    private TipePengiriman tipePengiriman;

    public PaketUdara(double panjang, double tinggi, double lebar, TipePengiriman tipePengiriman) {
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
        this.tipePengiriman = tipePengiriman;
    }

    public PaketUdara(TipeModaTransportasi tipeModaTransportasi, TipeBarang tipeBarang, double beratPaket, double panjang, double tinggi, double lebar, TipePengiriman tipePengiriman) {
        super(tipeModaTransportasi, tipeBarang, beratPaket);
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
        this.tipePengiriman = tipePengiriman;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public TipePengiriman getTipePengiriman() {
        return tipePengiriman;
    }

    public void setTipePengiriman(TipePengiriman tipePengiriman) {
        this.tipePengiriman = tipePengiriman;
    }
}
