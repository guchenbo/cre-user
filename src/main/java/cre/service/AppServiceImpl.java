/**
 * 
 */
package cre.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cre.domain.Role;
import cre.domain.RoleToPermission;
import cre.domain.User;
import cre.domain.UserToRole;
import cre.repository.RoleRepository;
import cre.repository.RoleToPermissionRepository;
import cre.repository.UserRepository;
import cre.repository.UserToRoleRepository;

/**
 * @author Cre.Gu
 * 
 */
@Service
public class AppServiceImpl implements AppService {
	protected final org.slf4j.Logger log = org.slf4j.LoggerFactory
			.getLogger(AppServiceImpl.class);

	@Resource
	private UserRepository userRepository;
	@Resource
	private RoleRepository roleRepository;
	@Resource
	private UserToRoleRepository userToRoleRepository;
	@Resource
	private RoleToPermissionRepository roleToPermissionRepository;

	@Override
	public void initialize() {
		if (userRepository.findAll().size() > 0) {
			log.warn("初始化数据已存在");
			return;
		}
		log.warn("初始化数据。。。");
		
		User admin = new User();
		admin.setUsername("admin");
		admin.setPassword("1");
		userRepository.save(admin);
		User test = new User();
		test.setUsername("test");
		test.setPassword("1");
		userRepository.save(test);

		Role role1 = new Role();
		role1.setName("admin");
		roleRepository.save(role1);
		Role role2 = new Role();
		role2.setName("test");
		roleRepository.save(role2);

		UserToRole ur1 = new UserToRole();
		ur1.setUser(admin);
		ur1.setRole(role1);
		userToRoleRepository.save(ur1);
		UserToRole ur2 = new UserToRole();
		ur2.setUser(admin);
		ur2.setRole(role2);
		userToRoleRepository.save(ur2);
		UserToRole ur3 = new UserToRole();
		ur3.setUser(test);
		ur3.setRole(role2);
		userToRoleRepository.save(ur3);

		RoleToPermission rp1 = new RoleToPermission();
		rp1.setRole(role1);
		rp1.setPermission("permission1");
		roleToPermissionRepository.save(rp1);
		RoleToPermission rp2 = new RoleToPermission();
		rp2.setRole(role1);
		rp2.setPermission("permission2");
		roleToPermissionRepository.save(rp2);
		RoleToPermission rp3 = new RoleToPermission();
		rp3.setRole(role2);
		rp3.setPermission("permission2");
		roleToPermissionRepository.save(rp3);
	}

}
