package service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import business.Bank;

public class LogMethodI implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation m1) throws Throwable {
		Log l=LogFactory.getLog(Bank.class);
		l.info("Methd beffor");
		Object ret=m1.proceed();
		l.info("method after");
		return ret;
	}

}
