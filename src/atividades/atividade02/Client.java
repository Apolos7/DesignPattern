package atividades.atividade02;

import java.util.*;

public class Client {
    
    public static void main(String[] args) {
        
        List<String> listaDedicatoriasHarryPotter = Arrays.asList("Nome3", "Nome2", "Nome1");

        List<LivroPrototype> loteLivrosHarryPotter = new ArrayList<>();
        
        HarryPotterPrototype harryPotterPrototype = new HarryPotterPrototype();
        harryPotterPrototype.setTitulo("Harry Potter e o Prisioneiro de Azkaban");
        harryPotterPrototype.setAutor("J.K Rowling");
        harryPotterPrototype.setClassIndicativa("Não recomendado para menores de 10 anos");
        harryPotterPrototype.setGenero("Fantasia, aventura");
        
        listaDedicatoriasHarryPotter.forEach(nome -> {
            LivroPrototype novoLivro = harryPotterPrototype.clonar();
            novoLivro.setNomeDedicatoria(nome);
            loteLivrosHarryPotter.add(novoLivro);
        });

        loteLivrosHarryPotter.forEach(livro -> {
            System.out.println(livro.exibirInfo());
        });


        System.out.println("-------------------------------------");

        
        List<String> listaDedicatoriasPercyJackson = Arrays.asList("Nome_1", "Nome_2", "Nome_3");

        List<LivroPrototype> loteLivrosPercyJackson = new ArrayList<>();
        
        PercyJacksonPrototype percyJacksonPrototype = new PercyJacksonPrototype();
        percyJacksonPrototype.setTitulo("Percy Jackson: O ladrão de raios");
        percyJacksonPrototype.setAutor("Rick Riordan");
        percyJacksonPrototype.setClassIndicativa("Não recomendado para menores de 12 anos");
        percyJacksonPrototype.setGenero("Mitologia grega, Ação, Aventura");
        
        listaDedicatoriasPercyJackson.forEach(nome -> {
            LivroPrototype novoLivro = percyJacksonPrototype.clonar();
            novoLivro.setNomeDedicatoria(nome);
            loteLivrosPercyJackson.add(novoLivro);
        });

        loteLivrosPercyJackson.forEach(livro -> {
            System.out.println(livro.exibirInfo());
        });



    }

}
