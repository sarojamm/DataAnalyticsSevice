package data.analytics.course;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired private CourseRepository courseRepository; 
	public Course getCourse(String id){
		 return  courseRepository.findOne(id);
	}
    public List<Course> getAllCourses(String id){
    	//return courses.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    	return courseRepository.findByTopicId(id);
    }
    public void addCourse(Course course){
    	courseRepository.save(course);
    }
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	public void deleteCourse(String id) {
		//courses.removeIf(t-> t.getId().equals(id));
		courseRepository.delete(id);
		
	}
}
