package com.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Goods;
import com.entity.Page;
import com.service.GoodsService;

@Controller
@RequestMapping(value="/goods")
public class GoodsAction extends BaseAction {
	
	@Resource
	private GoodsService goodsService;
	
	//通过多个条件分页查询
	@RequestMapping("/selectPageUseDyc")
	@ResponseBody //如果返回json格式，需要这个注解
	public Object selectPageUseDyc(Page<Goods> page,Goods goods){
		page.setParamEntity(goods);
		return goodsService.selectPageUseDyc(page).getPageMap();
	}
	

}
