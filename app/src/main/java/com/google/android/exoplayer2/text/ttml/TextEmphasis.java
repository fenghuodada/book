package com.google.android.exoplayer2.text.ttml;

import com.google.common.collect.AbstractC8031x;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import libv2ray.V2rayConfig;

/* loaded from: classes.dex */
public final class TextEmphasis {

    /* renamed from: d */
    public static final Pattern f13229d = Pattern.compile("\\s+");

    /* renamed from: e */
    public static final AbstractC8031x<String> f13230e = AbstractC8031x.m4215p(2, V2rayConfig.DEFAULT_SECURITY, SchedulerSupport.NONE);

    /* renamed from: f */
    public static final AbstractC8031x<String> f13231f = AbstractC8031x.m4215p(3, "dot", "sesame", "circle");

    /* renamed from: g */
    public static final AbstractC8031x<String> f13232g = AbstractC8031x.m4215p(2, "filled", "open");

    /* renamed from: h */
    public static final AbstractC8031x<String> f13233h = AbstractC8031x.m4215p(3, "after", "before", "outside");

    /* renamed from: a */
    public final int f13234a;

    /* renamed from: b */
    public final int f13235b;

    /* renamed from: c */
    public final int f13236c;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Position {
    }

    public TextEmphasis(int i, int i2, int i3) {
        this.f13234a = i;
        this.f13235b = i2;
        this.f13236c = i3;
    }
}
