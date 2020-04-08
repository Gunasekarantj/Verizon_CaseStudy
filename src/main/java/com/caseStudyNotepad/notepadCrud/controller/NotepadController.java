package com.caseStudyNotepad.notepadCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caseStudyNotepad.notepadCrud.entity.Notepad;
import com.caseStudyNotepad.notepadCrud.service.NotepadService;

@RestController
@Validated
@RequestMapping("/api/v1")
public class NotepadController {
	@Autowired
   private  NotepadService service;
	@PostMapping("/notepad")
	public Notepad saveNote(@RequestBody Notepad note) {
		return service.saveNote(note);
	}

	/*
	 * @PostMapping("/saveNotes") public List<Notepad> saveNotes(@RequestBody
	 * List<Notepad> notes){ return service.saveNotes(notes); }
	 */
	@GetMapping("/notepads")
	public List<Notepad> getAllNotes(){
		return service.getAllNotes();
	}
	@GetMapping("/notepad/{id}")
	public Notepad getNoteById(@PathVariable int id) {
		return service.getNoteById(id);
	}
	@DeleteMapping("/notepad/{id}")
	public String deleteProductById(@PathVariable int id) {
		return service.deleteProductById(id);
	}
	@PutMapping("/notepad")
	public Notepad updateNoteById(@RequestBody Notepad note) {
		return service.updateNoteById(note);
	}
	
   
}
