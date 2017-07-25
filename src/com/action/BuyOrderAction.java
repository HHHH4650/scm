package com.action;

import java.util.Arrays;

import javax.annotation.Resource;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.BuyOrder;
import com.entity.BuyOrderDetail;
import com.service.BuyOrderService;

@Controller
@RequestMapping(value="/buyOrder")
public class BuyOrderAction extends BaseAction {
	
	@Resource
	private BuyOrderService buyOrderService;
	
	@RequestMapping(value="/insert")
	@ResponseBody
	public Object insert(BuyOrder buyOrder,String rows){
		System.out.println("---action.buyOrder:"+buyOrder);
		System.out.println("-------rows:"+rows);
		Integer i = 0;
		BuyOrderDetail [] buyOrderDetails = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			buyOrderDetails = objectMapper.readValue(rows,BuyOrderDetail[].class);
			buyOrder.setBuyOrderDetails(Arrays.asList(buyOrderDetails));
			i = buyOrderService.insertBuyOrder(buyOrder);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return i;
	}
	
}
