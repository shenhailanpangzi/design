package com.yanghao.design.behavioralModel.ChainofResponsibilityPattern;

import com.yanghao.design.behavioralModel.ChainofResponsibilityPattern.entity.ConsoleLogger;
import com.yanghao.design.behavioralModel.ChainofResponsibilityPattern.entity.ErrorLogger;
import com.yanghao.design.behavioralModel.ChainofResponsibilityPattern.entity.FileLogger;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 17:24
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}