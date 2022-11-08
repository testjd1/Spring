package ex2_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex1_xml1.MessageBean;

public class MainApp {

	public static void main(String[] args) {
		// [1] 스프링 설정 파일 연결
			ApplicationContext context = new ClassPathXmlApplicationContext("ex2_annotation/applicationContext.xml");
		// [2] 빈 가져오기
			MemberDAO dao  = context.getBean("dao",MemberDAO.class);
			dao.insert();
	}

}
