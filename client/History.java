package client;

import main.Addable;

public class History implements Addable{

        private String []prescription;
	private String []allergy;
	private String []specialReqs;

	public History () {
		prescription = new String[SIZE];
		allergy = new String[SIZE];
		specialReqs = new String[SIZE];
	}
	public String [] getPrescription() {
		return prescription;
	}
	
	public void addAllergy(String allerg) {
		add(allerg, allergy); 
	}
        
        public void addPrescription(String prescript) {
		add(prescript, prescription); 
	}
	
	@Override
	public void add(String item, String []type) {

		for (int i = 0; i < type.length; i ++) {
			if (type[i] == null) {
				type[i] = item;
				return;
			}
		}
		String [] newType = new String[SIZE];
		if (type == allergy) {
			allergy = newType;
			allergy[SIZE] = item; 
		} else if (type == prescription) {
			prescription = newType;
			prescription[SIZE] = item; 
		}
		specialReqs = newType;
		specialReqs[SIZE] = item; 

	}
	
	public String showPrescriptions() {
		return prescription[0] == null ? "nothing" : String.join(", ", prescription);
	}
	
	public String showAllergies() {
		return allergy[0] == null ? "nothing" : String.join(", " , allergy);
	}
	
	public String showSpecialReqs() {
		return specialReqs[0] == null ? "nothing" : String.join(", " , specialReqs);
	}
	
	@Override
	public String toString() {
		return "\nPresctiprions:" + showPrescriptions() + "\nAllergies:" + showAllergies() + "\nSpecialReqs:" +showSpecialReqs() + "\n";
	}

	
}
