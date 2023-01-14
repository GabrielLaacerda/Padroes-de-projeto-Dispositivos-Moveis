package threads;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Threads {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        
        long start,end;
        FileReader myObj;
        int i = 1;
      
        start = System.currentTimeMillis();
        while(i<11){
        myObj = new FileReader("C:\\Users\\gabri\\Documents\\POO2\\Nomes\\teste" + i + ".txt");
        System.out.println("Arquivo "+i);
        LineCounter line = new LineCounter(myObj,i);
        i++;
        }
  
        end = System.currentTimeMillis();
        System.out.println("\nTempo Gasto para 10 arquivos: "+(end-start)+"ms"); 
  
        i=1;
        start = System.currentTimeMillis();
        while(i<101){
        myObj = new FileReader("C:\\Users\\gabri\\Documents\\POO2\\Nomes\\teste" + i + ".txt");
        LineCounter line = new LineCounter(myObj,i);
        System.out.println("Arquivo "+i);
        i++;
       }
        end = System.currentTimeMillis();
        System.out.println("\nTempo Gasto para 100 arquivos: "+(end-start)+"ms"); 
       
        i = 1;
        start = System.currentTimeMillis();
        while(i<1001){
        myObj = new FileReader("C:\\Users\\gabri\\Documents\\POO2\\Nomes\\teste" + i + ".txt");
        myObj = new FileReader("C:\\Users\\gabri\\Documents\\POO2\\Nomes\\teste" + i + ".txt");
        LineCounter line = new LineCounter(myObj,i);
        System.out.println("Arquivo "+i);
        i++;
       }
       end = System.currentTimeMillis();
       System.out.println("\nTempo Gasto para 1000 arquivos: "+(end-start)+"ms"); 
    
    }
}
