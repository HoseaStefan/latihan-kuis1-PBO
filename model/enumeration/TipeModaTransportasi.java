package model.enumeration;

public enum TipeModaTransportasi {
    DARAT, LAUT, UDARA;

    public static TipeModaTransportasi getModa(int input){
        if (input == 1) {
            return DARAT;
        } else if (input == 2) {
            return LAUT;
        }
        return UDARA;
    }
}
