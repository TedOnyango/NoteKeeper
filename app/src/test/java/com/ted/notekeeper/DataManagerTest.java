
package com.ted.notekeeper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataManagerTest {

    @Test
    public void createNewNote() throws Exception{
        DataManager dm = DataManager.getInstance();
        final CourseInfo course = dm.getCourse("android_async");
        final String noteTitle = "Test Note Title";
        final String noteText = "This is the body of the text that we want to check out";

       int noteIndex = dm.createNewNote();
       NoteInfo newNote = dm.getNotes().get(noteIndex);
       newNote.setCourse(course);
       newNote.setTitle(noteTitle);
       newNote.setText(noteText);

       NoteInfo compareNote = dm.getNotes().get(noteIndex);
       assertEquals(compareNote.getCourse(), course);
       assertEquals(compareNote.getTitle(), noteTitle);
       assertEquals(compareNote.getText(), noteText);

    }

    @Test
    public void findNote() {
        DataManager dm = DataManager.getInstance();

        


    }
}