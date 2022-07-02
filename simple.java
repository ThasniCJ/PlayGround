import java.io.*; 
import java.io.FileReader;
import java.io.FileWriter;
class simple
{
	public static void main(String args[])throws Exception
	{
	File log= new File("abc.txt");
String search = "consectetur adipiscing elit";
String replace = "########### ########## ####";

try{
    FileReader fr = new FileReader(log);
    String s;
    String totalStr = "";
    try (BufferedReader br = new BufferedReader(fr)) {

        while ((s = br.readLine()) != null) {
            totalStr += s;
        }
        totalStr = totalStr.replaceAll(search, replace);
        FileWriter fw = new FileWriter(log);

    fw.write(totalStr);
    fw.close();
    }
}catch(Exception e){
    e.printStackTrace();
}
	

}}