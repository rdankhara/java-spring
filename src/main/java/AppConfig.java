import com.hary.repository.HibernateSpeakerRepositoryImpl;
import com.hary.repository.SpeakerRepository;
import com.hary.service.SpeakerService;
import com.hary.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
//        speakerService.setRepository(getSpeakerRepository());

        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
