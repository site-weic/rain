package site.weic.rain.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import site.weic.rain.common.constant.WebConstant;
import site.weic.rain.service.contant.ServiceConstant;

/**
 * RainWebApplication
 *
 * @author Zhang Wei
 * @version RainWebApplication.java v1.0 2023-03-05
 */
@SpringBootApplication
public class RainWebApplication {

    public static void main(String[] args) {
        ServiceConstant.getHeaderName();
        WebConstant.getMsgIdName();
        SpringApplication.run(RainWebApplication.class, args);
    }
}
