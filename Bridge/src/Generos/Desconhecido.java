package Generos;

import Interfaces.Genero;
import Interfaces.Plataforma;

public class Desconhecido implements Plataforma,Genero{

    @Override
    public String nome() {
        return "Desconhecida(o)";
    }
    
}
