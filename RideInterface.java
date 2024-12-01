package src.intf;

import src.pojo.Visitor;

// RideInterface.java

/*
* 定义 RideInterface 接口
* */
public interface RideInterface {
    // 队列相关方法
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue();
    void printQueue();

    // 历史记录相关方法
    void addVisitorToHistory(Visitor visitor);
    boolean checkVisitorFromHistory(Visitor visitor);
    int numberOfVisitors();
    void printRideHistory();

    // 运行一个周期的方法
    void runOneCycle();

    // 文件输入输出方法
    void exportRideHistory(String filename);
    void importRideHistory(String filename);
}

