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
public interface Telephone {
    void powerOn();
    void dial(int telNum);
    void answer();
    boolean callphone(int telNum);
    boolean isRinging();
    
}
