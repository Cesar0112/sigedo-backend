package cu.edu.cujae.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import cu.edu.cujae.backend.core.service.*;
import cu.edu.cujae.backend.core.dto.*;

// En estas implementaciones luego se pondraan las llamadas al proyecto backend
@Service
public class MunicipalityServiceImpl implements MunicipalityService{

	@Override
	public List<MunicipalityDto> getMunicipalities() {

		List<MunicipalityDto> municipalities = new ArrayList<>();
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Municipio Desconocido", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Arroyo Naranjo", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Boyero", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Centro Habana", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Cerro", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Cotorro", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Diez de Octubre", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Habana del Este", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "La Habana Vieja", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "La Lisa", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Marianao", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Playa", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Plaza de la Revolución", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Regla", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "San Miguel del Padrón", false));
//		municipalities.add(new MunicipalityDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Guanabacoa", false));

		return municipalities;
	}

	@Override
	public MunicipalityDto getMunicipalityById(String id) {
//		return getMunicipalities().stream().filter(r -> r.getId().equals(id)).findFirst().get();
	return null;
	}

	@Override
	public void createMunicipality(MunicipalityDto municipality) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMunicipalityDTO(MunicipalityDto municipality) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMunicipality(String id) {
		// TODO Auto-generated method stub
		
	}

}
