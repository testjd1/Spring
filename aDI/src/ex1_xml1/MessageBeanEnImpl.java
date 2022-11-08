package ex1_xml1;

public class MessageBeanEnImpl implements MessageBean {

	public MessageBeanEnImpl() {
		System.out.println("MessageBeanEnImpl 생성자 호출");
	}
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hi~~" + name);
	}

}
