package Kodlama.io.Devs.codeAbility.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.codeAbility.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.codeAbility.entities.concretes.ProgrammingLanguage;


@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages;
	
	
	
	public InMemoryProgrammingLanguageRepository() {
		languages=new ArrayList<ProgrammingLanguage>();
		
		languages.add(new ProgrammingLanguage(1,"JAVA"));
		languages.add(new ProgrammingLanguage(2,"PYTHON"));
		languages.add(new ProgrammingLanguage(3,"C#"));
		languages.add(new ProgrammingLanguage(4,"C++"));
	}



	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return languages;
	}



	@Override
	public void add(ProgrammingLanguage language) {
		languages.add(language);		
	}



	@Override
	public void delete(int id) {
		languages.remove(id);
		
	}



	@Override
	public void update(int id, ProgrammingLanguage updateLanguage) {
		for(ProgrammingLanguage programmingLanguage:languages) {
			if(programmingLanguage.getId()==id) {
				programmingLanguage.setName(updateLanguage.getName());
			}
		}
		
	}



	@Override
	public ProgrammingLanguage getById(int id) throws Exception {
		
		for(ProgrammingLanguage programmingLanguage:languages) {
			if(programmingLanguage.getId()==id) {
				return programmingLanguage;
			}
		}
		throw new Exception("Memory hatası aldınız.");
	}

	
}
