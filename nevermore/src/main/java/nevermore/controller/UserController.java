package nevermore.controller;

import javax.servlet.http.HttpServletRequest;
import nevermore.dto.User;
import nevermore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

	/**
	 * 
	 * @author lizhi
	 *
	 */
@Controller
@Scope(value = "prototype")
public class UserController {
	
	@Autowired
	private UserService userService;
	

	
	/**
	 *  跳转到用户管理界面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/userIndex.do")
	public String showUserList(Model model) {
		
		return "user/userIndex";
	}
	
	/**
	 * 
	 * @param request
	 * @param id=14036647456281
	 * @return
	 */
	@RequestMapping(value = "/find.do")
	@ResponseBody
	public User findUserByID(HttpServletRequest request,
			@RequestParam(value = "id", required = false) String id
			) {
		User user = userService.findUserByID(new String("14036647456281"));
		return user;
	}
	
}
