package com.zolotukhin.spring.aop.aspects;

import com.zolotukhin.spring.aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

	//@Before("execution(* getStudents())")
	//public void beforeGetStudentsAdvice(){
	//	System.out.println("beforeGetStudentsAdvice: логируем получение " +
	//			"списка студентов перед методом getStudents");
	//}
	//
	//@AfterReturning(pointcut = "execution(* getStudents())",
	//	returning = "students")
	//public void afterReturningGetStudentsAdvice(List<Student> students){
	//	Student firstStudent = students.get(0);
	//	String nameSurname = firstStudent.getNameSurname();
	//	nameSurname = "Mr. " + nameSurname;
	//	firstStudent.setNameSurname(nameSurname);
	//
	//	double avgGrade = firstStudent.getAvgGrade();
	//	avgGrade++;
	//	firstStudent.setAvgGrade(avgGrade);
	//
	//	System.out.println("afterReturningGetStudentsAdvice: логируем получение " +
	//			"списка студентов после работы методом getStudents");
	//
	//}
	//
	//@AfterThrowing(pointcut = "execution(* getStudents())",
	//throwing = "exception")
	//public void afterThrowingGetStudentsAdvice(Throwable exception){
	//	System.out.println("afterThrowingGetStudentsAdvice: " +
	//			"ловим выброс исключение " + exception);
	//
	//}

	@After("execution(* getStudents())")
	public void afterGetStudentsAdvice(){
		System.out.println("afterGetStudentsAdvice: логируем нормальное " +
				"окончание работы метода или выброс исключения");
	}
}
