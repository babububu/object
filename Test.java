class BirthDate {
	private int day;
	private int month;
	private int year;
	
	public BirthDate(int _day, int _month, int  _year) {
		day = _day;
		month = _month;
		year = _year;
	}
	
	public void setDay(int _day) {
		day = _day;
	}
	
	public void setMonth(int _month) {
		month = _month;
	}
	
	public void setYear(int _year) {
		year = _year;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void display() {
		System.out.println(day+"-"+month+"-"+year);
	}
}

public class Test{
	public static void main(String[] args) {
		Test test = new Test();
		int date = 9;
		
		BirthDate d1 = new BirthDate(7,7,1970);
		BirthDate d2 = new BirthDate(11,1,2000);
		
		test.change1(date);//方法调用是值传递   方法执行完成后 date仍旧是9
		test.change2(d1);//方法调用是值传递  方法执行完成后 d1不变
		test.change3(d2);
		
		d1.display();
		d2.display();
		
	}
	
	public void change1(int i) {
		i = 1234;
	}//方法执行完毕后，为方法分配的局部变量i的内存空间消失
	
	public void change2(BirthDate b) {
		b = new BirthDate(22,2,2004);	
	}
	
	public void change3(BirthDate b) {
		b.setDay(22);
	}
}