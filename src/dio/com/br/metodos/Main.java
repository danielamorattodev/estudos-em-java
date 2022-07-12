package dio.com.br.metodos;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("exercicio calculadora");
        exercicioCalculadora.soma(3,6);
        exercicioCalculadora.subtracao(9, 1.8);
        exercicioCalculadora.multiplicacao(7,8);
        exercicioCalculadora.divisao(5,2.5);

        //Mensagem
        System.out.println("exercicio Mensagem");
        exercicioMensagem.obterMensagem(9);
        exercicioMensagem.obterMensagem(14);
        exercicioMensagem.obterMensagem(1);

        //Emprestimo
        System.out.println("exercicio de Empréstimo");
        exercicioEmprestimo.calcular(1000, exercicioEmprestimo.getDuasParcelas());
        exercicioEmprestimo.calcular(1000, exercicioEmprestimo.getTresParcelas()); // exemplos de parametros como metodo;
        exercicioEmprestimo.calcular(1000, 5);

    }
}
