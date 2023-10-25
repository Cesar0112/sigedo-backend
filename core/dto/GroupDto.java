package cu.edu.cujae.backend.core.dto;

public class GroupDto {
	private int id;
	private int year;
	private int numGroup;
	public GroupDto(int id,int year, int numGroup) {
		super();
		this.id = id;
		this.year = year;
		this.numGroup = numGroup;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getNumGroup() {
		return numGroup;
	}
	public void setNumGroup(int numGroup) {
		this.numGroup = numGroup;
	}

	@Override
	public String toString() {
		return "GroupDto [id=" + id + ", year=" + year + ", numGroup=" + numGroup + "]";
	}
	
	
	
	
}
