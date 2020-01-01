package com.imooc.springboot.ioc;

import org.junit.Test;

/**
 * @Author : 刘水镜
 * @Description :
 * @Date Create in 2019/12/30 21:57
 */
//@RunWith(JUnit4.class)
public class IocTests {

    @Test
    public void test() {
        Driveable bike = new Bike();
        Person xiaoming = new Person(bike);
        xiaoming.hangOut();

        Driveable car = new Car();
        xiaoming = new Person(car);
        xiaoming.hangOut();

        Driveable train = new Train();
        xiaoming = new Person(train);
        xiaoming.hangOut();

        Driveable airPlane = new AirPlane();
        xiaoming = new Person(airPlane);
        xiaoming.hangOut();

        Driveable ship = new Ship();
        xiaoming = new Person(ship);
        xiaoming.hangOut();
    }
}
