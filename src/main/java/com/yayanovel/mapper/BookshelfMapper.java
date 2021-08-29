package com.yayanovel.mapper;

import com.yayanovel.entity.Bookshelf;
import com.yayanovel.entity.BookshelfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookshelfMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    long countByExample(BookshelfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    int deleteByExample(BookshelfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    int deleteByPrimaryKey(Long bookshelfId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    int insert(Bookshelf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    int insertSelective(Bookshelf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    List<Bookshelf> selectByExample(BookshelfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    Bookshelf selectByPrimaryKey(Long bookshelfId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    int updateByExampleSelective(@Param("record") Bookshelf record, @Param("example") BookshelfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    int updateByExample(@Param("record") Bookshelf record, @Param("example") BookshelfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    int updateByPrimaryKeySelective(Bookshelf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    int updateByPrimaryKey(Bookshelf record);
}