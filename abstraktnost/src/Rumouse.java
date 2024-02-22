public class Rumouse implements Mouse {

    public void click() {System.out.println("щелчок мышью");}
    public void dbclick() {System.out.println("двойной щелчок мышью");}
    public void scroll(int direction) {
        if(direction>0)
            System.out.println("скроллим верх");
        else if (direction<0)
            System.out.println("скроллим вниз");
        else
            System.out.println("не скроллим");
    }
}
