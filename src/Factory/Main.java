package Factory;

/**
 * Created by hotsky on 16/4/11.
 */
public class Main {
    public static void main(String[] args){
        Sender sender=Factory.produceMailSender();
        sender.send();
    }
}
