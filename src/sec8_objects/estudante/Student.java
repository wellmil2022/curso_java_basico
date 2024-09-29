package sec8_objects.estudante;

import java.util.Arrays;

public class Student {
	private String name;
	private double[] note;
	private double finalGrade;

	public double[] getNote() {
		return note;
	}

	public void setNote(double[] note) {
		this.note = note;
	}
	
	/**
	 * @return the finalGrade
	 */
	public double getFinalGrade() {
		return finalGrade;
	}

	/**
	 * @param finalGrade the finalGrade to set
	 */
	public void setFinalGrade(double[] note) {
		this.finalGrade = note[0] + note[1] + note[2];
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [note=" + Arrays.toString(note) + "]";
	}
	
	public double missingPoints() {
		if (this.finalGrade < 60.00) {
			return 60.00 - this.finalGrade;
		} else return 0.0;
		
	}

}
