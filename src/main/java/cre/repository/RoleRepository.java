/**
 * 
 */
package cre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cre.domain.Role;

/**
 * @author Cre.Gu
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

}
