package co.simplon.hopital.business.service.bed;

import java.util.List;

import co.simplon.hopital.business.dto.BedDTO;

public interface IBedService {
	
	public List<BedDTO> getAllBed();
	
	public List<BedDTO> getAllFreeBed();
	
	public void updateBed(final BedDTO bed);

}
