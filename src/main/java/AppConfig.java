import com.hary.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan("com.hary")
public class AppConfig {

    @Bean("calenderFactory")
    public CalendarFactory calendarFactory() {
        CalendarFactory calendarFactory = new CalendarFactory();
        calendarFactory.addDays(2);
        return calendarFactory;
    }

    @Bean("calendar")
    public Calendar calendar() throws Exception {
        return calendarFactory().getObject();
    }
}
