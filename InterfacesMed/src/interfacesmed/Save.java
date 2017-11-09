/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesmed;
import java.util.ArrayList;

/**
 *
 * @author Thanos
 */
public interface Save {
    ArrayList<String> write();
    void read(ArrayList<String> savedValues);
    
}
