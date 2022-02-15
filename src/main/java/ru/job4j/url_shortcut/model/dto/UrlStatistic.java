package ru.job4j.url_shortcut.model.dto;

import lombok.Data;

/**
 * Объект DTO бля предоставления статиски по колличество запросов по определенной строке
 */
@Data
public class UrlStatistic {

    private String url;

    private Integer total;

    public UrlStatistic() {
    }

    public UrlStatistic(String addressUrl, Integer total) {
        this.url = addressUrl;
        this.total = total;
    }
}
