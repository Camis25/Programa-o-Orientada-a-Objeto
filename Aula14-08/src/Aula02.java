public class Aula02 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(18, "Bruna" );
        if(p1.getMaioridade()){
            p1.mostrarInfo();
        }



        Pessoa p2 = new Pessoa(7, "Geovana" );
        if(p2.getMaioridade()){
            p2.mostrarInfo();
        }

        Pessoa p3 = new Pessoa(-10, "Llilian");
        if(p3.getMaioridade()){
            p3.mostrarInfo();
        }

    }
}
