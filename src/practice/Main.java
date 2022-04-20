package practice;

public class Main {
	public static void main(String[] args) {
		new ChHuman().new HumanLeg().kick();
		
//		上記は下記の省略形。
//		ChHuman human = new Human();
//		ChHuman.HumanLeg leg = human.new HumanLeg();
//		lig.kick();
	}
}
