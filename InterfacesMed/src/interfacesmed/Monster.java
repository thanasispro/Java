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
public class Monster implements Save {
    private String name;
    private int hit;
    private int strength;

    

    public String getName() {
        return name;
    }

    public int getHit() {
        return hit;
    }

    public int getStrength() {
        return strength;
    }

    public Monster(String name, int hit, int strength) {
        this.name = name;
        this.hit = hit;
        this.strength = strength;
    }
    
    @Override
    public List<String> write() {
      List<String> values=new ArrayList<String>();
      values.add(0,this.name);
      values.add(1," "+this.hit);
      values.add(2," "+this.strength);
      
      return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size()>0){
            this.name=savedValues.get(0);
            this.hit=Integer.parseInt(savedValues.get(1));
            this.strength=Integer.parseInt(savedValues.get(2));
            
        
        }
    }

    @Override
    public String toString() {
        return "Monster{" + "name=" + name + ", hit=" + hit + ", strength=" + strength + '}';
    }
    
}
