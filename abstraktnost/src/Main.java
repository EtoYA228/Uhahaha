
public class Main {
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("RU");
        Mouse m= factory.getMouse();
        Keyboard k = factory.getKeyboard();
        Touchpad t = factory.getTouchpad();

        m.dbclick();
        k.println();
        t.track(19,39);

    }
    private static DeviceFactory getFactoryByCountryCode(String lang){
        switch(lang){
        case "RU":
            return new Rudevicefactory();
        case "EN":
            return new Endevicefactory();
        default:
            throw new RuntimeException("не поддерживается код страны: " + lang);}


}}







interface Mouse{
    void click();
    void dbclick();
    void scroll(int direction);
}
interface Keyboard{
    void print();
    void println();
}
interface Touchpad{
    void track(int deltaX, int deltaY);
}
interface DeviceFactory{
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}


