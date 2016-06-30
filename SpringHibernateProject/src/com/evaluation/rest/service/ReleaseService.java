package com.evaluation.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.Dao.ReleaseDao;
import com.evaluation.pojo.ReleaseInfo;

@Service
public class ReleaseService {

	@Autowired
	private ReleaseDao rd;


	public List getAllReleaseDetails()
	{
		
		List obj=rd.getReleaseList();
		return obj;
	}

	public List getProjReleaselist(){
		List projRelease=rd.getRelease(123006);
		return projRelease;
	}
	
	
}
