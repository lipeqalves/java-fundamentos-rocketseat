package primeirasAulas;

/*
 * HelloWord = Nome da classe
 * public = Tipo de acesso da classe
 * class = Tipo da classe
 */

public class HelloWorld {
    // Todo conteúdo deverá se inserido aqui dentro

    public static void main(String[] args) {
        /*
         * Numeros (int, double, float, long)
         * Texto (String)
         * Boleano (boolean) true ou false
         */

        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14F;
        long dadoDoTipoLong = 7896546543213456899L;
        String dadoDoTipoString = "Colocar meu texto";
        boolean dadoDoTipoBoolean = true;

        // if - else
        // if (dadoDoTipoInt == 11) {
        // // sysout
        // System.out.println("Entrou no if");
        // } else if (dadoDoTipoInt == 12) {
        // System.out.println("Entrou no if do 12");
        // } else {
        // System.out.println("Entrou no else");
        // }
        // }

        // While (Enquanto algo for verdadeiro, faça alguma coisa)
        // int valorInicial = 0;
        // while (valorInicial < 3) {
        // System.out.println("O valor inicial é menor que 3");
        // System.out.println(valorInicial);
        // valorInicial++;
        // }
        // System.out.println("Saiu do while");

        // For
        System.out.println("Iniciando o For");
        for (int i = 0; i < 4; i++) {
            System.out.println("O valor do i é: " + i);
        }
        System.out.println("Finalizando o For");
    }
}
// Fora do escopo da classe
