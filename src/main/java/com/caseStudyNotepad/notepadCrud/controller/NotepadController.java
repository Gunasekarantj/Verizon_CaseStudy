package com.caseStudyNotepad.notepadCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.caseStudyNotepad.notepadCrud.entity.Notepad;
import com.caseStudyNotepad.notepadCrud.service.NotepadService;

@RestController
public class NotepadController {
	@Autowired
   private  NotepadService service;
	@PostMapping("/saveNote")
	public Notepad saveNote(@RequestBody Notepad note) {
		return service.saveNote(note);
	}
	@PostMapping("/saveNotes")
	public List<Notepad> saveNotes(@RequestBody List<Notepad> notes){
		return service.saveNotes(notes);
	}
	@GetMapping("/notepad")
	public List<Notepad> getAllNotes(){
		return service.getAllNotes();
	}
	@GetMapping("/notepad/{id}")
	public Notepad getNoteById(@PathVariable int id) {
		return service.getNoteById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteProductById(@PathVariable int id) {
		return service.deleteProductById(id);
	}
	@PutMapping("/update")
	public Notepad updateNoteById(@RequestBody Notepad note) {
		return service.updateNoteById(note);
	}
	
   
}
