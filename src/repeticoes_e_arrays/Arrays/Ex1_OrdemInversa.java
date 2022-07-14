package repeticoes_e_arrays.Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4}; //inicializando um vetor com 5 elementos.

        System.out.print("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " "); //imprima o valor do elemento do vetor na posição indicada pelo contador.
            count++;
        }
        System.out.println("\n--------------"); //separar os vetores

        System.out.println("Vetor Inverso: ");
        for(int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i] + " "); //imprima o elemento
        }


    }

}
