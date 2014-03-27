/**
 * 
 */
package cre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cre.domain.UserToRole;

/**
 * @author Cre.Gu
 *
 */
public interface UserToRoleRepository extends JpaRepository<UserToRole, Long> {

}
