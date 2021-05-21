package junit;

import com.cj.study.Demo1.SpreadNumEnum;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/17 2:19 下午
 */
public class Demo1 {

    @Test
    public void demo1(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aaa");
        map.put(2, "bbb");

        System.out.println(map.get(1));
    }

    @Test
    public void demo2(){
        SpreadNumEnum sss = SpreadNumEnum.ADD_1;
        System.out.println(sss == SpreadNumEnum.ADD_1);
        System.out.println(sss.equals(SpreadNumEnum.ADD_1));
    }
}
