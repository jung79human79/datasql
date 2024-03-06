package com.smard.database;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smard.model.MemberVo;

public class DAO {
	
	// DAO = 데이터 액세스 오브젝트
	// 데이터에 접근하는 객체
	
	
	// 자바코드와 sql 쿼리를 자동으로 연결해주는 프레임워크(맵핑가능)
	// 먼저 자바코드와 sql 쿼리를 자동으로 연결해주기 전에 2개를 분리한다
	
	// 1. 필드 영역에서 
	// DBCP 꺼내오기
	//  factory  == connection 객체들을 가지고 있는 공간
	private SqlSessionFactory factory = MySqlsessionmanager.getSqlSessionFactory();
	
	public int join(MemberVo vo) {
		
		// 1. 연결 객체 빌려오기
		SqlSession session	= factory.openSession(true);
		
		
		
		// 2. 연결 객체 사용하기
		// **공통**
		//매개변수 한개 >> mapper파일의 sql구문 id값
		//매개변수 두개 >> id 값 , 보내줘야하는 데이터	
		// session.insert()
		// session.delete()
		// session.update()
		// session.seleteOne()
		// session.seleteList()
		int row=session.insert("join", vo);
		
		
		
		//3. 연결객체 반납하기
		session.close();
		
		
	
		return 0;
	}
	
	
	

}
