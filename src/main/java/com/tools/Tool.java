package com.tools;

import java.util.*;

/**
 * Created by full on 2017/10/27.
 */
public class Tool {

    public static String mapToPostData(Map<String, String> m) {

        ArrayList<String> list = new ArrayList<String>(m.keySet());
        Collections.sort(list);

        StringBuffer sb = new StringBuffer();
        for (String key : list) {
            sb.append(key + "=" + m.get(key) + "&");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /**
     * 如此种形式的字符串转换成Map
     * 40:1.5, 41:2.0, 49:2.0, 50:2.0
     * @param str
     * @return
     */
    public static Map<Integer,Double> idPrice(String str) {
        List<String> kvs = Arrays.asList(str.split(","));
        Map<Integer, Double> map = new HashMap<>();
        kvs.forEach(kv-> map.put(Integer.valueOf(kv.split(":")[0].trim()), Double.valueOf(kv.split(":")[1])));
        return map;
    }
}
