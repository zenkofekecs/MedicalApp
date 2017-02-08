package main;
import java.util.Date;

public abstract class Person {
	
	private String title;
	
	private FullName name;
	
	private Date birthDate;
	
	private Gender gender;
	
	private Address homeAddress;
	
	private Phone phone;
	
	public Person (String title) {
		this.title = title;
	}

	
	public Person(String title, FullName name, Date birthDate, Gender gender) {
		this(title);
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public FullName getName() {
		return name;
	}

	public void setName(FullName name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Title: " + title + ", " + name + ", Gender: " + gender + ", BirthDate: " + 
	(birthDate == null ? "nothing" : birthDate) + ", Address: " + 
				(homeAddress == null ? "nothing" : homeAddress) + ", Phone: " + (phone == null ? "nothing" : phone);
	}
}
