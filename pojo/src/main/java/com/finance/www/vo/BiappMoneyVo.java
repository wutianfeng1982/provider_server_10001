package com.finance.www.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/7/26.
 */
@Data
public class BiappMoneyVo implements Serializable{
    private String periods;
    private String schedule;
    private String money;
}
