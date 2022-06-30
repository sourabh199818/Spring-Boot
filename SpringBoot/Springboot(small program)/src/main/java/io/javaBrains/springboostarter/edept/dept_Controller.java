package io.javaBrains.springboostarter.edept;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dept_Controller {
	@Autowired
	private deptService deptService ;
	
	@GetMapping("/dept")
	public List<dept> getAlldept(){
		return deptService .getalldept();
		
	
		
		
	}
	@GetMapping("/dept/{id}")
	public Optional<dept> getdept(@PathVariable String id) {
		return deptService.getdept(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/dept")
	public void addtopic(@RequestBody dept dept ) {
		deptService.add(dept);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/dept/{id}")
	public void topicupdate(@RequestBody dept dept ,@PathVariable String id) {
		deptService.update(dept,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/dept/{id}")
	public void topicdelete(@PathVariable String id) {
		deptService.delete(id);
	}
}
