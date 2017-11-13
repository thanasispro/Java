/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclassesexample;

/**
 *
 * @author Thanos
 */
public class InnerClassesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GearBox ferrari=new GearBox(6);
        GearBox.Gear first=ferrari.new Gear(1,15.6);
        System.out.println(first.speed(7));
    }
    
}
