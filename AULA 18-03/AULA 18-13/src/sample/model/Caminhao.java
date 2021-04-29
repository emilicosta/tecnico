package sample.model;

public class Caminhao extends Veiculo {
    public int eixos;


    public Caminhao(String nome){
        super(nome);
    }

    public Caminhao(String nome, int cavalos){
        super(nome, cavalos);
        
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }



    @Override
    public String toString() {
        return super.toString()+"\nEixos: "+ eixos;
    }
}
