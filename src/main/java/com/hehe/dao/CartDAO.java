package com.hehe.dao;

import com.hehe.dto.Cart;

/**
 * @author Mack_he
 */
public interface CartDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}