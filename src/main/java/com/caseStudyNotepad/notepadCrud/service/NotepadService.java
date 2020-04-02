package com.caseStudyNotepad.notepadCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caseStudyNotepad.notepadCrud.entity.Notepad;
import com.caseStudyNotepad.notepadCrud.repository.NotepadRepository;

@Service
public class NotepadService {
	@Autowired 
         private NotepadRepository repository;
	
	public Notepad saveNote(Notepad note) {
		return repository.save(note);
	}
	public List<Notepad> saveNotes(List<Notepad> notes){
		return repository.saveAll(notes);
	}
	public List<Notepad> getAllNotes(){
		return repository.findAll();
	}
	public Notepad getNoteById(int id) {
		return repository.findById(id).orElse(null);
	}
	public String deleteProductById(int id) {
		repository.deleteById(id);
		return "Note removed!!" + id;
	}
	public Notepad updateNoteById(Notepad note) {
		Notepad existingNote =repository.findById(note.getId()).orElse(null);
		existingNote.setNoteName(note.getNoteName());
		existingNote.setNoteDescription(note.getNoteDescription());
		existingNote.setNoteDate(note.getNoteDate());
		return repository.save(existingNote);
	}
	
	
	
         
}
