package day22;

/*
	직렬화가 되기 위해서는 
	해당 클래스가 반드시 직렬화 가능 클래스여야 한다.
		방법 ]
			implements Serializable
			만 해주면 된다.
 */

import java.io.*;
public class MyData implements Serializable {
	private String name, tel, mail, addr;
	private char gen;
	private int age;
	private double height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "name=" + name + ", tel=" + tel + ", mail=" + mail + ", addr=" + addr + ", age=" + age + ", gen="
				+ gen + ", height=" + height;
	}
	@Override
	public boolean equals(Object o) {
		return name.equals(((MyData) o).getName()) && age == ((MyData) o).getAge();
	}
}