package AbstractFactory;


/**
 * @author holten
 * @date 2018/2/12
 */
public class Iphone8Factory implements IphoneFactory {
    @Override
    public Screen getScreen() {
        return new Screen8();
    }

    @Override
    public Shell getShell() {
        return new Shell8();
    }
}
