package myCreateFixedLengthFile;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import myCreateFixedLengthFile.enums.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-11-18 19:35
 * @description 卡申请文件
 **/
@Getter
@Setter
@ToString
public class CardApplyFile {
	/**
	 * 机构号
	 */
	@Column(length = 12, order = 100)
	private String org;

	/**
	 * 主副卡标识
	 */
	@Column(length = 1, order = 200)
	private IdentificationOfPSCard identificationOfPSCard;

	/**
	 * 产品代码
	 */
	@Column(length = 6, order = 300)
	private String productCd;

	/**
	 * 介质卡号
	 */
	@Column(length = 19, order = 400)
	private String cardNo;

	/**
	 * 对应的主卡介质卡号
	 */
	@Column(length = 19, order = 500)
	private String primaryCardNo;

	/**
	 * 对应的主卡逻辑卡号
	 */
	@Column(length = 19, order = 600)
	private String primaryLogicalCardNo;

	/**
	 * 申请信息类型
	 */
	@Column(length = 1, order = 700)
	private ApplyType applyType;

	/**
	 * 申请证件号
	 */
	@Column(length = 20, order = 800)
	private String applyNo;

	/**
	 * 对应主卡申请记录编号
	 */
	@Column(length = 20, order = 900)
	private String primaryAppId;

	/**
	 * 消费凭密选择
	 */
	@Column(length = 1, order = 1000)
	private Indicator posPinVerify;

	/**
	 * 彩照卡标志
	 */
	@Column(length = 1, order = 1100)
	private Indicator photoUseFlag;

	/**
	 * 本行员工编号
	 */
	@Column(length = 20, order = 1200)
	private String bankMemberNo;

	/**
	 * 姓名（中文）
	 */
	@Column(length = 80, order = 1300)
	private String name;

	/**
	 * 性别
	 */
	@Column(length = 1, order = 1400)
	private Gender gender;

	/**
	 * 出生日期
	 */
	@Column(length = 8, order = 1500)
	private Date birthday;

	/**
	 * 婚姻状况
	 */
	@Column(length = 1, order = 1600)
	private MaritalStatus maritalStatus;

	/**
	 * 国籍
	 */
	@Column(length = 3, order = 1700)
	private String nationality;

	/**
	 * 家庭人口
	 */
	@Column(length = 2, order = 1800)
	private Integer familyPopulation;

	/**
	 * 证件类型
	 */
	@Column(length = 1, order = 1900)
	private CredentialType credentials;

	/**
	 * 证件号码
	 */
	@Column(length = 30, order = 2000)
	private String credentialNo;

	/**
	 * 教育程度
	 */
	@Column(length = 1, order = 2100)
	private EducationType qualification;

	/**
	 * 现住址
	 */
	@Column(length = 200, order = 2200)
	private String homeAddress;

	/**
	 * 现住址邮编
	 */
	@Column(length = 10, order = 2300)
	private String homeZip;

	/**
	 * 现住址居住起始年月
	 */
	@Column(length = 8, order = 2400)
	private Date homeStanFrom;

	/**
	 * 现住址电话号码
	 */
	@Column(length = 15, order = 2500)
	private String homePhone;

	/**
	 * 移动电话号码
	 */
	@Column(length = 20, order = 2600)
	private String mobileNo;

	/**
	 * 电子信箱
	 */
	@Column(length = 80, order = 2700)
	private String email;

	/**
	 * 住宅状况
	 */
	@Column(length = 1, order = 2800)
	private HouseOwnerShip houseOwnerShip;

	/**
	 * 是否有按揭贷款
	 */
	@Column(length = 1, order = 2900)
	private Indicator houseLoanFlag;

	/**
	 * 单位全称
	 */
	@Column(length = 80, order = 3000)
	private String companyName;

	/**
	 * 单位地址
	 */
	@Column(length = 200, order = 3100)
	private String companyAddress;

	/**
	 * 单位邮编
	 */
	@Column(length = 10, order = 3200)
	private String companyZip;

	/**
	 * 单位电话号码
	 */
	@Column(length = 20, order = 3300)
	private String companyPhone;

	/**
	 * 单位性质
	 */
	@Column(length = 1, order = 3400)
	private CompanyStructure companyStructure;

	/**
	 * 行业类型
	 */
	@Column(length = 2, order = 3500)
	private IndustryType industryType;

