package com.caseStudyNotepad.notepadCrud.notesPlanner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StaticMethodReferenceDemo {
	 public StaticMethodReferenceDemo() {
		 
	 }
	 public boolean dateCheckToday(NotesPlanner p, LocalDate date) {
		 return p.check(date);
	 }
		/*
		 * public boolean dateCheckLastWeek(NotesPlanner p, LocalDate fromDate,LocalDate
		 * toDate) { return p.check(); }
		 * 
		 * public static void main(String [] args) { StaticMethodReferenceDemo demo=new
		 * StaticMethodReferenceDemo(); boolean result; LocalDate date
		 * =java.time.LocalDate.now(); result =
		 * demo.dateCheckToday(NotesPlannerChecker::isToday, date);
		 * System.out.println("Using static method reference: " + date + " isToday: " +
		 * result); result=demo.dateCheckLastWeek(NotesPlannerChecker::isLastWeek,)
		 * 
		 * }
		 */
	    
}
