package arrayListCol;

public class VectorData {
	
	private int Id;
	private String Name;
	private String Section;
	private String[] Subjects;
	
	public VectorData() {
		
	};
	
	public VectorData(int id, String name, String section, String[] subjects ){
		
		this.Id=id;
		this.Name=name;
		this.Section=section;
		this.Subjects=subjects;
	}
	
	public int getId() {
		return Id;
	}
	public String getName() {
		return Name;
	}
	public String getSection() {
		return Section;
	}
	
	public String[] getSubjects() {
		return Subjects;
	}

}
