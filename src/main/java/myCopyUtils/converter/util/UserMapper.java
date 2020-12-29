package myCopyUtils.converter.util;


import myCopyUtils.converter.model.Employee;
import myCopyUtils.converter.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = UserTransform.class)
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	@Mappings({
		@Mapping(source="name", target="ename")
	})
	Employee userToEmployee(User user);

	@Mappings({
		@Mapping(source="ename", target="name")
	})
	User employeeToUser(Employee employee);
}