	/**
	 * 职业
	 */
	@Column(length = 1, order = 3600)
	private OccupationType occupation;

	/**
	 * 职称
	 */
	@Column(length = 1, order = 3700)
	private TitleOfTechnicalType titleOfTechnicalType;

	/**
	 * 职务
	 */
	@Column(length = 1, order = 3800)
	private EmployeePositionType employeePosition;

	/**
	 * 个人年收入
	 */
	@Column(length = 12, order = 3900)
	private BigDecimal revenuePerYear;

	/**
	 * 家庭人均年收入
	 */
	@Column(length = 12, order = 4000)
	private BigDecimal familyAverageRevenue;

	/**
	 * 自动还款方式
	 */
	@Column(length = 1, order = 4100)
	private AgreedRepaymentType agreedRepaymentType;

	/**
	 * 约定还款开户行号
	 */
	@Column(length = 9, order = 4200)
	private String ddBankBranch;

	/**
	 * 约定还款扣款账号
	 */
	@Column(length = 40, order = 4300)
	private String ddBankAcctNo;

	/**
	 * 卡片寄送方式
	 */
	@Column(length = 1, order = 4400)
	private CardFetchMethod cardFetchMethod;

	/**
	 * 预留问题
	 */
	@Column(length = 40, order = 4500)
	private String obligateQuestion;

	/**
	 * 预留答案
	 */
	@Column(length = 40, order = 4600)
	private String obligateAnswer;

	/**
	 * 联系人姓名（中文）
	 */
	@Column(length = 80, order = 4700)
	private String contactName;

	/**
	 * 联系人与申请人关系
	 */
	@Column(length = 1, order = 4800)
	private Relationship contactRelationship;

	/**
	 * 联系人身份证件名称
	 */
	@Column(length = 1, order = 4900)
	private CredentialType credentialType;

	/**
	 * 联系人证件号码
	 */
	@Column(length = 30, order = 5000)
	private String contactIdNo;

	/**
	 * 联系人公司电话号码
	 */
	@Column(length = 15, order = 5100)
	private String contactCorpPhone;

	/**
	 * 信用额度
	 */
	@Column(length = 13, order = 5200)
	private BigDecimal creditLimit;

	/**
	 * 公务卡额度
	 */
	@Column(length = 13, order = 5210)
	private BigDecimal civilServicelLimti;

	/**
	 * 小额贷款额度
	 */
	@Column(length = 13, order = 5220)
	private BigDecimal microCreditLimit;

	/**
	 * 商务卡额度
	 */
	@Column(length = 13, order = 5225)
	private BigDecimal businessLimit;

	/**
	 * 专项额度车贷
	 */
	@Column(length = 13, order = 5230)
	private BigDecimal carLoan;

	/**
	 * 专项额度房贷
	 */
	@Column(length = 13, order = 5240)
	private BigDecimal houseLoan;

	/**
	 * 专项额度装修贷
	 */
	@Column(length = 13, order = 5250)
	private BigDecimal renovationLoan;

	/**
	 * 专项额度旅游贷
	 */
	@Column(length = 13, order = 5260)
	private BigDecimal travelLoan;

	/**
	 * 专项额度婚庆贷
	 */
	@Column(length = 13, order = 5270)
	private BigDecimal weddingLoan;

	/**
	 * 专项额度耐消贷
	 */
	@Column(length = 13, order = 5280)
	private BigDecimal durableLoan;

	/**
	 * 周期限额
	 */
	@Column(length = 13, order = 5300)
	private BigDecimal cardCycleLimit;

	/**
	 * 周期取现限额
	 */
	@Column(length = 13, order = 5400)
	private BigDecimal cardCycleCashLimit;

	/**
	 * 网银周期交易限额
	 */
	@Column(length = 13, order = 5500)
	private BigDecimal cardCycleNetLimit;

	/**
	 * 单笔交易限额
	 */
	@Column(length = 13, order = 5600)
	private BigDecimal cardTxnLimit;

	/**
	 * 单笔取现交易限额
	 */
	@Column(length = 13, order = 5700)
	private BigDecimal cardTxnCashLimit;

	/**
	 * 网银单笔交易限额
	 */
	@Column(length = 13, order = 5800)
	private BigDecimal cardTxnNetLimit;

	/**
	 * 账单介质类型标志
	 */
	@Column(length = 1, order = 5900)
	private StmtMediaType stmtMediaType;

