package es.atsistemas.techday;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import es.atsistemas.techday.service.ImageService;
import es.atsistemas.techday.service.ImageServiceImpl;

@Configuration
public class WpaasConfig {

	public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/").setViewName("forward:/index.html");
	}
	
	@Bean
	ImageService imageService(){
		return new ImageServiceImpl();
	}
	
	@Bean
	Map<String,String> uriMap(){
		return new HashMap<String,String>();
	}
	
	
}
