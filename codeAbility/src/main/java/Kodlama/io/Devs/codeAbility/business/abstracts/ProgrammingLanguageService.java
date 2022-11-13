package Kodlama.io.Devs.codeAbility.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.codeAbility.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	List<ProgrammingLanguage> getAll();
	
	void add(ProgrammingLanguage language) throws Exception;
	
	void delete (int id) throws Exception;
	
	void update(int id,ProgrammingLanguage updateLanguage) throws Exception;
	
	ProgrammingLanguage getById(int id) throws Exception;
}
