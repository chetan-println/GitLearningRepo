import java.util.*;
import edu.duke.*;
import org.apache.commons.csv.*;//we do this in the dev branch sirf comment change hooga
public class Hottestday
{
    public void hottesthour(CSVParser parser){
        CSVRecord largestsofar=null;
        for(CSVRecord record:parser){
            if(largestsofar==null){
                largestsofar=record;}
                else{
                    double largest=Double.parseDouble(largestsofar.get("TemperatureF"));
                    double curr=Double.parseDouble(record.get("TemperatureF"));
                if(largest<curr){
                largestsofar=record;}}}
                System.out.println("the largest temp is this is for git learn purpose"+largestsofar.get("TemperatureF"));}
                public void printMaxTemp(){
                    FileResource fr=new FileResource();
                    CSVParser parser=fr.getCSVParser();
                    hottesthour(parser);}
                    
                    public static void main(String[] args){
                        Hottestday hd=new Hottestday();
                        hd.printMaxTemp();}

}
