package sample.model3;

public class Cliente extends Pessoa {
    private String dataCadastro;

    public Cliente(String nome){
        super(nome);
    }
    public Cliente(String nome, String sobrenome){
        super(nome, sobrenome);
    }

    public Cliente(String nome, String sobrenome, String idade){
        super(nome, sobrenome,idade);
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nData de cadastro: " + dataCadastro+"\n";
    }
}
