
package payrollwriterbinary;

import dao.*;

import java.io.*;

public class PayrollWriterBinary 
{

    
    public static void main(String[] args) 
    {
       
        String inFile = "C:/Users/55mondelmd09/Documents/PayrollMasterBinary/PayrollMaster.dat";
        String inFileStreamName = "payrollMasterA";
        String outFile = "C:/Users/55mondelmd09/Documents/PayrollMasterBinary/PayrollMasterBinary.dat";
        String inputLine;
        
        try(FileOutputStream outFileStream = new FileOutputStream(outFile);)
        { 
            LineSequential.open(inFile, inFileStreamName, "input");
            
            while((inputLine = LineSequential.read(inFileStreamName)) != null)
            {
                outFileStream.write(inputLine.getBytes());
            }
            
            LineSequential.close(inFileStreamName, "input");
            System.out.println("File Complete!");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
