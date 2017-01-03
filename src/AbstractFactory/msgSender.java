package AbstractFactory;

/**
 * Created by hotsky on 16/4/11.
 */
public class msgSender implements Sender {
    @Override
    public void send() {
        System.out.println(" message");
    }
}
