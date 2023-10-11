class Member
{
	int mno=1;
	String id="admin";
	String pwd="1234";
	String name="홍길동";
	// Member(){}
	Member()
	{
		mno=2;
		id="hong";
		pwd="1234";
		name="박문수";
	}
}

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member(); // 메모리에 저장 => 생성자 호출
		System.out.println("번호: " + m1.mno);
		System.out.println("ID: " + m1.id);
		System.out.println("PWD: " + m1.pwd);
		System.out.println("Name: " + m1.name);
		System.out.println("==========");
		Member m2=new Member(); // 메모리에 저장 => 생성자 호출
		System.out.println("번호: " + m1.mno);
		System.out.println("ID: " + m1.id);
		System.out.println("PWD: " + m1.pwd);
		System.out.println("Name: " + m1.name);
	}

}
