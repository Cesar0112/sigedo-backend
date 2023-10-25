package cu.edu.cujae.backend.core.service;

import java.util.List;

import cu.edu.cujae.backend.core.dto.MunicipalityDto;

public interface MunicipalityService {
		List<MunicipalityDto> getMunicipalities();
		MunicipalityDto getMunicipalityById(String id);
		void createMunicipality(MunicipalityDto municipality);
		void updateMunicipalityDTO(MunicipalityDto municipality);
		void deleteMunicipality(String id);
}
