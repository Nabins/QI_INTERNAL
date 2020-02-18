package com.example.projectx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectx.model.Run;
import com.example.projectx.repository.RunStatusRepository;

@Service
public class RunService {
@Autowired
private RunStatusRepository runstatusrepo;
	public void saveRunstatus(Run run) {
		// TODO Auto-generated method stub
		System.out.println(" run dsc: "+run.toString());
		runstatusrepo.save(run);
		
		
	}
	


}
