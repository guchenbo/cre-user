/**
 * 
 */
package cre.test;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cre.repository.UserRepository;

/**
 * @author Cre.Gu
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DataTest extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private UserRepository userRepository;

	@Test
	public void test() {
		Assert.assertNotEquals(0, userRepository.findAll().size());

	}
}
