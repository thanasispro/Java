/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesmed;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Thanos
 */
public class InterfacesMed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User thanos=new User("Thanos",100,200);
        System.out.println(thanos.toString());
        saveObject(thanos);
        
        
        Monster dragon=new Monster("Dragon",100,900);
        System.out.println(dragon.toString());
        saveObject(dragon);
        System.out.println(dragon);
        System.out.println(((Monster)dragon).getStrength());
        
    }
    
    public static ArrayList<String> readValues(){
        ArrayList<String> values=new ArrayList<String>();
        Scanner scan= new Scanner(System.in);
        boolean quit=false;
        int i=0;
        System.out.println("Choose\n"
                + "1 for enter a string\n"
                + "0 to quit");
        
        while(!quit){
        System.out.println("Choose an option");
        int choice=scan.nextInt();
        scan.nextLine();
        switch(choice){
            case 0:
                quit=true;
                break;
            case 1:
                System.out.println("Enter a string");
                String newString=scan.nextLine();
                values.add(newString);
                i++;
                break;
        
        }
        
        
        
        }
        
        
    
    return values;
    
    
    }
    
    public static void saveObject(Save objectToSave){
        for(int index=0;index<objectToSave.write().size();index++){
            System.out.println(objectToSave.write().get(index)+" Saved to storage device!");
        
        }
    
    }
    
    public static void loadObject(Save objectToLoad){
        ArrayList<String> values=readValues();
        objectToLoad.read(values);
    
    }
    
}
