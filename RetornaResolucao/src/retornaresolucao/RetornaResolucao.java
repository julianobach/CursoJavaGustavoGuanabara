/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retornaresolucao;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Jbachesque
 */
public class RetornaResolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit tk = Toolkit.getDefaultToolkit();  
        Dimension d = tk.getScreenSize();  
        System.out.println("A resolução do seu sistema é: " + d.width + " X " + d.height);  
    }
    
}
