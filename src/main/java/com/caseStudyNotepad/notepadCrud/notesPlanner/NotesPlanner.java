package com.caseStudyNotepad.notepadCrud.notesPlanner;

import java.time.LocalDate;

@FunctionalInterface
public interface NotesPlanner {
   boolean check(LocalDate date);
}
