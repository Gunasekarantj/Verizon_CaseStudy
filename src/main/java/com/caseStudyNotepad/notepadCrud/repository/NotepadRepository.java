package com.caseStudyNotepad.notepadCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caseStudyNotepad.notepadCrud.entity.Notepad;

public interface NotepadRepository extends JpaRepository<Notepad,Integer>{

}
