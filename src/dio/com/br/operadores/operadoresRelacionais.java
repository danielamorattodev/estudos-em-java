package dio.com.br.operadores;

//exercicios de assimilação dos operadores relacionais - como se comportam na prática;

public class operadoresRelacionais {

    public static void main(String[] args) {

        System.out.println("Int");
        inteiros();
        System.out.println("Float");
        floatExemplo();
        System.out.println("Char");
        charExemplo();
        System.out.println("String");
        stringExemplo();
        System.out.println("Boolean");
        booleanExemplo();
        System.out.println("Outros Tipos");
        outrosTipos();

    }

    public static void inteiros() {
        int i1 = 10;
        int i2 = 20;

        boolean a = i1 == i2;
        boolean b = i1 != i2;
        boolean c = i1 > i2;
        boolean d = i1 < i2;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

    }

    public static void floatExemplo() {
        float f1 = 4.5f;
        float f2 = 3.5f;

        boolean a = f1 == f2;
        boolean b = f1 != f2;
        boolean c = f1 > f2;
        boolean d = f1 < f2;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

    }
    public static void charExemplo() {
        char c1 = 'X';
        char c2 = 'Y';

        boolean a = c1 == c2;
        boolean b = c1 != c2;
        boolean c = c1 > c2;
        boolean d = c1 < c2;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

    }

    public static void stringExemplo() {
        String s1 = "Fulano";
        String s2 = "Fulano";

        boolean a = s1 == s2;
        boolean b = s1 != s2;
        //boolean c = s1 > s2; -Condição não se aplica;
        //boolean d = s1 < s2; - Condição não se aplica;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        //System.out.println("c: " + c);
        //System.out.println("d: " + d);

    }

    public static void booleanExemplo() {
       boolean b1 = true;
        boolean b2 = false;

        boolean a = b1 == b2;
        boolean b = b1 != b2;
        //boolean c = b1 > b2; - Condição não se aplica;
        //boolean d = b1 < b2; - Condição não se aplica;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        //System.out.println("c: " + c);
        //System.out.println("d: " + d);


    }

    public static void outrosTipos() {
        double d1 = 59.4d;
        long l1 = 1597l;
        long l2 = 8459l;
        byte bt1 = 1;
        short sh1 = 25;

        System.out.println("double é == long1? : " + (d1 == l1));
        System.out.println("long1 é != long2? : " + (l1 != l2));
        System.out.println("byte é > short? : " + (bt1 != sh1));
        System.out.println("short é < double? : " + (sh1 != d1));


    }

}
