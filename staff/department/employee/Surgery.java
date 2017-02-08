package staff.department.employee;

import client.Patient;
import java.util.Date;

public class Surgery extends Treatment {
        private Date date;
	private Patient patient;
    
    public Surgery (Date date, String diag) {
		super(diag);
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
