package com.yale.projectj.models.entities;

import lombok.Data;

/**
 * @author Yale
 */
@Data
public class PrintReq {
    private String content;
    private String printer;
    private String type;
    private String user;
}
