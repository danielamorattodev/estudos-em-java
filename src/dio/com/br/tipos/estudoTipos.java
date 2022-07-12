package dio.com.br.tipos;
//Exercicios sobre os tipos de dados em JAVA e como são impressos;

public class estudoTipos {

    public static void main(String[] args) {

        //Exemplos de valores inteiros:
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
       // short s2 = 40000; - Valor ultrapassa o limite máximo de suporte deste tipo.

        int i2 = 28500;
       // int i1 = -12000000000; - Valor ultrapassa o limite máximo de suporte deste tipo.


        long l2 = 1200000000000000000L; //- Um long tem a letra L no final.
        // long l1 = 11000000000000000000L; - Valor ultrapassa o limite máximo de suporte deste tipo.

       //Tipos reais racionais:

        float f2 = 19.68F; // valores float levam um f no final.
        // float f1 = 4.5; - O erro é devido o java interpretar automáticamente como double e nâo float;

        double d1 = 85.69;
        double d2 = 85.69D; // as duas formas são válidas;

        //Tipos textuais:
        char c1 = 'a';
        // char c2 = 'Ia'; - Caracter reconhece apenas um letra, duas ele reconhece como erro.
        char c3 = '\u0057'; // código numérico para o valor descrever 'a' de c1, por isso ele é reconhecido pelo JAVA.

        String st1 = "fulano"; // string usa-se por defoul aspas duplas.
        String st2 = "Cicrano";
        String st3 = "Frases longas e Com + de algum tipo de d4do, também é válido";

        // String st4 = "09/07/2022"; -  exemplo de string com números, é permitido, porém é considerada como texto.

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);






    }
}
