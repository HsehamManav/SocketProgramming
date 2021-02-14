//By Mahesh Vanam 2019BCS0030
import java.util.*;
import java.net.*;
import java.io.*;
class ServerSide 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        ServerSocket ss=new ServerSocket(9999);
        Socket s=ss.accept();
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
        }
    }
}
//By Mahesh Vanam 2019BCS0030