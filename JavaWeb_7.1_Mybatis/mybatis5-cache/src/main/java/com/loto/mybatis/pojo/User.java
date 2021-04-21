package com.loto.mybatis.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * <p>Author：蓝田_Loto</p>
 * <p>Date：2021-04-01 16:51</p>
 * <p>PageName：User.java</p>
 * Function：
 */

@Data
public class User implements Serializable {
	@Id //对应的是注解id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //设置主键的生成策略
	private Integer id;

	private String username;

	private String password;
}
