package Kodlama.io.Devs.codeAbility.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Kodlama.io.Devs.codeAbility.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.codeAbility.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.codeAbility.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	
@Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
	
	this.programmingLanguageRepository = programmingLanguageRepository;
}
	
@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguageRepository.getAll();
	}

@Override
public void add(ProgrammingLanguage language) throws Exception {
	if(language.getName().isEmpty()) {
		throw new Exception("Programlama dilini boş bırakmayınız.");
	}
	
	for (ProgrammingLanguage programmingLanguage:getAll()) {
		if(language.getName().equals(language.getName())) {
			throw new Exception("Programlama dili tekrar edemez.");
		}
	}
	programmingLanguageRepository.add(language);
}

@Override
public void delete(int id) throws Exception {
	for(ProgrammingLanguage language:getAll()) {
		if(language.getId()==id) {
			programmingLanguageRepository.delete(id);
		}else {
			throw new Exception("Sistemde böyle bir programlama dili yok.");
		}
	}
	
}

@Override
public void update(int id, ProgrammingLanguage updateLanguage) throws Exception {

	for(ProgrammingLanguage language : getAll()) {
		if(language.getId()==id) {
			programmingLanguageRepository.update(id,updateLanguage);
		}else {
			throw new Exception("Sistemde böyle bir programlama dili yok.");
		}
	}
	
}

@Override
public ProgrammingLanguage getById(int id) throws Exception {
	
	return programmingLanguageRepository.getById(id);
}




	
}
