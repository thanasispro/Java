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
public class Gearbox {
    
    private boolean clutchIsIn;
    
    public void operateClutch(boolean inOrOut){
        this.clutchIsIn=inOrOut;
    }
    
}
