package com.emirhankarakoc.smstwilio.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SmsManager  implements SmsService{
    @Value("${TWILIO_ACCOUNT_SID}")
    String SID;

    @Value("${TWILIO_AUTH_TOKEN}")
    String AUTHTOKEN;

    @Value("${TWILIO_OUTGOING_SMS_NUMBER}")
    String OUTGOING;

    public SmsManager(){
    log.info("Creating sms manager");
    log.info("Account sid:" + SID);
 }

         @PostConstruct
         private void setup(){
             Twilio.init(SID,AUTHTOKEN);
         }

    @Override
    public String sendSms(String number, String message) {
        Message message1 = Message.creator(
                new PhoneNumber(number),
                new PhoneNumber(OUTGOING),
                message).create();
        return message1.getStatus().toString();
    }

    //ne kadar basit degil mi amina koyayim?
}
