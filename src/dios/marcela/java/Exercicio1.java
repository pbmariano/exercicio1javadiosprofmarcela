package dios.marcela.java;
import java.util.Scanner;


public class Exercicio1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double nota;
        do {
            System.out.print("Informe nota: ");
            nota = scan.nextInt();
        } while (nota  < 0 || nota > 10);
        System.out.print("Nota: " + nota);
    }
}
