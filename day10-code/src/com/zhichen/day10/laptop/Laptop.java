package com.zhichen.day10.laptop;

import java.security.Key;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-05 16:51
 */
public class Laptop {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }
    public void useUSBDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if(usb instanceof KeyBoard){
            KeyBoard keyboard = (KeyBoard) usb;
            keyboard.input();
        }

        usb.close();
    }
}
