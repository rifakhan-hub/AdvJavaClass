package Constructor;

public class Constructor_this {
    Constructor_this(){
        this("ABC");
       // this("hi", 10);    // error as it is not the first thing
        // this statement needs to be at the first
        System.out.println("const 1 ");
    }
    Constructor_this(String a){
        this("hello", 20);
        System.out.println(a);
        System.out.println("constrctor 2");
    }
    Constructor_this(String a, int b){
        System.out.println(a +b);
        System.out.println("constructor 3");
    }

    public static void main(String[] args) {
        Constructor_this c1 = new Constructor_this();

    }
}
