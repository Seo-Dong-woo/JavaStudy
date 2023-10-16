package com.sist.main;
/*
 *   1. 상속
 *      => 멤버변수, 메소드(기능 => 상속)
 *         ------
 *           | 접근지정어(private, default(패키지가 다른 경우))
 *           => 메소드를 재사용하거나 변경해서 사용(기능)
 *           => 객체지향 관련 => 메소드
 *           => 라이브러리는 변수가 없음 => 메소드
 *           
 *      => 형식
 *         단일 상속만 가능
 *         class SubClass Extends SuperClass
 *         {
 *             SuperClass가 가지고 있는 모든 메소드 사용 가능
 *             => 변경해서 사용 가능(오버라이딩)
 *         }
 *         
 *      => 호출
 *         class A
 *         class B extends A
 *              --        --
 *              Sub       Super => Super > Sub
 *            상속을 내리는 클래스가 상속을 받은 클래스보다 크다
 *            모든 클래스의 상위 클래스는 Object
 *            자바에서 지원하는 라이브러리 메소드 => Object
 *            
 *      => 확장(클래스 사용시에는 확장된 클래스를 사용함)
 *         // A a=new A() => 활용 
 *         B b=new B(); // 기본
 *         A a=new B(); // 특별한 경우에 사용
 *                         => A로부터 상속을 받은 클래스를 묶어서
 *                         => 스프링
 *         ------------
 *              | 카페
 *        *** 상위 클래스는 하위 클레스에 있는 변수/메소드를 접근     
 *        B b=new B()
 *        A a=new B()
 *        
 *      class A
 *      {
 *      ----------------- a
 *          int a, b;
 *          void aaa(){}
 *          void bbb(){}
 *      ----------------- a
 *      }
 *      class B extends A
 *      {
 *      --------------------------------- b
 *          int c, d;
 *          ------------- 메모리 상에만 배치
 *          int a, b;
 *          void aaa(){} => 변경시
 *          void bbb(){} => 변경시
 *          void ccc(){}
 *          -------------
 *      --------------------------------- b
 *      }
 *      A a=new A();
 *      B b=new B();
 *      A c=new B(); => A가 가지고 있ㄴ느 변수
 *                      B에서 오버라이딩 된 메소드 호출
 *        c는 접근 불가: 변수(c, d)
 *                    메소드(ccc())
 *                    
 *        클래스 객체명
 *        --------- => 객체는 클래스에 있는 변수, 메소드만 사용
 *        A a => A클래스에 정의된 변수, 메소드
 *        
 *        상위 클래스 = 하위 클래스
 *        --------  ---------
 *           |          |
 *         변수         메소드  ==> 메소드는 상위 클래스에 있는 것만 가능
 *        
 */
class A
{
	int a=10, b=20;
	void aaa() {System.out.println("A:aaa() Call");}
	void bbb() {System.out.println("A:bbb() Call");}
}
class B extends A
{
	int a=100, b=200, c=300, d=400;
	void aaa() {System.out.println("B:aaa() Call");}
	void bbb() {System.out.println("B:bbb() Call");}
	void ccc() {System.out.println("B:ccc() Call");}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		System.out.println("aa.a=" + aa.a);
		System.out.println("aa.b=" + aa.b);
		aa.aaa();
		aa.bbb();
		
		B bb=new B();
		System.out.println("bb.a=" + bb.a);
		System.out.println("bb.b=" + bb.b);
		System.out.println("bb.c=" + bb.c);
		System.out.println("bb.d=" + bb.d);
		bb.aaa();
		bb.bbb();
		bb.ccc();
		
		A cc=new B();
		// ==> 인터페이스(클래스 여러 개를 묶어서 사용)
		System.out.println("cc.a=" + cc.a); // A
		System.out.println("cc.b=" + cc.b); // A
		cc.aaa(); // B
		cc.bbb(); // B
		
		// 멤버변수: 클래스, 메소드: 생성자 타입
	}

}
