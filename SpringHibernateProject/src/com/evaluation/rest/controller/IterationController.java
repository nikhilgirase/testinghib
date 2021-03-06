package com.evaluation.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.rest.service.IterationService;
import com.evaluation.rest.service.ProjectService;

@RestController
@RequestMapping("/project")
public class IterationController {
	@Autowired
	private IterationService itServ;
	

	@RequestMapping(value = "/getAllIterations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List getAllIterations(){
        List projectList=itServ.getAllIterations();
        return projectList;
    }
	
	@RequestMapping(value = "/getReleaseIterations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List getEmployeeProject(){
        List projectList=itServ.getReleaseIterationList();
        return projectList;
    }
}
