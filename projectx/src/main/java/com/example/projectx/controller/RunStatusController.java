package com.example.projectx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.projectx.model.Run;
import com.example.projectx.model.RunType;
import com.example.projectx.repository.CurrentRunStatusRepository;
import com.example.projectx.repository.ProjectTypeRepository;
import com.example.projectx.repository.RunStatusRepository;
import com.example.projectx.repository.RunTypeRepository;
import com.example.projectx.service.RunService;




@Controller
public class RunStatusController {
	
	private RunStatusRepository runstatusrepo;
	private RunTypeRepository runtyperepo;
	private ProjectTypeRepository projecttyperepo;
	private CurrentRunStatusRepository currentrunstatusrepo;
	private RunService runstatusservicerepo;
	
	
    public RunStatusController()		
    {
    	
    }
	
    @Autowired
	public RunStatusController(RunStatusRepository runstatusrepo, RunTypeRepository runtyperepo,
			ProjectTypeRepository projecttyperepo, CurrentRunStatusRepository currentrunstatusrepo,
			RunService runstatusservicerepo) {
		super();
		this.runstatusrepo = runstatusrepo;
		this.runtyperepo = runtyperepo;
		this.projecttyperepo = projecttyperepo;
		this.currentrunstatusrepo = currentrunstatusrepo;
		this.runstatusservicerepo = runstatusservicerepo;
	}


	// TODO Auto-generated constructor stub
	@RequestMapping(value = "/run-status" ,method = RequestMethod.GET)
	public String RunStatus(Model model) {
		System.out.println("hello run status");
		model.addAttribute("runstatus",runstatusrepo.findAll() );
		return "/runstatus.html";
	}
	
	
	@RequestMapping(value = "/run-status-form" ,method = RequestMethod.GET)
	public String RunStatusForm(Model model) {
		System.out.println("hello run status form ");
		//for runtype dropdown in runstatus-form
		
	
		 List<RunType> runtypes = runtyperepo.findAll();
		 model.addAttribute("runtypes", runtypes);

		model.addAttribute("projecttypes", projecttyperepo.findAll());
		
		//current run status dropdown -- file transfer,data load,..
		model.addAttribute("currentrunstatus", currentrunstatusrepo.findAll());
		
		Run run = new Run();
		model.addAttribute("runstatusform", run );
		
		model.addAttribute("runstatus",runstatusrepo.findAll());
		return "/runstatus-form.html";
	}
	
	
	@RequestMapping(value = "/run-status-form" ,method = RequestMethod.POST)
	
	public String RunStatusFormPost(@ModelAttribute Run run, Model model) {
		
		runstatusservicerepo.saveRunstatus(run);
		 
	System.out.println("hello world post method");
		return "/runstatus";
	}
	}

	




