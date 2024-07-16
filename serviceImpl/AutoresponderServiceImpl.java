package com.mypromotions.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mypromotions.model.Autoresponder;
import com.mypromotions.repository.AutoresponderRepository;
import com.mypromotions.service.AutoresponderService;

@Service
public class AutoresponderServiceImpl implements AutoresponderService {

    @Autowired
    private AutoresponderRepository autoresponderRepository;

    @Override
    public Autoresponder createAutoresponder(Autoresponder autoresponder ) {
        Autoresponder autoresponders = new Autoresponder();
        autoresponders.setMessage(autoresponders.getMessage());
        autoresponders.setTrigger(autoresponders.getTrigger());
        return autoresponderRepository.save(autoresponders);
    }

    @Override
    public Autoresponder getAutoresponderById(Long id) {
        return autoresponderRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteAutoresponder(Long id) {
        autoresponderRepository.deleteById(id);
    }

    @Override
    public List<Autoresponder> findAll() {
        return autoresponderRepository.findAll();
    }

    @Override
    public Autoresponder save(Autoresponder autoresponder) {
        return autoresponderRepository.save(autoresponder);
    }

	@Override
	public Autoresponder createAutoresponder(AutoresponderRepository autoresponderRepository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autoresponder findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
}
