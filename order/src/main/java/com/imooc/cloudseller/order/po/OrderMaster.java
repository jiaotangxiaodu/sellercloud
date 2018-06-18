package com.imooc.cloudseller.order.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data

@Entity
public class OrderMaster {

//      order_id 	    varchar(32) 	No
////    buyer_name 	    varchar(32) 	No
////    buyer_phone 	varchar(32) 	No
////    buyer_address 	varchar(128) 	No
////    buyer_openid 	varchar(64) 	No
////    order_amount 	decimal(8,2) 	No
////    order_status 	tinyint(3) 	    No 	0
////    pay_status 	    tinyint(3) 	    No 	0
////    create_time 	timestamp 	    No 	CURRENT_TIMESTAMP
////    update_time 	timestamp 	    No 	CURRENT_TIMESTAMP

    @Id
    private String order_id;
    private String buyer_name;
    private String buyer_phone;
    private String buyer_address;
    private String buyer_openid;
    private long order_amount;
    private int order_status;
    private int pay_status;
    private Date create_time;
    private Date update_time;

    public OrderMaster(String order_id, String buyer_name, String buyer_phone, String buyer_address, String buyer_openid, long order_amount, int order_status, int pay_status, Date create_time, Date update_time) {
        this.order_id = order_id;
        this.buyer_name = buyer_name;
        this.buyer_phone = buyer_phone;
        this.buyer_address = buyer_address;
        this.buyer_openid = buyer_openid;
        this.order_amount = order_amount;
        this.order_status = order_status;
        this.pay_status = pay_status;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public OrderMaster() {

    }
}
