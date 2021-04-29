package sample.model;

public abstract class Veiculo {
    private String nome;
    private int cavalos;
    private Marca marca;

    public Veiculo(String nome){
        this.nome = nome;
    }

    public Veiculo(String nome, int cavalos){
        this.nome = nome;
        this.cavalos = cavalos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public void setMarca(String nome, String desc) {
        Marca marca = new Marca();
        marca.setNome(nome);
        marca.setDesc(desc);
        this.marca = marca;
    }



    @Override
    public String toString() {
        return "\nVeiculo" +
                "\nnome: " + nome +
                "\nCavalos: " + cavalos+
                "\n" + marca;

    }
}
