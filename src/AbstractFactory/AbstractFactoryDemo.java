package AbstractFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        IphoneFactory factory = new IphoneXFactory();
        Screen screen = factory.getScreen();
        Shell shell = factory.getShell();
        screen.build();
        shell.build();
    }
}
