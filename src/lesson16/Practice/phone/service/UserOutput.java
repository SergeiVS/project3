package Practice.phone.service;

import Practice.phone.entitys.Phone;

import java.util.Arrays;

public class UserOutput {
    public void phonePrintOut(Phone phone) {
        System.out.println("Phone imei:");
        System.out.println(phone.getImei());
        System.out.println("Phone model:");
        System.out.println(phone.getPhoneName());
        if (phone.getSimCards() == null) {
            System.out.println("sim is not installed");
        }
        if (phone.getSimCards()[0] != null){System.out.println("Phone number sim1 : " + phone.getSimCards()[0].getPhoneNumber());
        System.out.println("sim1 sms: " + Arrays.toString( phone.getSimCards()[0].getSms()));}
        if (phone.getSimCards()[1] != null){System.out.println("Phone number sim2: " + phone.getSimCards()[1].getPhoneNumber());
        System.out.println("sim2 sms: " + Arrays.toString(phone.getSimCards()[1].getSms()));}
    }
   // public void printSms(Phone phone) {
     //   if (phone.getSimCards()[0] == null) {
       //     System.out.println("sim is not installed");
        //} else if (phone.getSimCards()[0].getSms() == null) {
          //  System.out.println("no sms to print");
        //} else {
          //  for (int i = 0; i < phone.getSimCards().getSms().length; i++) {
            //    if (phone.getSimCards().getSms()[i] != null) {
              //      System.out.println(phone.getSimCards().getSms()[i]);
                //} else System.out.println(" - ");
         //   }
       // }
  // }
}