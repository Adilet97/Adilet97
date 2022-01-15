package com.company;

public class Boss extends GameEntity {

    public Boss (){
    }
    Weapon Boss = new Weapon("Makarov pistol", "Firearms");

    public Weapon getBoss(String Weapon) {
        return Boss;
    }

    public void setBoss() {
        this.Boss = Boss;
    }
}
