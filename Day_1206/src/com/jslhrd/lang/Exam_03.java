package com.jslhrd.lang;

class Person {
	int bun;
	String name;
	int age;

	Person(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return bun == p.bun && name.equals(p.name);
		} else {
			return false;
		}

	}

	@Override
	public int hashCode() {
		return name.hashCode()+bun; //문자열은 같은 해쉬코드를 가질 수 있다.(같은 장소를 가르킨다) 고로 번호를 붙이면 true가 될 수 있다.
	}

	@Override
	public String toString() {

		return bun + "\t" + name + "\t" + age;
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		Person p1 = new Person(1, "김학생", 28);
		Person p2 = new Person(1, "김학생", 30);
		System.out.println("같은 객체인가?" + (p1 == p2));
		System.out.println("같은 객체인가?" + p1.equals(p2));
		System.out.println("같은 객체인가?" + (p1.hashCode() == p2.hashCode()));
	}

}
