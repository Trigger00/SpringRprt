package unalm.startbootstrapSbAdmin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import unalm.startbootstrapSbAdmin.dao.ProgramaDAO;
import unalm.startbootstrapSbAdmin.model.Programa;

@Controller
@RequestMapping("/report/")
public class ReportController {
 
 
  
 
    @Autowired
	ProgramaDAO programaDAO;
 
    @RequestMapping(method = RequestMethod.GET , value = "pdf")
    public ModelAndView generatePdfReport(ModelAndView modelAndView){
 
       
 
        Map<String,Object> parameterMap = new HashMap<String,Object>();
 
        List<Programa> usersList = programaDAO.list();
 
        JRDataSource JRdataSource = new JRBeanCollectionDataSource(usersList);
 
        parameterMap.put("datasource", JRdataSource);
 
        //pdfReport bean has ben declared in the jasper-views.xml file
        modelAndView = new ModelAndView("pdfReport", parameterMap);
 
        return modelAndView;
 
    }//generatePdfReport
 
 
    @RequestMapping(method = RequestMethod.GET , value = "pdf2")
    public ModelAndView generatePdfReport2(ModelAndView modelAndView){
 
       
 
        Map<String,Object> parameterMap = new HashMap<String,Object>();
 
        parameterMap.put("P_TITULO", "EXITOOOO");
 
        //pdfReport bean has ben declared in the jasper-views.xml file
        modelAndView = new ModelAndView("pdfReport", parameterMap);
 
        return modelAndView;
 
    }//generatePdfReport
 
 
}//ReportController