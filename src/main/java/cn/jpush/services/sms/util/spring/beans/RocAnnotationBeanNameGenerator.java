package cn.jpush.services.sms.util.spring.beans;

import java.beans.Introspector;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.util.ClassUtils;
/**
 * AnnotationBeanNameGenerator
 * @author Roc
 * 	<context:component-scan base-package="cn.itcast.spring0401.jdbc.transaction.annotation"  name-generator="cn.itcast.spring0401.jdbc.transaction.annotation.RocAnnotationBeanNameGenerator"></context:component-scan>
 *
 */
public class RocAnnotationBeanNameGenerator extends AnnotationBeanNameGenerator {


	@Override
	protected String buildDefaultBeanName(BeanDefinition definition) {
		String className = definition.getBeanClassName();
		if(className.endsWith("ServiceImpl")){
			String shortName = ClassUtils.getShortName(className.replace("Impl", ""));
			return Introspector.decapitalize(shortName);
		}
		return super.buildDefaultBeanName(definition);
	}

//	@Override
//	protected String determineBeanNameFromAnnotation(
//			AnnotatedBeanDefinition arg0) {
//		return super.determineBeanNameFromAnnotation(arg0);
//	}
//
//	@Override
//	public String generateBeanName(BeanDefinition arg0,
//			BeanDefinitionRegistry arg1) {
//		return super.generateBeanName(arg0, arg1);
//	}
//
//	@Override
//	protected boolean isStereotypeWithNameValue(String annotationType,
//			Set<String> metaAnnotationTypes, Map<String, Object> attributes) {
//		return super.isStereotypeWithNameValue(annotationType, metaAnnotationTypes,
//				attributes);
//	}
//	

}
