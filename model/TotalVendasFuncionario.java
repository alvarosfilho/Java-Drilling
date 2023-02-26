package model;
import java.util.Scanner;

public class TotalVendasFuncionario {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o nome do vendedor");
        String nomeVendedor = sc.next();

        System.out.println("Informe o salário");
        double salarioFixo = sc.nextDouble();

        System.out.println("Informe o total de vendas");
        double totalVendas = sc.nextDouble();

        double comissao = 0.15 * totalVendas;

        double salarioFinal = salarioFixo + comissao;

        System.out.println("----------------------");
              
        System.out.printf(nomeVendedor + " receberá: RS %.2f\n ", salarioFinal);


       sc.close(); 
    
    }
}

