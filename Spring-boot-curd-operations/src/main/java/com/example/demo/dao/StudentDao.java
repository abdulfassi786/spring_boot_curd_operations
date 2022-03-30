package com.example.demo.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.pojo.salary;
@Repository
@Transactional
public interface StudentDao extends JpaRepository<salary, Integer>{
	
	@Query("select u from salary u ORDER BY name desc")
	List<salary> findAllStudentAddress();

}
