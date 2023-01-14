package semthreads;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineCounter {

    LineCounter(){
        
    }
    
    public int contar(int i) throws FileNotFoundException, IOException{
        
        FileReader myObj = new FileReader("C:\\Users\\gabri\\Documents\\POO2\\Nomes\\teste" + i + ".txt");
        LineNumberReader line = new LineNumberReader(myObj);
        
        int quant = 0;
       
        while (line.readLine() != null){
           quant = line.getLineNumber();
        }
        
        return quant;
    }
    
}
