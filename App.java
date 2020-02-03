import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<Nomination> nominations = loadNominations();
        Nomination nomination = getNomination();
        nominations.add(nomination);
        saveNominations(nominations);
    }

    public static Nomination getNomination() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nominator Information");
        System.out.println("Please tell us a little more about you!");
        System.out.println("Your name: ");
        String yourName = scanner.nextLine();
        System.out.println("Email Address: ");
        String email = scanner.nextLine();
        System.out.println("School District/Affiliion: ");
        String schoolDistrict = scanner.nextLine();
        System.out.println("Position");
        String position = scanner.nextLine();
        System.out.println("Relationship to Nominee");
        String relationshipToNominee = scanner.nextLine();

        System.out.println("Nominee");
        System.out.println("Please share more about your nominee!");
        System.out.println("Name: ");
        String nomineeName = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        String weirdBug = scanner.nextLine();
        System.out.println();
        System.out.println("Student contact information");
        String studentContactInfo = scanner.nextLine();
        System.out.println("Expected Graduation Date: ");
        String expectedGraduationDate = scanner.nextLine();

        System.out.println(
                "Base Camp Coding Academy looks for students with the aptitude and dedication to succeed in this program. Please explain why you believe this student will make an excellent canidate:");

        System.out.println("Aptitude:");
        String aptitude = scanner.nextLine();
        System.out.println("Perseverence");
        String perseverence = scanner.nextLine();
        System.out.println("Dedication");
        String dedication = scanner.nextLine();
        System.out.println("Work Ethic / Heart");
        String workEthic = scanner.nextLine();
        System.out.println("Anything else you would like to share about this nominee? ");
        String other = scanner.nextLine();
        scanner.close();

        Nomination nomination = new Nomination(yourName, email, schoolDistrict, position, relationshipToNominee,
                nomineeName, age, studentContactInfo, expectedGraduationDate, aptitude, perseverence, dedication,
                workEthic, other);

        nomination.yourName = yourName;
        nomination.email = email;
        nomination.schoolDistrict = schoolDistrict;
        nomination.position = position;
        nomination.relationshipToNominee = relationshipToNominee;
        nomination.nomineeName = nomineeName;
        nomination.age = age;
        nomination.studentContactInfo = studentContactInfo;
        nomination.expectedGraduationDate = expectedGraduationDate;
        nomination.aptitude = aptitude;
        nomination.perseverence = perseverence;
        nomination.dedication = dedication;
        nomination.workEthic = workEthic;
        nomination.other = other;
        return nomination;

    }

    public static ArrayList<Nomination> loadNominations() {
        try {
            FileInputStream fileStream = new FileInputStream("BCCANomination.ser");
            ObjectInputStream os = new ObjectInputStream(fileStream);
            ArrayList<Nomination> nominations = (ArrayList<Nomination>) os.readObject();
            os.close();
            return nominations;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<Nomination>();
        }
    }

    private static void saveNominations(ArrayList<Nomination> nominations) {
        try

        {
            FileOutputStream fileStream = new FileOutputStream("BCCANomination.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(nominations);
            os.close();
        } catch (IOException ex) {
            System.out.println("Failed to save nomination.");
        }
    }
}
