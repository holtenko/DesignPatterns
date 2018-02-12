package Factory;

/**
 * @author holten
 * @date 2018/2/12
 */
public class IphoneFactory {
    public Iphone getIphone(String iphoneType) {
        if (iphoneType == null) {
            return null;
        }
        if (iphoneType.equalsIgnoreCase("iphone7")) {
            return new Iphone7();
        } else if (iphoneType.equalsIgnoreCase("iphone8")) {
            return new Iphone8();
        } else if (iphoneType.equalsIgnoreCase("iphonex")) {
            return new Iphonex();
        }
        return null;
    }
}
