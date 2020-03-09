package cs544.exercise15_1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class BillingServiceImpl implements BillingService {

    @Scheduled(cron="0/7 * * * * *")
    public void printBills() {
        Date date = Calendar.getInstance().getTime();
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT);
        String currenttime = timeFormatter.format(date);

        System.out.println(currenttime + "    printing bills");
    }
    @Scheduled(cron="0/10 * * * * *")
    public void generateBillingReport(){
        Date date = Calendar.getInstance().getTime();
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT);
        String currenttime = timeFormatter.format(date);

        System.out.println(currenttime + "    generate Billing Report");
    }

}
