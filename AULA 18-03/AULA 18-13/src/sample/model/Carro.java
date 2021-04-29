package sample.model;

public class Carro extends Veiculo{
    private int portas;


    public Carro(String nome){
        super(nome);
    }
    public Carro(String nome, int cavalos){
        super(nome,cavalos);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPortas: "+portas;
    }
}
