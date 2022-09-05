public class dog extends animal{
    private int tail;
    private String teeth;

    public dog(String name, int size, int leg, int tail, String teeth) {
        super(name, size, leg);
        this.tail = tail;
        this.teeth = teeth;
    }
    private void chew(){
        System.out.println("chew mthod called");
    }

    @Override
    public void eat(String eat) {
        chew();
        super.eat(eat);
    }

    public int getTail() {
        return tail;
    }

    public String getTeeth() {
        return teeth;
    }
}
