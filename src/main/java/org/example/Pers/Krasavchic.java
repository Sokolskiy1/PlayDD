package org.example.Pers;

import org.example.Skils.SkillAction;

public class Krasavchic implements Herose{
    public int hps = 100;
    public boolean hodil = false;
    public boolean live = true;
    SkillAction skill = new SkillAction();
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

    public void skilOne(Herose her){skill.damageToPerson(her,50);}
    public void skilTwo(Herose her){skill.damageToPerson(her,50);}
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
