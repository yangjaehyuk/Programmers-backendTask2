package programmers2_task.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Member {
  private Long customer_id;
  private String name;
  private String status;
  
  public Long getId(){
    return customer_id;
  }

  public String getName(){
    return name;
  }

  public String getStatus(){
    return status;
  }

  public Member(){}

  @JsonCreator
  public Member(@JsonProperty("customer_id") Long customer_id, @JsonProperty("name") String name, @JsonProperty("status") String status){
    this.customer_id=customer_id;
    this.name=name;
    this.status=status;
  }
}
