package HashSet;

import java.util.HashSet;

public class Email {
    public static void main(String[] args) {
        String[] Email = {
                "lewis.hamilton@f1.com", "max.verstappen@f1.com",
                "charles.leclerc@f1.com", "sergio.perez@f1.com",
                "fernando.alonso@f1.com", "george.russell@f1.com",
                "carlos.sainz@f1.com", "lando.norris@f1.com",
                "lewis.hamilton@f1.com", // Duplicate email
                "max.verstappen@f1.com"  // Duplicate email
        };

        HashSet<String> uniqueEmails = new HashSet<>();
        for (String e : Email) {
            uniqueEmails.add(e);
        }
        System.out.println(uniqueEmails.size());
        System.out.println("Unique emails:");
        for (String email : uniqueEmails) {
            System.out.println(email);
        }
    }
}