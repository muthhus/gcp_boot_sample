package uk.jlr.digital.afrl.retailer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 *
 */
@Configuration
public class EnableUriMatrixVariableSupport extends WebMvcConfigurationSupport {

	/**
	 * requestMappingHandlerMapping - enable Matrix Paramsl
	 *
	 * @return RequestMappingHandlerMapping
	 */
	@Override
	@Bean
	public RequestMappingHandlerMapping requestMappingHandlerMapping() {
		RequestMappingHandlerMapping hm = super.requestMappingHandlerMapping();
		hm.setRemoveSemicolonContent(false);
		return hm;
	}
}