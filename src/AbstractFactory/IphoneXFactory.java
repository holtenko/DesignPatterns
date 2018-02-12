package AbstractFactory;


/**
 * @author holten
 * @date 2018/2/12
 */
public class IphoneXFactory implements IphoneFactory {
    @Override
    public Screen getScreen() {
        return new ScreenX();
    }

    @Override
    public Shell getShell() {
        return new ShellX();
    }
}
