package view;

import java.util.Scanner;

import controller.PaketController;
import main.Main;
import model.classes.*;
import model.enumeration.*;

public class MainMenu {

    static Scanner scan = new Scanner(System.in);

    public MainMenu() {
        showMenu();
    }

    public void showMenu() {
        boolean lanjut = true;

        while (lanjut) {
            try {
                new ShowMenuModaTransportasi();
                System.out.print("Input : ");
                int inputModaTransportasi = Integer.parseInt(scan.nextLine());

                System.out.print("Apakah barang anda termasuk barang berharga? (true/false) : ");
                boolean barangBerharga = Boolean.parseBoolean(scan.nextLine());

                TipeModaTransportasi pengirimanPilihan = TipeModaTransportasi.getModa(inputModaTransportasi);
                TipeBarang barangPilihan = TipeBarang.getTipe(barangBerharga);

                switch (pengirimanPilihan) {
                    case DARAT:
                        Main.pakets.add(MenuPaketDarat(pengirimanPilihan, barangPilihan, menuInputBerat()));
                        break;
                    case LAUT:
                        Main.pakets.add(MenuPaketLaut(pengirimanPilihan, barangPilihan, menuInputBerat(), menuInputPanjang(), menuInputLebar(), menuInputTinggi(), menuInputAsuransi()));
                        break;
                    case UDARA:
                        Main.pakets.add(MenuPaketUdara(pengirimanPilihan, barangPilihan, menuInputBerat(), menuInputPanjang(), menuInputTinggi(), menuInputLebar()));
                        break;

                    default:
                        break;
                }

                System.out.print("Masih ingin lanjut? (true/false) : ");
                if (!Boolean.parseBoolean(scan.nextLine())) {
                    lanjut = false;
                }
            } catch (Exception e) {
                System.out.println("Input Error!");
            }
        }

        new ShowTotalHarga();

    }
    public Paket MenuPaketDarat(TipeModaTransportasi tipeModaTransportasi, TipeBarang tipeBarang, double berat){
        Paket paketDarat = new PaketDarat(tipeModaTransportasi, tipeBarang, berat);
        paketDarat.setTotalHarga(PaketController.getTotalHarga(tipeBarang, berat));
        return paketDarat;

    }
    
    public Paket MenuPaketLaut(TipeModaTransportasi tipeModaTransportasi, TipeBarang tipeBarang, double berat, double panjang, double lebar, double tinggi, boolean asuransi){
        Paket paketLaut = new PaketLaut(tipeModaTransportasi, tipeBarang, berat, panjang, lebar, tinggi, asuransi);
        paketLaut.setTotalHarga(PaketController.getTotalHarga(tipeBarang, panjang, lebar, tinggi, asuransi));
        return paketLaut;
    }
    public Paket MenuPaketUdara(TipeModaTransportasi tipeModaTransportasi, TipeBarang tipeBarang, double berat, double panjang, double tinggi, double lebar){
        new ShowMenuTipePengiriman();
        System.out.print("Input : ");
        TipePengiriman pengiriman = TipePengiriman.getTipePengiriman(Integer.parseInt(scan.nextLine()));
        Paket paketUdara = new PaketUdara(tipeModaTransportasi, tipeBarang, berat, panjang, tinggi, lebar, pengiriman);
        paketUdara.setTotalHarga(PaketController.getTotalHarga(tipeBarang, panjang, lebar, tinggi, pengiriman));;
        return paketUdara;
    }

    public double menuInputBerat(){
        System.out.print("Masukan berat : ");
        return Double.parseDouble(scan.nextLine());
    }

    public double menuInputPanjang(){
        System.out.print("Masukan panjang : ");
        return Double.parseDouble(scan.nextLine());
    }

    public double menuInputLebar(){
        System.out.print("Masukan lebar : ");
        return Double.parseDouble(scan.nextLine());
    }

    public double menuInputTinggi(){
        System.out.print("Masukan tinggi : ");
        return Double.parseDouble(scan.nextLine());
    }

    public boolean menuInputAsuransi(){
        System.out.print("Masukan Asuransi (true/false) : ");
        return Boolean.parseBoolean(scan.nextLine());
    }

}
