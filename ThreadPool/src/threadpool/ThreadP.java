package threadpool;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadP {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException{
        
        long start;
        long end;
        
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        FileReader myObj;
        
        start = System.currentTimeMillis();
        for(int i=1;i<11;i++){
            
            System.out.println("Arquivo "+i);
            myObj = new FileReader("C:\\Users\\gabri\\Documents\\POO2\\Nomes\\teste" + i + ".txt");
            Task task = new Task(i);
            executor.execute(task);
         
        }
        executor.shutdown();
        
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto para 10 arquivos: "+(end-start)+"ms");
   
        ThreadPoolExecutor executor2 = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
        start = System.currentTimeMillis();
        for(int i=1;i<101;i++){
            
            System.out.println("Arquivo "+i);
            Task task2 = new Task(i);
 
            executor2.execute(task2);
        }
        executor2.shutdown();
        
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto para 100 arquivos: "+(end-start)+"ms");
    
       ThreadPoolExecutor executor3 = (ThreadPoolExecutor) Executors.newFixedThreadPool(1000);
        for(int i=1;i<1001;i++){
   
            System.out.println("Arquivo "+i);
            Task task = new Task(i);
            executor3.execute(task);
        }
        executor3.shutdown();
        
        end = System.currentTimeMillis();
        System.out.println("\nTempo Gasto para 1000 arquivos: "+(end-start)+"ms");
    }
}