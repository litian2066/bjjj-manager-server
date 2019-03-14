package net.greatsoft.bjjj.entity.budget;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 预算项目实体类
 */
@Entity
@Table(name = "ys_items")
public class Items implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ITEM_ID")
    @GenericGenerator(name="idGenerator", strategy="uuid") // 这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator="idGenerator")
    private String itemId;

    @Column(name = "ITEM_ORGID")
    private String itemOrgId;

    @Column(name = "ITEM_TYPE")
    private String itemType;

    @Column(name = "ITEM_NAME")
    private String itemName;

    @Column(name = "ITEM_STATUS")
    private String itemStatus;

    @Column(name = "ITEM_LIFECYCLE")
    private String itemLifecycle;

    @Column(name = "ITEM_IMPDEGREE")
    private String itemImpdegree;

    @Column(name = "ITEM_ZCCATEGORY")
    private String itemZccategory;

    @Column(name = "ITEM_CATEGORY")
    private String itemCategory;

    @Column(name = "ITEM_BASIS")
    private String itemBasis;

    @Column(name = "ITEM_AIM")
    private String itemAim;

    @Column(name = "ITEM_ESTIMATE")
    private String itemEstimate;

    @Column(name = "ITEM_YEAR")
    private Integer itemYear;

    @Column(name = "ITEM_CZAMOUNT1")
    private Double itemCzamount1;

    @Column(name = "ITEM_QTAMOUNT1")
    private Double itemQtamount1;

    @Column(name = "ITEM_CZAMOUNT2")
    private Double itemCzamount2;

    @Column(name = "ITEM_QTAMOUNT2")
    private Double itemQtamount2;

    @Column(name = "ITEM_CZAMOUNT3")
    private Double itemCzamount3;

    @Column(name = "ITEM_QTAMOUNT3")
    private Double itemQtamount3;

    @Column(name = "ITEM_ZDCONTENT")
    private String itemZdcontent;

    @Column(name = "ITEM_ZDAIM")
    private String itemZdaim;

    @Column(name = "ITEM_ZDZCBASIS")
    private String itemZdzcbasis;

    @Column(name = "ITEM_ZDCSBASIS")
    private String itemZdcsbasis;

    @Column(name = "ITEM_FLAG")
    private String itemFlag;

    @Column(name = "ITEM_ORDER")
    private Integer itemOrder;

    @Column(name = "ITEM_CLASS")
    private String itemClass;

    @Column(name = "ITEM_REMARK")
    private String itemRemark;

    @Column(name = "ITEM_PAYTYPE")
    private String itemPaytype;

    @Column(name = "ITEM_FUNDTO")
    private String itemFundto;

    @Column(name = "ITEM_FUNDTYPE")
    private String itemFundtype;

    @Column(name = "ITEM_REASON")
    private String itemReason;

    @Column(name = "ITEM_ISREVIEW")
    private String itemIsreview;

    @Column(name = "ITEM_ISTHREEYEARSYS")
    private String itemIsthreeyearsys;

    @Column(name = "ITEM_ISPERASS")
    private String itemIsperass;

    @Column(name = "ITEM_ISASSESS")
    private String itemIsassess;

    @Column(name = "ITEM_ISINFORITEM")
    private String itemIsinforitem;




    @Column(name = "ITEM_AGENTOFFICE")
    private String itemAgentoffice;

    @Column(name = "ITEM_ECONOMICEXPENDITURE")
    private String itemEconomicexpenditure;

    @Column(name = "ITEM_ITEMCATEGORIES")
    private String itemItemcategories;

    @Column(name = "ITEM_BASICREPORTING")
    private String itemBasicreporting;

    @Column(name = "ITEM_IMPLEMENTYEAR")
    private String itemImplementyear;

    @Column(name = "ITEM_DECLAREYEAR")
    private String itemDeclareyear;

    // 功能任务
    @Column(name = "ITEM_FTASKS")
    private String itemFtasks;

    //预算报表期
    @Column(name = "ITEM_REPORTDATE")
    private String itemReportdate;
    //代报单位
    @Column(name = "ITEM_ACTREPORTORG")
    private String itemActreportorg;
    //填表日期
    @Column(name = "ITEM_FILLFORMDATE")
    private String itemFillformdate;
    //填表人

    @Column(name = "ITEM_FILLFORMMAN")
    private String itemFillformman;

    //项目绩效目标
    @Column(name = "ITEM_PROACHTARGET")
    private String itemProachtarget;

    //审核状态
    @Column(name = "ITEM_AUDITSTATUS")
    private String itemAuditStatus;

    //保存状态
    @Column(name = "ITEM_SAVESTATUS")
    private String itemSaveStatus;

    //排序字段
    @Column(name = "ITEM_SORT")
    private Integer itemSort;

    // 2017年新增(项目审核状态(9:未上报,3:已上报,2:待审核,0:通过,1:退回))
    @Column(name = "ITEM_ITEMSTATUS")
    private String itemItemStatus;

    // 文号
    @Column(name = "ITEM_REFRE_NUMBER")
    private String itemRefreNumber;

    // 支出政策分类
    @Column(name = "ITEM_EXPENDITURE_CATEGORY")
    private String itemExpenditureCategory;

    // 是否是科研项目
    @Column(name = "ITEM_ISSRPROJECT")
    private String itemIssrproject;

    // 审核人
    @Column(name = "ITEM_AUDITMAN")
    private String itemAuditman;

    // 是否是高额自有资金项目 (医管局专属)
    @Column(name = "ITEM_ISHIGH")
    private String itemIshigh;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemOrgId() {
        return itemOrgId;
    }

    public void setItemOrgId(String itemOrgId) {
        this.itemOrgId = itemOrgId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getItemLifecycle() {
        return itemLifecycle;
    }

    public void setItemLifecycle(String itemLifecycle) {
        this.itemLifecycle = itemLifecycle;
    }

    public String getItemImpdegree() {
        return itemImpdegree;
    }

    public void setItemImpdegree(String itemImpdegree) {
        this.itemImpdegree = itemImpdegree;
    }

    public String getItemZccategory() {
        return itemZccategory;
    }

    public void setItemZccategory(String itemZccategory) {
        this.itemZccategory = itemZccategory;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemBasis() {
        return itemBasis;
    }

    public void setItemBasis(String itemBasis) {
        this.itemBasis = itemBasis;
    }

    public String getItemAim() {
        return itemAim;
    }

    public void setItemAim(String itemAim) {
        this.itemAim = itemAim;
    }

    public String getItemEstimate() {
        return itemEstimate;
    }

    public void setItemEstimate(String itemEstimate) {
        this.itemEstimate = itemEstimate;
    }

    public Integer getItemYear() {
        return itemYear;
    }

    public void setItemYear(Integer itemYear) {
        this.itemYear = itemYear;
    }

    public Double getItemCzamount1() {
        return itemCzamount1;
    }

    public void setItemCzamount1(Double itemCzamount1) {
        this.itemCzamount1 = itemCzamount1;
    }

    public Double getItemQtamount1() {
        return itemQtamount1;
    }

    public void setItemQtamount1(Double itemQtamount1) {
        this.itemQtamount1 = itemQtamount1;
    }

    public Double getItemCzamount2() {
        return itemCzamount2;
    }

    public void setItemCzamount2(Double itemCzamount2) {
        this.itemCzamount2 = itemCzamount2;
    }

    public Double getItemQtamount2() {
        return itemQtamount2;
    }

    public void setItemQtamount2(Double itemQtamount2) {
        this.itemQtamount2 = itemQtamount2;
    }

    public Double getItemCzamount3() {
        return itemCzamount3;
    }

    public void setItemCzamount3(Double itemCzamount3) {
        this.itemCzamount3 = itemCzamount3;
    }

    public Double getItemQtamount3() {
        return itemQtamount3;
    }

    public void setItemQtamount3(Double itemQtamount3) {
        this.itemQtamount3 = itemQtamount3;
    }

    public String getItemZdcontent() {
        return itemZdcontent;
    }

    public void setItemZdcontent(String itemZdcontent) {
        this.itemZdcontent = itemZdcontent;
    }

    public String getItemZdaim() {
        return itemZdaim;
    }

    public void setItemZdaim(String itemZdaim) {
        this.itemZdaim = itemZdaim;
    }

    public String getItemZdzcbasis() {
        return itemZdzcbasis;
    }

    public void setItemZdzcbasis(String itemZdzcbasis) {
        this.itemZdzcbasis = itemZdzcbasis;
    }

    public String getItemZdcsbasis() {
        return itemZdcsbasis;
    }

    public void setItemZdcsbasis(String itemZdcsbasis) {
        this.itemZdcsbasis = itemZdcsbasis;
    }

    public String getItemFlag() {
        return itemFlag;
    }

    public void setItemFlag(String itemFlag) {
        this.itemFlag = itemFlag;
    }

    public Integer getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(Integer itemOrder) {
        this.itemOrder = itemOrder;
    }

    public String getItemClass() {
        return itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    public String getItemRemark() {
        return itemRemark;
    }

    public void setItemRemark(String itemRemark) {
        this.itemRemark = itemRemark;
    }

    public String getItemPaytype() {
        return itemPaytype;
    }

    public void setItemPaytype(String itemPaytype) {
        this.itemPaytype = itemPaytype;
    }

    public String getItemFundto() {
        return itemFundto;
    }

    public void setItemFundto(String itemFundto) {
        this.itemFundto = itemFundto;
    }

    public String getItemFundtype() {
        return itemFundtype;
    }

    public void setItemFundtype(String itemFundtype) {
        this.itemFundtype = itemFundtype;
    }

    public String getItemReason() {
        return itemReason;
    }

    public void setItemReason(String itemReason) {
        this.itemReason = itemReason;
    }

    public String getItemIsreview() {
        return itemIsreview;
    }

    public void setItemIsreview(String itemIsreview) {
        this.itemIsreview = itemIsreview;
    }

    public String getItemIsthreeyearsys() {
        return itemIsthreeyearsys;
    }

    public void setItemIsthreeyearsys(String itemIsthreeyearsys) {
        this.itemIsthreeyearsys = itemIsthreeyearsys;
    }

    public String getItemIsperass() {
        return itemIsperass;
    }

    public void setItemIsperass(String itemIsperass) {
        this.itemIsperass = itemIsperass;
    }

    public String getItemIsassess() {
        return itemIsassess;
    }

    public void setItemIsassess(String itemIsassess) {
        this.itemIsassess = itemIsassess;
    }

    public String getItemIsinforitem() {
        return itemIsinforitem;
    }

    public void setItemIsinforitem(String itemIsinforitem) {
        this.itemIsinforitem = itemIsinforitem;
    }

    public String getItemAgentoffice() {
        return itemAgentoffice;
    }

    public void setItemAgentoffice(String itemAgentoffice) {
        this.itemAgentoffice = itemAgentoffice;
    }

    public String getItemEconomicexpenditure() {
        return itemEconomicexpenditure;
    }

    public void setItemEconomicexpenditure(String itemEconomicexpenditure) {
        this.itemEconomicexpenditure = itemEconomicexpenditure;
    }

    public String getItemItemcategories() {
        return itemItemcategories;
    }

    public void setItemItemcategories(String itemItemcategories) {
        this.itemItemcategories = itemItemcategories;
    }

    public String getItemBasicreporting() {
        return itemBasicreporting;
    }

    public void setItemBasicreporting(String itemBasicreporting) {
        this.itemBasicreporting = itemBasicreporting;
    }

    public String getItemImplementyear() {
        return itemImplementyear;
    }

    public void setItemImplementyear(String itemImplementyear) {
        this.itemImplementyear = itemImplementyear;
    }

    public String getItemDeclareyear() {
        return itemDeclareyear;
    }

    public void setItemDeclareyear(String itemDeclareyear) {
        this.itemDeclareyear = itemDeclareyear;
    }

    public String getItemFtasks() {
        return itemFtasks;
    }

    public void setItemFtasks(String itemFtasks) {
        this.itemFtasks = itemFtasks;
    }

    public String getItemReportdate() {
        return itemReportdate;
    }

    public void setItemReportdate(String itemReportdate) {
        this.itemReportdate = itemReportdate;
    }

    public String getItemActreportorg() {
        return itemActreportorg;
    }

    public void setItemActreportorg(String itemActreportorg) {
        this.itemActreportorg = itemActreportorg;
    }

    public String getItemFillformdate() {
        return itemFillformdate;
    }

    public void setItemFillformdate(String itemFillformdate) {
        this.itemFillformdate = itemFillformdate;
    }

    public String getItemFillformman() {
        return itemFillformman;
    }

    public void setItemFillformman(String itemFillformman) {
        this.itemFillformman = itemFillformman;
    }

    public String getItemProachtarget() {
        return itemProachtarget;
    }

    public void setItemProachtarget(String itemProachtarget) {
        this.itemProachtarget = itemProachtarget;
    }

    public String getItemAuditStatus() {
        return itemAuditStatus;
    }

    public void setItemAuditStatus(String itemAuditStatus) {
        this.itemAuditStatus = itemAuditStatus;
    }

    public String getItemSaveStatus() {
        return itemSaveStatus;
    }

    public void setItemSaveStatus(String itemSaveStatus) {
        this.itemSaveStatus = itemSaveStatus;
    }

    public Integer getItemSort() {
        return itemSort;
    }

    public void setItemSort(Integer itemSort) {
        this.itemSort = itemSort;
    }

    public String getItemItemStatus() {
        return itemItemStatus;
    }

    public void setItemItemStatus(String itemItemStatus) {
        this.itemItemStatus = itemItemStatus;
    }

    public String getItemRefreNumber() {
        return itemRefreNumber;
    }

    public void setItemRefreNumber(String itemRefreNumber) {
        this.itemRefreNumber = itemRefreNumber;
    }

    public String getItemExpenditureCategory() {
        return itemExpenditureCategory;
    }

    public void setItemExpenditureCategory(String itemExpenditureCategory) {
        this.itemExpenditureCategory = itemExpenditureCategory;
    }

    public String getItemIssrproject() {
        return itemIssrproject;
    }

    public void setItemIssrproject(String itemIssrproject) {
        this.itemIssrproject = itemIssrproject;
    }

    public String getItemAuditman() {
        return itemAuditman;
    }

    public void setItemAuditman(String itemAuditman) {
        this.itemAuditman = itemAuditman;
    }

    public String getItemIshigh() {
        return itemIshigh;
    }

    public void setItemIshigh(String itemIshigh) {
        this.itemIshigh = itemIshigh;
    }
}
