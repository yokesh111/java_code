package day3;

public class encapulation {
	private int serialNum;
	private String name;
	private int age;
	public int getSerialNum() {
	return serialNum;
	}
	encapulation() {
		System.out.println("DefaulConstructor");
	}
	public void setSerialNum(int serialNum) {
	this.serialNum = serialNum;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	@Override
	public String toString() {
	return "OopsConceptDemo [Serial Number="
	+ serialNum + ", name=" + name + ", age=" + age
	+ "]";
	}
}
