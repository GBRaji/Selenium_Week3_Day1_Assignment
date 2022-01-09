package week3.Day1;



public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student Id is" + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id and Name are " + id +","+name);
	}
	
	public void getStudentInfo(String email,String number) {
		System.out.println("Student email and Number are " + email +","+number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students ss= new Students();
ss.getStudentInfo(12345);
ss.getStudentInfo(12345, "Ganapathy");
ss.getStudentInfo("g.pathy.bit@gmail.com", "9677911238");
	}

}
