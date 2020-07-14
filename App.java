package com.attrawapti.WapitProject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

public static void main(String[] args) throws IOException {
		InetAddress ip;
		ip = InetAddress.getLocalHost();
       
        System.out.println(System.getProperty("os.name"));
        System.getProperty("os.name");
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("IP Address:- " + inetAddress.getHostAddress());
        System.out.println("Host Name:- " + inetAddress.getHostName());


File file = new File("C:\\\\\\\\Users\\\\\\\\User\\\\\\\\Desktop\\\\\\\\HTML_TRAINING\\\\\\\\Report\\\\\\\\test4.txt");
FileWriter fr = null;

fr = new FileWriter(file);
fr.write("\n================================== \n");
fr.write("IP Address :");

fr.write(inetAddress.getHostAddress());
fr.write("\n================================== \n");

//fr.close();

NetworkInterface network = NetworkInterface.getByInetAddress(ip);

byte[] mac = network.getHardwareAddress();

System.out.print("Current MAC address : ");

StringBuilder sb = new StringBuilder();
for (int i = 0; i < mac.length; i++) {
	sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
}
System.out.println(sb.toString());
fr.write("Current MAC address : ");
fr.write(sb.toString());

fr.write("\n================================== \n");
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime now = LocalDateTime.now();
System.out.println(dtf.format(now));
fr.write("System Date and Time  : ");
fr.write(dtf.format(now));

fr.write("\n================================== \n");
fr.write("The OS is   : ");
fr.write(System.getProperty("os.name"));
fr.close();
try
{  
  Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && ipconfig && start calc\""); 
} 
catch (Exception e) 
{ 
    System.out.println("U r Doing Something Wrong "); 
    e.printStackTrace(); 
} 

	}

}
