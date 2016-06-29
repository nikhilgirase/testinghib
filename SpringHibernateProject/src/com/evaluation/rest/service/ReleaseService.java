package com.evaluation.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.Dao.ReleaseDao;
import com.evaluation.pojo.ReleaseInfo;

@Service
public class ReleaseService {

@Autowired
private ReleaseDao rd;


public ReleaseInfo getReleaseDetails()
{
	System.out.println(rd);
	ReleaseInfo obj=rd.getList();
	return obj;
}
}
