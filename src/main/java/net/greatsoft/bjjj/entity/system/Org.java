package net.greatsoft.bjjj.entity.system;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "org_system")
public class Org implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ORG_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orgSeq")
    @SequenceGenerator(name = "orgSeq", sequenceName = "seq_org_system", allocationSize = 1, initialValue = 1)
    private Long id;

    @Column(name = "ORG_CODE")
    private String code;

    @Column(name = "ORG_NAME")
    private String name;

    /*@Column(name = "ORG_CODE")
    private String level;*/

    @Column(name = "ORG_PID")
    private String pid;

    /*@Column(name = "ORG_CODE")
    private String sort;*/

    @Column(name = "ORG_AREA")
    private String area;

    // 月报类型 1=医疗 2=卫生 3=科研 4=基层 5=行政
    @Column(name = "ORG_TYPE")
    private String type;

    // 卫生类型 1=医疗 2=卫生 3=基层
    @Column(name = "ORG_REPORTTYPE")
    private String reportType;


   /* @Column(name = "ORG_CODE")
    private Date createTime;

    @Column(name = "ORG_CODE")
    private String createUser;

    @Column(name = "ORG_CODE")
    private Date updateTime;

    @Column(name = "ORG_CODE")
    private String updateUser;*/

    @Column(name = "ORG_CZCODE")
    private String czCode;

    @Column(name = "ORG_WSCODE")
    private String wsCode;

    @Column(name = "ORG_YBCODE")
    private String ybCode;

    // 预算编码
    @Column(name = "ORG_YSCODE")
    private String ysCode;

    @Column(name = "ORG_CZCODES")
    private String czCodes;

    @Column(name = "ORG_WSCODES")
    private String wsCodes;

    @Column(name = "ORG_YBCODES")
    private String ybCodes;

    @Column(name = "ORG_STATUS")
    private String status;

    @Column(name = "ORG_SUMMARYSTATUS")
    private String summaryStatus;//是否汇总
    //组织结构编码
    @Column(name = "ORG_ZZJGCODE")
    private String zzjgCode;
    //所属机构
    @Column(name = "ORG_BELONGSTOORG")
    private String belongstoOrg;
    //是否是汇总单位（0基层单位，1汇总单位）

    @Column(name = "ORG_HZFLAG")
    private String hzFlag;
    //机构类别

    @Column(name = "ORG_JGTYPE")
    private String jgType;
    //经济类型
    @Column(name = "ORG_JJTYPE")
    private String jjType;
    //是否为预算所属机构（0不是1是）
    @Column(name = "ORG_YSFLAG")
    private String ysFlag;
    //是否为决算所属机构（0不是1是）
    @Column(name = "ORG_JSFLAG")
    private String jsFlag;
    //预算机构类型（0全额1差额2医院）
    @Column(name = "ORG_YSTYPE")
    private String ysType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getCzCode() {
        return czCode;
    }

    public void setCzCode(String czCode) {
        this.czCode = czCode;
    }

    public String getWsCode() {
        return wsCode;
    }

    public void setWsCode(String wsCode) {
        this.wsCode = wsCode;
    }

    public String getYbCode() {
        return ybCode;
    }

    public void setYbCode(String ybCode) {
        this.ybCode = ybCode;
    }

    public String getYsCode() {
        return ysCode;
    }

    public void setYsCode(String ysCode) {
        this.ysCode = ysCode;
    }

    public String getCzCodes() {
        return czCodes;
    }

    public void setCzCodes(String czCodes) {
        this.czCodes = czCodes;
    }

    public String getWsCodes() {
        return wsCodes;
    }

    public void setWsCodes(String wsCodes) {
        this.wsCodes = wsCodes;
    }

    public String getYbCodes() {
        return ybCodes;
    }

    public void setYbCodes(String ybCodes) {
        this.ybCodes = ybCodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSummaryStatus() {
        return summaryStatus;
    }

    public void setSummaryStatus(String summaryStatus) {
        this.summaryStatus = summaryStatus;
    }

    public String getZzjgCode() {
        return zzjgCode;
    }

    public void setZzjgCode(String zzjgCode) {
        this.zzjgCode = zzjgCode;
    }

    public String getBelongstoOrg() {
        return belongstoOrg;
    }

    public void setBelongstoOrg(String belongstoOrg) {
        this.belongstoOrg = belongstoOrg;
    }

    public String getHzFlag() {
        return hzFlag;
    }

    public void setHzFlag(String hzFlag) {
        this.hzFlag = hzFlag;
    }

    public String getJgType() {
        return jgType;
    }

    public void setJgType(String jgType) {
        this.jgType = jgType;
    }

    public String getJjType() {
        return jjType;
    }

    public void setJjType(String jjType) {
        this.jjType = jjType;
    }

    public String getYsFlag() {
        return ysFlag;
    }

    public void setYsFlag(String ysFlag) {
        this.ysFlag = ysFlag;
    }

    public String getJsFlag() {
        return jsFlag;
    }

    public void setJsFlag(String jsFlag) {
        this.jsFlag = jsFlag;
    }

    public String getYsType() {
        return ysType;
    }

    public void setYsType(String ysType) {
        this.ysType = ysType;
    }
}
