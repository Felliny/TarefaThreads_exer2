package View;

import Controller.ImprimeThread;

public class Main {
    public static void main(String[] args) {

        for (int threadId=0; threadId<5; threadId++){
            Thread Idthread = new ImprimeThread(threadId);
            Idthread.start();
        }
    }
}