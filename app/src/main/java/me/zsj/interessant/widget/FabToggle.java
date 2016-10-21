package me.zsj.interessant.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

import me.zsj.interessant.utils.PixelConverter;

/**
 * Created by zsj on 2016/10/15.
 */

public class FabToggle extends ImageButton {

    private int minOffset;

    public FabToggle(Context context) {
        this(context, null);
    }

    public FabToggle(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FabToggle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        minOffset = PixelConverter.dptopx(context, 360) -
                PixelConverter.dptopx(context, 140);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        minOffset -= h / 2;
    }

    public void setOffset(int offset) {
        offset = Math.max(minOffset, offset);
        setTranslationY(offset);
    }
}
