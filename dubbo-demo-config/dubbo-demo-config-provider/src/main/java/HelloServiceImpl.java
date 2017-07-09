import com.alibaba.dubbo.config.annotation.Service;
import com.otg.jason.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by jason.guan on 2017/7/7.
 */
@Component
@Service(version="1.0.0")
public class HelloServiceImpl  implements HelloService {

    public void sayHello(String ss) {

        System.out.println("hello dubbo-" + ss);
    }

}