public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int days = 17 * 7;

        int workDays = days - 17 * 2;

        int codingPerDay = 6;

        float workHours = 17 * 52;

        float codingHours = workDays * codingPerDay;

        System.out.println(codingHours);

        float productivity = codingHours / workHours;

        float productivityPercentage = productivity * 100;

        System.out.println(productivityPercentage);

    }
}