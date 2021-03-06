package com.ecfront.dew.core.test.dewutil;


import com.ecfront.dew.Dew;
import com.ecfront.dew.core.Container;
import com.ecfront.dew.core.Container;
import com.ecfront.dew.Dew;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class TestDewUtil {

    private Logger logger = LoggerFactory.getLogger(TestDewUtil.class);


    public void testAll() throws Exception {
        testTimer();
    }



    private void testTimer()throws InterruptedException{
        long startTime = System.currentTimeMillis();
        Dew.Timer.timer(1,()->logger.info("fun:    "+String.valueOf(System.currentTimeMillis() - startTime)));
        logger.info("end:   "+String.valueOf(System.currentTimeMillis() - startTime));
        Thread.sleep(1500);
        Container container = new Container();
    }
}
