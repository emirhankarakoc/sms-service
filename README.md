# SMS Sending API powered by Twilio
## What you need
- a upgraded account, not a trial one
- a number bought on twilio console
- account sid
- account token

## running
- java 17 you only need.
 
## how to use
- write your accounts details on application.properties file , outgoing number means bought number,sender number.
- if you open program , you will see there is only 1 endpoint, `BASEURL/sms/send` you must send body
  <br>
   `{
    "destinationSmsNumber":"number",
      "smsMessages":"yooo test message"
}` like this.
<br>
have fun, emirhankarakoc october 2024 dallas
