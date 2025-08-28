import java.util.Scanner;
import java.util.ArrayList;


public class MiniProjetoDeTabuada {
 public static void main (String []args){

    
    Scanner sc = new Scanner (System.in);

    int opcao = 0;

    while( opcao != 10 ){
    System.out.println("\n==============================");
    System.out.println("** Escolha uma opção: **");
    System.out.println("==============================\n");
    System.out.println("1 - Tabuada do 1");
    System.out.println("2 - Tabuada do 2");
    System.out.println("3 - Tabuada do 3");
    System.out.println("4 - Tabuada do 4");
    System.out.println("5 - Tabuada do 5");
    System.out.println("6 - Tabuada do 6");
    System.out.println("7 - Tabuada do 7");
    System.out.println("8 - Tabuada do 8");
    System.out.println("9 - Tabuada do 9");
    System.out.println("0 - Sair ou selecione um numero da tabuada que gostaria caso nao esteje na lista"); // quebra de linha após o menu
    System.out.println("Ou digite qualquer outro número para ver sua tabuada:\n " );
        opcao = sc.nextInt();
        sc.nextLine();

        if (opcao >=1 && opcao <=9) {
                System.out.println("Tabuada do " + opcao + ":");
                
                for(int  i= 1; i <= 10; i++){
                 System.out.println(opcao + " x " + i + " = " + (opcao * i));}
            
        } else if (opcao == 0) {

             System.out.println(" Saindo do Programda!\n" );

        } else {
            int numero = opcao;
            for ( int i= 1; i <=10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i ));}
        }
         

    }

  
    sc.close();

 }

    
}


