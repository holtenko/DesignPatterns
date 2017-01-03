package AbstractFactory;

/**
 * Created by hotsky on 16/4/11.
 */
public class msgProducer implements Producer {
    @Override
    public Sender provide() {
        return new msgSender();
    }
}
