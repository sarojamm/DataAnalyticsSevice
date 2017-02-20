package data.analytics.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
//   public List<Course> getCourseByTopic(String topicId);
	 public List<Course> findByTopicId(String topicId);
   public List<Course> findByName(String name);
}
