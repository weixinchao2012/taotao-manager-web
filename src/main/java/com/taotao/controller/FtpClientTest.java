//package com.taotao.controller;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.net.SocketException;
//
//import org.apache.commons.net.ftp.FTP;
//import org.apache.commons.net.ftp.FTPClient;
//import org.junit.Test;
//
//public class FtpClientTest {
//
//	@Test
//	public void testUpload() 
//	{
//		FTPClient client=new FTPClient();
//		
//		try {
//			client.connect("192.168.142.129",21);
//			
//			client.login("ftpuser", "wawj@2020");
//			
//		
//			
//			System.out.println( client.getReplyCode());
//			
//			File tempFile=new File("C:"+File.separator+"Pic"+File.separator+"2037546.jpg");
//			
//			System.out.println(tempFile.length());
//			FileInputStream in=new FileInputStream(tempFile);
//			
//			client.changeWorkingDirectory("/home/ftpuser/image");
//			
//			client.setFileType(FTP.BINARY_FILE_TYPE);
//			client.enterLocalPassiveMode();
//			client.setFileTransferMode(FTP.STREAM_TRANSFER_MODE);
//			client.setControlEncoding("UTF-8");
//			
//			Boolean isUpload=client.storeFile("Game.jpg", in);
//			
//			System.out.println(isUpload);
//			in.close();
//			
//			client.logout();
//		} catch (SocketException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//	}
//}
