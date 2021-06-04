import com.hary.repository.HibernateSpeakerRepositoryImpl;
import com.hary.repository.SpeakerRepository;
import com.hary.service.SpeakerService;
import com.hary.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
//        speakerService.setRepository(getSpeakerRepository());

        return speakerService;
    }

    @Bean(name = "speakerRepository")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
