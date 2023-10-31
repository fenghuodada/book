package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class TtmlStyle {
    @Nullable

    /* renamed from: a */
    public String f13237a;

    /* renamed from: b */
    public int f13238b;

    /* renamed from: c */
    public boolean f13239c;

    /* renamed from: d */
    public int f13240d;

    /* renamed from: e */
    public boolean f13241e;

    /* renamed from: k */
    public float f13247k;
    @Nullable

    /* renamed from: l */
    public String f13248l;
    @Nullable

    /* renamed from: o */
    public Layout.Alignment f13251o;
    @Nullable

    /* renamed from: p */
    public Layout.Alignment f13252p;
    @Nullable

    /* renamed from: r */
    public TextEmphasis f13254r;

    /* renamed from: f */
    public int f13242f = -1;

    /* renamed from: g */
    public int f13243g = -1;

    /* renamed from: h */
    public int f13244h = -1;

    /* renamed from: i */
    public int f13245i = -1;

    /* renamed from: j */
    public int f13246j = -1;

    /* renamed from: m */
    public int f13249m = -1;

    /* renamed from: n */
    public int f13250n = -1;

    /* renamed from: q */
    public int f13253q = -1;

    /* renamed from: s */
    public float f13255s = Float.MAX_VALUE;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface FontSizeUnit {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface RubyType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface StyleFlags {
    }

    /* renamed from: a */
    public final void m5323a(@Nullable TtmlStyle ttmlStyle) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ttmlStyle != null) {
            if (!this.f13239c && ttmlStyle.f13239c) {
                this.f13238b = ttmlStyle.f13238b;
                this.f13239c = true;
            }
            if (this.f13244h == -1) {
                this.f13244h = ttmlStyle.f13244h;
            }
            if (this.f13245i == -1) {
                this.f13245i = ttmlStyle.f13245i;
            }
            if (this.f13237a == null && (str = ttmlStyle.f13237a) != null) {
                this.f13237a = str;
            }
            if (this.f13242f == -1) {
                this.f13242f = ttmlStyle.f13242f;
            }
            if (this.f13243g == -1) {
                this.f13243g = ttmlStyle.f13243g;
            }
            if (this.f13250n == -1) {
                this.f13250n = ttmlStyle.f13250n;
            }
            if (this.f13251o == null && (alignment2 = ttmlStyle.f13251o) != null) {
                this.f13251o = alignment2;
            }
            if (this.f13252p == null && (alignment = ttmlStyle.f13252p) != null) {
                this.f13252p = alignment;
            }
            if (this.f13253q == -1) {
                this.f13253q = ttmlStyle.f13253q;
            }
            if (this.f13246j == -1) {
                this.f13246j = ttmlStyle.f13246j;
                this.f13247k = ttmlStyle.f13247k;
            }
            if (this.f13254r == null) {
                this.f13254r = ttmlStyle.f13254r;
            }
            if (this.f13255s == Float.MAX_VALUE) {
                this.f13255s = ttmlStyle.f13255s;
            }
            if (!this.f13241e && ttmlStyle.f13241e) {
                this.f13240d = ttmlStyle.f13240d;
                this.f13241e = true;
            }
            if (this.f13249m == -1 && (i = ttmlStyle.f13249m) != -1) {
                this.f13249m = i;
            }
        }
    }
}
