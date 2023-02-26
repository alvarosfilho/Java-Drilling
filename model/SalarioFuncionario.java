package model;

import java.util.Scanner;

public class SalarioFuncionario {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o número do funcionário");
        int numero_funcionario = sc.nextInt();
        System.out.println("Informe o número de horas trabalhadas");
        int horas_trabalhadas = sc.nextInt();
        System.out.println("Informe o valor da hora trabalhada");
        double valor_hora = sc.nextDouble();
        
        double salario = horas_trabalhadas * valor_hora;
        System.out.println("------------------------");
        System.out.printf("Número do funcionário: %d\n", numero_funcionario);
        System.out.printf("O salário é: R$ %.2f\n", salario);
        
        sc.close();
    }
}


