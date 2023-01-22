package org.example.Skils;

import org.example.Pers.Herose;

public class SkillAction {
    public void damageToPerson(Herose g, int damag)
    {
       int hp = g.getHps() - damag;
       g.setHps(hp);
    }
    public void hilToPerson(Herose g, int notdamag)
    {
        int hp = g.getHps() + notdamag;
        if (hp>100)
            hp=100;
        g.setHps(hp);
    }
    public void hilPointToPerson(Herose g, int notdamag)
    {
        int hp = g.getHps() + notdamag;
        //if (hp>100)
            //hp=100;
        g.setHps(hp);
    }
}
