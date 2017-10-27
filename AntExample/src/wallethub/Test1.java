package wallethub;

interface A {
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A{
	public void c() { System.out.println("I am c from B"); }
	public void d() { System.out.println("I am d from B"); }
}

class M extends B {
	public void a() { System.out.println("I am a from M"); }
	public void b() { System.out.println("I am b from M"); }
	public void d() { System.out.println("I am d from M"); }
}

class Test1 {
	public static void main(String... args){
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}

