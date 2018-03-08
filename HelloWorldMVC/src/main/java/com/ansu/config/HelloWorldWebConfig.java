package com.ansu.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.ansu"})
//@PropertySource(value="classpath:employeeMessages.properties")
public class HelloWorldWebConfig {
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver =
				new InternalResourceViewResolver();
		resolver.setPrefix("/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
	
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	
	 @Bean
	    public ReloadableResourceBundleMessageSource messageSource(){
	        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	        messageSource.setBasename("classpath:messages");
	        messageSource.setDefaultEncoding("UTF-8");
	        return messageSource;
	    }

	    @Bean
	    public CookieLocaleResolver localeResolver(){
	        CookieLocaleResolver localeResolver = new CookieLocaleResolver();
	        localeResolver.setDefaultLocale(Locale.ENGLISH);
	        localeResolver.setCookieName("my-locale-cookie");
	        localeResolver.setCookieMaxAge(3600);
	        return localeResolver;
	    }

	    @Bean
	    public LocaleChangeInterceptor localeInterceptor(){
	        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
	        interceptor.setParamName("lang");
	        return interceptor;
	    }

	   /* @Override
	    public void addInterceptors(InterceptorRegistry registry) {
	        registry.addInterceptor(localeInterceptor());
	    }*/
	
	
	
	
	/*@Bean(name="messageSource")
	public MessageSource messageSource() {
	  ResourceBundleMessageSource messageSource =
	          new ResourceBundleMessageSource();
	  messageSource.setBasename("WEB-INF/i18n/messages/");
	  return messageSource;
	}*/
	
	
	/*@Bean
	public MessageSource messageSource() {
	    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	    messageSource.setBasenames("WEB-INF/i18n/messages");
	    messageSource.setUseCodeAsDefaultMessage(true);
	   // messageSource.setDefaultEncoding(UTF8_ENCODING);
	    messageSource.setFallbackToSystemLocale(false);
	    messageSource.setCacheSeconds((int)TimeUnit.HOURS.toSeconds(1));
	    return messageSource;
	}*/

	 

}
