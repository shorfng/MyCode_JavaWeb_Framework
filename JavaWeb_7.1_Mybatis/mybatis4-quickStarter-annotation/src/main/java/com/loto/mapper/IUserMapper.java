package com.loto.mapper;

import com.loto.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * <p>Author：蓝田_Loto</p>
 * <p>Date：2021-04-02 16:02</p>
 * <p>PageName：UserMapper.java</p>
 * Function：
 */

public interface IUserMapper extends Mapper<User> {
	/**
	 * 添加用户
	 * @param user 用户对象
	 */
	@Insert("insert into user values(#{id},#{username})")
	public void addUser(User user);

	/**
	 * 查询用户
	 *
	 * @return
	 */
	@Select("select * from user")
	public List<User> selectAllUser();

	/**
	 * 根据 id 查询用户
	 * @param id 用户id
	 * @return
	 */
	@Select({"select * from user where id = #{id}"})
	public User findUserById(Integer id);

	/**
	 * 根据 username 和 id 更新用户
	 * @param user
	 */
	@Update("update user set username = #{username} where id = #{id}")
	public void updateUser(User user);

	/**
	 * 根据 id 删除用户
	 * @param id 用户id
	 */
	@Delete("delete from user where id = #{id}")
	public void deleteUser(Integer id);
}