package Factory.SimpleFactory;

/**
 * @author holten
 * @date 2018/2/12
 */
public class Iphonex implements Iphone {
    @Override
    public void build() {
        System.out.println("iphonex get!");
    }
}
