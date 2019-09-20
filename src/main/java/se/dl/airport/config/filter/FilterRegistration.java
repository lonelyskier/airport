package se.dl.airport.config.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.dl.airport.config.filter.CustomURLFilter;
import se.dl.airport.config.filter.SimpleFilter;

@Configuration
public class FilterRegistration {

    @Bean
    public FilterRegistrationBean <SimpleFilter> filterRegistrationBean() {
        FilterRegistrationBean < SimpleFilter > registrationBean = new FilterRegistrationBean();
        SimpleFilter customURLFilter = new SimpleFilter();

        registrationBean.setFilter(customURLFilter);
        registrationBean.addUrlPatterns("/greeting/*");
        registrationBean.addUrlPatterns("/arvid/*");
        registrationBean.setOrder(2); //set precedence
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean <CustomURLFilter> filterRegistrationBean22() {
        FilterRegistrationBean < CustomURLFilter > registrationBean = new FilterRegistrationBean();
        CustomURLFilter customURLFilter = new CustomURLFilter();

        registrationBean.setFilter(customURLFilter);
        registrationBean.addUrlPatterns("/hello/*");
        registrationBean.setOrder(2); //set precedence
        return registrationBean;
    }
}