package main;

import java.util.ArrayList;
import java.util.List;

public class Phone {
	private List<String> phones;

	public Phone() {
		phones = new ArrayList<String>();
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	
	public void addPhone(String phoness) {
		phones.add(phoness);
	}
	
	public boolean isEmpty() {
		return phones.isEmpty();
	}
	
	@Override
	public String toString() {
		return String.join(", ", phones);
	}

}
