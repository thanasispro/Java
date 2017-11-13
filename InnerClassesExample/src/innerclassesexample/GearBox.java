/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclassesexample;
import java.util.ArrayList;
/**
 *
 * @author Thanos
 */
public class GearBox {
    
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear=0;
    

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears=new ArrayList<>();
        Gear basic=new Gear(0,0.0);
        this.gears.add(basic);
    }
    
    public class Gear{
        private int maxGears;
        private double ratio;

        public Gear(int maxGears, double ratio) {
            this.maxGears = maxGears;
            this.ratio = ratio;
        }
        
       public double speed(int revs){
           return revs*this.ratio;
       }        


    }
    
    
}
