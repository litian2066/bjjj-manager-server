/*
 * 版权所有 2017 冠新软件。
 * 保留所有权利。
 */
package net.greatsoft.bjjj.entity.system;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 中间表
 */
@Entity
@Table(name = "USERS_ROLE")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 中间表id
	 */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@Column(name = "ID", nullable = false, length = 36)
	private String id;

	/**
	 * 用户id
	 */
	@Column(name = "USERS_ID", nullable = false, length = 36)
	private String userId;

	/**
	 * 角色id
	 */
	@Column(name = "ROLE_ID", nullable = false, length = 36)
	private String roleId;

	/**
	 * 中间表id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 中间表id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 用户id
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 用户id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 角色id
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * 角色id
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}
