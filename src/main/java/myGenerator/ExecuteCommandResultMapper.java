package myGenerator;

import myGenerator.ExecuteCommandResult;

public interface ExecuteCommandResultMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExecuteCommandResult record);

    int insertSelective(ExecuteCommandResult record);

    ExecuteCommandResult selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExecuteCommandResult record);

    int updateByPrimaryKey(ExecuteCommandResult record);
}