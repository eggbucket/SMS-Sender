package com.zuma.sms;

import lombok.Data;

/**
 * author:ZhengXing
 * datetime:2017/12/19 0019 14:25
 * 手机号和消息对 用于任务发送时的发送消息解析返回
 */
@Data
public class PhoneMessagePair {
	private String phones;
	private String Message;
}
