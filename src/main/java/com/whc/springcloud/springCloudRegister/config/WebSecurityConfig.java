package com.whc.springcloud.springCloudRegister.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * ClassName: WebSecurityConfig <br/>
 * Description: <br/>
 * date: 2020/8/31 15:19<br/>
 *
 * @author FEI FEI<br/>
 * @since JDK 1.8
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Basic 认证是一种较为简单的 HTTP 认证方式，客户端通过明文（Base64编码格式）传输用户名和密码到服务端进行认证
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER);
        http.csrf().disable();
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
}