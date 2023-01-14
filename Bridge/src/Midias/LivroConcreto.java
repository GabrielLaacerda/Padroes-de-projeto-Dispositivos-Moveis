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

public class LivroConcreto implements Midia{
    
    private int cod;
    private String nome;
    private String resumo;
    private String autor;
    private float preco;
    private Genero genero;
    private Plataforma plataforma;
    private int quantidade;
    
    public LivroConcreto(){
        
    }
    
    @Override
    public boolean cadastro(Scanner ler, ArrayList<Midia> m){
        
        String gen,plat,nom,resum,aut,gene;
        float prec;
        int codigo;
        
        ler.nextLine();
        System.out.println("\nCADASTRO LIVRO\n");
        System.out.println("Codigo: ");
        codigo = ler.nextInt();
        
        for(int i=0;i<m.size();i++){
            if(codigo == m.get(i).getCod()){
                System.out.println("\nCodigo ja existente\n");
                return false;
            }
        }
        ler.nextLine();
        System.out.println("Nome: ");
        nom = ler.nextLine();
        System.out.println("Breve resumo: ");
        resum = ler.nextLine();
        System.out.println("Autor: ");
        aut = ler.nextLine();
        System.out.println("Plataforma: ");
        plat = ler.nextLine();
        
        if(plat.toLowerCase().equals("saraiva")){
            Plataforma p = new Netflix();
            this.setPlataforma(p);
        }
        else if(plat.toLowerCase().equals("amazonprime") || plat.toLowerCase().equals("amazon")){
            Plataforma p = new AmazonPrime();
             this.setPlataforma(p);
        }
        else if(plat.toLowerCase().equals("scribd")){
            Plataforma p = new AmazonPrime();
             this.setPlataforma(p);
        }
        else{
            Plataforma p = new Desconhecido();
            this.setPlataforma(p);
        }
        
        System.out.println("Genero: ");
        gen = ler.nextLine();
        
        if(gen.toLowerCase().equals("acao")){
            Genero g = new Acao();
            this.setGenero(g);
        }
        else if(gen.toLowerCase().equals("ficcaocientifica") || gen.toLowerCase().equals("ficcao")){
            Genero g = new FiccaoCientifica();
            this.setGenero(g);
        }
        else if(gen.toLowerCase().equals("animacao") || gen.toLowerCase().equals("animaçao")){
            Genero g = new Animacao();
            this.setGenero(g);
        }
        else if(gen.toLowerCase().equals("comedia")){
            Genero g = new Comedia();
            this.setGenero(g);
        }
        else if(gen.toLowerCase().equals("documentario")){
            Genero g = new Documentario();
            this.setGenero(g);
        }
        else if(gen.toLowerCase().equals("romance")){
            Genero g = new Romance();
            this.setGenero(g);
        }
        else if(gen.toLowerCase().equals("terror")){
            Genero g = new Terror();
            this.setGenero(g);
        }
        else{
            Genero g = new Desconhecido();
            this.setGenero(g);
        }
        
        System.out.println("Preco: ");
        prec = ler.nextFloat();
        
        this.setAutor(aut);
        this.setNome(nom);
        this.setPreco(prec);
        this.setResumo(resum);
        this.setCod(codigo);
        this.setQuantidade(0);
        
        return true;
        
    }
    @Override
     public void Imprimir(){
        System.out.println("---------------------------------------\n");
        System.out.println("Codigo: "+this.getCod());
        System.out.println("Nome: "+this.getNome());
        System.out.println("Resumo: "+this.getResumo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Preço: "+this.getPreco());
        System.out.println("Plataforma: "+this.plataforma.nome());
        System.out.println("Genero: "+this.genero.nome());
        System.out.println("Estoque: "+this.quantidade);
        System.out.println("");
    
    }

    @Override
    public String getNome() {
        return nome;
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
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
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
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    @Override
    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
