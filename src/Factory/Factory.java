package Factory;

/**
 * Created by hotsky on 16/4/11.
 */
public class Factory {
    public static Sender produceMailSender(){
        return new mailSender();
    }
    public static Sender produceMsgSender(){
        return new msgSender();
    }
}
