package org.example.Pers;

public interface Herose {
    public int hps = 100;
    public boolean hodil = false;
    public boolean live = true;
    public default int getHps() {
        return hps;
    }

    public default void skilOne(){}
    public default void skilTwo(){}
    public default void setHps(int hps) {
    }
    public void skilOne(Herose hervrag,Herose her1,Herose her2,Herose her3 );
    public default void setHodil() {

    }

}
