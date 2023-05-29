package gr.aueb.cf.ch7;

public class ConcatApp {

    public static void main(String[] args) {
        String title = "Mr.";
        String firstname = "Lefteris";
        String lastname = " Gkiv";
        String fullName;
        String titledFullName;

        fullName = firstname + lastname;
        titledFullName = title.concat(firstname).concat(lastname);
        System.out.println(titledFullName);
    }
}
