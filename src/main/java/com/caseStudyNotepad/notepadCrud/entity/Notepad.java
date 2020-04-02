package com.caseStudyNotepad.notepadCrud.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Notepad_TBL")
public class Notepad {
	    @Id
	    @GeneratedValue
       private int id;
	   private String noteName;
       private String noteDescription;
       private Date noteDate;
       
       public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNoteName() {
			return noteName;
		}
		public void setNoteName(String noteName) {
			this.noteName = noteName;
		}
		public String getNoteDescription() {
			return noteDescription;
		}
		public void setNoteDescription(String noteDescription) {
			this.noteDescription = noteDescription;
		}
		public Date getNoteDate() {
			return noteDate;
		}
		public void setNoteDate(Date noteDate) {
			this.noteDate = noteDate;
		}
       
       
}
