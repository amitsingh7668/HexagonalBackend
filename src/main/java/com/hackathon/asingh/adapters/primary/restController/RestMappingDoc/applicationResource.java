package com.hackathon.asingh.adapters.primary.restController.RestMappingDoc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.asingh.adapters.primary.restController.BaseController;
import com.hackathon.asingh.corelogic.usecases.createHandler;
import com.hackathon.asingh.corelogic.usecases.employee.createEmployee;


@RestController
@RequestMapping("/app")

public class applicationResource extends BaseController {
	
	@Autowired
	createHandler create ;
	
	@Autowired
	createEmployee createEmp;
	
	
	
    @GetMapping("/{name}")
    @ResponseBody
    String get(@PathVariable("name") String name) {
    	
        //mapped to hostname:port/home/
        return "Hello from singh "+name;
    }
    @GetMapping(value = {"/index"})
    public ResponseEntity<Map<String,Object>> viewDoc(
    		
    		
    		)
    {
    return execute(() ->  create.handle_view()
    );
    }
    
    @GetMapping(value = {"t1/login/{id}/{password}"})
    public ResponseEntity<Map<String,Object>> viewDoc(
    		@PathVariable("id") String id,
    		@PathVariable("password") String password
    		
    		)
    {
    return execute(() ->  createEmp.logIn(id,password)
    );
    }
    
    @GetMapping(value = {"t1/user/{userName}/{firstname}/{lastname}/{password}"})
    public ResponseEntity<Map<String,Object>> createEmp(
    		@PathVariable("userName") String userName,
    		@PathVariable("firstname") String firstname,
    		@PathVariable("lastname") String lastname,
    		@PathVariable("password") String password
    		
    		)
    {
    return execute(() ->  createEmp.saveUserinDb(userName,firstname,lastname, password)
    );
    }

    
}
