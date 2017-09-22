package models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by tomasz.biniecki on 22/09/2017.
 */
public class StudentStore {
    private Map<Integer, Student> students = new HashMap<>();

    public Student addStudent(Student student) {
        int id = students.size();
        student.setId(id);
        students.put(id, student);
        return student;
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public Set<Student> getAllStudents() {
        return new HashSet<>(students.values());
    }

    public Student updateStudent(Student student) {
        int id = student.getId();
        if (students.containsKey(id)) {
            students.put(id, student);
            return student;
        }
        return null;
    }

    public boolean deleteStudent(int id) {
        return students.remove(id) != null;
    }
}