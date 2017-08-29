package bean;


import java.util.Date;

/*空港航班计划表*/

public class LmPmFlightPlan {

    /** 主键 */
    private String pkid;

    /** 营运状态 */
    private String servStatus;

    /** 流转状态 */
    private String flowStatus;

    /** 航班类型 */
    private String flightType;

    /** 航班号 */
    private String flightNo;

    /** 机号 */
    private String acno;

    /** 机型 */
    private String actype;

    /** 计划到港 */
    private Date plaArriveDate;

    /** 预计到港 */
    private Date estArriverDate;

    /** 实际到港 */
    private Date actArriveDate;

    /** 机位 */
    private String boardingGate;

    /** 始发站三字码 */
    private String startAirportThrCode;

    /** 始发站 */
    private String startAirportName;

    /** 连接标识 */
    private String linkFlag;

    /** 航线 */
    private String airline;

    /** 经停站三字码 */
    private String stopoverAirportThrCode;

    /** 经停站 */
    private String stopoverAirportName;

    /** 前站计划离港 */
    private Date preAirportPlaDepDate;

    /** 前站预计离港 */
    private Date preAirportEstDepDate;

    /** 前站实际离港 */
    private Date preAirportActDep;

    /** 提取盘 */
    private String carousel;

    /** 延误原因 */
    private String delayReason;

    /** 主航班标识 */
    private String flightFlag;

    /** 详细信息 */
    private String descript;

    /** 备注 */
    private String demo;

    /** 基地代码 */
    private String base;

    /** 同步时间 */
    private Date synDate;

    /** 操作人 */
    private String operator;

    /** 操作时间 */
    private Date operateDate;

    /** 修改人 */
    private String modifyBy;

    /** 修改时间 */
    private Date modifyDate;

    /**
     * 获取主键
     *
     * @return 主键
     */
    public String getPkid() {
        return this.pkid;
    }

    /**
     * 设置主键
     * 
     * @param pkid
     *          主键
     */
    public void setPkid(String pkid) {
        this.pkid = pkid;
    }

    /**
     * 获取营运状态
     * 
     * @return 营运状态
     */
    public String getServStatus() {
        return this.servStatus;
    }

    /**
     * 设置营运状态
     * 
     * @param servStatus
     *          营运状态
     */
    public void setServStatus(String servStatus) {
        this.servStatus = servStatus;
    }

    /**
     * 获取流转状态
     * 
     * @return 流转状态
     */
    public String getFlowStatus() {
        return this.flowStatus;
    }

    /**
     * 设置流转状态
     * 
     * @param flowStatus
     *          流转状态
     */
    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    /**
     * 获取航班类型
     * 
     * @return 航班类型
     */
    public String getFlightType() {
        return this.flightType;
    }

    /**
     * 设置航班类型
     * 
     * @param flightType
     *          航班类型
     */
    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    /**
     * 获取航班号
     * 
     * @return 航班号
     */
    public String getFlightNo() {
        return this.flightNo;
    }

    /**
     * 设置航班号
     * 
     * @param flightNo
     *          航班号
     */
    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    /**
     * 获取机号
     * 
     * @return 机号
     */
    public String getAcno() {
        return this.acno;
    }

    /**
     * 设置机号
     * 
     * @param acno
     *          机号
     */
    public void setAcno(String acno) {
        this.acno = acno;
    }

    /**
     * 获取机型
     * 
     * @return 机型
     */
    public String getActype() {
        return this.actype;
    }

    /**
     * 设置机型
     * 
     * @param actype
     *          机型
     */
    public void setActype(String actype) {
        this.actype = actype;
    }

    /**
     * 获取计划到港
     * 
     * @return 计划到港
     */
    public Date getPlaArriveDate() {
        return this.plaArriveDate;
    }

    /**
     * 设置计划到港
     * 
     * @param plaArriveDate
     *          计划到港
     */
    public void setPlaArriveDate(Date plaArriveDate) {
        this.plaArriveDate = plaArriveDate;
    }

    /**
     * 获取预计到港
     * 
     * @return 预计到港
     */
    public Date getEstArriverDate() {
        return this.estArriverDate;
    }

    /**
     * 设置预计到港
     * 
     * @param estArriverDate
     *          预计到港
     */
    public void setEstArriverDate(Date estArriverDate) {
        this.estArriverDate = estArriverDate;
    }

    /**
     * 获取实际到港
     * 
     * @return 实际到港
     */
    public Date getActArriveDate() {
        return this.actArriveDate;
    }

    /**
     * 设置实际到港
     * 
     * @param actArriveDate
     *          实际到港
     */
    public void setActArriveDate(Date actArriveDate) {
        this.actArriveDate = actArriveDate;
    }

    /**
     * 获取机位
     * 
     * @return 机位
     */
    public String getBoardingGate() {
        return this.boardingGate;
    }

    /**
     * 设置机位
     * 
     * @param boardingGate
     *          机位
     */
    public void setBoardingGate(String boardingGate) {
        this.boardingGate = boardingGate;
    }

    /**
     * 获取始发站三字码
     * 
     * @return 始发站三字码
     */
    public String getStartAirportThrCode() {
        return this.startAirportThrCode;
    }

    /**
     * 设置始发站三字码
     * 
     * @param startAirportThrCode
     *          始发站三字码
     */
    public void setStartAirportThrCode(String startAirportThrCode) {
        this.startAirportThrCode = startAirportThrCode;
    }

    /**
     * 获取始发站
     * 
     * @return 始发站
     */
    public String getStartAirportName() {
        return this.startAirportName;
    }

