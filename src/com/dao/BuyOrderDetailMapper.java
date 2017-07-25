package com.dao;

import java.util.List;

import com.entity.BuyOrderDetail;

public interface BuyOrderDetailMapper extends BaseMapper<BuyOrderDetail>{
	public int insertList(List<BuyOrderDetail> buyOrderDetails);

}