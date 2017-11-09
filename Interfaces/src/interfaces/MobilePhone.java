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
public class MobilePhone implements Telephone {
    private int myNum;
    private boolean isRinging;
    private boolean isOn=false;
    
    public MobilePhone(int myNum) {
        this.myNum = myNum;
    }
    

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("You turn on your phone!Welcome");
        
    }

    @Override
    public void dial(int telNum) {
        if(isOn){
        System.out.println(telNum+"\nis on the phone");
        }else{
        System.out.println("Mobile phone is off");
        }
        
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answer the phone");
            isRinging=false;
        }
    }

    @Override
    public boolean callphone(int telNum) {
        if(telNum==myNum && isOn){
            System.out.println("Ringing...");
            isRinging=true;
        }else{
            isRinging=false;
            System.out.println("No such mobile phone or mobile phone is off");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    
    
    
    
}
