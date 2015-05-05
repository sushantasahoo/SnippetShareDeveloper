package edu.sjsu.cmpe275.group12.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

	private Log log = LogFactory.getLog(this.getClass());

	/**
	 * This method will be called before IFileService.shareFile and do the
	 * logging and validation for user id. If validation fails it will throw an
	 * unauthorized exception
	 * 
	 * @param joinPoint
	 * @throws Exception
	 */

	/**
	 * 
	 * @param joinPoint
	 * @throws Throwable 
	 */
	@Around("execution(* edu.sjsu.cmpe275.group12.dao.*.*(..)))")
	public Object logDetails(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("Start of the method " + joinPoint.getSignature().getName());
		return joinPoint.proceed();
		
	}

}