package com.emirhankarakoc.smstwilio.controller;

import com.emirhankarakoc.smstwilio.service.SmsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sms")
@Slf4j
@AllArgsConstructor
public class SmsRestController {
    private final SmsService service;

    public record SmsSendRequest(String destinationSmsNumber,String message){}

    @PostMapping("/send")
    public String processSms(@RequestBody SmsSendRequest r){
         log.info(r.toString());
         return service.sendSms(r.destinationSmsNumber(),r.message());
    }
}
