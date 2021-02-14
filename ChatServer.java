//By Mahesh Vanam 2019BCS0030
import java.util.*;
import java.net.*;
import java.io.*;
public class ChatServer {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        ServerSocket ss=new ServerSocket(9999);
        Socket s=ss.accept();
        BufferedReader b=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter p=new PrintWriter(s.getOutputStream());
        String str;
        while(true)
        {   
            str=b.readLine();
            System.out.println("Received Message :"+str);
            if(str.equals("end")){
                break;
            }
            System.out.println("enter the message to send :");
            str=sc.nextLine();
            p.println(str);
            p.flush();
        }
    }
    
}
//By Mahesh Vanam 2019BCS0030