package cn.com.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * 创建udp发送的客户端
 * @author fengyuan
 *
 */
public class UdpClient {
	public static void main(String[] args) throws IOException {
		/*
		 * 1.创建socket,要往哪里发送信息
		 * 2.准备发送的信息
		 * 3.封闭要发送的消息
		 * 4.调用socket的方法发送信息
		 * 5.关闭资源
		 */
		System.out.println("udp客户端启动。。。。");
		DatagramSocket ds = new DatagramSocket();
		/*String msg = "i'm comming";
		byte[] bufs = msg.getBytes();
		DatagramPacket dp = new DatagramPacket(bufs, 0, bufs.length, InetAddress.getByName("localhost"), 10000);*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = null;
			if((line = br.readLine()) != null){
				DatagramPacket dp = new DatagramPacket(line.getBytes(), 0, line.getBytes().length, InetAddress.getByName("localhost"), 10000);
				ds.send(dp);
			}
			if("886".equals(line))
				break;
		}
		ds.close();
	}

}
