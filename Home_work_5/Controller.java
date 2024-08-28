

import java.util.List;

import Home_work_5.Student;
import Home_work_5.StudentGroupe;
import Home_work_5.Teacher;
import Home_work_5.StudentGroupeService;

public class Controller {
    public StudentGroupe createStudentGroupe(Teacher teacher, List<Student> students){
        StudentGroupeService studentGroupeService = new StudentGroupeService();
        StudentGroupe studentGroupe = studentGroupeService.getStudentGroupe(teacher, students);
        return studentGroupe;
        
    }

}
