package ibmtal.com.instagram.business.manager;

import java.util.ArrayList;

import javax.print.PrintService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.com.instagram.database.ProfıleDao;
import ibmtal.com.instagram.entity.Profıle;
@Service
public abstract class ProfıleManager implements PrintService {
    private ProfıleDao profıleDao;
    @Autowired
	public ProfıleManager(ProfıleDao profıleDao) {
		super();
		this.profıleDao = profıleDao;
	}
    public ArrayList<Profıle> getAll() {
		// TODO Auto-generated method stub
    	return new ArrayList<Profıle>(profıleDao.findAll());
    	
    }
}


