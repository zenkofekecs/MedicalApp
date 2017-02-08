package staff.department.employee;

import client.Patient;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import main.Addable;
import staff.department.OperationsStaff;

public class Doctor extends OperationsStaff implements Addable {
	public List<Patient> patients;
	private String[] specialty;
	private String[] locations;
	private Map<Patient, List<Diagnosis>> diagnosis;

	public Doctor(String title) {
		super(title);
		specialty = new String[SIZE];
		locations = new String[SIZE];
		diagnosis = new HashMap<>();
	}
        
        public void addPatient(Patient pat) {
		diagnosis.put(pat, new ArrayList<>());
	}

	@Override
	public void add(String item, String[] type) {
		for (int i = 0; i < type.length; i++) {
			if (type[i] == null) {
				type[i] = item;
				return;
			}
		}
		String[] newType = new String[SIZE];

		if (type == specialty) {
			specialty = newType;
			specialty[SIZE] = item;
		}

		locations = newType;
		locations[SIZE] = item;
	}

	public Set<Patient> getPatients() {
		return diagnosis.keySet();
	}

	public List<Diagnosis> getDiagnosis(Patient p) {
		return diagnosis.get(p);
	}

}
