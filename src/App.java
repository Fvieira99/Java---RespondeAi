public class App {
    public static void main(String[] args) {

        int qtdQuestoes = 4;

        Questao[] questoes = new Questao[qtdQuestoes];
        
        for(int i = 0; i < qtdQuestoes; i++){

            int numeroDaQuestao = i + 1;
            
            questoes[i] = new Questao("Enunciado " + numeroDaQuestao , "Resposta " + numeroDaQuestao);

        }

        int qtdCapitulos = 1;

        Capitulo[] capitulos = new Capitulo[qtdCapitulos];

        for(int i = 0; i < qtdCapitulos; i++){

            int numeroDoCapitulo = i + 1;

            capitulos[i] = new Capitulo(questoes, "Capitulo " + numeroDoCapitulo);
        
        }

        Disciplina disciplina = new Disciplina(capitulos, "Disciplina Teste");


        Capitulo[] capitulosCriados = disciplina.getCapitulos();

        System.out.println(capitulosCriados[0].getNome());
        System.out.println("---------------------");
        System.out.println("Questões");
        System.out.println("---------------------");

        Questao[] questoesCriadas = capitulosCriados[0].getQuestoes();

        for(Questao questao : questoesCriadas){

            System.out.println(questao.getEnunciado());
            System.out.println(questao.getResposta());

        }
            
        

    }
}
