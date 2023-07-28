package day11.practice;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AddTaskIntoDBTest {

    @Test
    public void testAddTasksToDb() {
    	AddTaskIntoDB AddTaskIntoDB = new AddTaskIntoDB();

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(100, "Reading", true));
        tasks.add(new Task(101, "Running", true));
        tasks.add(new Task(102, "Walking", true));

        assertDoesNotThrow(() -> AddTaskIntoDB.addTasksToDb(tasks), "Adding tasks to the database should not throw an exception");
    }
}