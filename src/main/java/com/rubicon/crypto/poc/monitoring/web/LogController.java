package com.rubicon.crypto.poc.monitoring.web;

import com.rubicon.crypto.poc.monitoring.log.LogEvent;
import com.rubicon.crypto.poc.monitoring.log.LogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @Autowired
    private LogService logService;

    @PostMapping(path = "/log", consumes = "application/json")
    public void log(@RequestBody LogEvent logEvent) {
        logService.log(logEvent.getSystem(), logEvent.getMessage());
    }
}
