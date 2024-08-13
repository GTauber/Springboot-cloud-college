package college.spb.cloud.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpbAndCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpbAndCloudApplication.class, args);
    }

}
