package haust.vk.e_anno2;

//�ѵ�ǰ�������ioc����
//@Component("userDao")   //  �൱��bean.xml ��<bean id=userDao class=".." />��

//@Component  // ����ioc������UserDao������������ƣ� Ĭ��������һ���� �ҵ�һ����ĸСд

//@Repository   // �ڳ־ò����ѡ�������ע��

public class UserDao {
	
	public UserDao(){
		System.out.println("UserDao.UserDao()");
	}
	
	public UserDao(int id){
		System.out.println("UserDao.UserDao(int id)" + id);
	}
	
	public void save() {
		System.out.println("dao  �����û�");
	}
}