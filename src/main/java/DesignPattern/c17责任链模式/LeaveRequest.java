package DesignPattern.c17责任链模式;

import lombok.Data;

@Data
public class LeaveRequest {

    /**天数*/
    private int leaveDays;

    /**姓名*/
    private String name;

    public LeaveRequest(int leaveDays,String name){
        this.leaveDays = leaveDays;
        this.name = name;
    }
}
