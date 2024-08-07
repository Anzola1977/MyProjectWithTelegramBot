package myProjects.MyProjectWithTelegram.controllers;

import lombok.RequiredArgsConstructor;
import myProjects.MyProjectWithTelegram.dto.ValuteCursOnDate;
import myProjects.MyProjectWithTelegram.service.CentralRussianBankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CurrencyController {

    private final CentralRussianBankService centralRussianBankService;

    @GetMapping("/getCurrencies")
    public List<ValuteCursOnDate> getValuteCursOnDate() throws Exception {
        return centralRussianBankService.getCurrenciesFromCbr();
    }
}
