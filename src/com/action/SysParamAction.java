package com.action;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.SysParamService;

@Controller
@RequestMapping(value="/sysParam")
public class SysParamAction extends BaseAction {
	
	@Resource
	private SysParamService sysParamService;
	
	
	//方式一
	//insert方法  --》调用sysParamInit（）；	
	//update方法 -->调用sysParamInit（）；	
	//delete方法 -->调用sysParamInit（）；
	
	//方式二	
	//insert方法  --》调用updateSysParam（）；	
	//update方法 -->调用updateSysParam（）；
	//delete方法 -->调用updateSysParam（）；
	
	
	//业务类型规则 添加仓库（as   -- addStoreHouse ）----》刷新参数
	//拦截器addStoreHouse--》调用sysParamInit（）
	
	@RequestMapping("/reloadSysParam")
	@ResponseBody
	public Object reload(){
		sysParamInit();
		return null;
		
	}
	
	@PostConstruct
	private void sysParamInit(){
		// Put your code here
//		Map<String, Object> sysParamMap = new HashMap<String, Object>();
//		Map<String, String> supTypeMap = new HashMap<String, String>();
//		supTypeMap.put("1", "一级供应商");
//		supTypeMap.put("2", "二级供应商");
//		supTypeMap.put("3", "三级供应商");
//		sysParamMap.put("supType", supTypeMap);
//		
//		Map<String, String> goodsColorMap = new HashMap<String, String>();
//		goodsColorMap.put("1", "红色");
//		goodsColorMap.put("2", "绿色");
//		goodsColorMap.put("3", "蓝色");
//		sysParamMap.put("goodsColor", goodsColorMap);
//		
		application.setAttribute("sysParam", sysParamService.sysParamLoad());

		System.out.println("=================系统参数初始化完成222222222====================");
	}
} 
