/**
 * 
 */
package cre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cre.domain.RoleToPermission;

/**
 * @author Cre.Gu
 *
 */
public interface RoleToPermissionRepository extends JpaRepository<RoleToPermission, Long> {

}
