package dio.com.br.variaveis;
// exercicios de criação de variáveis e impressão dos seus valores;
public class estudoVariaveis {
    public static void main(String[] args) {

        //exemplo de variáveis 1:
        int i;
       // int i; - Java nâo reconhece variáveis com mesmo nome;
        int I;
       // int 1i; - Variaveis nâo podem ser inicializadas com números;
        int _1a; // Embora seja permitido e nâo dar erro de compilação, não é uma boa prática;
        int $aq; // Embora seja permitido e nâo dar erro de compilação, não é uma boa prática;

        //variáveis dentro de métodos, sempre deve ser inicializada, ou seja, deve ser provido seu valor:
        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        //Exemplos de variáveis 2:
        final int j = 10; //exemplo de variável contante;
       // j = 15; - Quando uma constante é definida, ela nâo pode ter ser valor alterado posteriormente;
        int asrn2467ad; // Embora seja permitido criação de váriavel com letras e números, não é uma boa prática;
       // int asrn246 7ad; - Aqui o Java também não reconhece espaçamentos no nome de variáveis, dando erro de compilação;
        int asrn$2467_ad = 10; // Embora seja permitido criação de váriavel com letras e números, não é uma boa prática;
      //  int asrn%246_ad = 10; - Caracters especiais são proibidos, pois da erro de no código;

        asrn2467ad = 100;
        asrn$2467_ad = 10;

        //Expressividade de nomes de variáveis - exemplos:
        int quantidadeProduto = 50; // Modo correto de nomear uma variável em JAVA;
       // int QuantidadeProduto; - Nâo é uma boa prática inicializar variavel com letra maiscula;
        final int NUMERO_TENTATIVAS = 5; // Modo correto de nomear uma variável em JAVA;
       // final int numeroTentativas = 5; -Não é uma boa prática inicializar constantes com case_camel;
        int QUANTIDADE_OPCOES = 25; // Embora nâo da erro de compilação, não é uma boa prática para definir variável;
       // int qtdProd;  - Nome não está claro do que se trata, por isso, não segue um bom exemplo de variável.

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn2467ad);
        System.out.println(asrn$2467_ad);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);


    }
}
