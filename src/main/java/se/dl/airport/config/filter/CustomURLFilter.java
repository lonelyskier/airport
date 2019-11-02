package se.dl.airport.config.filter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Configuration
@Slf4j
public class CustomURLFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomURLFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.info("########## Initiating CustomURLFilter filter ##########");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("CUSTOMURLFILTER");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        LOGGER.info("This Filter is only called when request is mapped for /customer resource");

        //call next filter in the filter chain
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}