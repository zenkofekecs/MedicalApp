package client;

import java.util.Date;

import main.FullName;
import main.Gender;
import main.Person;

public class Patient extends Person {
    private String id;
	private int age;
	private java.util.Date accepted;
	private History history;
	
	public Patient(String id, int age, String title, FullName name, Date birthDate, Gender gender, Date accepted) {
		super(title, name, birthDate, gender);
		this.setId(id);
		this.setAge(age);
		setHistory(new History());
		this.setAccepted(accepted);
                this.setName(name);

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public java.util.Date getAccepted() {
		return accepted;
	}

	public void setAccepted(java.util.Date accepted) {
		this.accepted = accepted;
	}

	public History getHistory() {
		return history;
	}

	public void setHistory(History history) {
		this.history = history;
	}

	public String toGeneralInfo() {
		// TODO Auto-generated method stub
		return  super.toString();
	}
	
	@Override
	public String toString() {
		return id + ", Age: " + age + ", Accepted: " + (accepted == null ? "no accepted" : accepted) + "\nHistory: " + history;
	}

}
