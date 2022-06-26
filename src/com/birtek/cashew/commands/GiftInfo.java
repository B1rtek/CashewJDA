package com.birtek.cashew.commands;

import java.awt.*;

public record GiftInfo(int id, String name, String imageURL, String reactionLine1, String reactionLine2, String displayName, Color color) {

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String reactionLine1() {
        return reactionLine1;
    }

    public String reactionLine2() {
        return reactionLine2;
    }
}
