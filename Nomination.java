import java.io.Serializable;

public class Nomination implements Serializable {
    private static final long serialVersionUID = 1L;
    String yourName;
    String email;
    String schoolDistrict;
    String position;
    String relationshipToNominee;
    String nomineeName;
    int age;
    String studentContactInfo;
    String expectedGraduationDate;
    String aptitude;
    String perseverence;
    String dedication;
    String workEthic;
    String other;

    public Nomination(String yourName, String email, String schoolDistrict, String position,
            String relationshipToNominee, String nomineeName, int age, String studentContactInfo,
            String expectedGraduationDate, String aptitude, String perseverence, String dedication, String workEthic,
            String other) {
        this.yourName = yourName;
        this.email = email;
        this.schoolDistrict = schoolDistrict;
        this.position = position;
        this.relationshipToNominee = relationshipToNominee;
        this.nomineeName = nomineeName;
        this.age = age;
        this.studentContactInfo = studentContactInfo;
        this.expectedGraduationDate = expectedGraduationDate;
        this.aptitude = aptitude;
        this.perseverence = perseverence;
        this.dedication = dedication;
        this.workEthic = workEthic;
        this.other = other;
    }
}
