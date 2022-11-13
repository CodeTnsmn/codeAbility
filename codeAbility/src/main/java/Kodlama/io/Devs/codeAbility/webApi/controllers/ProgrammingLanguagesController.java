package Kodlama.io.Devs.codeAbility.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.codeAbility.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.codeAbility.entities.concretes.ProgrammingLanguage;


@RestController
@RequestMapping("/api/programmingLanguages")
	public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;
	
@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		
		this.programmingLanguageService = programmingLanguageService;
	}

@GetMapping("/getAll")
public List<ProgrammingLanguage> getAll(){
	return programmingLanguageService.getAll();
}

@PostMapping
public void add(ProgrammingLanguage language) throws Exception {
	
	programmingLanguageService.add(language);

}
@DeleteMapping
public void delete(int id) throws Exception {
	programmingLanguageService.delete(id);
}
@PatchMapping
public void update(int id, ProgrammingLanguage updateLanguage) throws Exception {
	programmingLanguageService.update(id, updateLanguage);
}
@GetMapping("/getbyid")
public ProgrammingLanguage getById(int id) throws Exception {
	return programmingLanguageService.getById(id);
}


}
