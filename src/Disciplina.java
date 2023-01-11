public class Disciplina {
    
    private String nome;
    private Capitulo[] capitulos;

    public Disciplina(Capitulo[] capitulos, String nome){
        this.nome = nome;
        this.capitulos = capitulos;
    }

    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public String getNome() {
        return nome;
    }

    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
