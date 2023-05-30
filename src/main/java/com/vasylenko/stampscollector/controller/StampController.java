package com.vasylenko.stampscollector.controller;

import com.vasylenko.stampscollector.domain.CommemorativeStamp;
import com.vasylenko.stampscollector.domain.Denomination;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Controller
public class StampController {

    @GetMapping("/stamps")
    public String stampPage(Model model) {
        CommemorativeStamp stamp1 = new CommemorativeStamp();
        stamp1.setEmission("2022");
        stamp1.setEditionId("1974");
        stamp1.setImagePath("/images/Stamp_of_Ukraine_s1974.jpg");
        stamp1.setInscription("Тризуб");
        stamp1.setPrintingDates(LocalDate.of(2022, Month.JANUARY, 21));
        stamp1.setDenomination(Denomination.CharacterList.V);
        stamp1.setCirculation(300000);
        CommemorativeStamp stamp2 = new CommemorativeStamp();
        stamp2.setEmission("2022");
        stamp2.setEditionId("1988");
        stamp2.setImagePath("/images/Stamp_of_Ukraine_s1988.jpg");
        stamp2.setInscription("Українська мрія");
        stamp2.setPrintingDates(LocalDate.of(2022, Month.JUNE, 28));
        stamp2.setDenomination(Denomination.CharacterList.U);
        stamp2.setCirculation(3000000);
        CommemorativeStamp stamp3 = new CommemorativeStamp();
        stamp3.setEmission("2022");
        stamp3.setEditionId("2020");
        stamp3.setImagePath("/images/Stamp_of_Ukraine_s2020.jpg");
        stamp3.setInscription("Херсон — це Україна!");
        stamp3.setPrintingDates(LocalDate.of(2022, Month.DECEMBER, 9));
        stamp3.setDenomination(Denomination.CharacterList.U);
        stamp3.setCirculation(900000);
        // model.addAttribute("stamp", stamp1);
        model.addAttribute("stamps", Arrays.asList(stamp1, stamp2, stamp3));
        return "stamp";
    }
}
