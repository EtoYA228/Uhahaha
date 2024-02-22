public class Rudevicefactory implements DeviceFactory{
    public Mouse getMouse(){
        return new Rumouse();
    }
    public Keyboard getKeyboard(){
        return new Rukeyboard();
    }
    public Touchpad getTouchpad(){
        return new Rutouchpad();
    }

}
