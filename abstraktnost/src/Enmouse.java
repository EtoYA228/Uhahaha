public class Enmouse implements Mouse {
    public void click() {
        System.out.println("mouse click");
    }

    public void dbclick() {
        System.out.println(" mouse double click");
    }

    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("scroll up");
        else if (direction < 0)
            System.out.println("scroll down");
        else
            System.out.println("no scroll");
    }
}