// Imports :)
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_convert {
    public static void main(String[] args) {
        String correctDateStr = "2022-03-17 10:45:30"; // current date
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter date and time");
        String dateStr = myObj.nextLine();  // Read user input
        if(dateStr != correctDateStr){
            system.out.println("bad");
        }else{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // formats date to readible format
            LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter); // creates a date object to be used
            String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss")); // reformats date to month day year format
    
            System.out.println(formattedDate); // prints out date
        }
    }
}
