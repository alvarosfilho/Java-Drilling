package model;
import java.util.Scanner;

public class NumerosCrescente {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor de A");
        int a = sc.nextInt();

        System.out.println("Informe o valor de B");
        int b = sc.nextInt();
        
        System.out.println("Informe o valor de C");
        int c = sc.nextInt();
    
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        
            System.out.println("--------------");
            System.out.println(a + " " + b + " " + c);

        sc.close();
    }    
}




