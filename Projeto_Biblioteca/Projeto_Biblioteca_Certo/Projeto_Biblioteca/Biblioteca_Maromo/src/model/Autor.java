package model;

import java.util.ArrayList;

public class Autor extends Pessoa {
    public String getBiografia() { return biografia; }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    private String biografia;
    private ArrayList<Livro> livrosEscritos;
    public Autor(String biografia, String nome, Integer idade, String endereco) {
        super(nome, idade, endereco);
        this.biografia = biografia;
        this.livrosEscritos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosEscritos.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEscritos.remove(livro);
    }


    public ArrayList<Livro> getLivrosEscritos() {
        return livrosEscritos;
    }



    @Override
    public String toString() {
        return "model.Autor [nome=" + getNome() + ", idade=" + getIdade() + ", endereco=" + getEndereco() +
                ", biografia=" + biografia + "]";
    }
}
