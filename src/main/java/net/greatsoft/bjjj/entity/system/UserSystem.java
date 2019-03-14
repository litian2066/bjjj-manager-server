package net.greatsoft.bjjj.entity.system;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * 用户信息类
 * @Date 2018-4-16
 */
@Entity
@Table(name="user_system")
public class UserSystem implements Serializable {



    @Id
    @Column(name="USER_ID")
    private Long id;

    /**
     *  机构id
     */
    @Column(name="USER_ORGID")
    private String orgId;

    /**
     *  姓名
     */
    @Column(name="USER_NAME")
    private String name;

    /**
     *
     */
    @Column(name="USER_PASSWORD")
    private String password;

    /**
     *
     */
    @Column(name="USER_DISPLAYNAME")
    private String displayName;

    /**
     *
     */
    @Column(name="USER_TEL")
    private String tel;

    /**
     *
     */
    @Column(name="USER_CREATETIME")
    private Date createTime;

    /**
     *
     */
    @Column(name="USER_CREATEUSERID")
    private Integer createUserId;

    /**
     *
     */
    @Column(name="USER_STATUS")
    private String status;

    /**
     *
     */
    @Column(name="USER_LASTLOGINDATE")
    private Date lastLoingDate;

    /**
     *
     */
    @Column(name="USER_LASTMODIFYDATE")
    private Date lastModifyDate;

    /**
     * 代理机构Id，多个由","逗号分隔
     */
    @Column(name="USER_AGENTIDS")
    private String agentids;

    /**
     * 用户类型（1基层端2管理端0运维端）
     * 加入权限管理后无效
     */
    @Column(name="USER_TYPE")
    private String type;

    /**
     * 单点登录用户id
     */
    @Column(name="USER_KEY")
    private String key;

    /**
     * 强制修改密码 1为强制修改  0为已修改
     */
    @Column(name="CHPW")
    private Integer chpw;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "USERS_ROLE", joinColumns = {
            @JoinColumn(name = "USERS_ID")}, inverseJoinColumns = {
            @JoinColumn(name = "ROLE_ID")})
    private Set<Role> roles;

    @Transient
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastLoingDate() {
        return lastLoingDate;
    }

    public void setLastLoingDate(Date lastLoingDate) {
        this.lastLoingDate = lastLoingDate;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getAgentids() {
        return agentids;
    }

    public void setAgentids(String agentids) {
        this.agentids = agentids;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getChpw() {
        return chpw;
    }

    public void setChpw(Integer chpw) {
        this.chpw = chpw;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
