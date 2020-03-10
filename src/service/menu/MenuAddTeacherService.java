package service.menu;

import java.util.Scanner;

import bean.Config;
import bean.Teacher;
import service.menu.interf.MenuAddStudentServiceInter;

public class MenuAddTeacherService implements MenuAddStudentServiceInter{

	@Override
	public void process() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name:");
		String name  = sc.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Surname:");
		String surname  = sc2.nextLine();
		
//		Scanner sc3 = new Scanner(System.in);
//		System.out.println("Salary:");
//		Double salary  = sc3.nextDouble();
		System.out.println("Teacher added!");
		
		Teacher t = new Teacher();
		t.setName(name);
		t.setSurname(surname);
//		t.setSalary(salary);
		
		Config.instance().appendTeacher(t);	
		Config.save();
	}
}
