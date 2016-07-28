package client;

import org.apache.commons.logging.LogFactory;
import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import service.LogMethodI;

public class Client {
public static void main(String[] args) {
	//create target Object
	Bank b=new Bank();
	//create advice
	LogMethodI lmi=new LogMethodI();
	
	//add target+advice to the proxy
	
	ProxyFactoryBean pfb=new ProxyFactoryBean();
	//setting target object
	pfb.setTarget(b);
	//adding advice to proxy
	pfb.addAdvice(lmi);
	Bank bproxy=(Bank) pfb.getObject();
	int amount=bproxy.deposit(2000, "sbi123");
	System.out.println(amount);
}
}
