package service.menu;

import java.util.Scanner;

import bean.Config;

import service.menu.interf.MenuLoginServiceInter;

public class MenuLoginService implements MenuLoginServiceInter{

	@Override
	public void process() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Username: ");
		String username = sc.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Password: ");
		String password = sc2.nextLine();
		
		if (!(username.equals("user") && password.equals("123"))){
			throw new IllegalArgumentException("User or password is invalid");
			
		}
		Config.setLoggedIn(true);
	}
}
