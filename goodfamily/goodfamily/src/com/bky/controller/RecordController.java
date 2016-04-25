package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Record;
import com.bky.service.RecordService;
import com.bky.util.dg;




@Controller
public class RecordController {

	private RecordService recordService;
	public RecordService getRecordService() {
		return recordService;
	}
	@Autowired
		public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}


	
	
	@RequestMapping(value = "/queryRecordList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryRecordList(Record record,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			d.setRows(recordService.queryRecordsByPage(record));
		    d.setTotal(recordService.getRecordCount(record));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addRecord", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addRecord(Record record,HttpServletRequest request)
	{
		try {
			recordService.insertRecord(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editRecord", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editRecord(Record record,HttpServletRequest request)
	{
		try {
			recordService.updateRecord(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteRecord", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteRecord(Record record,HttpServletRequest request)
	{
		try {
			recordService.deleteRecord(record);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
