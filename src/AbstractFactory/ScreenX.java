package AbstractFactory;

/**
 * @author holten
 * @date 2018/2/12
 */
public class ScreenX implements Screen {
    @Override
    public void build() {
        System.out.println("iphone X screen get!");
    }
}
