package threadpool;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Task implements Runnable {

    private FileReader file;
    
    public Task(int i) throws FileNotFoundException{
        FileReader myObj = new FileReader("C:\\Users\\gabri\\Documents\\POO2\\Nomes\\teste" + i + ".txt");
        this.file = myObj;
        
    }
    @Override
    public void run() {

        int quant = 0;
        try {
 
            LineNumberReader line = new LineNumberReader(this.file);
     
            while (line.readLine() != null)
                quant = line.getLineNumber();
            
            System.out.println("Possui "+quant+" linhas");
        }
        catch (IOException Erro) {
            System.out.println("\nErro\n");
        }
    }    
}
