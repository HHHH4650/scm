package com.service;

import com.entity.BuyOrder;

public interface BuyOrderService extends BaseService<BuyOrder>{
	public int insertBuyOrder(BuyOrder buyOrder) throws Exception;
}
