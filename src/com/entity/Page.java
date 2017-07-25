package com.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page<T> implements Serializable {

	private static final long serialVersionUID = 6611084988464816608L;

	private Integer start;  //The start count of the query
	private Integer rows;	//Page Size 
	private String keyWord;	//Query Key
	private List<T> list;	//Page List data
	private Integer totalRecords;	//Total number of records
	private Integer page;	//
	private T paramEntity;	//查询条件，支持多个
	private Map<String, Object> pageMap = new HashMap<String, Object>();	//返回界面的封装数据（total和Rows数据）
	
	public Integer getStart() {
		start = (page-1)*rows;
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
//	public List<T> getList() {
//		return list;
//	}
	public void setList(List<T> list) {
		pageMap.put("rows", list);
		this.list = list;
	}
//	public Integer getTotalRecords() {
//		return totalRecords;
//	}
	public void setTotalRecords(Integer totalRecords) {
		pageMap.put("total", totalRecords);
		this.totalRecords = totalRecords;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public T getParamEntity() {
		return paramEntity;
	}
	public void setParamEntity(T paramEntity) {
		this.paramEntity = paramEntity;
	}
	public Map<String, Object> getPageMap() {
		return pageMap;
	}
//	public void setPageMap(Map<String, Object> pageMap) {
//		this.pageMap = pageMap;
//	}
	@Override
	public String toString() {
		return "Page [start=" + start + ", rows=" + rows + ", keyWord="
				+ keyWord + ", list=" + list + ", totalRecords=" + totalRecords
				+ ", page=" + page + ", paramEntity=" + paramEntity + "]";
	}
	
	
}
