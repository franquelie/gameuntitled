package com.example.gameuntitled.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class Royal {
    private final SpriteSheet spriteSheet;
    private final Rect rect;

    public Royal(SpriteSheet spriteSheet, Rect rect) {
        this.spriteSheet = spriteSheet;
        this.rect = rect;
    }
  
    public void draw(Canvas canvas, int x, int y) {
        canvas.drawBitmap(
                spriteSheet.getBitmap(),
                rect,
                new Rect(x, y, x+getWidth(), y+getHeight()),
                null);
    }

    public int getWidth() {
        return rect.width();
    }

    public int getHeight() {
        return rect.height();
    }
}
