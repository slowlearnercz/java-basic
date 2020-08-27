package com.zhichen.day05.demo01Exception;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-17 21:20
 */
public class Demo01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
        System.out.println(sdf.parse("1999-0310"));
        System.out.println("后续代码");
//        "D:\Program Files\Java\jdk1.8.0_221\bin\java.exe" "-javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2019.2.2\lib\idea_rt.jar=62973:D:\Program Files\JetBrains\IntelliJ IDEA 2019.2.2\bin" -Dfile.encoding=UTF-8 -classpath "D:\Program Files\Java\jdk1.8.0_221\jre\lib\charsets.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\deploy.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\access-bridge-64.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\cldrdata.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\dnsns.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\jaccess.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\jfxrt.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\localedata.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\nashorn.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunec.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunjce_provider.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunmscapi.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunpkcs11.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\zipfs.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\javaws.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\jce.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\jfr.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\jfxswt.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\jsse.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\management-agent.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\plugin.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\resources.jar;D:\Program Files\Java\jdk1.8.0_221\jre\lib\rt.jar;C:\Users\Zhichen\IdeaProjects\basic-code\out\production\day_5_code" com.zhichen.day05.demo01Exception.Demo01
//        Exception in thread "main" java.text.ParseException: Unparseable date: "1999-0310"
//        at java.text.DateFormat.parse(DateFormat.java:366)
//        at com.zhichen.day05.demo01Exception.Demo01.main(Demo01.java:14)
//  这种情况里直接抛出异常，后续代码将不会执行

    }
//    public static void main(String[] args) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            sdf.parse("1999-0333");//第二种处理方式，把可能出现异常的语句关进try代码块中，不影响程序其他运行
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println("后续");
//        java.text.ParseException: Unparseable date: "1999-0333"
//        at java.text.DateFormat.parse(DateFormat.java:366)
//        at com.zhichen.day05.demo01Exception.Demo01.main(Demo01.java:26)
//        后续

//    }
}
