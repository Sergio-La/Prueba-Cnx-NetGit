/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2cnx;

import java.util.Scanner;

/**
 *
 * @author Sergio López
 */
public class Prueba2Cnx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner L = new Scanner(System.in);
        
        int x, y, z;
        x = y = z = 0;
        
        System.out.println("Digite un número: ");
        x = L.nextInt();
        System.out.println("Digite otro número: ");
        y = L.nextInt();
        z = x * y;
        System.out.println("La suma es: "+z);
        
    }
    
}
