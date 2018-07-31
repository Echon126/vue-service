package com.example.test.data;

public class IntervalBean {
    private int front;
    private int end;
    private int type;

    public IntervalBean(int front, int end, int type) {
        this.front = front;
        this.end = end;
        this.type = type;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
