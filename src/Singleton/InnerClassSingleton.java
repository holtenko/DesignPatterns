package Singleton;

/**
 * @author holten
 * @date 2018/3/22
 */
public class InnerClassSingleton {
    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static final InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
