package Thread;

import java.util.Random;

class SharedObject {
	int sum =0;

	synchronized void add(int i) {
		sum = sum + i;
	}
	synchronized void sub(int i) {
		sum = sum - i;
	}

}
class ThreadEx extends Thread {

	String name;
	int count;
	SharedObject sharedObj;
	Random random;
	public ThreadEx(String name, int count, SharedObject sharedObj) {
		this.name = name;
		this.count = count;
		this.sharedObj = sharedObj;
		this.random = new Random();
	}

	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try {
			if(name.equals("sum"))
			{
				for (int i = 1; i <= count; ++i) {
					sharedObj.add(i);
					int mili_second = random.nextInt(10);
					sleep(mili_second);
				}
			}
			else {
				for (int i = 1; i <= count; ++i) {
					sharedObj.sub(i);
					int mili_second = random.nextInt(10);
					sleep(mili_second);
				
				}
			}

		} catch (InterruptedException e) {
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
		System.out.printf("%s: %d\n", name, sharedObj.sum);
	}
}

public class lecture {
	public static void main(String[] args) {

		SharedObject sharedObj = new SharedObject();
		ThreadEx threadOne = new ThreadEx("sum", 100, sharedObj);
		ThreadEx threadTwo = new ThreadEx("sub", 100, sharedObj);

        threadOne.start();
        threadTwo.start();

	}


}
