package org.example.Pers;

import org.example.Skils.SkillAction;

public class BossDevushka implements Herose {
    public int hps = 700;
    public boolean hodil = false;
    SkillAction skill = new SkillAction();
    public BossDevushka() {

    }

    public int getHps() {
        return hps;
    }

    @Override
    public void skilOne() {
        Herose.super.skilOne();
    }

    @Override
    public void skilTwo() {
        Herose.super.skilTwo();
    }


    public void setHps(int hps) {
        this.hps = hps;
    }

    @Override
    public void skilOne(Herose hervrag, Herose her1, Herose her2, Herose her3) {

    }

    @Override
    public void setHodil() {
        Herose.super.setHodil();
    }

    public boolean isHodil() {
        return hodil;
    }

    public void setHodil(boolean hodil) {
        this.hodil = hodil;
    }
}
