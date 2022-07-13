package dio.com.br.sobrecarga;

public class Main {

    public static void main(String[] args) {

        //Quadrilatero
        System.out.println("Exercício Quadrilatero");
        estudoSobrecarga.area(3);
        estudoSobrecarga.area(5,5);
        estudoSobrecarga.area(7, 8, 9);
        estudoSobrecarga.area(5f,5f); //aqui usou o f, apenas para deixar mais claro que o Java leria normalmente o código, pois
        //no nesta assinatura, está já está declarado que seu tipo é diferente do anterior;
    }
}
