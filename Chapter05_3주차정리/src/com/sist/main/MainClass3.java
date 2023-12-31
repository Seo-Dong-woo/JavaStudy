package com.sist.main;
// 객체 대입
class Human
{
	int age; // 0
	String name; // null
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong=new Human();
		// hong(age, name) => hong.age, hong.name
		hong.age=20;
		hong.name="홍길동"; // => 쓰기 => setXxx
		
		// 변수(멤버변수, 정적변수, 지역변수, 매개변수) => 읽기/쓰기
		System.out.println(hong.age); // 읽기 => getXxx
		System.out.println(hong.name);
		
		// hong => 변수
		Human shim=hong;
		// 대입 가능 ==> 메모리 주소를 대입
		
		/*
		 *   int a=10;
		 *   int b=a; ==> 메모리에 있는 값 대입
		 */
		// shim, hong은 같은 주소를 가지고 있음
		shim.age=30;
		shim.name="심청이";
		
		System.out.println(hong.age);
		System.out.println(hong.name);
	}

}
