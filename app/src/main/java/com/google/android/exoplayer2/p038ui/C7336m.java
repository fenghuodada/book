package com.google.android.exoplayer2.p038ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.ui.m */
/* loaded from: classes.dex */
public final class C7336m {

    /* renamed from: A */
    public int f13668A;

    /* renamed from: B */
    public int f13669B;

    /* renamed from: C */
    public int f13670C;

    /* renamed from: D */
    public int f13671D;

    /* renamed from: E */
    public StaticLayout f13672E;

    /* renamed from: F */
    public StaticLayout f13673F;

    /* renamed from: G */
    public int f13674G;

    /* renamed from: H */
    public int f13675H;

    /* renamed from: I */
    public int f13676I;

    /* renamed from: J */
    public Rect f13677J;

    /* renamed from: a */
    public final float f13678a;

    /* renamed from: b */
    public final float f13679b;

    /* renamed from: c */
    public final float f13680c;

    /* renamed from: d */
    public final float f13681d;

    /* renamed from: e */
    public final float f13682e;

    /* renamed from: f */
    public final TextPaint f13683f;

    /* renamed from: g */
    public final Paint f13684g;

    /* renamed from: h */
    public final Paint f13685h;
    @Nullable

    /* renamed from: i */
    public CharSequence f13686i;
    @Nullable

    /* renamed from: j */
    public Layout.Alignment f13687j;
    @Nullable

    /* renamed from: k */
    public Bitmap f13688k;

    /* renamed from: l */
    public float f13689l;

    /* renamed from: m */
    public int f13690m;

    /* renamed from: n */
    public int f13691n;

    /* renamed from: o */
    public float f13692o;

    /* renamed from: p */
    public int f13693p;

    /* renamed from: q */
    public float f13694q;

    /* renamed from: r */
    public float f13695r;

    /* renamed from: s */
    public int f13696s;

    /* renamed from: t */
    public int f13697t;

    /* renamed from: u */
    public int f13698u;

    /* renamed from: v */
    public int f13699v;

    /* renamed from: w */
    public int f13700w;

    /* renamed from: x */
    public float f13701x;

    /* renamed from: y */
    public float f13702y;

    /* renamed from: z */
    public float f13703z;

    public C7336m(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f13682e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f13681d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f13678a = round;
        this.f13679b = round;
        this.f13680c = round;
        TextPaint textPaint = new TextPaint();
        this.f13683f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f13684g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f13685h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    public final void m5189a(Canvas canvas, boolean z) {
        int i;
        if (z) {
            StaticLayout staticLayout = this.f13672E;
            StaticLayout staticLayout2 = this.f13673F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate(this.f13674G, this.f13675H);
                if (Color.alpha(this.f13698u) > 0) {
                    Paint paint = this.f13684g;
                    paint.setColor(this.f13698u);
                    canvas.drawRect(-this.f13676I, 0.0f, staticLayout.getWidth() + this.f13676I, staticLayout.getHeight(), paint);
                }
                int i2 = this.f13700w;
                TextPaint textPaint = this.f13683f;
                boolean z2 = true;
                if (i2 == 1) {
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.f13678a);
                    textPaint.setColor(this.f13699v);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else {
                    float f = this.f13679b;
                    if (i2 == 2) {
                        float f2 = this.f13680c;
                        textPaint.setShadowLayer(f, f2, f2, this.f13699v);
                    } else if (i2 == 3 || i2 == 4) {
                        if (i2 != 3) {
                            z2 = false;
                        }
                        int i3 = -1;
                        if (z2) {
                            i = -1;
                        } else {
                            i = this.f13699v;
                        }
                        if (z2) {
                            i3 = this.f13699v;
                        }
                        float f3 = f / 2.0f;
                        textPaint.setColor(this.f13696s);
                        textPaint.setStyle(Paint.Style.FILL);
                        float f4 = -f3;
                        textPaint.setShadowLayer(f, f4, f4, i);
                        staticLayout2.draw(canvas);
                        textPaint.setShadowLayer(f, f3, f3, i3);
                    }
                }
                textPaint.setColor(this.f13696s);
                textPaint.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.f13677J.getClass();
        this.f13688k.getClass();
        canvas.drawBitmap(this.f13688k, (Rect) null, this.f13677J, this.f13685h);
    }
}
