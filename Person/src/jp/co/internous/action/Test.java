package jp.co.internous.action;

public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "太郎";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		Person jiro = new Person("次郎",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		Person hanako = new Person();
		hanako.name = "花子";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		Person saburo = new Person("サブロー");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		Person tanaka = new Person(25);
		System.out.println(tanaka.name);
		System.out.println(tanaka.age);
		
		Person tamura = new Person(17,"田村");
		System.out.println(tamura.name);
		System.out.println(tamura.age);
		
		Robot aibo = new Robot();
		aibo.name="アイボ";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo = new Robot();
		asimo.name="アシモ";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper = new Robot();
	    pepper.name="ペッパー君";
	    System.out.println(pepper.name);
	    pepper.talk();
	    pepper.walk();
	    pepper.run();
	    
	    Robot doraemon = new Robot();
	    doraemon.name="ドラえもん";
	    System.out.println(doraemon.name);
	    doraemon.talk();
	    doraemon.walk();
	    doraemon.run();
	    
	}


}
