/**
 * 
 */
package cre.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cre.domain.UserToRole;

/**
 * @author Cre.Gu
 *
 */
public interface UserToRoleRepository extends JpaRepository<UserToRole, Long> {

	@Query("select r.name from Role r ,UserToRole re,User u where r = re.role and re.user = u and u.username = ?1")
	public Set<String> findRoleName(String username);
}
