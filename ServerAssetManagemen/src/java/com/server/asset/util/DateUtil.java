/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class DateUtil {
    
    public List<Date> generateTglMaintenance(String beginDate, String endDate, int interval){
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        List<Date> dates = new ArrayList<Date>();
        Calendar c_begin = Calendar.getInstance();
        Calendar c_end = Calendar.getInstance();
        
        try {
            Date d_begin = df.parse(beginDate);
            Date d_end = df.parse(endDate);
            c_begin.setTime(d_begin);
            c_end.setTime(d_end);
            
//            long c_begin_inmili = c_begin.getTimeInMillis();
//            long c_end_inmili = c_end.getTimeInMillis();
            if(c_end.compareTo(c_begin) > 0){
//                long diferentMili = c_end_inmili - c_begin_inmili;
//                long selisihHari = diferentMili / (24 * 60 * 60 * 1000);
                c_end.add(Calendar.DATE, -interval);
                while(c_begin.compareTo(c_end) <= 0){
                    c_begin.add(Calendar.DATE, interval);
                    dates.add(c_begin.getTime());
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(DateUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dates;
    }
    
    public boolean canCreateSchedule(String beginDate, Date lastDate) throws ParseException{
        boolean can = false;
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        
        Calendar begin = Calendar.getInstance();
        Calendar last = Calendar.getInstance();
        
        begin.setTime(df.parse(beginDate));
        last.setTime(lastDate);
        
        if(begin.compareTo(last) >= 0) can = true;
        return can;
    }
    
}
