package com.sist.main;
/*
 *   interface
 *   ---------
 *     => 서로 다른 클래스를 연결해서 사용
 *     => 결합성이 낮은 프로그램
 *     => 개발자가 같은 메소드를 사용 => 표준화
 *     => 관련된 클래스를 묶어서 한 개의 이름으로 관리
 *     
 *     Object는 클래스는 Object에 포함되어 있는 메소드만 사용할 수 있음
 *     
 *     class A
 *     {
 *         int a;
 *         void aaa() {}
 *     }
 *     Object obj=new A();
 *     
 *     class B
 *     class B
 *     Object[] obj={new A(), new B(), new C()}
 *     
 *     A a=(A)obj[0]; // Object로 접근하면 각 클래스 안에 있는 메소드에 접근을 못함. 따라서 A로 접근한 후 강제 형변환
 *     -----------------------------------------------------------------------------------------
 *     
 *     class A
 *     class B extends A
 *     
 *     A a=new A() => A에 있는 변수, 메소드만 호출
 *     B b=new B() => B에 있는 변수, 메소드만 호출
 *     A c=new B() => A에 있는 변수 and 메소드는 B에 있는 것 호출
 *                                  ----------------
 *                                  오버라이드 된 메소드를 사용
 *                                  
 *     interface => aaa() ===> 클래스 공통으로 적용되는 메소드 선언
 *     class A implements I
 *          aaa() bbb()
 *          
 *          I i=new A()(X) ==> A a=new A();
 *     class B implements I
 *     class C implements I
 *     
 *     I i=new A(); // I에 존재하는 메소드중에 A에서 오버라이딩한 메소드 호출
 *     I i=new B();
 *     I i=new C();
 *     
 *     상위클래스 객체명=new 하위클래스()
 *     => 접근: 변수는 상위클래스 메소드는 하위클래스
 *     => 인터페이스 통해서 클래스에 접근
 *        ------- 인터페이스에 있는 메소드만 가지고 있어야 효율적
 *        
 *        inter face A
 *        {
 *            void aaa();
 *            void bbb();
 *        }
 *        class B implements A
 *        {
 *            void aaa(){}
 *            void bbb(){}
 *            void ccc(){}
 *        }
 *        
 *        A a=new B(); ==> 가급적 사용 X
 *        --- => aaa(), bbb()
 *        B b=new B();
 *        --- => aaa(), bbb(), ccc()
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
