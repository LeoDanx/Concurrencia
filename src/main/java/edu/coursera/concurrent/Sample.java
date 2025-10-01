package edu.coursera.concurrent;

public class Sample {

    public static void main(String[] args) throws InterruptedException {

        String info[] = {"Mares eat oates", "Does eat oates","Little lambs eat ivy", "A kid will eat a ivy too"};

        for(int i=0; i < info.length; i++){
            //Pausar por 4 segundos
            Thread.sleep(4000);

            //Print a message
            System.out.println(info[i]);
        }
    }
}
