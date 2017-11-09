/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesmed;

import java.util.ArrayList;

/**
 *
 * @author Thanos
 */
public class User implements Save {
    
    private String name;
    private int hit;
    private int points;
    private String weapon;

    public User(String name, int hit, int points) {
        this.name = name;
        this.hit = hit;
        this.points = points;
        this.weapon="Gun";
    }

    @Override
    public ArrayList<String> write() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", hit=" + hit + ", points=" + points + ", weapon=" + weapon + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
}
