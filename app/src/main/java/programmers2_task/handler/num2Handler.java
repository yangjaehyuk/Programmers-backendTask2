package programmers2_task.handler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.SortedMap;
import java.util.TreeMap;

import com.fasterxml.jackson.databind.ObjectMapper;

import programmers2_task.domain.Member;

public class num2Handler {
  public static void num2() throws Exception{
    SortedMap<Long, String> sortedMap = new TreeMap<>();
    ObjectMapper objectMapper = new ObjectMapper();
    String readPath = "C:\\Users\\user\\Desktop\\programmers2_task\\data\\input\\customer.json";
    File readFile = new File(readPath);
    Member[] members = objectMapper.readValue(readFile, Member[].class);
    for(Member member: members){
      if(member.getStatus().toString().equals("dormant")){
        sortedMap.put(member.getId(), member.getName());
      }
    }
    String num2Path = "C:\\Users\\user\\Desktop\\programmers2_task\\data\\output\\problem_2.json";
    File num2File = new File(num2Path);
    if(!num2File.exists()){
      num2File.createNewFile();
      FileWriter fw = new FileWriter(num2File);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(sortedMap.keySet().toString());
      bw.close();
    }
    else{
      FileWriter fw = new FileWriter(num2File);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(sortedMap.keySet().toString());
      bw.close();
    }
  }
}
