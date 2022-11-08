package com.example.LearningMyBatisSpringBoot;

import lombok.Data;

@Data
public class Accounts {
    private long id_account;
    private String nick_name;
    private String password;
    private java.sql.Timestamp created_date;
    private java.sql.Timestamp updated_date;
}
