package Singleton;

/**
 * @author holten
 * @date 2018/3/22
 */
public class DoubleCheckedLockingSingleton {
    private volatile static DoubleCheckedLockingSingleton singleton;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}
