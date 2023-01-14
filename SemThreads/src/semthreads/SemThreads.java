package semthreads;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SemThreads {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        int i =1;
        long start,end;
        
        start = System.currentTimeMillis();
        while (i < 11) {
            LineCounter l = new LineCounter();
            System.out.println("Arquivo: "+i);
            System.out.println(l.contar(i));
            i++;
        }
        end = System.currentTimeMillis();
        System.out.println("Tempo com 10 arquivos: "+(end-start)+"ms");
        
        i = 1;
        start = (int) System.currentTimeMillis();
        while (i < 101) {
            LineCounter l = new LineCounter();
            System.out.println("Arquivo: "+i);
            System.out.println(l.contar(i));
            i++;
        }
        end = (int) System.currentTimeMillis();
        System.out.println("Tempo com 100 arquivos: "+(end-start));

        start = (int) System.currentTimeMillis();
        
        i = 1;
        while (i < 1001) {
            LineCounter l = new LineCounter();
            System.out.println("Arquivo: "+i);
            System.out.println(l.contar(i));
            i++;
        }
        end = (int) System.currentTimeMillis();
        System.out.println("Tempo com 1000 arquivos: "+(end-start));
        
    }

}
