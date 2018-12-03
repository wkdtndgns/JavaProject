package lecture3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Person) == false) return false;
        Person p = (Person)obj;
        return (this.name == null ? p.name == null : this.name.equals(p.name)) && this.age == p.age;
    }

    @Override
    public String toString() {
        return String.format("Person{name=\"%s\", age=%d}", name, age);
    }

}

public class Example3 {

    static void sort1(List<Person> list) {
    	Collections.sort(list,new personNameComporator());
    }

    static void sort2(List<Person> list) {
    	Collections.sort(list,new personNameComporatorDesc());
    }

    static void sort3(List<Person> list) {
    	Collections.sort(list,new personAgeComporator());
    	
    }

    static void sort4(List<Person> list) {
    	Collections.sort(list,new personAgeComporatorDesc()); 	
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("홍길동", 18));
        list.add(new Person("임꺽정", 19));
        list.add(new Person("전우치", 20));
        sort1(list);
        System.out.println(list.toString());
        sort2(list);
        System.out.println(list.toString());
        sort3(list);
        System.out.println(list.toString());
        sort4(list);
        System.out.println(list.toString());
    }
}


class personNameComporator  implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		int r = o1.name.compareTo(o2.name);
		if(r!=0)
			return r;
	
		return o1.age-o2.age;
	}
}

class personNameComporatorDesc  implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		int r = o2.name.compareTo(o1.name);
		if(r!=0)
			return r;
	
		return o2.age-o1.age;
	}
}

class personAgeComporator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		int r = o1.age-o2.age;
		if(r!=0)
			return r;
	
		return o1.name.compareTo(o2.name);
	}
}
class personAgeComporatorDesc  implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		int r = o2.age-o1.age;
		if(r!=0)
			return r;
	
		return o2.name.compareTo(o1.name);	}
}