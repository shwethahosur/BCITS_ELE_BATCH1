package com.bcits.springannotation.PostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor  implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Inside my bean factory");
		
		
		BeanDefinition beanDefinition=beanFactory.getBeanDefinition("messageBean");
		MutablePropertyValues propertyValues =beanDefinition.getPropertyValues();
		propertyValues.addPropertyValue("message", "value From MBFPP");
		
	}

}
