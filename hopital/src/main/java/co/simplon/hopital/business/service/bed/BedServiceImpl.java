package co.simplon.hopital.business.service.bed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.hopital.business.DTO.BedDTO;
import co.simplon.hopital.business.convert.BedConvert;
import co.simplon.hopital.persistance.repository.IBedRepository;

@Service
public class BedServiceImpl implements IBedService{
	
	private IBedRepository repo;

	@Override
	public List<BedDTO> getAllBed() {
		return BedConvert.getInstance().convertListEntityToListDTO(repo.findAll());
	}

	@Override
	public List<BedDTO> getAllFreeBed() {
		return BedConvert.getInstance().convertListEntityToListDTO(repo.getFreeBed());
	}
	
	@Override
	public void updateBed(final BedDTO bed) {
		repo.save(BedConvert.getInstance().convertDTOToEntity(bed));
	}

	@Autowired
	public void setRepo(IBedRepository repo) {
		this.repo = repo;
	}
	
	

}
