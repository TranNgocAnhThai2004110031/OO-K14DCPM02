package SE_K14DCPM02.BaiTapVeNha;

import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class StoredFiles {
    private String stored_file;

     List<Account> memory = new ArrayList<>();

    public StoredFiles() {
    }

    public StoredFiles(String stored_file) {
        this.stored_file = stored_file;
    }

    public void read() {
        Gson gson = new Gson();
        try(Reader fileReader = Files.newBufferedReader(Paths.get("data.json"))){
            System.out.println(fileReader);
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void write() {
        Gson gson = new Gson();
        try(FileWriter fileWriter = new FileWriter("data.json")){
            gson.toJson(memory, fileWriter);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Account account) {
        memory.add(account);
    }

    public void get_all() {
        
    }    
}
