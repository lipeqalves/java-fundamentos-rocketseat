package construtor;

public class Construtor {

    /*
     * Construtor
     * tem o mesmo nome da classe
     * não tem retorno, é void por padrao
     * pode ter varios construtores dentro de uma classe
     * se não criar um construtor, o java cria um construtor sem parametro por
     * padrão
     */
    private int numero;

    public Construtor(int numero) {
        this.numero = numero;
    }

    public Construtor(String nome) {

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
