package net.krypton.smartimmo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.service.SousCategorieService;


@Controller
public class HomeController {
	
	@Autowired
	SousCategorieService sousCategorieService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(ModelMap model) {
		Bien b = new Bien();
		model.addAttribute("listSousCategorie", sousCategorieService.consulterSousCategories());
		model.addAttribute("formSearch", b);
		return "index";     
	}	
}
