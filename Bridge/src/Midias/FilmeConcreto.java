package Midias;

import Generos.Terror;
import Generos.Documentario;
import Generos.Romance;
import Generos.Animacao;
import Generos.Acao;
import Generos.FiccaoCientifica;
import Generos.Comedia;
import Generos.Desconhecido;
import java.util.ArrayList;
import java.util.Scanner;
import Plataformas.AmazonPrime;
import Interfaces.Genero;
import Interfaces.Midia;
import Plataformas.Netflix;
import Interfaces.Plataforma;

public class FilmeConcreto implements Midia {

    private int cod;
    private String nome;
    private String resumo;
    private String diretor;
    private Genero genero;
    private Plataforma plataforma;

    public FilmeConcreto() {
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void Imprimir() {
        System.out.println("---------------------------------------\n");
        System.out.println("Codigo: "+this.getCod());
        System.out.println("Nome: "+this.getNome());
        System.out.println("Resumo: "+this.getResumo());
        System.out.println("Diretor: "+this.getDiretor());
        System.out.println("Plataforma: "+this.plataforma.nome());
        System.out.println("Genero: "+this.genero.nome());
        System.out.println("");
    }

    @Override
    public boolean cadastro(Scanner ler, ArrayList<Midia> m) {

        String gen, plat, nom, resum, aut, gene;
        int codigo;

        ler.nextLine();
        System.out.println("\nCadastro Filme\n");
        System.out.println("Codigo: ");
        codigo = ler.nextInt();

        for (int i = 0; i < m.size(); i++) {
            if (codigo == m.get(i).getCod()) {
                System.out.println("\nCodigo ja existente\n");
                return false;
            }
        }
        ler.nextLine();
        System.out.println("Nome: ");
        nom = ler.nextLine();
        System.out.println("Um pouco Sobre: ");
        resum = ler.nextLine();
        System.out.println("Diretor: ");
        aut = ler.nextLine();
        System.out.println("Plataforma: ");
        plat = ler.nextLine();

        if (plat.toLowerCase().equals("netflix")) {
            Plataforma p = new Netflix();
            this.setPlataforma(p);
        } else if (plat.toLowerCase().equals("amazonprime") || plat.toLowerCase().equals("amazon")) {
            Plataforma p = new AmazonPrime();
            this.setPlataforma(p);
        } else {
            Plataforma p = new Desconhecido();
            this.setPlataforma(p);
        }

        System.out.println("Genero: ");
        gen = ler.nextLine();

        if (gen.toLowerCase().equals("acao")) {
            Genero g = new Acao();
            this.setGenero(g);
        } else if (gen.toLowerCase().equals("ficcaocientifica") || gen.toLowerCase().equals("ficcao")) {
            Genero g = new FiccaoCientifica();
            this.setGenero(g);
        } else if (gen.toLowerCase().equals("animacao") || gen.toLowerCase().equals("animaçao")) {
            Genero g = new Animacao();
            this.setGenero(g);
        } else if (gen.toLowerCase().equals("comedia")) {
            Genero g = new Comedia();
            this.setGenero(g);
        } else if (gen.toLowerCase().equals("documentario")) {
            Genero g = new Documentario();
            this.setGenero(g);
        } else if (gen.toLowerCase().equals("romance")) {
            Genero g = new Romance();
            this.setGenero(g);
        } else if (gen.toLowerCase().equals("terror")) {
            Genero g = new Terror();
            this.setGenero(g);
        } else {
            Genero g = new Desconhecido();
            this.setGenero(g);
        }

        this.setDiretor(aut);
        this.setNome(nom);
        this.setResumo(resum);
        this.setCod(codigo);

        return true;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public int getCod() {
        return this.cod;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public int getQuantidade() {
        return -1;
    }

    @Override
    public void setQuantidade(int quantidade) {
        System.out.println("Erro");
    }

}
