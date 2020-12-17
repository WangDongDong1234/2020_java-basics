package myCopyUtils.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-17 20:50
 * @description
 **/
@Mapper
public interface PersonMapper {
	PersonMapper INSTANCT = Mappers.getMapper(PersonMapper.class);

	@Mapping(target = "name", source = "personName")
	@Mapping(target = "id", ignore = true) // 忽略id，不进行映射
	PersonDTO conver(Person person);
}
