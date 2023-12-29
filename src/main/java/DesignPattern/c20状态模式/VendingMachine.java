package DesignPattern.c20状态模式;

import DesignPattern.c20状态模式.StateImpl.*;

/**
 * 自动售货机
 */
public class VendingMachine {

    private State noMoneyState; //没钱的状态
    private State hasMoneyState; //有钱的状态
    private State soldState; //准备出商品的状态
    private State soldOutState; //售罄的状态
    private State winnerState; //中奖的状态

    private int count = 0; //商品数量
    private State currentState; //现在的状态


    public VendingMachine(int count) {
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        if (count > 0) {
            this.count = count;
            currentState = noMoneyState;
        }
    }

    /**
     * 放钱
     */
    public void insertMoney() {
        currentState.insertMoney();
    }

    /**
     * 退钱
     */
    public void backMoney() {
        currentState.backMoney();
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        currentState.turnCrank();
        if (currentState == soldState || currentState == winnerState) {
            currentState.dispense();//两种情况会出货
        }
    }

    /**
     * 出商品
     */
    public void dispense() {
        System.out.println("发出一件商品...");
        if (count > 0) {
            count--;
        }
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }


}
