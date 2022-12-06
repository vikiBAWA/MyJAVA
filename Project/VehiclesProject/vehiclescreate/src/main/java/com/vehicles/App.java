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
        Travel instructor = new Travel("Elite", "Gaurav", "MH04CJ9878");
        TravelDetail instructorDetail = new TravelDetail("Hyundai", "Car", 2015);
        instructorDetail.setInstructor(instructor);
        instructor.setInstructorDetail(instructorDetail);
       
        Travel instructor1 = new Travel("Platina", "Vikram", "MH05CJ21");
        TravelDetail instructorDetail1 = new TravelDetail("Bajaj","Bike", 2015);
        instructorDetail1.setInstructor(instructor1);
        instructor1.setInstructorDetail(instructorDetail1);
      
        TravelDao instructorDao = new TravelDao();
        instructorDao.saveTravel(instructor);
        instructorDao.saveTravel(instructor1);
        
        // Get all instructors
        List<Travel> instructors = instructorDao.getAllTravel();
        instructors.forEach(instructorTemp -> System.out.println(instructorTemp.getCarName()));
        
       
    }
}
