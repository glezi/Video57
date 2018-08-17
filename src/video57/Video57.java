/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video57;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author gleez
 */
public class Video57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoCentrado mimarco=new MarcoCentrado(); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true); 
        
    }
    
}

class MarcoCentrado extends JFrame{
    
    public MarcoCentrado(){
        Toolkit mipantalla = Toolkit.getDefaultToolkit(); 
        Dimension tamañoPantalla = mipantalla.getScreenSize(); 
        int alturaPantalla=tamañoPantalla.height; 
        int anchoPantalla =tamañoPantalla.width; 
        setSize(anchoPantalla/2, alturaPantalla/2); 
        setLocation(anchoPantalla/4, alturaPantalla/4); 
        
        
    }
    
}