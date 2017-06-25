package dandan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.forest.dandan.repos.HelloRepo;
import com.forest.dandan.services.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SpringLaunchTest {

	@Autowired
	private IUserService service;
	
	@Test
	public void lunch(){
		service.findAll().forEach(a->System.err.println(a));
	}
	
}
