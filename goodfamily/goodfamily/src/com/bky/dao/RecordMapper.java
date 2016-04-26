package com.bky.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Record;



public interface RecordMapper {

	public int insertRecord(Record record) throws DataAccessException;
	
	public void insertRecords(List<Record> records) throws DataAccessException;
	
	public void deleteRecord(Record record) throws DataAccessException;
	
	public void updateRecord(Record record) throws DataAccessException;
	
	public List<Record> queryRecords(Record record) throws DataAccessException;
	
	public List<Record> queryRecordsByPage(Record record) throws DataAccessException;
	
	public Record queryRecordById(long recordId) throws DataAccessException;
	
	public int getRecordCount(Record record) throws DataAccessException;
}
