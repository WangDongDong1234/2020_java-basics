package myCopyUtils.converter;

import java.math.BigDecimal;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-17 20:51
 * @description
 **/
public class PersonMapperImpl implements PersonMapper {
	public PersonMapperImpl() {
	}

	@Override
	public PersonDTO conver(Person person) {
		if (person == null) {
			return null;
		} else {
			PersonDTO personDTO = new PersonDTO();
			personDTO.setDescribe(person.getDescribe());
			if (person.getId() != null) {
				personDTO.setId(Long.parseLong(person.getId()));
			}

			personDTO.setPersonName(person.getName());
			personDTO.setAge(String.valueOf(person.getAge()));
			if (person.getSource() != null) {
				personDTO.setSource(person.getSource().toString());
			}

			personDTO.setHeight(String.valueOf(person.getHeight()));
			return personDTO;
		}
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.setDescribe("测试");
		person.setAge(18);
		person.setName("张三");
		person.setHeight(170.5);
		person.setSource(new BigDecimal("100"));
		person.setDescribe("南京大学");

		PersonDTO dto = PersonMapper.INSTANCT.conver(person);

		System.out.println(dto);
	}
}
