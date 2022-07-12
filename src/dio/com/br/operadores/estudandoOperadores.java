package dio.com.br.operadores;
//Exercicios para compreensão dos operadores em JAVA

public class estudandoOperadores {

    public static void main(String[] args) {

        System.out.println("Prepos");
        prePos();
        System.out.println("Aritiméticos");
        aritimeticos();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedencia");
        precedencia();

    }

    private static void prePos() {

        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("x = " + x);

    }

    private static void aritimeticos() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b = " + r1);
        System.out.println("c-a = " + r2);
        System.out.println("d*b = " + r3);
        System.out.println("e/a = " + r4);
        System.out.println("c%b = " + r5);

    }

    private static void atribuicao(){

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d = " + d);

        i += 5; // i = i + 5;
        j -= 3; // i = i - 3;
        d /= 2.7d; // d = d /2.7d;
        l *= 3; // l = l * 3;
        k %= 2; // k = k % 2;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("k = " + k);

        //Exemplo de operação composta:

        i = k = j;

        System.out.println("Novo K = " + k);
        System.out.println("Novo I = " + i);

    }

    private static void precedencia(){ //como o Java interpreta as operações;

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;

        System.out.println("i++ = --j * k = " + a);
        System.out.println("i = " + i);

        int b = k / --i % 3 + 1;

        System.out.println("k / --i % 3  + 1 = " + b);
        System.out.println("i = " + i);

        int c = 2; // exemplo de operação composta;

        c += i += 5;

        System.out.println("c +=i += 5 = " + c);

    }
}
