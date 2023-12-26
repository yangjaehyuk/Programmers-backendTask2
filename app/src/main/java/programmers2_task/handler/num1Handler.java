package programmers2_task.handler;

import com.fasterxml.jackson.databind.ObjectMapper;

import programmers2_task.domain.Member;

import java.io.*;
public class num1Handler {
  public static void num1() throws Exception{
    ObjectMapper objectMapper = new ObjectMapper();
    String readPath = "C:\\Users\\user\\Desktop\\programmers2_task\\data\\input\\customer.json";
    File readFile = new File(readPath);
    Member[] members = objectMapper.readValue(readFile, Member[].class);
    int total = 0;
    for(Member member: members){
      total+=1;
    }
    String res="""
      {
        "total": %d
      }
        """.formatted(total);
    String num1Path = "C:\\Users\\user\\Desktop\\programmers2_task\\data\\output\\problem_1.json";
    File num1File = new File(num1Path);
    if(!num1File.exists()){
      num1File.createNewFile();
      FileWriter fw = new FileWriter(num1File);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(res);
      bw.close();
    }
    else{
      FileWriter fw = new FileWriter(num1File);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(res);
      bw.close();
    }

  }
  
}
