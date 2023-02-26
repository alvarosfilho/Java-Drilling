package model;
import java.util.Scanner;

public class IdentificadorNumero {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor A");
        int a = sc.nextInt();
        System.out.println("Informe o valor B");
        int b = sc.nextInt();
        System.out.println("Informe o valor C");
        int c = sc.nextInt();
        
        int maior = a, menor = a;

        if (b > maior) maior = a;
        if (c > menor) maior = c;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        System.out.println("------------------");
        System.out.println("O valor maior é: " + maior);
        System.out.println("O valor menor é: " + menor);
 
        
        sc.close();
    }        
}