	/**
	 * 账单寄送标志
	 */
	@Column(length = 1, order = 6000)
	private AddressType stmtMailAddrInd;

	/**
	 * 版面代码
	 */
	@Column(length = 10, order = 6100)
	private String designCd;

	/**
	 * 联名卡会员编号
	 */
	@Column(length = 80, order = 6200)
	private String cobrandNo;

	/**
	 * 凸印名-姓名拼音
	 */
	@Column(length = 26, order = 6300)
	private String embName;

	/**
	 * 家庭国家代码
	 */
	@Column(length = 3, order = 6400)
	private String homeContryCd;

	/**
	 * 家庭省份
	 */
	@Column(length = 40, order = 6500)
	private String homeState;

	/**
	 * 家庭城市
	 */
	@Column(length = 40, order = 6600)
	private String homeCity;

	/**
	 * 家庭行政区
	 */
	@Column(length = 40, order = 6700)
	private String homeDistrict;

	/**
	 * 公司国家代码
	 */
	@Column(length = 3, order = 6800)
	private String companyCountryCd;

	/**
	 * 公司省份
	 */
	@Column(length = 40, order = 6900)
	private String companyState;

	/**
	 * 公司城市
	 */
	@Column(length = 40, order = 7000)
	private String companyCity;

	/**
	 * 公司行政区
	 */
	@Column(length = 40, order = 7100)
	private String companyDistrict;

	/**
	 * 联系人生日
	 */
	@Column(length = 40, order = 7200)
	private Date contactBirthday;

	/**
	 * 联系人公司职务
	 */
	@Column(length = 1, order = 7300)
	private EmployeePositionType contactCorpPost;

	/**
	 * 联系人公司传真
	 */
	@Column(length = 20, order = 7400)
	private String contactCorpFax;

	/**
	 * 联系人公司名称
	 */
	@Column(length = 80, order = 7500)
	private String contactCorpName;

	/**
	 * 联系人性别
	 */
	@Column(length = 1, order = 7600)
	private Gender contactGender;

	/**
	 * 联系人手机
	 */
	@Column(length = 20, order = 7700)
	private String contacMobileNo;

	/**
	 * 约定还款扣款账户姓名
	 */
	@Column(length = 80, order = 7800)
	private String ddBankAcctName;

	/**
	 * 约定还款银行名称
	 */
	@Column(length = 40, order = 7900)
	private String ddBankName;

	/**
	 * 发卡网点
	 */
	@Column(length = 9, order = 8000)
	private String owningBranch;

	/**
	 * 与主卡持卡人关系
	 */
	@Column(length = 1, order = 8100)
	private Relationship relationshipToBsc;

	/**
	 * 促销码
	 */
	@Column(length = 15, order = 8200)
	private String appPromotionCd;

	/**
	 * 申请来源
	 */
	@Column(length = 20, order = 8300)
	private String appSource;

	/**
	 * 申请书条码
	 */
	@Column(length = 40, order = 8400)
	private String barcode;

	/**
	 * 推荐人介质卡号
	 */
	@Column(length = 19, order = 8500)
	private String recomCardNo;

	/**
	 * 推荐人姓名
	 */
	@Column(length = 80, order = 8600)
	private String recomName;

	/**
	 * 客户经理
	 */
	@Column(length = 80, order = 8700)
	private String representName;

	/**
	 * 是否接收推广邮件
	 */
	@Column(length = 1, order = 8800)
	private Indicator salesInd;

	/**
	 * 驾驶证号码
	 */
	@Column(length = 20, order = 8900)
	private String driveLicenseId;

	/**
	 * 驾驶证登记日期
	 */
	@Column(length = 8, order = 9000)
	private Date driveLicRegDate;

	/**
	 * 工作稳定性
	 */
	@Column(length = 1, order = 9100)
	private EmployeeStability empStability;

	/**
	 * 就业状态
	 */
	@Column(length = 1, order = 9200)
	private Indicator empStatus;

	/**
	 * 住宅类型
	 */
	@Column(length = 1, order = 9300)
	private HouseType houseType;

	/**
	 * 发证机关所在地址
	 */
	@Column(length = 200, order = 9400)
	private String idIssuerAddress;

	/**
	 * 语言代码
	 */
	@Column(length = 4, order = 9500)
	private String languageInd;

