package com.sist.lib;
/*
 *        Set
 *         |
 *    -----------
 *    |         |
 *   HashSet  TreeSet
 *   ----------------
 *     특징)
 *         = 순서가 없음(인덱스가 없음), 데이터 중복을 허용하지 않음
 *         = 장르별, 부서별...
 *         = 데이터베이스: DISTINCT
 *         = HashSet: 속도가 빠름
 *         = TreeSet: 정렬, 검색 속도
 *         ---------------------- List에 저장 => 중복 제거
 *         = 주요 메소드
 *           데이터 저장: add(Object)
 *           삭제: remove(Object)
 *           전체 삭제: clear()
 *           데이터를 한번에 모아서 관리: iterator
 *           TreeSet => LIKE, REGEXP_LIKE(오라클)
 *             = headSet
 *             = tailSet
 *         = 장바구니 => 같은 상품 구매
 */
import java.util.*;

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		/////////////
		set.add("A");
		set.add("B");
		set.add("C");
		
		// 출력
		for(String s:set)
		{
			System.out.print(s + " ");
		}
	}

}
