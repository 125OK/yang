package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.RecordMapper;
import com.bky.model.Record;
import com.bky.service.RecordService;



@Service("record")
public class RecordServiceImpl implements RecordService {

	private RecordMapper recordMapper;
	
	
	public RecordMapper getRecordMapper() {
		return recordMapper;
	}
     @Autowired
	public void setRecordMapper(RecordMapper recordMapper) {
		this.recordMapper = recordMapper;
	}

	@Override
	public void insertRecord(Record record) throws DataAccessException
	{
		recordMapper.insertRecord(record);
		
		
	}
	
	@Override
	public void insertRecords(List<Record> records) throws DataAccessException
	{
		recordMapper.insertRecords(records);
	}
	
	@Override
	public void deleteRecord(Record record) throws DataAccessException
	{
		recordMapper.deleteRecord(record);
	}
	
	@Override
	public void updateRecord(Record record) throws DataAccessException
	{
		recordMapper.updateRecord(record);
	}
	
	@Override
	public List<Record> queryRecords(Record record) throws DataAccessException
	{
		return recordMapper.queryRecords(record);
	}
	
	@Override
	public List<Record> queryRecordsByPage(Record record) throws DataAccessException
	{
		return recordMapper.queryRecordsByPage(record);
	}
	
	@Override
	public Record queryRecordById(long recordId) throws DataAccessException
	{
		return recordMapper.queryRecordById(recordId);
	}

	@Override
	public int getRecordCount(Record record) throws DataAccessException
	{
		return recordMapper.getRecordCount(record);
	}
}
