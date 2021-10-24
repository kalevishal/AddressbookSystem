import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileIO1 {
    public void writeData(Map<String,Address> addressBook){
        File file=new File("C:\\Users\\Arti\\IdeaProjects\\AddressBook\\src\\Address.java");
        BufferedWriter bw = null;
        try{
            bw=new BufferedWriter(new FileWriter(file));

            for(Map.Entry<String,Address> entry: addressBook.entrySet()){
                bw.write(entry.getKey() + ":" +entry.getValue());
                bw.newLine();
            }
            bw.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
    public static Map<String, String> readData(){
        Map<String,String>mapFile=new HashMap<>();
        BufferedReader br=null;
        try{
            File file=new File("C:\\Users\\Arti\\IdeaProjects\\AddressBook\\src\\Documents\\xyz.txt");

            br=new BufferedReader(new FileReader(file));

            String line=null;

            while ((line=br.readLine()) !=null){
                String[] parts=line.split(",");
                String bookName=parts[0].trim();
                String firstName=parts[1].trim();
                String address=parts[2].trim();
                mapFile.put(bookName,firstName);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (br!=null){
                try {
                    br.close();
                }catch (Exception e){

                }
            }
        }
        System.out.println(mapFile);
        return mapFile;

    }

    public static void main(String[] args){
        FileIO1 fileIO1=new FileIO1();
        FileIO1.readData();
    }
}