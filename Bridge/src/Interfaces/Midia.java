package Interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public interface Midia {
    
    public String getNome();
    public void Imprimir();
    public int getCod();
    public boolean cadastro(Scanner ler, ArrayList<Midia> m);
    public int getQuantidade();
    public void setQuantidade(int quantidade);
    
}
