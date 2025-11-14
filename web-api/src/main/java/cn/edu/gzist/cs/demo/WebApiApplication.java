package cn.edu.gzist.cs.demo;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@MapperScan("cn.edu.gzist.cs.demo.devenv.mapper")
public class WebApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WebApiApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        this.setRegisterErrorPageFilter(false); // 错误页面有容器来处理，而不是SpringBoot
        return builder.sources(WebApiApplication.class);
    }
}
