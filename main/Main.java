package main;


import java.util.Calendar;
import java.util.GregorianCalendar;

import client.Patient;
import organization.Hospital;
import staff.department.employee.Doctor;
import staff.department.employee.Nurse;
import staff.department.employee.Surgeon;
import staff.department.employee.Receptionist;
import staff.department.employee.Technician;
import staff.department.employee.Technologist;
import staff.department.employee.SurgicalTechnologist;

public class Main {

	public static void main(String... args) {

		Hospital hospitalAlameda = new Hospital("Alameda", new Address("England", "London", "152 Harley Street"),
				new Phone());
		Hospital hospitalHighland = new Hospital("Highland", new Address("England", "Liverpool", "Locked Bag 7130"),
				new Phone());

		Doctor doctorOne = new Doctor("Doctor");
		doctorOne.setName(new FullName("Jack", "", ""));
		doctorOne.addLanguage("English");
		doctorOne.addLanguage("French");
		doctorOne.addLanguage("German");
		doctorOne.setGender(Gender.male);
		doctorOne.setBirthDate(new GregorianCalendar(1977, Calendar.FEBRUARY, 12).getTime());
		doctorOne.setHomeAddress(new Address("England", "London", "412 Street"));
		Phone phone = new Phone();
		phone.addPhone("52578545");
		phone.addPhone("5666-64654");
		doctorOne.setPhone(phone);

		Doctor doctorTwo = new Doctor("Doctor");
		doctorTwo.setName(new FullName("Jane", "", ""));
		doctorTwo.addLanguage("Dutch");
		doctorTwo.setGender(Gender.female);
		doctorTwo.setBirthDate(new GregorianCalendar(1955, Calendar.JUNE, 23).getTime());

		Doctor doctorThree = new Doctor("Doctor");
		doctorThree.setName(new FullName("Jill", "", ""));
		doctorThree.setGender(Gender.female);
		doctorThree.setBirthDate(new GregorianCalendar(1963, Calendar.SEPTEMBER, 28).getTime());

		hospitalAlameda.addToStaff(doctorOne);
		hospitalAlameda.addToStaff(doctorTwo);
		hospitalHighland.addToStaff(doctorThree);

		Surgeon surgeonOne = new Surgeon("Surgeon");
		surgeonOne.setName(new FullName("Sally", "", ""));
		surgeonOne.addCertification("Certification 1");
		surgeonOne.addCertification("Certification 2");

		Surgeon surgeonTwo = new Surgeon("Surgeon");
		surgeonTwo.setName(new FullName("Sam", "", ""));
		surgeonTwo.addCertification("Certification 1");

		Surgeon surgeonThree = new Surgeon("Surgeon");
		surgeonThree.setName(new FullName("Scarlett", "", ""));

		hospitalAlameda.addToStaff(surgeonOne);
		hospitalAlameda.addToStaff(surgeonTwo);
		hospitalHighland.addToStaff(surgeonThree);

		Receptionist receptionistOne = new Receptionist("Receptionist");
		receptionistOne.setName(new FullName("Ryan", "", ""));

		Receptionist receptionistTwo = new Receptionist("Receptionist");
		receptionistTwo.setName(new FullName("Rose", "", ""));

		Receptionist receptionistThree = new Receptionist("Receptionist");
		receptionistThree.setName(new FullName("Rihanna", "", ""));

		hospitalAlameda.addToStaff(receptionistOne);
		hospitalHighland.addToStaff(receptionistTwo);
		hospitalHighland.addToStaff(receptionistThree);
		
		Nurse nurseOne = new Nurse("Nurse");
		nurseOne.setName(new FullName("Neo", "", ""));
		nurseOne.setGender(Gender.male);

		Nurse nurseTwo = new Nurse("Nurse");
		nurseTwo.setName(new FullName("Nate", "", ""));
		nurseTwo.setGender(Gender.male);

		Nurse nurseThree = new Nurse("Nurse");
		nurseThree.setName(new FullName("Nick", "", ""));
		nurseThree.setGender(Gender.male);

		hospitalAlameda.addToStaff(nurseOne);
		hospitalAlameda.addToStaff(nurseTwo);
		hospitalAlameda.addToStaff(nurseThree);

		Technician technicianOne = new Technician("Technician");
		technicianOne.setName(new FullName("Tom", "", ""));
		technicianOne.setJoined(new GregorianCalendar(2010, Calendar.JANUARY, 22).getTime());

		Technician technicianTwo = new Technician("Technician");
		technicianTwo.setName(new FullName("Thor", "", ""));
		technicianTwo.setJoined(new GregorianCalendar(2008, Calendar.FEBRUARY, 12).getTime());

		Technician technicianThree = new Technician("Technician");
		technicianThree.setName(new FullName("Tim", "", ""));

		hospitalAlameda.addToStaff(technicianOne);
		hospitalAlameda.addToStaff(technicianTwo);
		hospitalHighland.addToStaff(technicianThree);

		Technologist technologistOne = new Technologist("Technologist");
		technologistOne.setName(new FullName("Greg", "", ""));

		Technologist technologistTwo = new Technologist("Technologist");
		technologistTwo.setName(new FullName("Grace", "", ""));
		technologistTwo.setJoined(new GregorianCalendar(2000, Calendar.MAY, 02).getTime());

		hospitalAlameda.addToStaff(technologistOne);
		hospitalHighland.addToStaff(technologistTwo);

		SurgicalTechnologist surgtechnologistOne = new SurgicalTechnologist("SurgicalTechnologist");
		surgtechnologistOne.setName(new FullName("Helena", "", ""));

		SurgicalTechnologist surgtechnologistTwo = new SurgicalTechnologist("SurgicalTechnologist");
		surgtechnologistTwo.setName(new FullName("Heather", "", ""));

		SurgicalTechnologist surgtechnologistThree = new SurgicalTechnologist("SurgicalTechnologist");
		surgtechnologistThree.setName(new FullName("Harvey", "", ""));

		hospitalAlameda.addToStaff(surgtechnologistOne);
		hospitalHighland.addToStaff(surgtechnologistTwo);
		hospitalHighland.addToStaff(surgtechnologistThree);

		Patient patientOne = new Patient("1", 40, "Patient", new FullName("Neil", "", "Piper"),
				new GregorianCalendar(1977, Calendar.FEBRUARY, 15).getTime(), Gender.male,
				new GregorianCalendar(2016, Calendar.OCTOBER, 22).getTime());
		Patient patientTwo = new Patient("2", 25, "Patient", new FullName("Andrea", "", "Lewis"),
				new GregorianCalendar(1992, Calendar.MAY, 21).getTime(), Gender.female,
				new GregorianCalendar(2015, Calendar.AUGUST, 11).getTime());
		Patient patientThree = new Patient("3", 54, "Patient", new FullName("Amanda", "", "Walsh"),
				new GregorianCalendar(1963, Calendar.JULY, 23).getTime(), Gender.female,
				new GregorianCalendar(2012, Calendar.NOVEMBER, 17).getTime());
		Patient patientFour = new Patient("4", 66, "Patient", new FullName("Rose", "", "Johnston"),
				new GregorianCalendar(1951, Calendar.FEBRUARY, 25).getTime(), Gender.female,
				new GregorianCalendar(2015, Calendar.MAY, 06).getTime());
		Patient patientFive = new Patient("5", 55, "Patient", new FullName("David", "", "Rutherford"),
				new GregorianCalendar(1962, Calendar.MARCH, 19).getTime(), Gender.male,
				new GregorianCalendar(2011, Calendar.MARCH, 12).getTime());
		Patient patientSix = new Patient("6", 31, "Patient", new FullName("Kimberly", "", "James"),
				new GregorianCalendar(1986, Calendar.OCTOBER, 31).getTime(), Gender.female,
				new GregorianCalendar(2011, Calendar.APRIL, 26).getTime());

		doctorOne.addPatient(patientOne);
		doctorOne.addPatient(patientTwo);

		doctorTwo.addPatient(patientThree);


		patientOne.getHistory().addAllergy("alerThree");
		patientOne.getHistory().addAllergy("alerTwo");
		patientOne.getHistory().addAllergy("alerOne");
		patientOne.getHistory().addPrescription("prescriptionOne");

		patientTwo.getHistory().addAllergy("alerOne");
		patientTwo.getHistory().addAllergy("alerFour");
		patientTwo.getHistory().addPrescription("prescriptionTwo");

		patientThree.getHistory().addPrescription("prescriptionThree");

		hospitalAlameda.addPerson(patientOne);
		hospitalAlameda.addPerson(patientTwo);
		hospitalAlameda.addPerson(patientThree);
		hospitalHighland.addPerson(patientFour);
		hospitalHighland.addPerson(patientFive);
		hospitalHighland.addPerson(patientSix);


		 /* 1. Which patients do they have for each hospital? 2. What are the
		 * patient's details?*/
		System.out.println("\n1, 2 ");
		System.out.println("Patient`s details for  hospital " + hospitalAlameda.getName());
		hospitalAlameda.showPatients();
		System.out.println("Patient`s details for  hospital " + hospitalHighland.getName());
		hospitalHighland.showPatients();


		/* 4. What languages does each staff member speak?*/
		System.out.println("\n4.");
		System.out.println("Languages: ");
		hospitalAlameda.showLanguagesForStaff();


		/* 5. What are the phone numbers for each hospital?*/
		System.out.println("\n5.");
		System.out.println("Phones numbers for " + hospitalAlameda.getName());
		hospitalAlameda.addPhone("124554556");
		hospitalAlameda.addPhone("659545454");
		hospitalAlameda.showPhoneNumbers();
		System.out.println("Phones for " + hospitalHighland.getName());
		hospitalHighland.showPhoneNumbers();

		/* 6. How old are each of the patients and what is their prescription?*/
		System.out.println("\n6.");
		System.out.println("Age patients and prescriptions: ");
		hospitalAlameda.showPatientsAgeAndPrescriptions();
		hospitalHighland.showPatientsAgeAndPrescriptions();


		 /* 8. The patients sorted by their date, when they entered the hospital,
		 * descending by date please*/
		System.out.println("\n8.");
		System.out.println("Patients sorted by their entered date");
		try {
			hospitalAlameda.showPatientsSortedByEnterDate();
		} finally {
			System.out.println("The sorting finished.");
		}

		 /* 9. The employees should be shown sorted by their certification. (each
		 * employee might have multiple or no certification)*/
		System.out.println("\n9.");
		System.out.println("Employees sorted by number of certification:");
		try {
			hospitalAlameda.showEmployeesSortByNumberCertifications();
		} finally {
			System.out.println("Sorted.");
		}

		/* 10. Technical employees should be shown and sorted by the date when
		 * they were employed by each hospital*/
		System.out.println("\n10.");
		System.out.println("Technical employees sorted for " + hospitalAlameda.getName() + ":");
		hospitalAlameda.showTechnicalEmployeesSortByDate();
		System.out.println("Technical employees sorted for " + hospitalHighland.getName() + ":");
		hospitalHighland.showTechnicalEmployeesSortByDate();

		 /* 11. There should be a report to show how much is the percentage of
		 * male patients vs female patients*/
		System.out.println("\n11.");
		System.out.println("Percentage of male patients\n vs female patients");
		hospitalAlameda.showPercentMaleVsFemale();


		 /* 12. What are the special requirements for each patient grouped by the
		 * doctor taking care of him/her for each hospital.*/
		System.out.println("\n12.");
		System.out.println("Special requirements for " + hospitalAlameda.getName() + ":");
		hospitalAlameda.showSpecialReqsForEachPatientGroupByDoctor();
		System.out.println("Special requirements for " + hospitalHighland.getName() + ":");
		hospitalHighland.showSpecialReqsForEachPatientGroupByDoctor();

		
		 /* 13. What therapies are prescribed to each patient*/
		System.out.println("\n13.");
		System.out.println("Therapies:");
		hospitalAlameda.showTherapiesPresToPatient();

		
		 /* 15. Show the rating for each doctor and nurse order by the best to
		 * the lowest for each hospital*/

		System.out.println("\n15.");
		System.out.println("Rating for " + hospitalAlameda.getName() + ":");
		hospitalAlameda.showRatingDoctorAndNurseOrder();
		System.out.println("Rating for " + hospitalHighland.getName() + ":");
		hospitalHighland.showRatingDoctorAndNurseOrder();

	}

}
