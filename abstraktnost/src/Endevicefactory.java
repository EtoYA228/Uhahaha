public class Endevicefactory implements DeviceFactory {
    public Mouse getMouse(){
        return new Enmouse();
        }
    public Keyboard getKeyboard(){
        return new Enkeyboard();
    }
    public Touchpad getTouchpad(){
        return new Entouchpad();
    }




    }



