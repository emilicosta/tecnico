package sample.model;

public class Marca {
    private String nome;
    private String desc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "\nMarca" +
                "\nnome: " + nome +
                "\ndesc: " + desc ;
    }
}
