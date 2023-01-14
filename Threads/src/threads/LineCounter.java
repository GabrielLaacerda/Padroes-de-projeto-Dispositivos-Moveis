package threads;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LineCounter implements Runnable {

    private FileReader file;

    public LineCounter(FileReader file, int num) throws InterruptedException {
        this.file = file;
        Thread t1 = new Thread(this);
        t1.start();
        t1.join();
    }

    @Override
    public void run() {

        int quant = 0;

        LineNumberReader line = new LineNumberReader(this.file);

        try {
            while (line.readLine() != null) {
                quant = line.getLineNumber();
            }
        } catch (IOException ex) {
            Logger.getLogger(LineCounter.class.getName()).log(Level.SEVERE, null, ex);
        }
     

        System.out.println("Possui "+quant+" linhas");
        System.out.println("");

    }

}
