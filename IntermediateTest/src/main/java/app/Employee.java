package app;

import java.util.List;

import com.google.gson.Gson;

public class Employee {
	
	private String name;
	private String surname;
	private int age;
	private LivingPlace livingPlace;
	private List<ProgrammingLanguages> programmingLanguages;
	
	
	public Employee(String name,String surname,int age,LivingPlace lp,List<ProgrammingLanguages> pl) {
		
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.livingPlace=lp;
		this.programmingLanguages=pl;
		
	}
	public Employee() {}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getAge() {
		return age;
	}
	
	public LivingPlace getLivingPlace() {
		return livingPlace;
	}

	public List<ProgrammingLanguages> getPL(){
		return programmingLanguages;
	}
	public void setName(String c) {
		this.name=c;
	}
	public void setSurname(String p) {
		this.surname=p;
	}
	public void setLivingPlace(LivingPlace p) {
		this.livingPlace=p;
	}
	public void setProgrammingLanguages(List<ProgrammingLanguages> pl) {
		this.programmingLanguages=pl;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	
	public String toJSON(Employee e) {
		
		String jsonInString = new Gson().toJson(e);
		return jsonInString;
	}
	
	
	
	
	
	

	
	

	
	
	

}
