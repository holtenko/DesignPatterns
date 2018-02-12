package Factory.FactoryMethod;

public class FactoryDemo {

    public static void main(String[] args) {
        IphoneFactory iphonefactory = new Iphone8Factory();
        Iphone iphone = iphonefactory.getIphone();
        iphone.build();
    }
}
