package cn.edu.gzist.cs.demo.config;

import cn.edu.gzist.cs.demo.interceptor.LoginInterceptor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Value("${file.upload-local-dir}")
    private String uploadLocalDir;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        System.out.println("file:" + uploadLocalDir);
        // 配置：访问 /upload/** 路径时，映射到本地 /data/upload/ 目录
        registry.addResourceHandler("/upload/**")
                .addResourceLocations("file:" + uploadLocalDir);
    }

    //  拦截器注册
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");
    }
}