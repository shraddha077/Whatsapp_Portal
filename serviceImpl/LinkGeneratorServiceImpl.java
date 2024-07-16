package com.mypromotions.serviceImpl;

import com.mypromotions.model.LinkGenerator;
import com.mypromotions.repository.LinkGeneratorRepository;
import com.mypromotions.service.LinkGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkGeneratorServiceImpl implements LinkGeneratorService {

    @Autowired
    private LinkGeneratorRepository linkGeneratorRepository;

    @Override
    public List<LinkGenerator> getAllLinks() {
        return linkGeneratorRepository.findAll();
    }

	@Override
	public LinkGenerator generateLink(LinkGeneratorRepository linkGeneratorRepository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkGenerator getLinkById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LinkGenerator> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkGenerator findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkGenerator save(LinkGenerator linkGenerator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LinkGenerator generateLink(LinkGeneratorService linkGeneratorDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return null;
	}
}
