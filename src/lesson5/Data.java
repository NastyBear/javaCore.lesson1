package lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {


    public static void main(String[] args) throws IOException {

res();
AppData appData = read();

    }

    public static void res() throws FileNotFoundException {
        File fileCSV = new File("src/lesson5/header.csv");
        int i;
        File resultCSV = new File("src/lesson5/result.csv");
        FileInputStream fileInputStream = new FileInputStream(fileCSV);
        try ( fileInputStream;
              FileOutputStream fileOutputStream = new FileOutputStream(resultCSV);){
            do{
                i = fileInputStream.read();
                fileOutputStream.write(i);
            }while (i!=-1);

        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static AppData read () throws IOException {
        AppData appData = new AppData();
List<List<String>> records = new ArrayList<>();
try (BufferedReader br = new BufferedReader(new FileReader("src/lesson5/result.csv"))){
    String line = br.readLine();
    appData.setHeader(line.split(";"));
    while ((line = br.readLine())!=null){
        String [] values = line.split(";");
        records.add(Arrays.asList(values));
    }
};
int [][] resultData = new int [records.size()][3];
for (int i =0;i<records.size();i++){
    for (int j=0;j<records.get(i).size();j++){
        resultData[i][j] = Integer.valueOf(records.get(i).get(j));

    }
}
        appData.setData(resultData);
        return appData;
    }

    }