package com.rubicon.crypto.poc.monitoring.log;

public class LogEvent {
    private String system;
    private String message;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
