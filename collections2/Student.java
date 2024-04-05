package collections2;

public class Student {
	private String name;
	private char section;
	private String grade;
	private int age;
	private boolean isBright;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isBright() {
		return isBright;
	}
	public void setBright(boolean isBright) {
		this.isBright = isBright;
	}
	public Student(String name,char section,String grade,int age,boolean isBright) {
		this.name=name;
		this.section=section;
		this.grade=grade;
		this.age=age;
		this.isBright=isBright;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", section=" + section + ", grade=" + grade + ", age=" + age + ", isBright="
				+ isBright + "]";
	}
}

	
	

