package dio.com.br.sobrecarga;

//exercício para compreensão do conceito de sobrecarga de métodos em Java;

//Quadrilatero

/*A sobrecarga ocorre pois manteve-se o nome do método "area", porém no seu uso, foi alterado os parametros, mudando assim sua assinatura;
No caso, são 3 sobre cargas para o método de calcular "area" de um quadrilatero;
 */
public class estudoSobrecarga {

    public static void area(double lado){

        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trápezio: " + ((baseMaior+baseMenor)*altura) / 2);
    }

    /*Para ficar mais claro a questão da sobrecarga, acrescentou-se mais uma area. Aqui porém, diferente dos anteriores, foi utilizado o tipo float ao invés do double,
    porque o tipo também influencia na sobregarca;
    Anteriormente usou-se double, porque a quantidade de parametros usados foi diferente, mas aqui, o losango recebe a mesma quantidade que a do retângulo,
    o que dá erro na compilação por conta se ser o mesmo tipo. Por isso, neste caso, resolveu-se usando o float:
     */

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Área do Losango: " + (diagonal1 * diagonal2) / 2);
    }
}

