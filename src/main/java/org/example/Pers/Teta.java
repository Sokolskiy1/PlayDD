package org.example.Pers;

import org.example.Skils.SkillAction;

public class Teta implements Herose{
    public int hps = 100;
    public boolean hodil = false;
    public boolean live = true;
    SkillAction skill = new SkillAction();

    public int getHps() {
        return hps;
    }
    public void skilOne(Herose hervrag,Herose her1,Herose her2,Herose her3 ){
        skill.damageToPerson(her1, (int) (Math.random()*50));
        skill.damageToPerson(her2,(int) (Math.random()*50));
        skill.damageToPerson(her3,(int) (Math.random()*50));
        skill.damageToPerson(hervrag,(int) (Math.random()*400+50));

    }
    public void skilTwo(Herose her){skill.damageToPerson(her,50);}


    public void setHps(int hps) {
        this.hps = hps;
    }

    public boolean isHodil() {
        return hodil;
    }

    public void setHodil(boolean hodil) {
        this.hodil = hodil;
    }
}
