package Polymorphism.abstract1;



public class Abstract2 {
    
    static void doSomething(Parent parent) {
        parent.method1();
        parent.method2();
    }
       
    public static void main(String[] args) {
        ChildOne obj1 = new ChildOne();
        ChildTwo obj2 = new ChildTwo();
        doSomething(obj1);
        doSomething(obj2);
    }
}

