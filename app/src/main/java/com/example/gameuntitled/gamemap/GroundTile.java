package com.example.gameuntitled.gamemap;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.example.gameuntitled.graphics.Sprite;
import com.example.gameuntitled.graphics.SpriteSheet;

public class GroundTile extends Tile {
    private final Sprite sprite;

    public GroundTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getGroundSprite();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
