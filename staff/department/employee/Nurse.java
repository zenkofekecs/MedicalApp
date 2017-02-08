package staff.department.employee;

import client.Patient;
import java.util.ArrayList;
import java.util.List;
import staff.department.OperationsStaff;

public class Nurse extends OperationsStaff {
    public List<Patient> patients;

    public Nurse(String title) {
		super(title);
		patients = new ArrayList<>();
	}
	
	public void addPatient(Patient pat) {
		patients.add(pat);
	}
	
	public int getNumberPatients() {
		return patients.size();
	}
}
