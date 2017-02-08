package organization;

import java.util.ArrayList;
import java.util.List;

import client.Patient;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import main.Address;
import main.Gender;
import main.Person;
import main.Phone;
import staff.Staff;
import staff.department.OperationsStaff;

import staff.department.TechnicalStaff;
import staff.department.employee.Doctor;
import staff.department.employee.Nurse;

public class Hospital {
	private String name;
	private Address address;
	private Phone phone;
	private List<Person> persons;
	private List<Staff> staffs;

	public Hospital(String name, Address address, Phone phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		persons = new ArrayList<>();
		staffs = new ArrayList<>();
	}

	public void addToStaff(Staff staff) {
		staffs.add(staff);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void showPhoneNumbers() {
		System.out.println(phone.isEmpty() ? "No phones for hospital " + name : phone.getPhones());
	}

	public void addPerson(Person person) {
		persons.add(person);
	}

	public void addPhone(String phone) {
		this.phone.addPhone(phone);
	}

	public void showPatients() {
		StringBuilder sb = new StringBuilder();
		for (Person pers : persons) {
			if (pers.getTitle().equals("Patient")) {
				sb.append(pers);
			}
		}
		System.out.println(sb);

	}

	public void showLanguagesForStaff() {
		staffs.forEach(item -> {
			if (!item.areLanguages()) {
				System.out.println("No languages for " + item.getName());
				return;
			}
			System.out.println("Languages for " + item.getName() + ":");
			item.showLanguages();
		});

	}

	public void showPatientsAgeAndPrescriptions() {
		persons.forEach(item -> {
			if (item instanceof Patient) {
				Patient pat = (Patient) item;
				System.out.println(pat.getAge() + ", Prescriptions: " + pat.getHistory().showPrescriptions());
			}
		});
	}

	public void showPatientsSortedByEnterDate() {
		Patient[] patients = persons.stream()
				.filter(pers -> pers instanceof Patient && ((Patient) pers).getAccepted() != null)
				.toArray(size -> new Patient[size]);

		Arrays.sort(patients, Comparator.comparing(Patient::getAccepted).reversed());
		Arrays.stream(patients)
				.forEach(p -> System.out.println(p.getName() + ", Accepted: " + p.getAccepted()));
	}

	public void showEmployeesSortByNumberCertifications() {
		Collections.sort(staffs, new Comparator<Staff>() {

			@Override
			public int compare(Staff o1, Staff o2) {
				int dif = o1.getNumberOfCertifications() - o2.getNumberOfCertifications();
				if (dif > 0) {
					return -1;
				} else if (dif < 0) {
					return 1;
				}
				return 0;
			}
		});
		staffs.forEach(emp -> {
			System.out.println(emp.getName() + ", Number of certifications: " + emp.getNumCertifications());
		});
	}

	public void showTechnicalEmployeesSortByDate() {

		TechnicalStaff[] tstaffs = staffs.stream()
				.filter(staf -> staf instanceof TechnicalStaff && ((TechnicalStaff) staf).getJoined() != null)
				.toArray(size -> new TechnicalStaff[size]);

		Arrays.sort(tstaffs, Comparator.comparing(TechnicalStaff::getJoined).reversed());
		Arrays.stream(tstaffs).forEach(p -> System.out.println(p.getName() + ", Accepted: " + p.getJoined()));

	}

	public void showPercentMaleVsFemale() {
		int numMale = 0;
		int numFemale = 0;

		int index = 0;
		while (index != persons.size()) {
			if (persons.get(index) instanceof Patient) {
				if (persons.get(index).getGender() == Gender.male) {
					numMale++;
				} else {
					numFemale++;
				}
			}
			index++;
		}

		System.out.println("Male vs Female, %: " + numMale * 100 / (numFemale + numMale) + " / "
				+ numFemale * 100 / (numFemale + numMale));
	}

	public void showSpecialReqsForEachPatientGroupByDoctor() {
		// TODO Auto-generated method stub
		int index = 0;

		do {
			if (staffs.get(index) instanceof Doctor) {
				Doctor doc = (Doctor) staffs.get(index);
				System.out.println(doc.getTitle() + ": " + doc.getName());
				if (doc.getPatients().isEmpty()) {
					System.out.println("no patients");
				}
				for (Patient pat : doc.getPatients()) {
					System.out.println("Patient: " + pat.getName());
					System.out.println("Special requirements: ");
					System.out.println(pat.getHistory().showSpecialReqs());
				}
			}
			index++;
		} while (index != staffs.size());
	}

	public void showTherapiesPresToPatient() {
		int index = 0;
		do {
			if (persons.get(index) instanceof Patient) {
				Patient p = (Patient) persons.get(index);
				System.out.println(p.getName() + ", Therapy: " + p.getHistory().showPrescriptions());
			}
			index++;
		} while (index != persons.size());
	}

	public void showRatingDoctorAndNurseOrder() {
		List<OperationsStaff> list = new ArrayList<>();
		int index = 0;

		while (index != staffs.size()) {
			switch (staffs.get(index).getTitle()) {
			case "Nurse":
			case "Doctor":
				list.add((OperationsStaff) staffs.get(index));
			}
			index++;
		}

		list.sort(Comparator.comparing(
				e -> (e instanceof Doctor ? ((Doctor) e).getPatients().size() : ((Nurse) e).getNumberPatients()))
				.reversed());
		list.forEach(item -> System.out.println(item));
	}
}
