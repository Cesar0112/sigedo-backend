package cu.edu.cujae.backend.core.dto;

public class MunicipalityDto{

	private int id;
	private String name_municipality;
	private boolean newRecord;

	
	public MunicipalityDto() {
		super();
	}
	
	public MunicipalityDto(int id, String name_municipality, boolean newRecord) {
        this.id = id;
        this.name_municipality = name_municipality;
		this.newRecord = newRecord;
    }
	
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameMunicipality() {
        return name_municipality;
    }

    public void setNameMunicipality(String name_municipality) {
        this.name_municipality = name_municipality;
    }  
    
    @Override
    public String toString() {
        return  getId() + " " + getNameMunicipality();
    }

	public boolean isNewRecord() {
		return newRecord;
	}

	public void setNewRecord(boolean newRecord) {
		this.newRecord = newRecord;
	}
}
