/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhaskara;

import java.util.Scanner;

public class Bhaskara {
// programa de bhaskara as avessas
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Insira o valor de x1: ");
        double x1 = Double.parseDouble(console.nextLine());
        System.out.println("Insira o valor de x2: ");
        double x2 = Double.parseDouble(console.nextLine());
        System.out.println("Insira o valor de C: ");
        double c = Double.parseDouble(console.nextLine());
        double s = x1 + x2;
        double p = x1 * x2;
        double a = c/p;
        double b = -s*a;
        System.out.println("A equação que tem raízes" +x1 +" e " + x2 +" é "+ a +" x² "+ b+ " x "+c);
    }

}
