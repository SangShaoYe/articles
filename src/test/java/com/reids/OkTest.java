package com.reids;

import okhttp3.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class OkTest {

    public OkTest() {
        System.out.println("---");
    }

    static Map<String, String> map = new ConcurrentHashMap<>();

    public void add(String key,String val) {
        OkTest.map.put(key, val);
    }

    static {
        System.out.println("static");
    }
    public static void main(String[] args) throws IOException {


//        Thread thread = new Thread(new C());
//        thread.start();
//        System.out.println(thread.getState());
    }
}

class C implements Runnable{

    @Override
    public void run() {
        System.out.println("xxx");
    }
}