package Prototype;

public class Human implements Copyable{
	int age;
	Sex sex;
	String name;


public Human(int a, Sex s, String n) {
	this.age = a;
	this.sex = s;
	this.name = n;
}


@Override
public Object copy() {
	Human copy = new Human(age, sex, name);
	return copy;
}
}