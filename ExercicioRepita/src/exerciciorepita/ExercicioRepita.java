/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Jbachesque
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas",JOptionPane.INFORMATION_MESSAGE);
        int n; 
        int s= 0;
        int p = 0;
        int i =0;
        int v = 0;
        int c = 0;
        float m =0;
        
        do{
          

            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br> <em>(valor 0 interrompe)</em> </html>")); 
            s += n;
            
            if (n != 0)
            {
                v++;

                if (n%2 == 0)
                {
                    p++;
                }
                else
                {
                   i++;
                }

                if ( n > 100)
                {
                    c++;
                }

                m = s /v;
            }
            
        }while (n!=0);
        JOptionPane.showMessageDialog(null, "<html> Resultado final <hr>" +
                "<br> Total de Valores: " + v
                + "<br> Total de Pares: " + p
                + "<br> Total de Ímpares: " + i
                + "<br> Acima de 100: " + c
                + "<br> Média de valores: " + String.format("%.1f", m)
                + "<br> Somatório vale: " + s
                + "</html>");
    }
    
}
