package repeticoes_e_arrays.Loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();


        int multiplicacao = 1; //variável para guardar o valor da multiplicação dos valores.

        System.out.println(fatorial +"! = ");  //para: variável i = numero, até i maior que 0, diminuimos 1 ao valor de i a cada loop.
        for( int i = fatorial; i >= 1; i--){
            multiplicacao *= i; //multiplicamos os valores de i e armazenamos na variável multiplicação
        }

        //imprima o valor resultado da multiplicação
        System.out.println(multiplicacao);
    }
}
