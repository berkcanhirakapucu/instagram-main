package ibmtal.com.instagram.api;

import java.util.ArrayList;

import javax.print.PrintService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.com.instagram.entity.Profıle;
import ibmtal.com.instagram.business.services.ProfıleService;
import ibmtal.com.instagram.entity.Profıle;

@RestController
@RequestMapping("/api/profıle")
public class ProfıleController {
    private ProfıleService profıleService;
    @Autowired
	public ProfıleController(ProfıleService profıleService) {
		super();
		this.profıleService = profıleService;
	}
    @GetMapping("/getall")
    public ArrayList<Profıle> allProfıle(){
    	// TODO Auto-generated method stub
    	return new ArrayList<Profıle>(profıleService.getAll());
    	
    }
} 