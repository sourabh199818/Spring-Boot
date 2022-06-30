package io.javaBrains.springboostarter.edept;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class deptService {
	@Autowired
	private deptRepository deptRepository;


	public List<dept> getalldept(){
		//return topics;
		List<dept> dept = new ArrayList<>();
		deptRepository.findAll().forEach(dept::add);
		return dept;
	}
	public Optional<dept> getdept(String id) {
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return deptRepository.findById(id);
	}
	public void add(dept dept) {
		// TODO Auto-generated method stub
		//topics.add(topic);
		deptRepository.save(dept);
		
	}
	public void update(dept dept, String id) {
		deptRepository.save(dept);

			
				return;
			
		
		
		
	}
	public void delete(String id) {
		// TODO Auto-generated method stub
		//topics.removeIf(t->t.getId().equals(id));
		deptRepository.deleteById(id);
		
	}
}
