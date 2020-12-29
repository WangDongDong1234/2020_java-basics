package myCopyUtils.converter.util;


import myCopyUtils.converter.model.Money;

import java.math.BigDecimal;

public class UserTransform {
	
	public String booleanToString(boolean value){
		if(value){
			return "Y";
		}
		return "N";
	}
	
	public boolean strToBoolean(String str){
		if ("Y".equals(str)) {
			return true;
		}
		return false;
	}

	public Money bigDecimalToMoney(BigDecimal l){
		if(l==null){
			return null;
		}
		return new Money(l);
	}

	public BigDecimal moneyToBigDecimal(Money m){
		if(m ==null){
			return null;
		}
		return m.getCaifu();
	}
	
}
