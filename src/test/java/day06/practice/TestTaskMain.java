package day06.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TestTaskMain {
	

	@Test
	void testCreateTaskList() {
	    Task task1 = new Task("Write Testcase", 5);
	    Task task2 = new Task("Complete FacePrep", 4);
	
	    ArrayList<Task> actualList = TaskMain.createTaskList(task1, task2);
	
	    ArrayList<Task> expectedList = new ArrayList<Task>();
	    expectedList.add(task1);
	    expectedList.add(task2);
	
	    assertEquals(expectedList, actualList);
	}
}