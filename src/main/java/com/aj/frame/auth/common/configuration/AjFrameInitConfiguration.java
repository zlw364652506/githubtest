package com.aj.frame.auth.common.configuration;


import com.aj.frame.idstring.util.DefaultIdStringsLoader;
import com.aj.frame.processor.impl.SynchronousFrameTime;
import com.aj.frame.service.impl.TimingProcessorCallService;
import com.aj.frame.spring.SpringProcessorFactory;
import com.aj.frame.spring.SpringServiceFrameInitialization;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AjFrameInitConfiguration {

    @Bean(name = "处理器工厂")
    public SpringProcessorFactory springProcessorFactory() {
        SpringProcessorFactory factory = new SpringProcessorFactory();
        factory.setDefaultProcessorId(FpidRemoteConfiguration.TRANSPORT_PROXY_PROCESSOR);
//		是否将新创建的处理器强制设置为同步执行模式
        factory.setCreateProcessorAsSynchronous(true);
        return factory;
    }

    @Bean
    @ConfigurationProperties(prefix = "ajframe-initialize.id-strings-constructor")
    DefaultIdStringsLoaderConstructor defaultIdStringsLoaderConstructor() {
        DefaultIdStringsLoaderConstructor defaultIdStringsLoaderConstructor = new DefaultIdStringsLoaderConstructor();
        defaultIdStringsLoaderConstructor.setCharSet("GBK");
        defaultIdStringsLoaderConstructor.setLoadArgs("com.aj.frame.um.Ids");
        return defaultIdStringsLoaderConstructor;
    }

    @Bean
    @ConditionalOnMissingBean
    public DefaultIdStringsLoader defaultIdStringsLoader(DefaultIdStringsLoaderConstructor idStrings) throws Exception {
        // System.out.println("创建默认DefaultIdStringsLoader");
        return new DefaultIdStringsLoader(idStrings.getCharSet(), idStrings.getLoadArgs());
    }

    @Bean("框架初始化")
    @ConfigurationProperties(prefix = "ajframe-initialize")
    public SpringServiceFrameInitialization SpringServiceFrameInitialization(
            SpringProcessorFactory springProcessorFactory, DefaultIdStringsLoader defaultIdStringsLoader) {
        SpringServiceFrameInitialization frameInitialization = new SpringServiceFrameInitialization();
        frameInitialization.setProcessorFactory(springProcessorFactory);
        frameInitialization.setIdStrings(defaultIdStringsLoader);
        return frameInitialization;
    }

    @Bean(name = "同步框架时间")
    public SynchronousFrameTime SynchronousFrameTime() {
        SynchronousFrameTime synchronousFrameTime = new SynchronousFrameTime();
        return synchronousFrameTime;
    }

    @Bean("定时任务")
    @ConfigurationProperties(prefix = "ajframe-timetask")
    public TimingProcessorCallService TimingProcessorCallService() {
        return new TimingProcessorCallService();
    }

}
