package api;

// Member 클래스를 만든다
// 필드는 String name; int age; String number; 이다
// 필드를 외부접근 금지가 되게 한다
// 생성자의 매개변수로 매개값을 받아 필드 초기화 해준다
// Object 클래스의 equals, hashCode, toString 메소드를 오버라이딩하며 재정의 해준다

class Member {
	private String name; 
	private int age; 
	private String number; 
	
	public Member(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}

	public void Member(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			
			Member member = (Member)obj;
			boolean bool = this.name.equals(member.name)
					&& this.age == member.age
					&& this.number.equals(member.number);
			
			return bool;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return (name + age + number).hashCode();
	}
	
	@Override
	public String toString() {
		return "이름: " + name + "\n나이: " + age + "\n전화번호: " + number;
	}
	
}


public class Ex02 {

	public static void main(String[] args) {

		Member m1 = new Member("홍길동", 20, "017-111-2222");
		Member m2 = new Member("홍길동", 20, "017-111-2222");
		Member m3 = new Member("홍길동", 20, "017-111-2222");
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		
		System.out.println(m1.hashCode());
		System.out.println(m1.hashCode());
		
		System.out.println(m1.toString());

	}

}
