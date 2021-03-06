package ru.job4j.urlshortcut.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.job4j.urlshortcut.model.dto.UrlStatistic;
import ru.job4j.urlshortcut.service.UrlService;

import java.util.List;

/**
 * После авторизации,
 * пользователь может получить данные всех адресов и количество обращения к ним
 */
@RestController
@RequestMapping("/statistic")
public class StatisticController {

    private UrlService urlService;

    public StatisticController(UrlService urlService) {
        this.urlService = urlService;
    }

    /**
     * можно получить статистку всех адресов и количество вызовов этого адреса.
     * @return
     */
    @GetMapping("/")
    public List<UrlStatistic> findAllStatistic() {
        return urlService.findAllStatistic();
    }
}
