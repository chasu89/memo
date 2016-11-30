package com.chasu89.memo.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public class MemoDAOImpl implements MemoDAO{
	
	@Autowired
	SqlSessionTemplate sqlsession;
	
	@Override
	public int insertMemo(Model model) {
		return sqlsession.insert("", model);
	}

}
