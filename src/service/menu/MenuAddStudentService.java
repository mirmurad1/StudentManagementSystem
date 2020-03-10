package service.menu;

import java.util.Scanner;

import bean.Config;
import bean.Student;

import service.menu.interf.MenuAddStudentServiceInter;
import util.FileUtility;

public class MenuAddStudentService implements MenuAddStudentServiceInter{

	@Override
	public void process() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name:");
		String name  = sc.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Surname:");
		String surname  = sc2.nextLine();
		
//		Scanner sc3 = new Scanner(System.in);
//		System.out.println("Age:");
//		int age  = sc3.nextInt();
		System.out.println("Student added!");
		
		Student s = new Student();
		s.setName(name);
		s.setSurname(surname);
//		s.setAge(age);
		
		Config.instance().appendStudent(s);
		Config.save();
	}
}
