package demo;

public class SmartPhone implements Phone {
	private Non_SmartPhone nonSmartPhone;
	
	public SmartPhone(Non_SmartPhone nonSmartPhone) {
		super();
		this.nonSmartPhone = nonSmartPhone;
	}
	
	public void action() {
		nonSmartPhone.action();
		//��ǿ����
		System.out.println("������������Ϸ");

	}

}
