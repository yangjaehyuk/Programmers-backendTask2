package programmers2_task.handler;

import java.nio.file.*;


public class mkdirHandler {
  public static void mkdir(){
    String dirPath="C:\\Users\\user\\Desktop\\programmers2_task\\data\\output";
    Path path = Paths.get(dirPath);
    try {
      Files.createDirectory(path);
    } catch (Exception e) {
      System.out.println("이미 존재하는 디렉터리");
    }
  }
}
