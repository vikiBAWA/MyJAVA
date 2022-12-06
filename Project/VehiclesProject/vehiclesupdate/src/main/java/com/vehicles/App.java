package com.vehicles;

import java.util.List;

import com.dao.TravelDao;
import com.entity.Travel;
import com.entity.TravelDetail;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  // Save two instructors
        Travel instructor = new Travel("Raider", "Pranay", "MH04CJ5678");
        TravelDetail instructorDetail = new TravelDetail("TVS", "Bike", 2022);
        instructorDetail.setInstructor(instructor);
        instructor.setInstructorDetail(instructorDetail);
       
        Travel instructor1 = new Travel("F-150® Truck", "Adarsh", "MH05BM01");
        TravelDetail instructorDetail1 = new TravelDetail("Ford","Car", 2023);
        instructorDetail1.setInstructor(instructor1);
        instructor1.setInstructorDetail(instructorDetail1);
        
        Travel instructor2 = new Travel("i20", "Shivam", "MH05CJ2165");
        TravelDetail instructorDetail2 = new TravelDetail("Hyundai Elite","Car", 2014);
        instructorDetail2.setInstructor(instructor2);
        instructor2.setInstructorDetail(instructorDetail2);
      
        TravelDao instructorDao = new TravelDao();
        instructorDao.saveTravel(instructor);
        instructorDao.saveTravel(instructor1);
        instructorDao.saveTravel(instructor2);
        
        // Get all instructors
        List<Travel> instructors = instructorDao.getAllTravel();
        instructors.forEach(instructorTemp -> System.out.println(instructorTemp.getCarName()));
        
       
    }
}
