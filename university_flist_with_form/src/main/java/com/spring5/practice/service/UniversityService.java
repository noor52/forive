package com.spring5.practice.service;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.spring5.practice.exceptions.ResourceAlreadyExistsException;
import com.spring5.practice.exceptions.ResourceNotFoundException;
import com.spring5.practice.model.Course;

//import org.springframework.stereotype.Service;

//import com.spring5.practice.exceptions.ResourceAlreadyExistsException;
//import com.spring5.practice.exceptions.ResourceNotFoundException;
import com.spring5.practice.model.University;

@Service
public class UniversityService {
	
	
private static List<University> universities = new ArrayList<University>();
	
	private static final String[] UNIVERSITY_LIST = new String[] {
			"BUET","DU","AIUB","STAMFORD","ASA"};
	
	private static final String[] RANK_LIST = new String[] {
			"1","3","6","8","17"};
	
	private static final String[] DEPARTMENT_LIST = new String[] {
			"14","30","6","13","5"};

	public UniversityService() {
		super();
		
		for(int i = 0; i < UNIVERSITY_LIST.length; i++) {
			addUniversity(UNIVERSITY_LIST[i], RANK_LIST[i], DEPARTMENT_LIST[i]);
		}
	
	}
	
	public void addCourse(University versity) {
//		checkCourseInList(versity);
		versity.setId(universities.size() + 1);
		versity.setNumOfDepartment(versity.getNumOfDepartment());
		versity.setRank(versity.getRank());		
		universities.add(versity);
	}
	
	private void addUniversity(String universityName,String rank,String NumberOfepartment) {
		var courseObj = new University();
		courseObj.setId(universities.size()+1);
		courseObj.setName(universityName);
		courseObj.setRank(rank);
		courseObj.setNumOfDepartment(NumberOfepartment);
		universities.add(courseObj);
	}
	
//	public void checkCourseInList(University c) {
//		if (universities.stream().filter(university -> university.getUniCode().equals(c.getUniCode())).findAny()
//				.isPresent()) {
//			throw new ResourceAlreadyExistsException("University already exists in list");
//		}
//	}
	
//	public University getCourseByCode(String uniCode) {
//
//
//		return universities.stream().filter(university -> university.getUniCode().equals(uniCode)).findAny()
//				.orElseThrow(() -> new ResourceNotFoundException("University not found with this code"));
//
//	}
	public List<University> getAllUniversity(){
		return universities;
	}


	
}
