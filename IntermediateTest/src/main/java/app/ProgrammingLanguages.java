package app;

public class ProgrammingLanguages {

	String name;
	String description;
	int levelOfConfidence;

	
	public ProgrammingLanguages(String name, String description,int levelOfConfidence) {
		
		this.name=name;
		this.description=description;
		this.levelOfConfidence=levelOfConfidence;
	}
	
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
		
	}
	public int getLevelOfConfidence() {
		return levelOfConfidence;
	}
	
	public void setName(String n) {
		this.name=n;
	}

	public void setDescription(String d) {
		this.description=d;
	}
	public void setLevelOfConfidence(int l) {
		this.levelOfConfidence=l;
	}
	
	


}
