package ex2_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao")
public class MemberDAO {
	// 3. 필드 기반 의존성 주입 방식 (DI)
	@Autowired
	private MemberBean member;
/*	
	// 1. constructor
	public MemberDAO() {}
	
	
	public MemberDAO(MemberBean member) {
		super();
		this.member = member;
	}


	// 2. setter
	public void setMember(MemberBean member) {
		this.member = member;
	}
*/	

	public void insert() {
		member.output();
		System.out.println("저장하여씃ㅂ니다.");
	}
	
	
	
}
