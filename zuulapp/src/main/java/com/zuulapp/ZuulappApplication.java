package com.zuulapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuulapp.filters.ErrorFilter;
import com.zuulapp.filters.PostFilter;
import com.zuulapp.filters.PreFilter;
import com.zuulapp.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulappApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
