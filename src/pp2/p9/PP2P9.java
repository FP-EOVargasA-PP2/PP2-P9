/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p9;
import java.util.Scanner;

/**
 *
 * @author osiri
 */
public class PP2P9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        int n;
        int a;
        int b;
        int c;
        int d;
        //Procedimiento
        n = pedir();
        //Usando unos mod se pudo fragmentar el numero
        a = calcular (n);
        b = calcular (n,a);
        c = calcular (n,a,b);
        d = calcular (n,a,b,c);
        mostrar (n,a,b,c,d);
    }
    public static int pedir (){
        int n;
        Scanner teclado = new Scanner (System.in);
        System.out.println("*****   Fragmentacion   *****");
        System.out.println("Introduce un numero de 4 cifras");
        n = teclado.nextInt();
        return n;
    }
    public static int calcular (int n){
        return n % 10;
    }
    public static int calcular (int n,int a){
        int b;
        b = n - a;
        return b % 100;
    }
    public static int calcular (int n,int a,int b){
        return (n - a - b) % 1000;
    }
    public static int calcular (int n,int a,int b,int c){
        return n - a - b - c;
    }
    public static void mostrar (int n,int a,int b,int c,int d){
        System.out.println("la fragmentacion de "+n+" es "+d+", "+c+", "+b+" y "+a);
    }
}
