package com.zhichen.day10.laptop;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-05 16:57
 */
public class LaptopDrive {
    public static void main(String[] args) {
        Laptop matebook = new Laptop();
        matebook.powerOn();
        matebook.useUSBDevice(new Mouse());
        matebook.useUSBDevice(new KeyBoard());
        matebook.powerOff();
    }
}
