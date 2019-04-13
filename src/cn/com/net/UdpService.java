package cn.com.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpService {
	public static void main(String[] args) throws IOException {
		System.out.println("udp服务端启动。。。");
		DatagramSocket ds = new DatagramSocket(10000);
		while(true){
			byte[] bs = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bs, bs.length);
			ds.receive(dp);
			byte[] data = dp.getData();
			InetAddress address = dp.getAddress();
			int port = dp.getPort();
			System.out.println(address.getHostAddress() + ":" + port + new String(data,0,data.length));	
		}
		//ds.close();
	}

}
