package com.mypromotions.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mypromotions.model.LinkGenerator;
import com.mypromotions.repository.LinkGeneratorRepository;
import com.mypromotions.service.LinkGeneratorService;


@Service
public class PerformanceMonitoringServiceImpl implements LinkGeneratorService {

    @Autowired
    private LinkGeneratorRepository linkGeneratorRepository;

    @Override
    public LinkGenerator generateLink(LinkGeneratorService linkGeneratorDTO) {
        LinkGenerator linkGenerator = new LinkGenerator();
        linkGenerator.setUrl(linkGeneratorDTO.getUrl());
        return linkGeneratorRepository.save(linkGenerator);
    }

    @Override
    public LinkGenerator getLinkById(Long id) {
        return linkGeneratorRepository.findById(id).orElse(null);
    }

    @Override
    public List<LinkGenerator> findAll() {
        return linkGeneratorRepository.findAll();
    }

    @Override
    public LinkGenerator save(LinkGenerator linkGenerator) {
        return linkGeneratorRepository.save(linkGenerator);
    }

    @Override
    public void deleteById(Long id) {
        linkGeneratorRepository.deleteById(id);
    }

	@Override
	public LinkGenerator generateLink(LinkGeneratorRepository linkGeneratorRepository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkGenerator findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LinkGenerator> getAllLinks() {
		// TODO Auto-generated method stub
		return null;
	}
}
