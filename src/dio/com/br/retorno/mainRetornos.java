package dio.com.br.retorno;

public class mainRetornos {

    public static void main(String[] args) {

        //Retornos
        System.out.println("Exercício sobre Retornos");

        double areaQuadrado = estudoRetornos.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = estudoRetornos.area(5,5);
        System.out.println("Área do Retangulo: " + areaRetangulo);

        double areaTrapezio = estudoRetornos.area(7,8,9);
        System.out.println("Área do trápezio: " + areaTrapezio);
    }

}

//Diferente do exercício de sobrecarga, aqui devido ao retorno, foi possível chamar guardadno os valores dentro de variaveis;