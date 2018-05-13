package com.uk.cog.qea.sdet;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.uk.cog.qea.sdet.assembler.dto.entity.MemberAssemblerBusiness;
import com.uk.cog.qea.sdet.assembler.vo.dto.MemberAssemblerService;
import com.uk.cog.qea.sdet.util.MemberUtil;

@Configuration
@EnableWebMvc
public class SdetConfiguration implements WebMvcConfigurer  {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	public MemberAssemblerService memberAssemblerService() {
		return new MemberAssemblerService();
	}

	@Bean
	public MemberAssemblerBusiness memberAssemblerBusiness() {
		return new MemberAssemblerBusiness();
	}
	
	@Bean
	public MemberUtil memberUtil() {
		return new MemberUtil();
	}
	
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        registry.viewResolver(resolver);
    }
    
	@Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}