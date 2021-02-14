//By Mahesh Vanam 2019BCS0030
import java.util.*;
import java.net.*;
import java.io.*;
public class ServerSide2 {
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
            p.println(str);
            p.flush();
            if(str.equals("end")){
                break;
            }
        }
    }
    
}
//By Mahesh Vanam 2019BCS0030