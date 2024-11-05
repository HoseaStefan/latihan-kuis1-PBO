package model.enumeration;

public enum TipePengiriman {
    EKSPRES,REGULER;

    public static TipePengiriman getTipePengiriman(int input){
        switch (input) {
            case 1:
                return EKSPRES;
            default:
                return REGULER;
        }
    }
}
