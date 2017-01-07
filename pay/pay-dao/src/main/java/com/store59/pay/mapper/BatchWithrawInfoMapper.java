package com.store59.pay.mapper;

import java.util.List;

import com.store59.pay.model.BatchWithrawInfo;

public interface BatchWithrawInfoMapper {
	
	List<BatchWithrawInfo> selectByState(Integer[] state);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch_withraw_info
     *
     * @mbggenerated Fri May 20 14:33:22 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch_withraw_info
     *
     * @mbggenerated Fri May 20 14:33:22 CST 2016
     */
    int insert(BatchWithrawInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch_withraw_info
     *
     * @mbggenerated Fri May 20 14:33:22 CST 2016
     */
    int insertSelective(BatchWithrawInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch_withraw_info
     *
     * @mbggenerated Fri May 20 14:33:22 CST 2016
     */
    BatchWithrawInfo selectByPrimaryKey(Integer id);
    
    BatchWithrawInfo selectByTradeNo(String tradeNo);
    
    int updateByTradeNoSelective(BatchWithrawInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch_withraw_info
     *
     * @mbggenerated Fri May 20 14:33:22 CST 2016
     */
    int updateByPrimaryKeySelective(BatchWithrawInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch_withraw_info
     *
     * @mbggenerated Fri May 20 14:33:22 CST 2016
     */
    int updateByPrimaryKey(BatchWithrawInfo record);
}