package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.applovin.impl.adview.i */
/* loaded from: classes.dex */
public abstract class AbstractC2774i extends View {

    /* renamed from: a */
    protected float f6624a;

    /* renamed from: b */
    protected final Context f6625b;

    /* renamed from: com.applovin.impl.adview.i$a */
    /* loaded from: classes.dex */
    public enum EnumC2775a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);
        

        /* renamed from: e */
        private final int f6631e;

        EnumC2775a(int i) {
            this.f6631e = i;
        }

        /* renamed from: a */
        public int m8947a() {
            return this.f6631e;
        }
    }

    public AbstractC2774i(Context context) {
        super(context);
        this.f6624a = 1.0f;
        this.f6625b = context;
    }

    /* renamed from: a */
    public static AbstractC2774i m8948a(EnumC2775a enumC2775a, Context context) {
        return enumC2775a.equals(EnumC2775a.INVISIBLE) ? new C2799p(context) : enumC2775a.equals(EnumC2775a.WHITE_ON_TRANSPARENT) ? new C2800q(context) : enumC2775a.equals(EnumC2775a.TRANSPARENT_SKIP) ? new C2801r(context) : new C2807w(context);
    }

    /* renamed from: a */
    public void mo8886a(int i) {
        setViewScale(i / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f6624a * 30.0f;
    }

    public abstract EnumC2775a getStyle();

    public void setViewScale(float f) {
        this.f6624a = f;
    }
}
