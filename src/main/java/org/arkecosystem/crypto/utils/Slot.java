package org.arkecosystem.crypto.utils;

import org.arkecosystem.crypto.configuration.Network;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Slot {
    public static int time() {
        return (int)((new Date().getTime() - epoch()) / 1000);
    }

    public static long epoch() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        try {
            return dateFormat.parse(Network.get().epoch()).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
