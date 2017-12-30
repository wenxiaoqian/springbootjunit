package com.example;

import com.example.entity.User;
import com.example.service.UserService;
import java.math.BigDecimal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void createUser() {
		User user = new User();
		user.setUsername("wenxiaoqian");
		user.setAge(10);
		user.setBalance(new BigDecimal(100));
		userService.addUser(user);

	}

}
