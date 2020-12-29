package myCopyUtils.converter;


import myCopyUtils.converter.model.Employee;
import myCopyUtils.converter.model.Money;
import myCopyUtils.converter.model.User;
import myCopyUtils.converter.util.UserMapper;
import org.junit.Test;

import java.math.BigDecimal;

public class MidTest {
	@Test
	public void midTest(){
		User user = new User();
        user.setId(125);
        user.setName("Lee");
        user.setMarried(true);
        user.setCaifu(new BigDecimal(100));
        user.setYue(new BigDecimal(50));
        
        Employee e = UserMapper.INSTANCE.userToEmployee(user);
        System.out.println(e);
	}
	
	@Test
	public void midTest2(){
		Employee e = new Employee();
        e.setEname("Chao");
        e.setMarried("N");
        e.setCaifu(new Money(new BigDecimal(1000)));
        
        User u = UserMapper.INSTANCE.employeeToUser(e);
        System.out.println(u);
	}
}
