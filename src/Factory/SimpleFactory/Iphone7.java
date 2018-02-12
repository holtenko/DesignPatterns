package Factory.SimpleFactory;

/**
 * @author holten
 * @date 2018/2/12
 */
public class Iphone7 implements Iphone {
    @Override
    public void build() {
        System.out.println("iphone7 get!");
    }
}
