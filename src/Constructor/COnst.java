package Constructor;

class Test{

    Test(){} // default constructor
    Test(int a){}


    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(10);
    }
}
class Demo  {
    Demo(int ab){}

    public static void main(String[] args) {
      //  Constructor.Demo d1 = new Constructor.Demo();  // this will give error
        Demo di = new Demo(10);
    }
}

// interview question

class Test1{
    Test1(){
        System.out.println("Constructor1");
    }
    void Test(){
        System.out.println("method");

    }

    public static void main(String[] args) {
        Test1 tn = new Test1();
        tn.Test();
    }
}

