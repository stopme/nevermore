package nevermore.dto;

import java.io.Serializable;

/**
 * 
 * @author lizhi
 *
 */
public class User implements Serializable {
	
	private static final long serialVersionUID = -6132438124918269086L;
	
	private long user_id;
	private String user_name;//管理员
	private String login_password;//密码
	
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getLogin_password() {
		return login_password;
	}
	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}
	
	
}
