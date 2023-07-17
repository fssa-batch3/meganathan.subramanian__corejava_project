package day06.practice;

import java.util.ArrayList;

class taskArrayList {

	private ArrayList<Task> taskArray;

	taskArrayList() {
		taskArray = new ArrayList();
	}

	public void addElement(Task element) {
		taskArray.add(element);
	}

	public String gettaskArray(Task task) {
		return task.getTask();
	}

}

public class TaskMain {

	public static void main(String[] args) {

		ArrayList<Task> taskArray = new ArrayList<Task>();

		Task task1 = new Task("Check slack", 1);
		Task task2 = new Task("doing routine", 2);
		Task task3 = new Task("Learn about java", 3);
		Task task4 = new Task("Learn java", 4);
		Task task5 = new Task("complete the task", 5);

		taskArray.add(task1);
		taskArray.add(task2);
		taskArray.add(task3);
		taskArray.add(task4);
		taskArray.add(task5);

		System.out.print(taskArray);

	}

}