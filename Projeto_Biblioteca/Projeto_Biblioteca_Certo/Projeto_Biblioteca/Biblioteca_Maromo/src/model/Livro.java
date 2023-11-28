package model;

import java.lang.String;

public class Livro {
    // Atributos
    private String titulo;
    private String ISBN;
    private double preco;
    private Autor autor;  // Associação com a classe model.Autor

    // Construtor
    public Livro(String titulo, String ISBN, double preco, Autor autor) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.preco = preco;
        this.autor = autor;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Método toString que inclui detalhes do autor
    @Override
    public String toString() {
        return "model.Livro [titulo=" + titulo + ", ISBN=" + ISBN + ", preco=" + preco +
                ", autor=" + autor.getNome() + "]";
        
    }
}
