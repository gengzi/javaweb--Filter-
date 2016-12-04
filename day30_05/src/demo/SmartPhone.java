package demo;

public class SmartPhone implements Phone {
	private Non_SmartPhone nonSmartPhone;
	
	public SmartPhone(Non_SmartPhone nonSmartPhone) {
		super();
		this.nonSmartPhone = nonSmartPhone;
	}
	
	public void action() {
		nonSmartPhone.action();
		//增强功能
		System.out.println("可以上网玩游戏");

	}

}
