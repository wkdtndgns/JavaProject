package Lamda;


public class OutterClass1 {
    int a;

    class InnerClass {

        int b;

        void method2() {
            b = 5;
            this.b = 6;
            a = 7;
            OutterClass1.this.a = 8;
            instanceMethod();
            OutterClass1.this.instanceMethod();
            // this.instanceMethod();            컴파일 에러
            main(null);
        }
    }

    public void instanceMethod() {
        InnerClass obj = new InnerClass();
        a = 1;
        this.a = 2;
        obj.method2();
    }

    public static void main(String[] args) {
        OutterClass1 o = new OutterClass1();
        o.instanceMethod();
        // InnerClass obj = new InnerClass();   컴파일 에러
        // a = 3;                               컴파일 에러
        // this.a = 4;                          컴파일 에러
    }
}
