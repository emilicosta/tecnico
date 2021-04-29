package sample.model4;

public abstract class Pessoa {
    private String nome;
    private int idade;



    public Pessoa(String nome, double nota1, double nota2){
        this.nome = nome;
    }
    public Pessoa(String nome,int horasTrabalhadas, double valorHora){
        this.nome = nome;
    }
    public Pessoa(String nome, double valorHora, int horasTrabalhadas, int idade){
        this.nome = nome;
        this.idade = idade;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    @Override
    public String toString() {
        return "\n\nPessoa" +
                "\nnome: " + nome + ((idade == 0)?"":"\nIdade: " + idade)
                 ;
    }

}
