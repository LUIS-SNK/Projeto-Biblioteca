import model.Autor;
import model.Livro;
import model.Biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.String;
import java.io.Console;

public class Main {
    public static void main(String[] args) {

        List<Autor> autorLista = new ArrayList<Autor>();
        Scanner teclado = new Scanner(System.in);
        Console tecla = System.console();
        Biblioteca bib = new Biblioteca();

        int menu = 0;

        do {

            System.out.println("1- Adicionar Autor");
            System.out.println("2- Adicionar | Remover Livro");
            System.out.println("3- Listar Livro");
            System.out.println("4- Listar Autor");
            System.out.println("5- Sair do Sistema ");
            menu = teclado.nextInt();

            if(menu == 1){ 	

                System.out.println("Nome do Autor: ");
                String nomeAutor = teclado.next();

                System.out.println("Idade do Autor: ");
                int idadeAutor = teclado.nextInt();

                System.out.println("Endereço do Autor: ");
                String endAutor = teclado.next();  
                
                teclado.nextLine();
     	
                System.out.println("Biografia: ");  
                String bioAutor = teclado.nextLine();

                Autor autor = new Autor(bioAutor, nomeAutor, idadeAutor, endAutor);
                
                bib.adicionarAutor(autor);

                autorLista.add(autor);
                
                teclado.nextLine();

            } else if (menu == 2) {

                int menu2 = 0;

                do{

                    System.out.println("1- Adicionar Livro");
                    System.out.println("2- Remover Livro");
                    System.out.println("3- Voltar");
                    menu2 = teclado.nextInt();

                    if(menu2 == 1){

                    System.out.println("Título: ");
                    String titLivro = teclado.next();

                    System.out.println("ISBN: ");
                    String isbn = teclado.next();

                    System.out.println("Preço: ");
                    double precoLivro = teclado.nextDouble();


                    System.out.println("Digite o Autor: ");
                    for (Autor a : autorLista){

                    	System.out.println(a.getNome());

                    }

                    String nomeAutor = teclado.next();
                    Autor autor = (Autor) autorLista.stream().filter(a -> a.getNome().equals(nomeAutor)).findFirst().get();

                    Livro livro = new Livro(titLivro, isbn, precoLivro, autor);

                    bib.adicionarLivro(livro);
                    
                    teclado.nextLine();

                } else if(menu2 == 2) {

                    bib.listarLivros();

                    System.out.println("Qual livro deseja remover?");
                    String titLivro = teclado.next();

                    ArrayList<Livro> listLivro = bib.getListaLivros();

                    System.out.println(listLivro);

                    Livro livro1 = listLivro.stream().filter(l -> l.getTitulo().equals(titLivro)).findFirst().get();

                    System.out.println(livro1);


                    bib.removerLivro(livro1);
                    
                    teclado.nextLine();

                }

                }while(menu2 != 3);


                } else if (menu == 3) {

                    bib.listarLivros();
                    
                    teclado.nextLine();

                } else if (menu == 4) {
                	
                	bib.listarAutor();
                	
                    teclado.nextLine();
                	
                }

        }while(menu != 5);

    }
}
