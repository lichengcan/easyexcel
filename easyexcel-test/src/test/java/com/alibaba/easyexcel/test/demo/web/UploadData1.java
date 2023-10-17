package com.alibaba.easyexcel.test.demo.web;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 基础数据类
 *
 * @author Jiaju Zhuang
 **/
@Getter
@Setter
@EqualsAndHashCode
public class UploadData1 {
    private String id;
    private String string;
    private Date date;
    private Double doubleData;
    private Integer age;
}
