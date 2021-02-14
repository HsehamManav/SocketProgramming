//By Mahesh Vanam 2019BCS0030
import java.util.*;
import java.net.*;
import java.io.*;
class ClientSide 
{
    public static void main(String[] args) throws Exception
    {
        //System.out.println("Hello World");
        Socket s=new Socket("localhost",9999);
        BufferedReader b=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str;
        while(true)
        {
            str=b.readLine();
            System.out.println("Recieved Message: "+str);
            if(str.equals("end")){
                break;
            }
        }
    }
    
}
//By Mahesh Vanam 2019BCS0030