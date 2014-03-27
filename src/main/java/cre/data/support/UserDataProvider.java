/**
 * 
 */
package cre.data.support;

import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;

import cre.service.AppService;

/**
 * @author Cre.Gu
 *
 */
public class UserDataProvider implements InitializingBean {
	
	@Resource
	private AppService appService;

	@Override
	public void afterPropertiesSet() throws Exception {
		appService.initialize();
	}

}
