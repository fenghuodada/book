package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.common.primitives.C8035a;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class SsaStyle {

    /* renamed from: a */
    public final String f13189a;

    /* renamed from: b */
    public final int f13190b;
    @Nullable
    @ColorInt

    /* renamed from: c */
    public final Integer f13191c;

    /* renamed from: d */
    public final float f13192d;

    /* renamed from: e */
    public final boolean f13193e;

    /* renamed from: f */
    public final boolean f13194f;

    /* renamed from: g */
    public final boolean f13195g;

    /* renamed from: h */
    public final boolean f13196h;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SsaAlignment {
    }

    /* renamed from: com.google.android.exoplayer2.text.ssa.SsaStyle$a */
    /* loaded from: classes.dex */
    public static final class C7247a {

        /* renamed from: a */
        public final int f13197a;

        /* renamed from: b */
        public final int f13198b;

        /* renamed from: c */
        public final int f13199c;

        /* renamed from: d */
        public final int f13200d;

        /* renamed from: e */
        public final int f13201e;

        /* renamed from: f */
        public final int f13202f;

        /* renamed from: g */
        public final int f13203g;

        /* renamed from: h */
        public final int f13204h;

        /* renamed from: i */
        public final int f13205i;

        public C7247a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f13197a = i;
            this.f13198b = i2;
            this.f13199c = i3;
            this.f13200d = i4;
            this.f13201e = i5;
            this.f13202f = i6;
            this.f13203g = i7;
            this.f13204h = i8;
            this.f13205i = i9;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.ssa.SsaStyle$b */
    /* loaded from: classes.dex */
    public static final class C7248b {

        /* renamed from: a */
        public static final Pattern f13206a = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: b */
        public static final Pattern f13207b = Pattern.compile(C7408g0.m5096j("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: c */
        public static final Pattern f13208c = Pattern.compile(C7408g0.m5096j("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: d */
        public static final Pattern f13209d = Pattern.compile("\\\\an(\\d+)");

        @Nullable
        /* renamed from: a */
        public static PointF m5329a(String str) {
            String group;
            String group2;
            Matcher matcher = f13207b.matcher(str);
            Matcher matcher2 = f13208c.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb = new StringBuilder(str.length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    Log.i("SsaStyle.Overrides", sb.toString());
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (find2) {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            } else {
                return null;
            }
            group.getClass();
            float parseFloat = Float.parseFloat(group.trim());
            group2.getClass();
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }
    }

    public SsaStyle(String str, int i, @Nullable @ColorInt Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f13189a = str;
        this.f13190b = i;
        this.f13191c = num;
        this.f13192d = f;
        this.f13193e = z;
        this.f13194f = z2;
        this.f13195g = z3;
        this.f13196h = z4;
    }

    /* renamed from: a */
    public static int m5332a(String str) {
        String str2;
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Ignoring unknown alignment: ".concat(valueOf);
        } else {
            str2 = new String("Ignoring unknown alignment: ");
        }
        Log.w("SsaStyle", str2);
        return -1;
    }

    /* renamed from: b */
    public static boolean m5331b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(C0552c.m12193a(str, 33));
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            C7421n.m5055c("SsaStyle", sb.toString(), e);
            return false;
        }
    }

    @Nullable
    @ColorInt
    /* renamed from: c */
    public static Integer m5330c(String str) {
        long parseLong;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            C7394a.m5134a(z);
            int m4211a = C8035a.m4211a(((parseLong >> 24) & 255) ^ 255);
            int m4211a2 = C8035a.m4211a((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(m4211a, C8035a.m4211a(parseLong & 255), C8035a.m4211a((parseLong >> 8) & 255), m4211a2));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(C0552c.m12193a(str, 36));
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            C7421n.m5055c("SsaStyle", sb.toString(), e);
            return null;
        }
    }
}
