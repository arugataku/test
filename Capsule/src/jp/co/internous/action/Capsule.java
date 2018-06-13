package jp.co.internous.action;

public class Capsule {
	public static void main(String[] args){
		Person taro = new Person();
		taro.setName("山田太郎");
		taro.setAge(20);

//		taro.name="山田太郎";
//		taro.age=20;
//		System.out.println(taro.name);

		System.out.println(taro.getName());
		System.out.println(taro.getAge());
	}
}
