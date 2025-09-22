package object_oriented_practice.ch12.practice05;

/*
 * Object의 equals() 와 hashCode() 메소드를 오버라이딩해서 Student의 학번(studentNum)이 같으면
 * 동등 객체가 될 수 있도록 Student 클래스를 작성(hashCode() 메소드의 리턴값은 studentNum 필드값으로 설정)
 */

public class Student {
	
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
//@Override
//public boolean equals(Object obj) {
//	if(obj instanceof Student) {
//		Student student = (Student) obj;
//		if(studentNum.equals(student.getStudentNum())) {
//			return true;
//		}
//	}
//	return false;
//}
//
//@Override
//public int hashCode() {
//	return studentNum.hashCode();
//}