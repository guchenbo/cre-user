/**
 * 
 */
package cre.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Cre.Gu
 *
 */
@Entity
public class RoleToPermission implements Serializable {

	private static final long serialVersionUID = 8368945364433779491L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String permission;
	
	@ManyToOne
	private Role role;
	
	public RoleToPermission() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
