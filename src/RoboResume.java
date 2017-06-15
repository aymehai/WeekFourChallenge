public class RoboResume {

	private NameAndEmail nameNEmail;
	private Education edu;
	private Work work;
	private Skills skills;

	public RoboResume() {
		this.nameNEmail = new NameAndEmail();
		this.edu = new Education();
		this.work = new Work();
		this.skills = new Skills();
	}

	// Name And Email Methods
	public String getRoboResumeNameNEmail() {
		nameNEmail.getNameAndEmail();
		return "";
	}

	public String setRoboResumeNameNEmail() {
		nameNEmail.setNameAndEmail();
		return "";
	}

	// Education Methods
	public String getRoboResumeEducation() {

		return edu.getEducation();
	}

	public void setRoboResumeEducation(String input) {
		edu.setEducation(input);
	}

	// Work Methods

	public String getRoboResumeWork() {
		return work.getWork();
	}

	public void setRoboResumeWork(String input) {
		work.setWork(input);
	}

	// Skills Methods

	public String getRoboResumeSkills() {
		return skills.getSkills();
	}

	public void setRoboResumeSkills(String input) {
		skills.setSkills(input);
	}

	// To String

	public String toString() {
		System.out.println("========================================");
		nameNEmail.getNameAndEmail();
		System.out.println(" ");
		System.out.println("EDUCATION");
		edu.getEducation();
		System.out.println(" ");
		System.out.println("WORK");
		work.getWork();
		System.out.println(" ");
		System.out.println("SKILLS");
		skills.getSkills();

		return "";
	}
}
