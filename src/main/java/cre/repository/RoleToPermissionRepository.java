/**
 * 
 */
package cre.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cre.domain.RoleToPermission;

/**
 * @author Cre.Gu
 *
 */
public interface RoleToPermissionRepository extends JpaRepository<RoleToPermission, Long> {

	@Query("select rp.permission from RoleToPermission rp ,Role r where rp.role = r and r.name = ?1")
	public Set<String> findPermissions(String roleName);
}
