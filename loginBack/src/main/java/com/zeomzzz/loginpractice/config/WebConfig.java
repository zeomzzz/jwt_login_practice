package com.zeomzzz.loginpractice.config;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//import com.zeomzzz.loginpractice.interceptor.SessionInterceptor;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
//	@Autowired
//	SessionInterceptor sessionInterceptor;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/swagger-ui/**")
				.addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/");
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "PUT", "DELETE");
	}

//	// 인터셉터 설정 추가
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(sessionInterceptor)
//				.addPathPatterns("/**") // 다른 요청들은 다 인터셉터가 통제
//				.excludePathPatterns(
//						"/api-user/login", 
//						"/swagger-resources/**", // swagger
//						"/swagger-ui/**", "/v2/api-docs");
//	}

}
