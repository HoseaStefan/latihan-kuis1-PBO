package model.classes;

import model.enumeration.TipeBarang;
import model.enumeration.TipeModaTransportasi;

public class PaketDarat extends Paket {

    public PaketDarat(TipeModaTransportasi tipeModaTransportasi, TipeBarang tipeBarang, double beratPaket) {
        super(tipeModaTransportasi, tipeBarang, beratPaket);

    }

}
