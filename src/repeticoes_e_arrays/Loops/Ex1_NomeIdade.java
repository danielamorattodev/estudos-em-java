package repeticoes_e_arrays.Loops;

/*Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o número 0 no campo nome). - Exercicio para estudo do laço "while";
 */

import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        String nome;
        int idade;

        while(true) { //Enquando o loop for verdadeiro
            System.out.println("Nome: ");
            nome = scan.next(); //comando para que seja digitado o nome e só então seguir para o próximo.
            if (nome.equals("0")) break; //quando for digitdo 0, interrompa o programa.

            System.out.println("Idade: ");
            idade = scan.nextInt(); //mesma coisa, porém , aqui foi utilizado next.Int por se tratar de uma variável int.

        }

        System.out.println("Continua aqui..."); /* Para emitir uma mensagem quando o 0 for digitado e saber
     que o programa saiu do laço.*/

    }


}
