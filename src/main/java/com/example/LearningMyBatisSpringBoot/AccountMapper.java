package com.example.LearningMyBatisSpringBoot;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface AccountMapper {
    @Insert(insert)
    @Options(useGeneratedKeys = true, keyProperty = "id_account")
    int insert(@Param("Accounts")Accounts accounts);

    final String getAll = "SELECT * FROM accounts";
}
