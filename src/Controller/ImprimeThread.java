package Controller;

public class ImprimeThread extends Thread {

    private int threadId;

    public ImprimeThread(int threadId){
        this.threadId = threadId;
    }

    @Override
    public void run() {
        System.out.println("TID #" +getId()+ " ===> " +threadId);
    }
}