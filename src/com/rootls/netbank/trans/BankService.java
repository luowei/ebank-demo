package com.rootls.netbank.trans;

import java.io.UnsupportedEncodingException;

/**
 * Created by luowei on 2014/9/24.
 */
public interface BankService {
    byte[] handleBankPushXml(String xml) throws UnsupportedEncodingException;

    byte[] handleMyPush(byte[] sendData) throws UnsupportedEncodingException;

    byte[] handleBankPush(String xml,String signdata)throws UnsupportedEncodingException;

    byte[] getBankKeyData(String type, String mch_no);
}
