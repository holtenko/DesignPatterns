package Factory.FactoryMethod;

/**
 * @author holten
 * @date 2018/2/12
 */
public class Iphone8 implements Iphone {
    @Override
    public void build() {
        System.out.println("iphone8 get!");
    }
}
