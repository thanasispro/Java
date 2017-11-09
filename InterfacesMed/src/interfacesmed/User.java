/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesmed;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> write() {
      List<String> values=new ArrayList<String>();
      values.add(0,this.name);
      values.add(1," "+this.hit);
      values.add(2," "+this.points);
      values.add(3," "+this.weapon);
      
      return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size()>0){
            this.name=savedValues.get(0);
            this.hit=Integer.parseInt(savedValues.get(1));
            this.points=Integer.parseInt(savedValues.get(2));
            this.weapon=savedValues.get(3);
            
        
        }
        
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
