package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import com.applovin.impl.adview.AbstractC2774i;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.applovin.impl.adview.p */
/* loaded from: classes.dex */
public final class C2799p extends AbstractC2774i {
    public C2799p(Context context) {
        super(context);
    }

    @Override // com.applovin.impl.adview.AbstractC2774i
    /* renamed from: a */
    public void mo8886a(int i) {
        setViewScale(i / 30.0f);
    }

    @Override // com.applovin.impl.adview.AbstractC2774i
    public AbstractC2774i.EnumC2775a getStyle() {
        return AbstractC2774i.EnumC2775a.INVISIBLE;
    }
}
