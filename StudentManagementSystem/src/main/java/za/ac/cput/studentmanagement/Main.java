package za.ac.cput.studentmanagement;

import za.ac.cput.studentmanagement.model.*;

public class Main {

    public static void main(String[] args) {

        Student undergrad = new UndergraduateStudent.Builder(
                "U001", "Dillin Benjamin", "dbenjamin@gmail.com", "Electrical Engineering")
                .creditHours(20)
                .scholarshipAmount(8300)
                .build();

        Student graduate = new GraduateStudent.Builder(
                "G001", "Ethan Willis", "willisethan@gmail.com", "Ornomental Horticulture")
                .researchAssistant(true)
                .stipend(10000)
                .build();

        undergrad.displayStudentDetails();
        System.out.println();
        graduate.displayStudentDetails();
    }
}
