package com.mongoexample.controllerImpl;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.mongoexample.controller.BaseController;

@RestController
public class BaseControllerImpl implements BaseController{

	@Override
	public String Hello() {
		
		return "Hello World " + LocalDate.now();
	}

}
