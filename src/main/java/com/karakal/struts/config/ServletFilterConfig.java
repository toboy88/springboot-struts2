package com.karakal.struts.config;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (c) 2019, 北京卡拉卡尔科技股份有限公司 All rights reserved.
 *
 * @author eran.zhan@karakal.com.cn (zhaneran)
 * @version 1.0
 * @since 2019/8/13 16:03
 */
@Configuration
public class ServletFilterConfig {
    /**
     * 因为这里是使用main方法加载的所以没有配置文件这里需要将struts2的核心拦截器实例
     * 否则无法访问struts2
     * 而web项目中struts2的配置文件如下：
     * 			<filter>
     *				<filter-name>struts2</filter-name>
     *				<filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
     *			</filter>
     *			<filter-mapping>
     *				<filter-name>struts2</filter-name>
     *				<url-pattern>/*</url-pattern>
     *			</filter-mapping>
     * 所以我们需要在这个配置类中将web中配置的拦截器类创建这样才实现了struts2的核心配置
     * 而路径如果不配置的话默认的就是拦截所有路径
     */
    @Bean
    public StrutsPrepareAndExecuteFilter strutsPrepareAndExecuteFilter(){
        return new StrutsPrepareAndExecuteFilter();
    }

}
