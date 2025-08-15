import java.sql.SQLOutput;

public class Pessoa {
    private String nome;
    private int idade;


    Pessoa(int _idade, String _nome) {
        setIdade(_idade);
        setNome(_nome);
    }

public void fazAniversario(){
        this.idade = this.idade + 1;
        setIdade(getIdade()+1);
}
    public void mostrarInfo(){
        System.out.println(getNome() + ", " +  getIdade() + " anos de idade " + getMaioridade());
    }

    public boolean getMaioridade(){
        if(getIdade() <= 17){
            return false;
        }else{
            return true;
        }
    }

    private void setNome(String _nome) {

            this.nome = _nome;


    }

    private void setIdade(int _idade) {

        this.idade = _idade;
    }

   private int getIdade() {
       if(idade < 0){
           idade = 0;
       }
        return this.idade;
    }

    private String getNome() {
        if(this.nome == null) {
            return "SemNome";

        }
            return this.nome;
    }
}