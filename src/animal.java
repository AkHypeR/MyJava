public class animal {
    private String name;
    private int size;
    private int leg;
    public animal(String name, int size, int leg) {
        this.name = name;
        this.size = size;
        this.leg = leg;
    }
    public void eat(String eat){
        if(eat=="y"){
            System.out.println("this animal can eat");

        }
        else {
            System.out.println("this animal can't Eat ");
        }
    }
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getLeg() {
        return leg;
    }



}
