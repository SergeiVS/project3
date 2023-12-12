package Practice.phone;

import Practice.phone.entitys.Phone;
import Practice.phone.entitys.SimCard;
import Practice.phone.service.PhoneService;
import Practice.phone.service.UserOutput;

public class PoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone(1258456987, "Gnusmas");
        SimCard simCard1 = new SimCard(175891231);
        SimCard simCard2 = new SimCard(1254488888);
        PhoneService pS = new PhoneService();
        UserOutput uO = new UserOutput();
        uO.phonePrintOut(phone1);

        pS.insertSimCard(phone1, simCard1);
        uO.phonePrintOut(phone1);


    }
}
