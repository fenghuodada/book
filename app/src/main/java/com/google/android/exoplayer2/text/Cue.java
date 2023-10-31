package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7394a;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Cue {

    /* renamed from: r */
    public static final Cue f12968r;
    @Nullable

    /* renamed from: a */
    public final CharSequence f12969a;
    @Nullable

    /* renamed from: b */
    public final Layout.Alignment f12970b;
    @Nullable

    /* renamed from: c */
    public final Layout.Alignment f12971c;
    @Nullable

    /* renamed from: d */
    public final Bitmap f12972d;

    /* renamed from: e */
    public final float f12973e;

    /* renamed from: f */
    public final int f12974f;

    /* renamed from: g */
    public final int f12975g;

    /* renamed from: h */
    public final float f12976h;

    /* renamed from: i */
    public final int f12977i;

    /* renamed from: j */
    public final float f12978j;

    /* renamed from: k */
    public final float f12979k;

    /* renamed from: l */
    public final boolean f12980l;

    /* renamed from: m */
    public final int f12981m;

    /* renamed from: n */
    public final int f12982n;

    /* renamed from: o */
    public final float f12983o;

    /* renamed from: p */
    public final int f12984p;

    /* renamed from: q */
    public final float f12985q;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AnchorType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface LineType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TextSizeType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface VerticalType {
    }

    /* renamed from: com.google.android.exoplayer2.text.Cue$a */
    /* loaded from: classes.dex */
    public static final class C7206a {
        @Nullable

        /* renamed from: a */
        public CharSequence f12986a;
        @Nullable

        /* renamed from: b */
        public Bitmap f12987b;
        @Nullable

        /* renamed from: c */
        public Layout.Alignment f12988c;
        @Nullable

        /* renamed from: d */
        public Layout.Alignment f12989d;

        /* renamed from: e */
        public float f12990e;

        /* renamed from: f */
        public int f12991f;

        /* renamed from: g */
        public int f12992g;

        /* renamed from: h */
        public float f12993h;

        /* renamed from: i */
        public int f12994i;

        /* renamed from: j */
        public int f12995j;

        /* renamed from: k */
        public float f12996k;

        /* renamed from: l */
        public float f12997l;

        /* renamed from: m */
        public float f12998m;

        /* renamed from: n */
        public boolean f12999n;
        @ColorInt

        /* renamed from: o */
        public int f13000o;

        /* renamed from: p */
        public int f13001p;

        /* renamed from: q */
        public float f13002q;

        public C7206a() {
            this.f12986a = null;
            this.f12987b = null;
            this.f12988c = null;
            this.f12989d = null;
            this.f12990e = -3.4028235E38f;
            this.f12991f = Integer.MIN_VALUE;
            this.f12992g = Integer.MIN_VALUE;
            this.f12993h = -3.4028235E38f;
            this.f12994i = Integer.MIN_VALUE;
            this.f12995j = Integer.MIN_VALUE;
            this.f12996k = -3.4028235E38f;
            this.f12997l = -3.4028235E38f;
            this.f12998m = -3.4028235E38f;
            this.f12999n = false;
            this.f13000o = -16777216;
            this.f13001p = Integer.MIN_VALUE;
        }

        public C7206a(Cue cue) {
            this.f12986a = cue.f12969a;
            this.f12987b = cue.f12972d;
            this.f12988c = cue.f12970b;
            this.f12989d = cue.f12971c;
            this.f12990e = cue.f12973e;
            this.f12991f = cue.f12974f;
            this.f12992g = cue.f12975g;
            this.f12993h = cue.f12976h;
            this.f12994i = cue.f12977i;
            this.f12995j = cue.f12982n;
            this.f12996k = cue.f12983o;
            this.f12997l = cue.f12978j;
            this.f12998m = cue.f12979k;
            this.f12999n = cue.f12980l;
            this.f13000o = cue.f12981m;
            this.f13001p = cue.f12984p;
            this.f13002q = cue.f12985q;
        }

        /* renamed from: a */
        public final Cue m5372a() {
            return new Cue(this.f12986a, this.f12988c, this.f12989d, this.f12987b, this.f12990e, this.f12991f, this.f12992g, this.f12993h, this.f12994i, this.f12995j, this.f12996k, this.f12997l, this.f12998m, this.f12999n, this.f13000o, this.f13001p, this.f13002q);
        }
    }

    static {
        C7206a c7206a = new C7206a();
        c7206a.f12986a = "";
        f12968r = c7206a.m5372a();
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            C7394a.m5134a(bitmap == null);
        }
        this.f12969a = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f12970b = alignment;
        this.f12971c = alignment2;
        this.f12972d = bitmap;
        this.f12973e = f;
        this.f12974f = i;
        this.f12975g = i2;
        this.f12976h = f2;
        this.f12977i = i3;
        this.f12978j = f4;
        this.f12979k = f5;
        this.f12980l = z;
        this.f12981m = i5;
        this.f12982n = i4;
        this.f12983o = f3;
        this.f12984p = i6;
        this.f12985q = f6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cue.class != obj.getClass()) {
            return false;
        }
        Cue cue = (Cue) obj;
        if (TextUtils.equals(this.f12969a, cue.f12969a) && this.f12970b == cue.f12970b && this.f12971c == cue.f12971c) {
            Bitmap bitmap = cue.f12972d;
            Bitmap bitmap2 = this.f12972d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f12973e == cue.f12973e && this.f12974f == cue.f12974f && this.f12975g == cue.f12975g && this.f12976h == cue.f12976h && this.f12977i == cue.f12977i && this.f12978j == cue.f12978j && this.f12979k == cue.f12979k && this.f12980l == cue.f12980l && this.f12981m == cue.f12981m && this.f12982n == cue.f12982n && this.f12983o == cue.f12983o && this.f12984p == cue.f12984p && this.f12985q == cue.f12985q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12969a, this.f12970b, this.f12971c, this.f12972d, Float.valueOf(this.f12973e), Integer.valueOf(this.f12974f), Integer.valueOf(this.f12975g), Float.valueOf(this.f12976h), Integer.valueOf(this.f12977i), Float.valueOf(this.f12978j), Float.valueOf(this.f12979k), Boolean.valueOf(this.f12980l), Integer.valueOf(this.f12981m), Integer.valueOf(this.f12982n), Float.valueOf(this.f12983o), Integer.valueOf(this.f12984p), Float.valueOf(this.f12985q)});
    }
}
