package Factory.FactoryMethod;

/**
 * @author holten
 * @date 2018/2/12
 */
public class IphonexFactory implements IphoneFactory {
    @Override
    public Iphone getIphone() {
        return new Iphonex();
    }
}
