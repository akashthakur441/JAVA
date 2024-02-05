import java.time.Duration;
import java.time.Instant;
class TimeDifference {
    public static void main(String[] args) {
        
        Instant currentTime = Instant.now(); //  current time

        Instant anotherTime = Instant.now().minus(Duration.ofHours(2)); //replace this with actual time

        Duration duration = Duration.between(anotherTime, currentTime); // Calculate the time difference

        System.out.println("Time difference in seconds: " + duration.getSeconds()); 
    }
}