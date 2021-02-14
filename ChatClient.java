//By Mahesh Vanam 2019BCS0030
import java.util.*;
import java.net.*;
import java.io.*;
public class ChatClient {
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        Socket s=new Socket("localhost",9999);
        BufferedReader b=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter p=new PrintWriter(s.getOutputStream());
        String str;
        while(true)
        {   
            System.out.println("enter the message to send :");
            str=sc.nextLine();
            p.println(str);
            p.flush();
            if(str.equals("end")){
                break;
            }
            str=b.readLine();
            System.out.println("message received from the server :"+str);
        }
    }
    
}
//By Mahesh Vanam 2019BCS0030