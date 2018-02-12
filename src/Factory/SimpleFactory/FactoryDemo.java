package Factory.SimpleFactory;

import Factory.FactoryMethod.Iphone;

public class FactoryDemo {

    public static void main(String[] args) {
        IphoneFactory iphonefactory = new IphoneFactory();
        Iphone iphone = iphonefactory.getIphone("iphonex");
        iphone.build();
    }
}
