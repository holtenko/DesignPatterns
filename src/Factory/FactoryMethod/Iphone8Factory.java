package Factory.FactoryMethod;

/**
 * @author holten
 * @date 2018/2/12
 */
public class Iphone8Factory implements IphoneFactory {
    @Override
    public Iphone getIphone() {
        return new Iphone8();
    }
}
