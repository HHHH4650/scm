package com.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Page;
import com.entity.Supplier;
import com.service.SupplierService;

@Controller
@RequestMapping(value="/supplier")
public class SupplierAction extends BaseAction {
	
	@Resource
	private SupplierService supplierService;
	
	@RequestMapping(value="/insert")
	@ResponseBody
	public Object insert(Supplier supplier){
		System.out.println("---action.supplier:"+supplier);
		
		Integer i = 0;
		try {
			i = supplierService.insert(supplier);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	@RequestMapping(value="/update")
	@ResponseBody
	public Object update(Supplier supplier){
		System.out.println("---action.supplier:"+supplier);
		
		Integer i = 0;
		try {
			i = supplierService.updateByPK(supplier);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

/*	@RequestMapping("supplierList")
//	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public String SupplierList() {
		
		return "forward:/WEB-INF/supplier/supplierlist.jsp"; 
	}*/
	
	//通过单个关键字分页查询
	@RequestMapping("/selectPage")
	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public Object selectPage(Page<Supplier> page){
		
		System.out.println("---dselectPage:"+page+"|"+page);
		
		return supplierService.selectPageUseDyc(page).getPageMap();
	}
	
	//通过多条件分页查询
	@RequestMapping("/selectPageUseDyc")
	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public Object selectPageUseDyc(Page<Supplier> page, Supplier supplier){
		
		page.setParamEntity(supplier);
		
		return supplierService.selectPageUseDyc(page).getPageMap();
	}
	
	@RequestMapping(value="/deleteList")
	@ResponseBody
	public Object deleteList(String pks[]){
		System.out.println("---action.pks:"+pks);
		Integer i = 0;
		try {
			i = supplierService.deleteList(pks);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
}
