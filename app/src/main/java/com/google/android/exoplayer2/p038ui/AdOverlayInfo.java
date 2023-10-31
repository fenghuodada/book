package com.google.android.exoplayer2.p038ui;

import android.view.View;
import android.widget.FrameLayout;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.exoplayer2.ui.AdOverlayInfo */
/* loaded from: classes.dex */
public final class AdOverlayInfo {

    /* renamed from: a */
    public final View f13495a;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.AdOverlayInfo$Purpose */
    /* loaded from: classes.dex */
    public @interface Purpose {
    }

    public AdOverlayInfo(FrameLayout frameLayout) {
        this.f13495a = frameLayout;
    }
}
