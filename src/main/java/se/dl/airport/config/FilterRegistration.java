package se.dl.airport.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.dl.airport.config.filter.CustomURLFilter;
import se.dl.airport.config.filter.SimpleFilter;

@Log4j2
//@Configuration
public class FilterRegistration {

//    @Bean
    public FilterRegistrationBean <SimpleFilter> registerSimpleFilter() {
        FilterRegistrationBean < SimpleFilter > registrationBean = new FilterRegistrationBean();
        SimpleFilter customURLFilter = new SimpleFilter();

        registrationBean.setFilter(customURLFilter);
        registrationBean.addUrlPatterns("/greeting/*");
        registrationBean.addUrlPatterns("/arvid/*");
        registrationBean.setOrder(1);
        log.info("Simple filter registered");
        return registrationBean;
    }

//    @Bean
    public FilterRegistrationBean <CustomURLFilter> registerCustomURLFilter() {
        FilterRegistrationBean < CustomURLFilter > registrationBean = new FilterRegistrationBean();
        CustomURLFilter customURLFilter = new CustomURLFilter();

        registrationBean.setFilter(customURLFilter);
        registrationBean.addUrlPatterns("/rest/*");
        registrationBean.setOrder(2);
        log.info("Custom URL filter registered");
        return registrationBean;
    }
}