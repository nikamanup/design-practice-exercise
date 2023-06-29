package designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo implements Cloneable{
  private List<String>  employeeList;
  public PrototypeDemo(){
      employeeList=new ArrayList<>();
  }
  public PrototypeDemo(List<String> list){
      employeeList=list;
  }
    public PrototypeDemo clone(){
      List<String> newEmpList=new ArrayList<>();
        for (String emp:employeeList) {
            newEmpList.add(emp);
        }
        return new PrototypeDemo(newEmpList);
    }

    public void loadData(){
      employeeList.add("anup");
      employeeList.add("reeva");
    }
    public List<String> getEmployeeList() {
        return employeeList;
    }
}
