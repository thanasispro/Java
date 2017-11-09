/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Thanos
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Telephone myphone;
        myphone=new DeskPhone(69495488);
        myphone.powerOn();
        myphone.callphone(69495488);
        myphone.answer();
    }
    
}
