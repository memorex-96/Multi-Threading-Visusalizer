import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class DiffThread implements Runnable, ActionListener {
    public void actionPerformed(ActionEvent event){
        Thread nThread = new Thread(this);
        nThread.start();
    }
    @Override
    public void run(){
        for(int z = 0; z <= 10; z++){
            System.out.println(z + " On: " + Thread.currentThread());
            try{
                Thread.sleep(1000); 
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
