package po;
/**
 * 1 ���л��ӿڣ�2����װ��
 * @author lenovo
 *
 */
public class User implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;                                //������ֵ���ͣ�����Ϊ��װ�ࡣDB��name����Ϊnull��Ϊ�˺�DB��Ӧ�ĸ����ơ�
	private String name;
	private String password;
	private String telephone;
	private String username;
	private String isAdmin;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
