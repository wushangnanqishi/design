package com.hp.design.singleton;

/**
 * 饿汉式单例模式
 * JVM 加载该类时，即生成该类的实例
 * 优点：不会因为多线程环境下，生成多个HungrySingleton对象
 * 缺点： 无论程序需不需要HungrySingleton对象，程序只要加载了HungrySingleton，
 * 就有一个HungrySingleton对象
 */
public class HungrySingleton {

    private static HungrySingleton  hungrySingleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
