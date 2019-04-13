package cn.com.net;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;

public class IPDemo {
	private static Logger log = Logger.getLogger(IPDemo.class);
	public static void main(String[] args) throws UnknownHostException, UnsupportedEncodingException {
		InetAddress iAdress = InetAddress.getLocalHost();
		String name = iAdress.getHostName();
		log.info("name:" + name);
		String hostAddress = iAdress.getHostAddress();
		log.info("hostAddress" + hostAddress);
		InetAddress[] inetAddress = InetAddress.getAllByName("www.baidu.com");
		for (InetAddress inetAddress2 : inetAddress) {
			System.out.println(inetAddress2.getHostAddress());
		}
	}

}
