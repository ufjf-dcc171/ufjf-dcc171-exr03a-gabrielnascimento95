/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr3a_labiii;

import javax.swing.JOptionPane;
/**
 *
 * @author gabrielsantos
 */
public class EXR3a_LABIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b = 0, c = 0, delta = 0, x1 = 0, x2 = 0;
        JOptionPane.showMessageDialog(null,"Equação do 2º grau na forma: Ax² + Bx + C");
        a = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de A:"));
        if(verificaEquacao(a)){
            b = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de B:"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de C:"));
        }
        calculaDelta(delta,a,b,c);
     
        if (delta >= 0)
        {
            x1=calculaX1(delta, a, b);
            x2=calculaX2(delta, a, b);
            JOptionPane.showMessageDialog(null, "\nx1 vale: " + x1 + "\n x2 vale: " + x2);

        } else
        {
            JOptionPane.showMessageDialog(null, "Sem soluções em IR");
        }
    }
    
    private static void calculaDelta(double delta, double a, double b, double c){
        delta = ((b * b) - (4 * a * c));
    }
    
    private static double calculaX1(double delta, double a, double b){
        double x1 = 0;
        if (delta >= 0){
          x1 = (-b + Math.sqrt(delta)) / (2 * a);
        }
        return x1;
    }
    
    private static double calculaX2(double delta, double a, double b){
        double x2 = 0;
        if (delta >= 0){
          x2 = (-b + Math.sqrt(delta)) / (2 * a);
        }
        return x2;
    }
    
    private static boolean verificaEquacao(double a){
        while(a == 0){
            JOptionPane.showMessageDialog(null, "O valor de A inválido!\n Digite outro valor !");
            a = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de A:"));
        }
        return true;
    } 
    
}
