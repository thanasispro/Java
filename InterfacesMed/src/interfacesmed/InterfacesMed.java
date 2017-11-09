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
        // TODO code application logic here
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
    
}
