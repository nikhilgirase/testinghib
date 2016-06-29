package com.evaluation.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.pojo.ReleaseInfo;
import com.evaluation.rest.service.ReleaseService;

@RestController
public class ReleaseController {

	
	@Autowired
	private ReleaseService rs;
	
	@RequestMapping(value = "/release", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public  ReleaseInfo getPlayerDetails() {
		
        ReleaseInfo details=rs.getReleaseDetails();
        System.out.println(details.getReleaseId());
        System.out.println(details.getReleaseDescription());
        System.out.println(details.getReleasePlanneDdate());
        System.out.println(details.getActualReleaseDate());
        System.out.println(details.getReleaseStartDate());
        System.out.println(details.getReleaseStatus());
        System.out.println(details.getReleaseTitle());
        System.out.println(details.getReleaseType());
        System.out.println(details.getReleaseVersion());
        
		return details;
    }

}
