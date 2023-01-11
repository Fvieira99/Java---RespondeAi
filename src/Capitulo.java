public class Capitulo {

    private String nome;
    private Questao[] questoes;


    public Capitulo(Questao[] questoes, String nome){
        this.nome = nome;
        this.questoes = questoes;
    }

    public String getNome() {
        return nome;
    }
    public Questao[] getQuestoes() {
        return questoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setQuestoes(Questao[] questoes) {
        this.questoes = questoes;
    }

   
}
