import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
	private LocalDateTime dateTime;
	private final long oneGigaSec = 1_000_000_000L;

    Gigasecond(LocalDate birthDate) {
    	this(birthDate.atStartOfDay());
     }

    Gigasecond(LocalDateTime birthDateTime) {
    	dateTime = birthDateTime.plus(Duration.ofSeconds(oneGigaSec));
     }

    LocalDateTime getDateTime() {
    	return dateTime;
     }

}

