public class SenderWorkerThread extends Thread{

    private String msg;
    Sender sd;

    SenderWorkerThread(String msg, Sender sd){
        this.msg = msg;
        this.sd = sd;
    }

    public void run(){
        synchronized (sd){
            sd.SenderMsg(msg);
        }
    }
}
