package ru.job4j.url_shortcut.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * URL Поле того, как пользователь зарегистрировал свой сайт,
 * он может отправлять на сайт ссылки и получать преобразованные ссылки.
 */
@Data
@EqualsAndHashCode
@Entity
@Table(name = "url")
public class Url {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "encode_url")
    private String encodeUrl;

    @Column(name = "address_url")
    private String addressUrl;

    @Version
    @Column(name = "total")
    private Integer total;

    public Url() {
    }
}