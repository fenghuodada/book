package com.google.android.exoplayer2.text.span;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class TextEmphasisSpan implements InterfaceC7245b {

    /* renamed from: a */
    public final int f13184a;

    /* renamed from: b */
    public final int f13185b;

    /* renamed from: c */
    public final int f13186c;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MarkFill {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MarkShape {
    }

    public TextEmphasisSpan(int i, int i2, int i3) {
        this.f13184a = i;
        this.f13185b = i2;
        this.f13186c = i3;
    }
}
