package repeticoes_e_arrays.Loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensgaem caso o valor seja inválido e _continue pedindo_ até que o _usuário_ informe um valor válido.
- Exercicio para estudo do laço "while";
 */

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10){ //Só vai entrar nete laço, quando a condição for menor que 0 e maior que 10;
            System.out.println("Nota Inválida! Digite novamente");
            nota = scan.nextInt();
        } //só sairá do laço, se for digitada uma nota válida;

    }

}
