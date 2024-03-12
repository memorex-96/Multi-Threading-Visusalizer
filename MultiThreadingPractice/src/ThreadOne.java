import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
public class ThreadOne implements Runnable, ActionListener{
    public void actionPerformed(ActionEvent event){
        Thread nThread = new Thread(this);
        nThread.start();
    }

    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){ //just count to 100 at 1000 miliseconds
            System.out.println(i + " On: " + Thread.currentThread());
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
