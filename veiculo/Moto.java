package veiculo;

public class Moto implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Acelerando uma moto");
    }

    @Override
    public void freiar() {
        System.out.println("Freiando uma moto");
    }

}
