/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise.b.Exercise.Java.B;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.Tiara.serviceProses;

/**
 *
 * @author ASUS
 */
@Controller
@ResponseBody
public class ProjectController {
    serviceProses sv = new serviceProses();
    
    @RequestMapping("/tampilkandolarToRp")
    public String tampilkanDolar(){
        int Konversidolartorp = sv.getDolarToRp(20000);
        
        String view = "Hasil Konversi = " + Konversidolartorp;
        return view;
    }
    
    @RequestMapping("/tampilkanSGDToRp")
    public String tampilkanSGDToRp(){
        int KonversiSGDToRp = sv.getSGDToRp(20000);
        
        String view = "Hasil Konversi = " + KonversiSGDToRp;
        return view;
    }
    
    @RequestMapping("/tampilkanRinggitToRp")
    public String tampilkanRgToRp(){
        int KonversiRgToRp = sv.getRinggitToRp(20000);
        
        String view = "Hasil Konversi = " + KonversiRgToRp;
        return view;
    }
    
    @RequestMapping("/tampilkanEURToRp")
    public String tampilkanEURtoRp(){
        int KonversiEURToRp = sv.getEURToRp(20000);
        
        String view = "Hasil Konversi = " + KonversiEURToRp;
        return view;
    }
}
