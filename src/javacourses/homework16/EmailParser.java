package javacourses.homework16;

import static java.lang.String.format;

public class EmailParser {

    private final String email;

    private final String PATTERN = "^\\w+@\\w+\\.\\w{1,3}\\z$";

    public EmailParser(String email) throws IllegalArgumentException {
        if (isEmail(email))
            this.email = email;
        else throw new IllegalArgumentException(format("Email isn't correct: %s", email));
    }

    public String getNameOfEmail() {
        int indexOfAt = this.email.indexOf("@") + 1;
        int indexOfDot = this.email.indexOf(".");
        return this.email.substring(indexOfAt, indexOfDot);
    }

    private boolean isEmail(String email) {
        return email.matches(PATTERN);
    }
}

class Program {
    public static void main(String[] args) {

        String[] testData = {"1234567@mail", " ", "roma@gmail.com", "@.", "qwertyuomail.ruuu",
                "qweqwe@ruur.ruuuuuu", "qwertyuio@mail.ru", "asdfghjkl@gmail.com"};

        for (String data : testData) {
            try {
                EmailParser emailParser = new EmailParser(data);
                System.out.println(emailParser.getNameOfEmail());
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }


    }
}
