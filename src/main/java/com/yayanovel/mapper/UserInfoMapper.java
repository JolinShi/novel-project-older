package com.yayanovel.mapper;

import com.yayanovel.entity.UserInfo;
import com.yayanovel.entity.UserInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Sep 05 15:32:50 CST 2021
     */
    long countByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Sep 05 15:32:50 CST 2021
     */
    int deleteByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Sep 05 15:32:50 CST 2021
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Sep 05 15:32:50 CST 2021
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Sep 05 15:32:50 CST 2021
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Sep 05 15:32:50 CST 2021
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Sep 05 15:32:50 CST 2021
     */
    UserInfo selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Sep 05 15:32:50 CST 2021
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Sep 05 15:32:50 CST 2021
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Sep 05 15:32:50 CST 2021
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Sep 05 15:32:50 CST 2021
     */
    int updateByPrimaryKey(UserInfo record);
    /**
     * 根据用户email查询用户信息
     * @param userEmail
     * @return
     */
    UserInfo selectByEmail(String userEmail);

    /**
     * 根据用户uid查询用户信息
     * @param uid
     * @return
     */
    UserInfo selectByUserUid(String uid);

    /**
     * 根据激活码查询
     * @param activeCode
     * @return
     */
    UserInfo selectByActiveCode(String activeCode);

    /**
     * 根据激活码激活账号
     * @param activeCode
     * @return
     */
    int updateActive(String activeCode);

    /**
     * 第一次注册没有激活，从新注册
     * @param userInfo
     * @return
     */
    int updateAvtiveState(UserInfo userInfo);

    /**
     * 根据用户email修改密码
     * @param password
     * @param userEmail
     * @return
     */
    int updatePassword(@Param("password") String password, @Param("userEmail") String userEmail);
}