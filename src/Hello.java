public class Hello {
    void display(){
        this.show (10);
        System.out.println("HELLO");
    }
    void show(int a){
        System.out.println("HI");
    }

    public static void main(String[] args) {
        Hello h1 = new Hello();
        h1.display();
    }
}
