package edu.seg2105.assignment1.exercise2.entities;

public class TeachingAssistant extends Instructor{
    /*The entities that represent people (i.e. students, administrators, and professors) are
represented in the hierarchy described in the UML diagram of Figure 2. The
TeachingAssistant class is not implemented yet. Implement the TeachingAssistant
class by extending the Instructor class. While a professor can teach 5 courses
simultaneously, make sure that a TA can only have a workload of 3 courses at a time. */

private final int max_courses = 3;

public TeachingAssistant(String firstName, String lastName, String id, double salary){
    super(firstName, lastName, id, salary);
}

@Override
public boolean assignCourse(Course course) {
	if (courses.size() < max_courses) {
		courses.add(course);
		return true;
	} else {
		return false;
	}
}
    
}