	/**
	 * 个人资产类型
	 */
	@Column(length = 1, order = 9600)
	private PersonalAsset liquidAssert;

	/**
	 * 是否永久居住
	 */
	@Column(length = 1, order = 9700)
	private Indicator prOfCountry;

	/**
	 * 永久居住地国家代码
	 */
	@Column(length = 3, order = 9800)
	private String residencyCountryCd;

	/**
	 * 社保缴存金额
	 */
	@Column(length = 15, order = 9900)
	private BigDecimal socialInsAmt;

	/**
	 * 风险情况
	 */
	@Column(length = 1, order = 10000)
	private SocialStatus socialStatus;

	/**
	 * 公司传真
	 */
	@Column(length = 20, order = 10100)
	private String companyFax;

	/**
	 * 卡片寄送地址标志
	 */
	@Column(length = 1, order = 10200)
	private AddressType cardMailerInd;

	/**
	 * 账单周期
	 */
	@Column(length = 2, order = 10300)
	private String billingCycle;

	/**
	 * 卡片有效期
	 */
	@Column(length = 8, order = 10400)
	private Date cardExpireDate;

	/**
	 * 行内客户号
	 */
	@Column(length = 20, order = 10500)
	private String bankCustomerId;

	/**
	 * 客户级利率
	 */
	@Column(length = 5, order = 10600)
	private BigDecimal custRateDiscount;

	/**
	 * 其他联系人姓名（中文）
	 */
	@Column(length = 80, order = 10700)
	private String contactOtherName;

	/**
	 * 其他联系人与申请人关系
	 */
	@Column(length = 1, order = 10800)
	private Relationship contactOtherRelationship;

	/**
	 * 其他联系人身份证件类型
	 */
	@Column(length = 1, order = 10900)
	private CredentialType contactOtherCredential;

	/**
	 * 其他联系人证件号码
	 */
	@Column(length = 30, order = 11000)
	private String contactOtherIdNo;

	/**
	 * 其他联系人手机
	 */
	@Column(length = 20, order = 11100)
	private String contactOtherMobileNo;

	/**
	 * 其他联系人公司名称
	 */
	@Column(length = 80, order = 11200)
	private String contactOtherCorpName;

	/**
	 * 其他联系人公司职务
	 */
	@Column(length = 1, order = 11300)
	private EmployeePositionType contactOtherCorpPost;

	/**
	 * 其他联系人公司电话号码
	 */
	@Column(length = 15, order = 14000)
	private String contactOtherCorpPhone;

	/**
	 * 是否紧急制卡
	 */
	@Column(length = 1, order = 14100)
	private Indicator isUrgentCard;

	/**
	 * 任职部门
	 */
	@Column(length = 80, order = 15000)
	private String empDepartment;

	/**
	 * 申请录入人员
	 */
	@Column(length = 40, order = 16000)
	private String createUser;

	/**
	 * 领卡网点
	 */
	@Column(length = 9, order = 17000)
	private String fetchBranch;

	/**
	 * 学位
	 */
	@Column(length = 1, order = 18000)
	private Degree degree;

	/**
	 * 本单位起始年份
	 */
	@Column(length = 8, order = 18500)
	private Date corpBegDate;

	/**
	 * 统一客户编号
	 */
	@Column(length = 20, order = 19000)
	private String ecifNo;

	/**
	 * 小额免密免签约
	 */
	@Column(length = 1, order = 19500)
	private Indicator qUicsTxnInd;

	/**
	 * 证件到期日
	 */
	@Column(length = 8, order = 20000)
	private Date idLastDate;

	/**
	 * 额度外分期申请
	 */
	@Column(length = 1, order = 27800)
	private Indicator specLoanInd;

	/**
	 * 额度外分期期数
	 */
	@Column(length = 3, order = 27810)
	private Integer lonInitTerm;

	/**
	 * 额度外分期金额
	 */
	@Column(length = 13, order = 27820)
	private BigDecimal loanInitPrin;

	/**
	 * 额度外分期手续费收取方式
	 */
	@Column(length = 1, order = 27830)
	private LoanFeeMethod loanFeeMethod;

	/**
	 * 额度外分期本金分配方式
	 */
	@Column(length = 1, order = 27840)
	private String distributeMethod;

	/**
	 * 额度外分期分期手续费计算方式
	 */
	@Column(length = 1, order = 27850)
	private String loanFeeCalcMethod;

