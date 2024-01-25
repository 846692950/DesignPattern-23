package DesignPattern.c17责任链模式;

import DesignPattern.c17责任链模式.AbstractLeaveHandlerExt.CEOLeaveHandler;
import DesignPattern.c17责任链模式.AbstractLeaveHandlerExt.LeaderLeaveHandler;
import DesignPattern.c17责任链模式.AbstractLeaveHandlerExt.ManagerLeaveHandler;

/**
 * 顾名思义，责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。
 * 这种模式给予请求的类型，对请求的发送者和接收者进行解耦。
 * 这种类型的设计模式属于行为型模式。
 * <p>
 * 在这种模式中，通常每个接收者都包含对另一个接收者的引用。
 * 如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
 * <p>
 * 比如下边的例子，员工请假一层一层匹配，只有到有权限的领导，才能够被批准！
 */
public class ChainPatternDemo {

    public static void main(String[] args) {

        AbstractLeaveHandler leaderLeaveHandler = new LeaderLeaveHandler("唐乔");//主管
        ManagerLeaveHandler managerLeaveHandler = new ManagerLeaveHandler("霍天麟");//部门经理
        CEOLeaveHandler ceoLeaveHandler = new CEOLeaveHandler("京兆尹");//总经理

        //主管的下个节点是部门经理
        leaderLeaveHandler.setNextHandler(managerLeaveHandler);
        //部门经理的下个节点是总经理
        managerLeaveHandler.setNextHandler(ceoLeaveHandler);

        //员工开始请假
        LeaveRequest request = new LeaveRequest(30, "田七");
        leaderLeaveHandler.handlerRequest(request);
    }

}
