package com.example.Trabajo3IMC;

import java.text.DecimalFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping()
    public String getImc(   @RequestParam(name="peso1", required=false, defaultValue="0")   double peso1,
                            @RequestParam(name="altura1", required=false, defaultValue="0") double altura1,
                            Model model){
        DecimalFormat df=new DecimalFormat("##.##");
        double imc=peso1/(altura1*altura1);
        model.addAttribute("IMC", df.format(calcularMasaCorp(peso1, altura1)));
        model.addAttribute("Estado", obtenerEstado(imc));
        return "index";
            
            }
    
    
        public static Double calcularMasaCorp(double peso, double altura){
        
            double masaCorp = peso/(altura*altura);
                                
                        return masaCorp;
            }
                        
        public static String obtenerEstado(double indcMasaCorp){
                         if(indcMasaCorp>=1 && indcMasaCorp<=18.49)      return "Tu peso es bajo";
                         if(indcMasaCorp>=18.50 && indcMasaCorp<24.99)   return "Tu peso es normal";
                         if(indcMasaCorp>=25 && indcMasaCorp<=29.99)     return "Usted tiene sobrepeso";
                         if(indcMasaCorp>=30 && indcMasaCorp>35)         return "Usted tiene obesidad";
                        return "";
            }
    
}
