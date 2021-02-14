//By Mahesh Vanam 2019BCS0030
import java.util.*;
import java.net.*;
import java.io.*;
public class ClientSide2 {
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
            str=b.readLine();
            System.out.println("message received from the server :"+str);
            if(str.equals("end")){
                break;
            }
        }
    }
    
}
//By Mahesh Vanam 2019BCS0030