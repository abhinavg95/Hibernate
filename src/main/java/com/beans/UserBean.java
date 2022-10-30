package com.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserBean implements Serializable {
    // member variables ----> bean properties
     private String userId;
     private String userName;
     private String accountNo;
     private String password;
     private double balance;
}
