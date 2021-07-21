package com.a0521.dda.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.a0521.dda.entity.Developer;


public interface DeveloperRepository extends CrudRepository<Developer,Long>{
	@Override
	public List<Developer> findAll();

}
