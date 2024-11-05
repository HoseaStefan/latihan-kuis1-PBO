package controller;

import java.util.ArrayList;

import main.Main;
import model.classes.*;
import model.enumeration.TipeBarang;
import model.enumeration.TipePengiriman;

public class PaketController {
    public static double getTotalHarga(TipeBarang tipe, double panjang, double lebar, double tinggi, boolean asuransi) {
        double volume = panjang * lebar * tinggi;
        double harga = 0;

        if (volume <= 2500) {
            harga += 100;
        } else {
            harga += 75;
        }
        harga *= volume;

        if (tipe == TipeBarang.BERHARGA) {
            harga *= 1.05;
        }

        if (asuransi) {
            harga *= 1.015;
        }

        return harga;
    }

    public static double getTotalHarga(TipeBarang tipe, double panjang, double lebar, double tinggi,
            TipePengiriman tipePengiriman) {
        double volume = panjang * lebar * tinggi;
        double harga = 0;

        if (tipePengiriman == TipePengiriman.EKSPRES) {
            harga += 45;
        } else {
            harga += 45;
        }
        harga *= volume;

        if (tipe == TipeBarang.BERHARGA) {
            harga *= 1.05;
        }


        // wajib bayar asuransi boss
        harga *= 1.02;

        return harga;
    }

    public static double getTotalHarga(TipeBarang tipe, double berat) {
        double harga = 15000 * berat;
        if (tipe == TipeBarang.BERHARGA) {
            harga *= 1.05;
        }
        return harga;
    }

    public static double getTotal() {
        double total = 0;
        for (Paket pakets : Main.pakets) {
            int i = 1;
            double harga = pakets.getTotalHarga();
            System.out.println("Paket ke-" + i + " : " + harga);
            System.out.println("-----------------------------");
            total += harga;
            i++;
        }
        return total;
    }
}