    /**
     * 设置始发站
     * 
     * @param startAirportName
     *          始发站
     */
    public void setStartAirportName(String startAirportName) {
        this.startAirportName = startAirportName;
    }

    /**
     * 获取连接标识
     * 
     * @return 连接标识
     */
    public String getLinkFlag() {
        return this.linkFlag;
    }

    /**
     * 设置连接标识
     * 
     * @param linkFlag
     *          连接标识
     */
    public void setLinkFlag(String linkFlag) {
        this.linkFlag = linkFlag;
    }

    /**
     * 获取航线
     * 
     * @return 航线
     */
    public String getAirline() {
        return this.airline;
    }

    /**
     * 设置航线
     * 
     * @param airline
     *          航线
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     * 获取经停站三字码
     * 
     * @return 经停站三字码
     */
    public String getStopoverAirportThrCode() {
        return this.stopoverAirportThrCode;
    }

    /**
     * 设置经停站三字码
     * 
     * @param stopoverAirportThrCode
     *          经停站三字码
     */
    public void setStopoverAirportThrCode(String stopoverAirportThrCode) {
        this.stopoverAirportThrCode = stopoverAirportThrCode;
    }

    /**
     * 获取经停站
     * 
     * @return 经停站
     */
    public String getStopoverAirportName() {
        return this.stopoverAirportName;
    }

    /**
     * 设置经停站
     * 
     * @param stopoverAirportName
     *          经停站
     */
    public void setStopoverAirportName(String stopoverAirportName) {
        this.stopoverAirportName = stopoverAirportName;
    }

    /**
     * 获取前站计划离港
     * 
     * @return 前站计划离港
     */
    public Date getPreAirportPlaDepDate() {
        return this.preAirportPlaDepDate;
    }

    /**
     * 设置前站计划离港
     * 
     * @param preAirportPlaDepDate
     *          前站计划离港
     */
    public void setPreAirportPlaDepDate(Date preAirportPlaDepDate) {
        this.preAirportPlaDepDate = preAirportPlaDepDate;
    }

    /**
     * 获取前站预计离港
     * 
     * @return 前站预计离港
     */
    public Date getPreAirportEstDepDate() {
        return this.preAirportEstDepDate;
    }

    /**
     * 设置前站预计离港
     * 
     * @param preAirportEstDepDate
     *          前站预计离港
     */
    public void setPreAirportEstDepDate(Date preAirportEstDepDate) {
        this.preAirportEstDepDate = preAirportEstDepDate;
    }

    /**
     * 获取前站实际离港
     * 
     * @return 前站实际离港
     */
    public Date getPreAirportActDep() {
        return this.preAirportActDep;
    }

    /**
     * 设置前站实际离港
     * 
     * @param preAirportActDep
     *          前站实际离港
     */
    public void setPreAirportActDep(Date preAirportActDep) {
        this.preAirportActDep = preAirportActDep;
    }

    /**
     * 获取提取盘
     * 
     * @return 提取盘
     */
    public String getCarousel() {
        return this.carousel;
    }

    /**
     * 设置提取盘
     * 
     * @param carousel
     *          提取盘
     */
    public void setCarousel(String carousel) {
        this.carousel = carousel;
    }

    /**
     * 获取延误原因
     * 
     * @return 延误原因
     */
    public String getDelayReason() {
        return this.delayReason;
    }

    /**
     * 设置延误原因
     * 
     * @param delayReason
     *          延误原因
     */
    public void setDelayReason(String delayReason) {
        this.delayReason = delayReason;
    }

    /**
     * 获取主航班标识
     * 
     * @return 主航班标识
     */
    public String getFlightFlag() {
        return this.flightFlag;
    }

    /**
     * 设置主航班标识
     * 
     * @param flightFlag
     *          主航班标识
     */
    public void setFlightFlag(String flightFlag) {
        this.flightFlag = flightFlag;
    }

    /**
     * 获取详细信息
     * 
     * @return 详细信息
     */
    public String getDescript() {
        return this.descript;
    }

    /**
     * 设置详细信息
     * 
     * @param descript
     *          详细信息
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 获取备注
     * 
     * @return 备注
     */
    public String getDemo() {
        return this.demo;
    }

    /**
     * 设置备注
     * 
     * @param demo
     *          备注
     */
    public void setDemo(String demo) {
        this.demo = demo;
    }

    /**
     * 获取基地代码
     * 
     * @return 基地代码
     */
    public String getBase() {
        return this.base;
    }

    /**
     * 设置基地代码
     * 
     * @param base
     *          基地代码
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * 获取同步时间
     * 
     * @return 同步时间
     */
    public Date getSynDate() {
        return this.synDate;
    }

    /**
     * 设置同步时间
     * 
     * @param synDate
     *          同步时间
     */
    public void setSynDate(Date synDate) {
        this.synDate = synDate;
    }

    /**
     * 获取操作人
     * 
     * @return 操作人
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * 设置操作人
     * 
     * @param operator
     *          操作人
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取操作时间
     * 
     * @return 操作时间
     */
    public Date getOperateDate() {
        return this.operateDate;
    }

    /**
     * 设置操作时间
     * 
     * @param operateDate
     *          操作时间
     */
    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    /**
     * 获取修改人
     * 
     * @return 修改人
     */
    public String getModifyBy() {
        return this.modifyBy;
    }

    /**
     * 设置修改人
     * 
     * @param modifyBy
     *          修改人
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    /**
     * 获取修改时间
     * 
     * @return 修改时间
     */
    public Date getModifyDate() {
        return this.modifyDate;
    }

    /**
     * 设置修改时间
     * 
     * @param modifyDate
     *          修改时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}