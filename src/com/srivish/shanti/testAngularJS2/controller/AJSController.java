package com.srivish.shanti.testAngularJS2.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.srivish.shanti.testAngularJS2.dao.AJSDao;
import com.srivish.shanti.testAngularJS2.dto.AJSGroup;

import org.springframework.stereotype.Controller;


@Controller

public class AJSController {

	@Autowired  
	AJSDao selfServiceDao; 
	
	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public ModelAndView showDisplay() {
	    return new ModelAndView("getDatas");
	}
	    @RequestMapping(path="/getGroups" ,method = RequestMethod.GET,
                produces = MediaType.APPLICATION_JSON_VALUE)
	    public @ResponseBody List<AJSGroup> getGroups(Model model) {
	    	List<AJSGroup> groups = selfServiceDao.getGroups();
	        return groups;
	 
	}

	
}
