package com.cj.study.designpattern.iterator;

import java.util.Arrays;
import java.util.List;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/18 2:20 下午
 */
public class MyList {

    private List<String> data = Arrays.asList("a", "b", "c");

    public Iterator iterator(){
        return new Itr();
    }

    private class Itr implements Iterator{

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.size();
        }

        @Override
        public String next() {
            return data.get(index++);
        }
    }


}
