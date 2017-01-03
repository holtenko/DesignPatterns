package AbstractFactory;

import Factory.Factory;

/**
 * Created by hotsky on 16/4/11.
 */
public class Main {
    public static void main(String[] args) {
        Producer producer = new msgProducer();
        Sender sender=producer.provide();
        sender.send();
    }
}
