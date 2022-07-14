package repeticoes_e_arrays.Loops;

/*
Faça um programa que peça N números inteiros,
caclule e mostre a quantidade de números pares
e a quantidade de _números impares_ - Exercicio para estudo do laço "do while";
 */

import java.util.Scanner;

public class Ex4_PareImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        int quantNumeros;
        int numero;
        int quantPares = 0 , quantImpares = 0;

        System.out.println("Quantidade de números: "); //Peça um número
        quantNumeros = scan.nextInt(); //Entrada de dados, neste caso de um int.

        int count = 0; //controla o loop
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;    //se o resto da divisão do número por 2 (numero/2) for 0, acrescente o valor 1 a variável quantPar.
            else quantImpares++; //caso contrário, adicione o valor 1 a variável quantImpar.

            count++; //some o valor 1 ao contador até que invalide a condição do loop. (count < quantidadeDeNumeros)
        }while(count < quantNumeros);  // Faça o loop caso o valor do contador seja menor que a quantidade de números

        //imprimindo a quantidade de números pares digtados e números ímpares digitados.
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);

    }

}
