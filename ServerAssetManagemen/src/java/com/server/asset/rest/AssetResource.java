/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.rest;

import com.server.asset.entity.Asset;
import com.server.asset.entity.Condition;
import com.server.asset.entity.MaintenanceSchedule;
import com.server.asset.entity.StatusMaintenance;
import com.server.asset.service.AssetService;
import com.server.asset.service.CategoryService;
import com.server.asset.service.ConditionService;
import com.server.asset.service.MaintenanceScheduleService;
import com.server.asset.service.StatusMaintenanceService;
import com.server.asset.util.DateUtil;
import com.server.asset.view.json.JsonAsset;
import com.server.asset.view.json.JsonMaintenanceSchedule;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author USER
 */
@Controller
@RequestMapping("/asset")
public class AssetResource {
    
    @Autowired
    private AssetService assetService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ConditionService conditionService;
    
    @Autowired
    private MaintenanceScheduleService maintenanceScheduleService;
    
    @Autowired
    private StatusMaintenanceService statusMaintenanceService;
    
    @Autowired
    private DateUtil dateUtil;

    @RequestMapping(value="/getAllAssets", method=RequestMethod.GET)
    public @ResponseBody List<JsonAsset> test(){
//        List<Condition> con = conditionService.listCondition();
//        Set<Asset> asset = con.get(0).getAssets();
        List<Asset> listAsset = assetService.listAsset();
        List<JsonAsset> assets = new ArrayList<JsonAsset>();
        
        for(Asset a : listAsset){
//            Asset a = listAsset.get(0);
            JsonAsset jsonAsset = new JsonAsset();
            jsonAsset.setIdAsset(a.getIdAsset());
            jsonAsset.setLocation(a.getLocation().getLocation());
            jsonAsset.setCondition(a.getCondition().getConditionName());
            jsonAsset.setCategory(a.getCategory().getCategoryName());
            jsonAsset.setAsset(a.getAsset());
            jsonAsset.setDepartemen(a.getDepartemen());
            jsonAsset.setAcquiredDate((a.getAcquiredDate()!=null)?a.getAcquiredDate().toString():"");
            jsonAsset.setCurrentValue(a.getCurrentValue());
            jsonAsset.setPurchasePrice(a.getPurchasePrice());
            jsonAsset.setManufacturer(a.getManufacturer());
            jsonAsset.setDescription(a.getDescription());
            jsonAsset.setComment(a.getComment());
            jsonAsset.setModel(a.getModel());
            jsonAsset.setScheduleInterval(a.getScheduleInterval() + " Hari");
            jsonAsset.setEstimasiWaktu(a.getEstimasiWaktu() + " Jam");
            assets.add(jsonAsset);
        }
        return assets;
    }
    
    @RequestMapping(value="/getAssetNames", method=RequestMethod.GET)
    public @ResponseBody List<String> getAllAssetNames(){
        List<String> assetNames = new ArrayList<String>();
        List<Asset> assets = assetService.listAsset();
        for(Asset a : assets){
            assetNames.add(a.getAsset());
        }
        return assetNames;
    }
    
    @RequestMapping(value="/getAllSchedule", method=RequestMethod.GET)
    public @ResponseBody List<JsonMaintenanceSchedule> getAllMaintenanceSchedule(){
        List<MaintenanceSchedule> schedules = maintenanceScheduleService.listMaintenanceSchedule();
        List<JsonMaintenanceSchedule> maintenanceSchedules = new ArrayList<JsonMaintenanceSchedule>();
        for(MaintenanceSchedule ms : schedules){
            JsonMaintenanceSchedule jms = new JsonMaintenanceSchedule();
            jms.setIdMaintenance(ms.getIdMaintenance());
            jms.setAsset(ms.getAsset().getAsset());
            jms.setStatusMaintenance(ms.getStatusMaintenance().getStatus());
            jms.setCommentStatus(ms.getCommentStatus());
            jms.setEstimasiWaktu(ms.getEstimasiWaktu()+" Jam");
            jms.setPic(ms.getPic());
            jms.setTanggalAwal((ms.getTanggalAwal()!=null)?new SimpleDateFormat("dd-MM-yyyy").format(ms.getTanggalAwal()):"");
            jms.setTanggalSelesai((ms.getTanggalSelesai()!=null)?new SimpleDateFormat("dd-MM-yyyy").format(ms.getTanggalSelesai()):"");
            maintenanceSchedules.add(jms);
        }
        return maintenanceSchedules;
    }
    
    @RequestMapping(value="/generateSchedule", method=RequestMethod.GET)
    public @ResponseBody Response generateScheduleMaintenance(
            @RequestParam(value = "asset", required = true) String asset,
            @RequestParam(value = "beginDate", required = true) String beginDate,
            @RequestParam(value = "endDate", required = true) String endDate,
            @RequestParam(value = "comment", required = true) String comment,
            @RequestParam(value = "pic", required = true) String pic
    ) throws Exception{
        
        MaintenanceSchedule scheduleLast = maintenanceScheduleService.getScheduleLastDate(asset);
        if(scheduleLast!=null)
        if(!dateUtil.canCreateSchedule(beginDate, scheduleLast.getTanggalAwal())){
            throw new Exception("beginDate must be after Last Schedule");
        }
        
        Asset a = assetService.findAssetByName(asset);
        StatusMaintenance sm = statusMaintenanceService.findByStatus("in schedule");
        List<Date> dates = dateUtil.generateTglMaintenance(beginDate, endDate, a.getScheduleInterval());
        
        if(dates.isEmpty()) throw new Exception("There is no schedule generated");
        
        if(a!=null && sm!=null && dates!=null){
            
            for(Date tglAwal : dates){
                MaintenanceSchedule ms = new MaintenanceSchedule();
                ms.setAsset(a);
                ms.setCommentStatus(comment);
                ms.setEstimasiWaktu(0);
                ms.setPic(pic);
                ms.setStatusMaintenance(sm);
                ms.setTanggalAwal(tglAwal);
                ms.setTanggalSelesai(null);
                maintenanceScheduleService.addMaintenanceSchedule(ms);
                System.out.println("insert generate");
            }
            
            return new Response("1", "Generate Sukses");
        }
        return new Response("1", "Generate Sukses "+asset+" "+beginDate+" "+endDate);
    }
    
    @ExceptionHandler(Exception.class)
    public @ResponseBody Response handleExeption(Exception e, HttpServletRequest request){
        return new Response("0", e.getMessage());
    }

    public class Response{
        private String status;
        private String fullMessage;

        public Response() {
        }
        
        public Response(String status, String fullMessage) {
            this.status = status;
            this.fullMessage = fullMessage;
        }

        public String getFullMessage() {
            return fullMessage;
        }

        public void setFullMessage(String fullMessage) {
            this.fullMessage = fullMessage;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
        
    }

}
