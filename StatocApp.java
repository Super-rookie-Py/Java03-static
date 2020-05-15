package project02;
class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar);//OK
//		System.out.println(instanceVar);//Error
	}
	public void instanceMethod() {
		
		System.out.println(classVar);//OK
		System.out.println(instanceVar);//OK
	}
	
	
}
public class StatocApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);//OK
//		System.out.println(Foo.instanceVar);//error
		
		Foo.classMethod();
//		Foo.instanceMethd();
		
		Foo f1 = new Foo();
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
	}

}
