package Factory.FactoryMethod;

/**
 * @author holten
 * @date 2018/2/12
 */
public class Iphone7Factory implements IphoneFactory {
    @Override
    public Iphone getIphone() {
        return new Iphone7();
    }
}
