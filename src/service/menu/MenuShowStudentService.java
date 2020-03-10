package service.menu;

import bean.Config;
import bean.Student;
import service.menu.interf.MenuShowStudentServiceInter;

public class MenuShowStudentService implements MenuShowStudentServiceInter{

	@Override
	public void process() {
		
		Student[] allStudents = Config.instance().getStudents();
		for(int i = 0; i < allStudents.length; i++){
			System.out.println(allStudents[i]);
		}
	}
}
