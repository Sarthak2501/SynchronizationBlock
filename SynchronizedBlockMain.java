public class SynchronizedBlockMain {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello world!");

        Sender sender = new Sender();

        SenderWorkerThread sender1 = new SenderWorkerThread("Hello",sender);

        SenderWorkerThread sender2 = new SenderWorkerThread("How are you..?",sender);

        sender1.start();
        sender2.start();



        sender1.join();
        sender2.join();
    }
}