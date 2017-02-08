package staff;

import java.util.Arrays;
import java.util.Date;

import main.Addable;
import main.Person;

public class Staff extends Person implements Addable {
	
    protected Date joined;
	
	public Date getJoined() {
		return joined;
	}

	public void setJoined(Date joined) {
		this.joined = joined;
	}
	private String languages[];
	private String certification[];

	public Staff(String title) {
		super(title);
		certification = new String[SIZE];
		languages = new String[SIZE];
	}

	public void showLanguages() {
		System.out.println(String.join(", ", languages));
	}

	public boolean areLanguages() {
		return languages[0] != null;
	}

	public void addLanguage(String lang) {
		add(lang, languages);
	}

	public void addCertification(String cert) {
		add(cert, certification);
	}
	
    public int getNumCertifications() {
		
		return Arrays.stream(certification).filter(cert -> cert != null).toArray(size -> new String[size]).length;
	}
	
@Override
	public void add(String item, String[] type) {

	    languages[SIZE] = item;
	}

	public int getNumberOfCertifications() {
		int num = 0;
		for (String s : certification) {
			if (s != null) {
				num++;
			}
		}
		return num;
	}

}
