package nevermore.dao;

import nevermore.dto.User;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

	/**
	 * 管理员登录
	 * @param id
	 * @return 管理员
	 */
	public User findUserByID(@Param("id") String id);
}
