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
public class DeskPhone implements Telephone {
    
    private int myNum;
    private boolean isRinging;

    @Override
    public void powerOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dial(int telNum) {
        System.out.println(telNum+"\nis on the phone");
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
        if(telNum==myNum){
            System.out.println("Ringing...");
            isRinging=true;
        }else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
    
    
    
}
