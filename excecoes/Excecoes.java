package excecoes;

import pessao.Pessoa;

public class Excecoes {

    // Checked exceptions verificadas, informar erro, exigi o tratamento

    // Unchecked exceptions n verificadas, no momento da execulção

    public static void main(String[] args) {
        // try / catch
        // try {
        //     validarNumero();
        // } catch (Exception e) {
        //     System.out.println("Deu ruim");
        //     e.printStackTrace();
        // }

        Pessoa p = null;
        p.getCpf();
    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O número é mener que 100");
        }
    }
}
