package se.dl.airport.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.dl.airport.config.filter.CustomURLFilter;
import se.dl.airport.config.filter.SimpleFilter;

@Configuration
public class AppConfig {

    @Bean
    public FilterRegistrationBean <SimpleFilter> filterRegistrationBean() {
        FilterRegistrationBean < SimpleFilter > registrationBean = new FilterRegistrationBean();
        SimpleFilter customURLFilter = new SimpleFilter();

        registrationBean.setFilter(customURLFilter);
        registrationBean.addUrlPatterns("/greeting/*");
        registrationBean.setOrder(2); //set precedence
        return registrationBean;
    }
}