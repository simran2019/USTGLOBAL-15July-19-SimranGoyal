package com.ustg.ustspringcore.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor  {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
if(beanName.equals("obj")) {
	System.out.println("hellow world before init");
}else if(beanName.equals("dog")) {
	System.out.println("dog before init");
}
return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean Name :"+beanName);
		return bean;
	}

}
