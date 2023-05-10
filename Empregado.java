public class Empregado{
    private String nome;
    protected Float salario;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "nome do funcionario: " + getNome() + "\n" + "Salario: " + salario;
    }
}