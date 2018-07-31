package com.example.test.service;

import com.example.test.data.IntervalBean;
import com.example.test.data.WinCalDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class LotteryService {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    private  static List<WinCalDO> luckDrawDAO = Arrays.asList(new WinCalDO(1, 100L, 10, 1), new WinCalDO(2, 101L, 20, 2));
    private static Map<String, Object> getWinInfo() {
        Map<String, Object> res = new HashMap<>();
        try {
            // 从数据库读取奖品信息列表
            List<WinCalDO> l = luckDrawDAO;
            int totalWeight = 0;
            Map<Long, IntervalBean> interval = new HashMap<>();
            int prev = 0;
            // 计算最右区间值以及奖品对应的区间
            for (WinCalDO item : l) {
                int spacing = item.getNum() * item.getRatio();
                totalWeight += spacing;
                interval.put(item.getPrizedId(), new IntervalBean(prev, prev + spacing, item.getType()));
                prev = prev + spacing;
            }
            // 产生随机数
            int randNum = new Random().nextInt(totalWeight);
            long prizeId = -1;
            int type = -1;
            for (Map.Entry<Long, IntervalBean> m : interval.entrySet()) {
                int front = m.getValue().getFront();
                int end = m.getValue().getEnd();
                if (randNum >= front && randNum < end) {
                    prizeId = m.getKey();
                    type = m.getValue().getType();
                    break;
                }
            }
            res.put("prizeId", prizeId);
            res.put("type", type);
        } catch (Exception e) {
            e.printStackTrace();
           // log.error("计算获奖出错");
        }
        return res;
    }

    public static void main(String[] args) {
        Map<String, Object> res=getWinInfo();
        System.out.println(res.toString());
    }
}
