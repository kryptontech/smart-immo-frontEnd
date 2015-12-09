package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.service.BienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
	
	@Autowired
	BienService Biens;
	
	@RequestMapping(value ="/test")
	public @ResponseBody List<Bien> test() {
		
		return Biens.consulterBiens();
	}

}
