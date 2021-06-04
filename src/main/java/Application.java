import com.hary.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
    public static void main(String args[]) {

        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/ApplicationContext.xml");
        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
