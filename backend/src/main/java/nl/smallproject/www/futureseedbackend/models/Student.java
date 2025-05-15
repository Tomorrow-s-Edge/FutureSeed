package nl.smallproject.www.futureseedbackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "students")
public class Student extends BaseObject{
    private String studentNumber;
    private String gradeLevel;
    private LocalDateTime enrollmentDate;
    private String classGroup;
    private String guardianName;
    private String guardianContact;

    @OneToOne
    private User user;

    public Student() {
        super();
        this.studentNumber = UUID.randomUUID().toString();
        this.enrollmentDate = LocalDateTime.now();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public LocalDateTime getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDateTime enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(String classGroup) {
        this.classGroup = classGroup;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianContact() {
        return guardianContact;
    }

    public void setGuardianContact(String guardianContact) {
        this.guardianContact = guardianContact;
    }
}
