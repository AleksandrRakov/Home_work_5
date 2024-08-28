

import Home_work_5.StudentGroupe;
import Home_work_5.Teacher;
import Home_work_5.Type;
import Home_work_5.User;
import Home_work_5.Student;
import java.util.List;

public class StudentGroupeService {
    public StudentGroupe getStudentGroupe(Teacher teacher, List<Student> students){
        StudentGroupe studentGroupe = new StudentGroupe(teacher, students);
        return studentGroupe;
    }
}
