package org.springframework.samples.petclinic.owner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 어디에 쓸수있는지
@Retention(RetentionPolicy.RUNTIME) // 어노테이션 정보를 언제까지 유지할것인가
public @interface LogExcutionTime {

}
