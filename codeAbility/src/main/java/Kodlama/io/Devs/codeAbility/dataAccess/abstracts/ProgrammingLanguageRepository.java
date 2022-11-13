package Kodlama.io.Devs.codeAbility.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.codeAbility.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage language);
	void delete(int id);
	void update(int id,ProgrammingLanguage updateLanguage);
	ProgrammingLanguage getById(int id) throws Exception;
}
