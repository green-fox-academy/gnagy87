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

        int dailyCoding = 6;
        int semester = 17;
        int workdays = 5;
        int workingHours = 52;
        int codingHours = dailyCoding*workdays*semester;
        //float percentage=(workingHours*semester)/codingHours;


        System.out.println("GF students spend " + codingHours + " hours with coding during the course");

        //System.out.println(percentage);

    }
}