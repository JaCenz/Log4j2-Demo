package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    //日志
    private static final Logger logger = LogManager.getLogger(DemoController.class);

    //
    @GetMapping("/demo/1")
    public String demo(){
        logger.trace("--trace");
        logger.debug("--debug");
        logger.info("--info");
        logger.warn("--warn");
        logger.error("--error");
        logger.fatal("--fatal");

        return "demo/demo1";
    }
}
