package Practice.phone;


import Practice.phone.entitys.Phone;
import Practice.phone.entitys.SimCard;
import Practice.phone.service.UserOutput;
import service.PhoneService;

public class PoneDemo {
    public static void main(String[] args) {
        service.PhoneService ps = new PhoneService();
        Practice.phone.entitys.Phone phone1 = new Phone(1258456987, "Gnusmas");
        Practice.phone.entitys.SimCard simCard1 = new SimCard(175891231);
        Practice.phone.entitys.SimCard simCard2 = new SimCard(1254488888);
        Practice.phone.service.UserOutput uO = new UserOutput();
        uO.phonePrintOut(phone1);

        ps.insertSimCard(phone1, simCard1);
        uO.phonePrintOut(phone1);
        ps.insertSimCard(phone1, simCard2);
        uO.phonePrintOut(phone1);
        ps.removeSimCard(phone1, 0);
        uO.phonePrintOut(phone1);

    }
}
