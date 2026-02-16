package za.ac.cput.studentmanagement.model;

public class GraduateStudent extends Student {

    private boolean researchAssistant;
    private double stipend;

    private GraduateStudent(Builder builder) {
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition() {
        double baseTuition = 30000;
        if (researchAssistant) {
            return baseTuition - stipend;
        }
        return baseTuition;
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("Graduate Student");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Tuition: " + calculateTuition());
    }

    public static class Builder {

        private String studentId;
        private String name;
        private String email;
        private String department;

        private boolean researchAssistant;
        private double stipend;

        public Builder(String studentId, String name, String email, String department) {
            this.studentId = studentId;
            this.name = name;
            this.email = email;
            this.department = department;
        }

        public Builder researchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public Builder stipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }
}
