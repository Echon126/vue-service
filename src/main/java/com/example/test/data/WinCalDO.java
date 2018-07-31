package com.example.test.data;

public class WinCalDO {
    private int num;
    private Long prizedId;
    private int ratio;
    private int type;

    public WinCalDO(int num, Long prizedId, int ratio, int type) {
        this.num = num;
        this.prizedId = prizedId;
        this.ratio = ratio;
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Long getPrizedId() {
        return prizedId;
    }

    public void setPrizedId(Long prizedId) {
        this.prizedId = prizedId;
    }

    public int getRatio() {
        return ratio;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
