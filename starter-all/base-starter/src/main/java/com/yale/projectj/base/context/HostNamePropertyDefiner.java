package com.yale.projectj.base.context;

import ch.qos.logback.core.PropertyDefinerBase;
import lombok.extern.slf4j.Slf4j;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Yale
 */
@Slf4j
public class HostNamePropertyDefiner extends PropertyDefinerBase {

    @Override
    public String getPropertyValue() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            log.error("getPropertyValue UnknownHostException :{}", e);
        }
        return null;
    }
}
