package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Card {
    private String avatar;
    private String name;
    private String cardname;
    private String info;
    private String picture;

    public Card() {
    }

    public Card(String avatar, String name, String cardname, String info, String picture) {
        this.avatar = avatar;
        this.name = name;
        this.cardname = cardname;
        this.info = info;
        this.picture = picture;
    }
}
