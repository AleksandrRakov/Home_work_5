import Home_work_5.Student;
import Home_work_5.StudentGroupe;
import Home_work_5.Teacher;
import Home_work_5.ViewStudentGroupe;

import java.util.ArrayList;
import java.util.List;

import Home_work_5.Controller;

public class Main {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Новиков", "Иван" , "Васильевич", "1");
        List<Student> students = new ArrayList<>();

        students.add(new Student("Воробьев", "Игнат", "Борисович", "2"));
        students.add(new Student("Джамбиев", "Сергей", "Григорьевич", "3"));

        Controller controller = new Controller();

        StudentGroupe studentGroupe = controller.createStudentGroupe(teacher, students);

        
        ViewStudentGroupe viewStudentGroupe = new ViewStudentGroupe();
        viewStudentGroupe.view(studentGroupe);
    }
}
