package repeticoes_e_arrays.Loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a media desses números; - Exercicio para estudo do laço "do while"; (muito usado em testes de recrutamento).
 */

import java.util.Scanner;

public class Ex3_MaioreMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        int numero;
        int maior = 0; //guarda o maior valor
        int soma = 0; // guarda a soma

        int count = 0; // controla o loop
        do{
            System.out.println("Numero: "); // Peça um número
            numero = scan.nextInt();

            soma = soma + numero; //será usado para calcular a média no final do laço.

            if (numero > maior) maior = numero; //Caso o valor que o usuário digitou seja maior que o valor armazanado na variável maior.
//atribua o valor deste número a variável maior.

            count = ++count; //some o valor 1 ao contador, até que invalide a condição do loop. (count < 5)
        } while (count < 5);  //enquanto o contador tiver o valor menor que 5

        //imprimindo o maior número digtados e a média dos mesmos
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }

}
