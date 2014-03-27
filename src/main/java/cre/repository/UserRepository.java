/**
 * 
 */
package cre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cre.domain.User;

/**
 * @author Cre.Gu
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
