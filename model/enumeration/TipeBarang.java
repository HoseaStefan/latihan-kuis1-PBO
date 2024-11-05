package model.enumeration;

public enum TipeBarang {
    BERHARGA, TIDAK;

    public static TipeBarang getTipe(boolean inputTipe){
        switch (inputTipe) {
            case true:
                return BERHARGA;
            default:
                return TIDAK;
        }
    }
}
