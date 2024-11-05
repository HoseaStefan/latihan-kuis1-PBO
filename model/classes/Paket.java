package model.classes;

import model.enumeration.*;;

public abstract class Paket {
    private TipeModaTransportasi tipeModaTransportasi;
    private TipeBarang tipeBarang;
    private double beratPaket;
    private double totalHarga;

    public Paket(){
        
    }

    public Paket(TipeModaTransportasi tipeModaTransportasi, TipeBarang tipeBarang, double beratPaket) {
        this.tipeModaTransportasi = tipeModaTransportasi;
        this.tipeBarang = tipeBarang;
        this.beratPaket = beratPaket;
       
    }

    public TipeModaTransportasi getTipeModaTransportasi() {
        return tipeModaTransportasi;
    }

    public void setTipeModaTransportasi(TipeModaTransportasi tipeModaTransportasi) {
        this.tipeModaTransportasi = tipeModaTransportasi;
    }

    public TipeBarang getTipeBarang() {
        return tipeBarang;
    }

    public void setTipeBarang(TipeBarang tipeBarang) {
        this.tipeBarang = tipeBarang;
    }

    public double getBeratPaket() {
        return beratPaket;
    }

    public void setBeratPaket(double beratPaket) {
        this.beratPaket = beratPaket;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

}