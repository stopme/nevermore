package nevermore.service;

import nevermore.dto.User;

	/**
	 * 
	 * @author lizhi
	 *
	 */
public interface UserService {

	/**
	 * 管理员登录，目前只提供密码
	 * @param password
	 * @return 管理员对象
	 */
	public User findUserByID(String id);
	
}
