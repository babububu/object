class Person {
	private String name;
	private String location;
	
	Person(String name) {
		this.name = name;
		this.location = "BeiJing";
	}
	
	Person(String name,String location) {
		this.name = name;
		this.location = location;
	}
	
	public String info() {
		return "Name:"+name+"\n"+"Location:"+location;
	}
}

class Teacher extends Person {
	private String capital;
	
	Teacher(String name,String capital) {
		this(name,"BeiJing",capital);
	}
	
	Teacher(String name,String location,String capital) {
		super(name,location);
		this.capital = capital;
	}
	
	public String info() {
		return super.info()+"\n"+"Capital:"+capital;
	}
}

class Student extends Person {
	private String school;
	
	Student(String name,String school) {
		this(name,"BeiJing",school);
	}
	
	Student(String name,String location,String school) {
		super(name,location);
		this.school = school;
	}
	
	public String info() {
		return super.info()+"\n"+"School:"+school;
	}
}

class TestTeacher {
	public static void main(String[] args) {
		Person p1 = new Person("p1");
		Person p2 = new Person("p2","ShangHai");
		Student s1 = new Student("s1","bj11");
		Student s2 = new Student("s2","ShanXi","sx22");
		Teacher t1 = new Teacher("t1","professor");
		Teacher t2 = new Teacher("t2","GuangZhou","jiangshi");
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(t1.info());
		System.out.println(t2.info());
	}
}