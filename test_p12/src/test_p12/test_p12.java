package test_p12;

public class test_p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1=new Car();
		car1.num=1234;
		car1.gas=20.1;
		car1.showCar();
	}

}
class Car{
	int num;
	double gas;
	
	void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	void showCar() {
		System.out.println("�}�l��ܨ��l���");
		this.show();
	}
}