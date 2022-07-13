package dio.com.br.operadores;

//exercicios de assimilação dos operadores lógicos - como se comportam na prática;

public class operadoresLogicos {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 && b3: " + (b1 && b3));

        System.out.println("b2 || b3: " + (b2 || b3));
        System.out.println("b2 || b4: " + (b2 || b4));

        System.out.println("b1 ^ b3: " + (b1 ^ b3));
        System.out.println("b4 ^ b1: " + (b4 ^ b1));

        System.out.println("!b1 : " + (!b1));
        System.out.println("!b2 : " + (!b2));

//exemplos com outrs operandos envolvendo artitméticos, relacionais e booleanos:
        int i1 = 10;
        int i2 = 7;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("(i1 > i2) || (f2 < f1) : " + ((i1 > i2) || (f2 < f1)));
        System.out.println("((i1 + i2) < (f2 -f1)) && true : " + (((i1 + i2) < (f2 -f1)) && true));

//exemplo de boa prática de variaveis intermediárias para facilitar entendedimento e re-uso de resultados;

        double salarioMensal = 11893.58d;
        double mediaSalarial = 1050.0d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalarial) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBase = salarioMensal < mediaSalarial;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBase) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBase) && (muitosDependentes);
        System.out.println("Recebe Auxilio: " + recebeAuxilio);

    }

}