	/**
	 * 额度外分期分期手续费比例
	 */
	@Column(length = 5, order = 27860)
	private BigDecimal feeRate;

	/**
	 * 额度外分期分期手续费金额
	 */
	@Column(length = 5, order = 27870)
	private BigDecimal feeAmount;

	/**
	 * 放款银行名称
	 */
	@Column(length = 80, order = 27880)
	private String rlBankName;

	/**
	 * 放款开户行号
	 */
	@Column(length = 12, order = 27890)
	private String rlBankBranch;

	/**
	 * 放款账号
	 */
	@Column(length = 40, order = 27891)
	private String rlBankAcctNo;

	/**
	 * 放款账户姓名
	 */
	@Column(length = 80, order = 27892)
	private String rlBankAcctName;

	/**
	 * 额度外分期额度
	 */
	@Column(length = 13, order = 27893)
	private BigDecimal custLargeSpecLimit;

	/**
	 * 放款方式
	 */
	@Column(length = 1, order = 27894)
	private String largeLoanSendMode;

	/**
	 * 约定还款他行代扣标识
	 */
	@Column(length = 1, order = 27895)
	private Indicator ddOtherBankInd;

	/**
	 * 推荐人ID
	 */
	@Column(length = 20, order = 27896)
	private String recomId;

	/**
	 * 受理人姓名
	 */
	@Column(length = 80, order = 27897)
	private String accepterName;

	/**
	 * 受理人员工号
	 */
	@Column(length = 20, order = 27898)
	private String accepterEmpId;

	/**
	 * 推荐计划代码
	 */
	@Column(length = 15, order = 27899)
	private String recomSourceCd;

	/**
	 * 客户类型
	 */
	@Column(length = 1, order = 27901)
	private CustomerType customerType;

	/**
	 * 是否需要面签标识
	 */
	@Column(length = 1, order = 27902)
	private String needFaceSign;

	/**
	 * 大额分期申请类型
	 */
	@Column(length = 1, order = 27903)
	private LoanType specLoanType;

	/**
	 * 分期商户号
	 */
	@Column(length = 20, order = 27904)
	private String loanMerchantId;

	/**
	 * 分期活动号
	 */
	@Column(length = 20, order = 27905)
	private String loanProgramId;

	/**
	 * 营销人员姓名
	 */
	@Column(length = 80, order = 27906)
	private String marketerName;

	/**
	 * 营销人员编号
	 */
	@Column(length = 20, order = 27907)
	private String marketerId;

	/**
	 * 营销人员所属分行
	 */
	@Column(length = 9, order = 27908)
	private String markerterBranchId;

	/**
	 * 分期款项用途
	 */
	@Column(length = 8, order = 27909)
	private String loanPrinApp;

	/**
	 * 是否抵押
	 */
	@Column(length = 1, order = 27910)
	private Indicator guaranty;

	/**
	 * 放款开户行号2
	 */
	@Column(length = 20, order = 27911)
	private String rlBankBranch2;

	/**
	 * 放款账户对公/对私标识
	 */
	@Column(length = 2, order = 27912)
	private String loanTarget;

	/**
	 * 约定还款开户行号2
	 */
	@Column(length = 20, order = 27913)
	private String ddBankBranch2;

	/**
	 * 给海口的预留字段
	 */
	@Column(length = 1, order = 27914)
	private String hkReserved;

	/**
	 * CRS
	 */
	@Column(length = 1, order = 27915)
	private String crs;

	/**
	 * 客户等级
	 */
	@Column(length = 2, order = 27916)
	private String custLevel;

	/**
	 * 关联方
	 */
	@Column(length = 20, order = 27917)
	private String custRelation;

	/**
	 * 证件起始日
	 */
	@Column(length = 8, order = 27918)
	private Date isStartDate;

	/**
	 * 卡片层初始化锁定码，包含memo
	 * 第一版：Z_D2
	 * Z:锁定码，D2:memo,以第一个"_"分割
	 */
	@Column(length = 20, order = 27919)
	private String cardInitBlockCode;

	@Column(length = 8, order = 27920)
	private Date custlargeSpecLimitStartDate;

	@Column(length = 8, order = 27921)
	private Date custLargeSpecLimitEndDate;

	/**
	 * 预留字段
	 */
	@Column(length = 92, order = 27922)
	private String extra;


}
