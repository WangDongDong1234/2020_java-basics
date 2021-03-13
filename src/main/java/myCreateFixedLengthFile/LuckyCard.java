package myCreateFixedLengthFile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-01-29 20:23
 * @description
 **/
@ToString
public class LuckyCard {
	/**
	 * 机构号
	 */
	@Column(length = 12,order = 100)
	//@StringColumn(order = 100, length = 12)
	private String org;

	/**
	 * 卡号
	 */
	@Column(length = 19,order = 200)
	//@StringColumn(order = 200, length = 19)
	private String cardNo;

	/**
	 * 预留域
	 */
	@Column(length = 200,order = 300)
	//@StringColumn(order = 300, length = 200)
	private String reserve;

	public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IOException, IllegalAccessException {
		LuckyCard luckyCard = new LuckyCard();
		luckyCard.setCardNo("2234567110000074");
		luckyCard.setOrg("88888888");
		luckyCard.setReserve("00000000001111111111000000000011111111110000000000111111111100000000001111111111000000000011111111110000000000111111111100000000001111111111000000000011111111110000000000111111111100000000001111111111");
		Utils.createFile2(luckyCard,LuckyCard.class);
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
}
