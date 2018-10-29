package homeWork.mid;



class World {
	
	class Hello {
	    public void say() {
	        System.out.println(World.this.message);
	    }
	}
	
    String message = "안녕하세요";

    public void doSomething() {
        Hello hello = new Hello();
        hello.say();
    }
}

public class Exam12 {

    public static void main(String[] args) {
        World world = new World();
        world.doSomething();
    }
}
