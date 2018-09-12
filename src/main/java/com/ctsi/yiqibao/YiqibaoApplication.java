package com.ctsi.yiqibao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@MapperScan("com.ctsi.yiqibao.*.mapper")
@SpringBootApplication
public class YiqibaoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(YiqibaoApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(YiqibaoApplication.class);
    }
}
