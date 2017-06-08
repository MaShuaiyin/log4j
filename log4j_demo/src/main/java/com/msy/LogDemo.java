package com.msy;


import org.apache.log4j.Logger;

/**
 * Created by MaShuaiyin on 2017/6/8.
 */
public class LogDemo {

    public static void main(String[] args) {

        //日志记录器
        Logger logger = Logger.getLogger(LogDemo.class);

        // 可以打印5种日志信息，危险级别越来越高
        logger.debug("My debug message...");
        logger.info("My info message...");
        logger.warn("My warn message...");
        logger.error("My error message...");
        logger.fatal("My fetal message...");
    }
}
