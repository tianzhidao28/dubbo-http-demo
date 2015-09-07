package cn.jpush.services.sms.util;

import java.security.SecureRandom;
import java.util.UUID;

/**
 * Created by rocyuan on 2015/9/3.
 */
public class Identities {
    private static SecureRandom random = new SecureRandom();


    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    public static String uuid2() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static long randomLong() {
        return Math.abs(random.nextLong());
    }

    public static String idByTimer() {
        return String.valueOf(System.currentTimeMillis());
    }

}
