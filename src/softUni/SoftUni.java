package softUni;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SoftUni {
    private int capacity;
    private List<Student> data;

    public SoftUni(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }
    public int getCapacity() {
        return capacity;
    }
    public int getStudentCount(){
        return this.data.size();
    }
    public String insert(Student student) {
        if (this.data.size()< this.capacity) {
            this.data.add(student);
            return  String.format("Added student %s %s.", student.getFirstName(), student.getLastName());
        }else {

            return "Student is already in the hall.";
        }


    }
    public String isFuel(Student student){
        if (this.capacity > this.data.size()) {
            return "The hall is full.";

        }
        return null;
    }
    public String remove(Student student){
        if (this.data.contains(student)) {
            return String.format("Removed student %s %s.", student.getFirstName(), student.getLastName());
        }
        return "Student not found.";
    }
    public Student getStudent(String firstName, String lastName) {
        return this.data.stream().filter(e -> e.getFirstName().equals(firstName) && e.getLastName().equals(lastName))
                .findFirst().orElse(null);
    }
    public String getStatistics(){
        return String.format("Hall size: %d%n", getStudentCount(),
                "Student: %s %s, Best Course = %s");

    }
}
