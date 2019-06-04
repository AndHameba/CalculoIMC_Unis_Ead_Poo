package newpackage;

import javax.swing.JFrame;

/**
 *
 * @author Anderson
 */
public class ClassePrincipal {
    
    public static void main(String[] args){
        
        CalculoFrame calculoFrame = new CalculoFrame();
        
        calculoFrame.setSize(700,450);
        calculoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculoFrame.setVisible(true);
        
        
    }
    
}
