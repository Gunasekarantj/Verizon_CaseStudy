package com.caseStudyNotepad.notepadCrud.notesPlanner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class NotesPlannerChecker {
   public static boolean isToday(LocalDate date) {
	   if(java.time.LocalDate.now().equals(date)) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   public static boolean isLastWeek(LocalDateTime fromDate,LocalDateTime toDate) {
	   Period period = getPeriod(fromDate, toDate);
	   if(period.getDays()==7) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   private static Period getPeriod(LocalDateTime dob, LocalDateTime now) {
       return Period.between(dob.toLocalDate(), now.toLocalDate());
   }
}
