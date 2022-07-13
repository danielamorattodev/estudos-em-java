package dio.com.br.retorno;

//exercício de compresão sobre o uso de retornos em métodos Java;

/* Recrie a  apliação que calcula a área dos 3 quadriláteros notáveis do estudo "Sobrecarga".
Porém agora, faça os métodos retornarem valores */

public class estudoRetornos {

    public static double area(double lado) {

        return lado * lado;
    }

    public static double area(double lado1, double lado2 ) {

        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        return ((baseMaior*baseMenor) * altura) / 2;
    }


}

/* Diferente do exercício de sobrecarga, aqui foi utilizado no "public static double" ao invés de "public static void"
para se utilizar o retorno. O return interrompe a operção para devolver o valor solicitado.
 */
