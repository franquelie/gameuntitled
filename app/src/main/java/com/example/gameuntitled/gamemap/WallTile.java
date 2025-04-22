package com.example.gameuntitled.gamemap;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.example.gameuntitled.graphics.Sprite;
import com.example.gameuntitled.graphics.SpriteSheet;

public class WallTile extends Tile{
    private final Sprite sprite;

    public WallTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getWallSprite();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
