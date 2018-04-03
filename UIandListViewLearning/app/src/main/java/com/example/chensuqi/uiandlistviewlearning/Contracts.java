package com.example.chensuqi.uiandlistviewlearning;

/**
 * Created by chensuqi on 2018/3/16.
 */

public class Contracts {
    private String nickName;
    private String summary;
    private String date;

    public Contracts(String nickName, String summary, String date) {
        this.nickName = nickName;
        this.summary = summary;
        this.date = date;
    }

    public String getNickName() {
        return nickName;
    }

    public String getSummary() {
        return summary;
    }

    public String getDate() {
        return date;
    }
}
