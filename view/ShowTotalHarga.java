package view;

import controller.PaketController;

public class ShowTotalHarga {
    public ShowTotalHarga(){
        menuTotalHarga();
    }

    public void menuTotalHarga(){
        System.out.println("=======================");
        System.out.println("LIST TOTAL HARGA : ");
        System.out.println("Total : " + PaketController.getTotal());
        System.out.println("=======================");
    }
}
