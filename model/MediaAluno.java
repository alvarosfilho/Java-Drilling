package model;

    import java.util.Scanner;

public class MediaAluno {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a nota A do aluno");
        double A = sc.nextDouble();
        System.out.println("Informe a nota B do aluno");
        double B = sc.nextDouble();

        double media = (A * 3.5 + B * 7.5) / 11.0;
        System.out.println("-----------------------");
        System.out.printf("A média do aluno é: %.1f%n", media);

        sc.close();

    }
}


