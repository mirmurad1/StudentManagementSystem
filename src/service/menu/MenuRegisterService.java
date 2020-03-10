package service.menu;

import service.menu.interf.MenuRegisterServiceInter;

public class MenuRegisterService implements MenuRegisterServiceInter{

	@Override
	public void process() {
		System.out.println("Register");
	}
}
