package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.trackselection.C7279a;
import com.google.android.exoplayer2.trackselection.C7304l;
import com.google.android.exoplayer2.trackselection.InterfaceC7296g;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.common.collect.AbstractC7994m0;
import com.google.common.collect.AbstractC7995n;
import com.google.common.collect.AbstractC8013s;
import com.google.common.collect.C7985k0;
import com.google.common.collect.C7993m;
import com.google.common.collect.C8010q0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Http2;

/* renamed from: com.google.android.exoplayer2.trackselection.f */
/* loaded from: classes.dex */
public final class C7286f extends AbstractC7300i {

    /* renamed from: d */
    public static final int[] f13371d = new int[0];

    /* renamed from: e */
    public static final AbstractC7994m0<Integer> f13372e;

    /* renamed from: f */
    public static final AbstractC7994m0<Integer> f13373f;

    /* renamed from: b */
    public final InterfaceC7296g.InterfaceC7298b f13374b;

    /* renamed from: c */
    public final AtomicReference<C7289c> f13375c;

    /* renamed from: com.google.android.exoplayer2.trackselection.f$a */
    /* loaded from: classes.dex */
    public static final class C7287a implements Comparable<C7287a> {

        /* renamed from: a */
        public final boolean f13376a;
        @Nullable

        /* renamed from: b */
        public final String f13377b;

        /* renamed from: c */
        public final C7289c f13378c;

        /* renamed from: d */
        public final boolean f13379d;

        /* renamed from: e */
        public final int f13380e;

        /* renamed from: f */
        public final int f13381f;

        /* renamed from: g */
        public final int f13382g;

        /* renamed from: h */
        public final int f13383h;

        /* renamed from: i */
        public final int f13384i;

        /* renamed from: j */
        public final boolean f13385j;

        /* renamed from: k */
        public final int f13386k;

        /* renamed from: l */
        public final int f13387l;

        /* renamed from: m */
        public final int f13388m;

        /* renamed from: n */
        public final int f13389n;

        public C7287a(C7003m0 c7003m0, C7289c c7289c, int i) {
            int i2;
            int i3;
            boolean z;
            boolean z2;
            String locale;
            String[] strArr;
            int i4;
            LocaleList locales;
            String languageTags;
            this.f13378c = c7289c;
            this.f13377b = C7286f.m5274g(c7003m0.f12278c);
            int i5 = 0;
            this.f13379d = C7286f.m5276e(i, false);
            int i6 = 0;
            while (true) {
                AbstractC8013s<String> abstractC8013s = c7289c.f13452m;
                i2 = Integer.MAX_VALUE;
                if (i6 < abstractC8013s.size()) {
                    i3 = C7286f.m5278c(c7003m0, abstractC8013s.get(i6), false);
                    if (i3 > 0) {
                        break;
                    }
                    i6++;
                } else {
                    i3 = 0;
                    i6 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f13381f = i6;
            this.f13380e = i3;
            this.f13382g = Integer.bitCount(c7003m0.f12280e & c7289c.f13453n);
            if ((c7003m0.f12279d & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f13385j = z;
            int i7 = c7003m0.f12300y;
            this.f13386k = i7;
            this.f13387l = c7003m0.f12301z;
            int i8 = c7003m0.f12283h;
            this.f13388m = i8;
            if ((i8 != -1 && i8 > c7289c.f13455p) || (i7 != -1 && i7 > c7289c.f13454o)) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f13376a = z2;
            int i9 = C7408g0.f13905a;
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i10 = C7408g0.f13905a;
            if (i10 >= 24) {
                locales = configuration.getLocales();
                languageTags = locales.toLanguageTags();
                strArr = languageTags.split(",", -1);
            } else {
                String[] strArr2 = new String[1];
                Locale locale2 = configuration.locale;
                if (i10 >= 21) {
                    locale = locale2.toLanguageTag();
                } else {
                    locale = locale2.toString();
                }
                strArr2[0] = locale;
                strArr = strArr2;
            }
            for (int i11 = 0; i11 < strArr.length; i11++) {
                strArr[i11] = C7408g0.m5084v(strArr[i11]);
            }
            int i12 = 0;
            while (true) {
                if (i12 < strArr.length) {
                    i4 = C7286f.m5278c(c7003m0, strArr[i12], false);
                    if (i4 > 0) {
                        break;
                    }
                    i12++;
                } else {
                    i4 = 0;
                    i12 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f13383h = i12;
            this.f13384i = i4;
            while (true) {
                AbstractC8013s<String> abstractC8013s2 = c7289c.f13456q;
                if (i5 >= abstractC8013s2.size()) {
                    break;
                }
                String str = c7003m0.f12287l;
                if (str != null && str.equals(abstractC8013s2.get(i5))) {
                    i2 = i5;
                    break;
                }
                i5++;
            }
            this.f13389n = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public final int compareTo(C7287a c7287a) {
            AbstractC7994m0 mo4248a;
            AbstractC7994m0<Integer> abstractC7994m0;
            boolean z = this.f13379d;
            boolean z2 = this.f13376a;
            if (z2 && z) {
                mo4248a = C7286f.f13372e;
            } else {
                mo4248a = C7286f.f13372e.mo4248a();
            }
            AbstractC7995n mo4254c = AbstractC7995n.f15781a.mo4254c(z, c7287a.f13379d);
            Integer valueOf = Integer.valueOf(this.f13381f);
            Integer valueOf2 = Integer.valueOf(c7287a.f13381f);
            C7985k0.f15757a.getClass();
            C8010q0 c8010q0 = C8010q0.f15813a;
            AbstractC7995n mo4255b = mo4254c.mo4255b(valueOf, valueOf2, c8010q0).mo4256a(this.f13380e, c7287a.f13380e).mo4256a(this.f13382g, c7287a.f13382g).mo4254c(z2, c7287a.f13376a).mo4255b(Integer.valueOf(this.f13389n), Integer.valueOf(c7287a.f13389n), c8010q0);
            int i = this.f13388m;
            Integer valueOf3 = Integer.valueOf(i);
            int i2 = c7287a.f13388m;
            Integer valueOf4 = Integer.valueOf(i2);
            if (this.f13378c.f13460u) {
                abstractC7994m0 = C7286f.f13372e.mo4248a();
            } else {
                abstractC7994m0 = C7286f.f13373f;
            }
            AbstractC7995n mo4255b2 = mo4255b.mo4255b(valueOf3, valueOf4, abstractC7994m0).mo4254c(this.f13385j, c7287a.f13385j).mo4255b(Integer.valueOf(this.f13383h), Integer.valueOf(c7287a.f13383h), c8010q0).mo4256a(this.f13384i, c7287a.f13384i).mo4255b(Integer.valueOf(this.f13386k), Integer.valueOf(c7287a.f13386k), mo4248a).mo4255b(Integer.valueOf(this.f13387l), Integer.valueOf(c7287a.f13387l), mo4248a);
            Integer valueOf5 = Integer.valueOf(i);
            Integer valueOf6 = Integer.valueOf(i2);
            if (!C7408g0.m5105a(this.f13377b, c7287a.f13377b)) {
                mo4248a = C7286f.f13373f;
            }
            return mo4255b2.mo4255b(valueOf5, valueOf6, mo4248a).mo4252e();
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.f$b */
    /* loaded from: classes.dex */
    public static final class C7288b implements Comparable<C7288b> {

        /* renamed from: a */
        public final boolean f13390a;

        /* renamed from: b */
        public final boolean f13391b;

        public C7288b(C7003m0 c7003m0, int i) {
            this.f13390a = (c7003m0.f12279d & 1) != 0;
            this.f13391b = C7286f.m5276e(i, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(C7288b c7288b) {
            C7288b c7288b2 = c7288b;
            return AbstractC7995n.f15781a.mo4254c(this.f13391b, c7288b2.f13391b).mo4254c(this.f13390a, c7288b2.f13390a).mo4252e();
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.f$d */
    /* loaded from: classes.dex */
    public static final class C7291d extends C7304l.C7306b {

        /* renamed from: o */
        public boolean f13405o;

        /* renamed from: p */
        public boolean f13406p;

        /* renamed from: q */
        public boolean f13407q;

        /* renamed from: r */
        public boolean f13408r;

        /* renamed from: s */
        public boolean f13409s;

        /* renamed from: t */
        public final SparseArray<Map<C7178k0, C7292e>> f13410t;

        /* renamed from: u */
        public final SparseBooleanArray f13411u;

        @Deprecated
        public C7291d() {
            this.f13410t = new SparseArray<>();
            this.f13411u = new SparseBooleanArray();
            this.f13405o = true;
            this.f13406p = true;
            this.f13407q = true;
            this.f13408r = true;
            this.f13409s = true;
        }

        @Override // com.google.android.exoplayer2.trackselection.C7304l.C7306b
        /* renamed from: a */
        public final C7304l.C7306b mo5257a(int i, int i2) {
            super.mo5257a(i, i2);
            return this;
        }

        /* renamed from: b */
        public final void m5272b(Context context) {
            CaptioningManager captioningManager;
            String locale;
            int i = C7408g0.f13905a;
            if (i >= 19) {
                if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                    this.f13475n = 1088;
                    Locale locale2 = captioningManager.getLocale();
                    if (locale2 != null) {
                        if (i >= 21) {
                            locale = locale2.toLanguageTag();
                        } else {
                            locale = locale2.toString();
                        }
                        this.f13474m = AbstractC8013s.m4243t(locale);
                    }
                }
            }
        }

        /* renamed from: c */
        public final void m5271c(Context context) {
            Display display;
            Point point;
            String str;
            String str2;
            String str3;
            String[] split;
            DisplayManager displayManager;
            int i = C7408g0.f13905a;
            String str4 = null;
            if (i >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                display = displayManager.getDisplay(0);
            } else {
                display = null;
            }
            if (display == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.getClass();
                display = windowManager.getDefaultDisplay();
            }
            if (display.getDisplayId() == 0 && C7408g0.m5085u(context)) {
                if (i < 28) {
                    str = "sys.display-size";
                } else {
                    str = "vendor.display-size";
                }
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    str4 = (String) cls.getMethod("get", String.class).invoke(cls, str);
                } catch (Exception e) {
                    if (str.length() != 0) {
                        str2 = "Failed to read system property ".concat(str);
                    } else {
                        str2 = new String("Failed to read system property ");
                    }
                    C7421n.m5056b("Util", str2, e);
                }
                if (!TextUtils.isEmpty(str4)) {
                    try {
                        split = str4.trim().split("x", -1);
                    } catch (NumberFormatException unused) {
                    }
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            point = new Point(parseInt, parseInt2);
                            mo5257a(point.x, point.y);
                        }
                    }
                    String valueOf = String.valueOf(str4);
                    if (valueOf.length() != 0) {
                        str3 = "Invalid display size: ".concat(valueOf);
                    } else {
                        str3 = new String("Invalid display size: ");
                    }
                    Log.e("Util", str3);
                }
                if ("Sony".equals(C7408g0.f13907c) && C7408g0.f13908d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                    mo5257a(point.x, point.y);
                }
            }
            point = new Point();
            if (i >= 23) {
                Display.Mode mode = display.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            } else if (i >= 17) {
                display.getRealSize(point);
            } else {
                display.getSize(point);
            }
            mo5257a(point.x, point.y);
        }

        public C7291d(Context context) {
            m5272b(context);
            m5271c(context);
            this.f13410t = new SparseArray<>();
            this.f13411u = new SparseBooleanArray();
            this.f13405o = true;
            this.f13406p = true;
            this.f13407q = true;
            this.f13408r = true;
            this.f13409s = true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.f$e */
    /* loaded from: classes.dex */
    public static final class C7292e implements Parcelable {
        public static final Parcelable.Creator<C7292e> CREATOR = new C7293a();

        /* renamed from: a */
        public final int f13412a;

        /* renamed from: b */
        public final int[] f13413b;

        /* renamed from: c */
        public final int f13414c;

        /* renamed from: com.google.android.exoplayer2.trackselection.f$e$a */
        /* loaded from: classes.dex */
        public class C7293a implements Parcelable.Creator<C7292e> {
            @Override // android.os.Parcelable.Creator
            public final C7292e createFromParcel(Parcel parcel) {
                return new C7292e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C7292e[] newArray(int i) {
                return new C7292e[i];
            }
        }

        public C7292e() {
            throw null;
        }

        public C7292e(Parcel parcel) {
            this.f13412a = parcel.readInt();
            int[] iArr = new int[parcel.readByte()];
            this.f13413b = iArr;
            parcel.readIntArray(iArr);
            this.f13414c = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7292e.class != obj.getClass()) {
                return false;
            }
            C7292e c7292e = (C7292e) obj;
            return this.f13412a == c7292e.f13412a && Arrays.equals(this.f13413b, c7292e.f13413b) && this.f13414c == c7292e.f13414c;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f13413b) + (this.f13412a * 31)) * 31) + this.f13414c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f13412a);
            int[] iArr = this.f13413b;
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(iArr);
            parcel.writeInt(this.f13414c);
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.f$f */
    /* loaded from: classes.dex */
    public static final class C7294f implements Comparable<C7294f> {

        /* renamed from: a */
        public final boolean f13415a;

        /* renamed from: b */
        public final boolean f13416b;

        /* renamed from: c */
        public final boolean f13417c;

        /* renamed from: d */
        public final boolean f13418d;

        /* renamed from: e */
        public final int f13419e;

        /* renamed from: f */
        public final int f13420f;

        /* renamed from: g */
        public final int f13421g;

        /* renamed from: h */
        public final int f13422h;

        /* renamed from: i */
        public final boolean f13423i;

        public C7294f(C7003m0 c7003m0, C7289c c7289c, int i, @Nullable String str) {
            int i2;
            boolean z = false;
            this.f13416b = C7286f.m5276e(i, false);
            int i3 = c7003m0.f12279d & (~c7289c.f13401w);
            this.f13417c = (i3 & 1) != 0;
            this.f13418d = (i3 & 2) != 0;
            AbstractC8013s<String> abstractC8013s = c7289c.f13457r;
            AbstractC8013s<String> m4243t = abstractC8013s.isEmpty() ? AbstractC8013s.m4243t("") : abstractC8013s;
            int i4 = 0;
            while (true) {
                if (i4 >= m4243t.size()) {
                    i4 = Integer.MAX_VALUE;
                    i2 = 0;
                    break;
                }
                i2 = C7286f.m5278c(c7003m0, m4243t.get(i4), c7289c.f13459t);
                if (i2 > 0) {
                    break;
                }
                i4++;
            }
            this.f13419e = i4;
            this.f13420f = i2;
            int i5 = c7289c.f13458s;
            int i6 = c7003m0.f12280e;
            int bitCount = Integer.bitCount(i5 & i6);
            this.f13421g = bitCount;
            this.f13423i = (i6 & 1088) != 0;
            int m5278c = C7286f.m5278c(c7003m0, str, C7286f.m5274g(str) == null);
            this.f13422h = m5278c;
            if (i2 > 0 || ((abstractC8013s.isEmpty() && bitCount > 0) || this.f13417c || (this.f13418d && m5278c > 0))) {
                z = true;
            }
            this.f13415a = z;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public final int compareTo(C7294f c7294f) {
            AbstractC7995n mo4254c = AbstractC7995n.f15781a.mo4254c(this.f13416b, c7294f.f13416b);
            Integer valueOf = Integer.valueOf(this.f13419e);
            Integer valueOf2 = Integer.valueOf(c7294f.f13419e);
            AbstractC7994m0 abstractC7994m0 = C7985k0.f15757a;
            abstractC7994m0.getClass();
            C8010q0 c8010q0 = C8010q0.f15813a;
            AbstractC7995n mo4255b = mo4254c.mo4255b(valueOf, valueOf2, c8010q0);
            int i = this.f13420f;
            AbstractC7995n mo4256a = mo4255b.mo4256a(i, c7294f.f13420f);
            int i2 = this.f13421g;
            AbstractC7995n mo4254c2 = mo4256a.mo4256a(i2, c7294f.f13421g).mo4254c(this.f13417c, c7294f.f13417c);
            Boolean valueOf3 = Boolean.valueOf(this.f13418d);
            Boolean valueOf4 = Boolean.valueOf(c7294f.f13418d);
            if (i != 0) {
                abstractC7994m0 = c8010q0;
            }
            AbstractC7995n mo4256a2 = mo4254c2.mo4255b(valueOf3, valueOf4, abstractC7994m0).mo4256a(this.f13422h, c7294f.f13422h);
            if (i2 == 0) {
                mo4256a2 = mo4256a2.mo4253d(this.f13423i, c7294f.f13423i);
            }
            return mo4256a2.mo4252e();
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.f$g */
    /* loaded from: classes.dex */
    public static final class C7295g implements Comparable<C7295g> {

        /* renamed from: a */
        public final boolean f13424a;

        /* renamed from: b */
        public final C7289c f13425b;

        /* renamed from: c */
        public final boolean f13426c;

        /* renamed from: d */
        public final boolean f13427d;

        /* renamed from: e */
        public final int f13428e;

        /* renamed from: f */
        public final int f13429f;

        /* renamed from: g */
        public final int f13430g;

        public C7295g(C7003m0 c7003m0, C7289c c7289c, int i, boolean z) {
            this.f13425b = c7289c;
            float f = c7003m0.f12294s;
            int i2 = c7003m0.f12283h;
            int i3 = c7003m0.f12293r;
            int i4 = c7003m0.f12292q;
            boolean z2 = true;
            int i5 = 0;
            int i6 = -1;
            this.f13424a = z && (i4 == -1 || i4 <= c7289c.f13440a) && ((i3 == -1 || i3 <= c7289c.f13441b) && ((f == -1.0f || f <= ((float) c7289c.f13442c)) && (i2 == -1 || i2 <= c7289c.f13443d)));
            if (!z || ((i4 != -1 && i4 < c7289c.f13444e) || ((i3 != -1 && i3 < c7289c.f13445f) || ((f != -1.0f && f < c7289c.f13446g) || (i2 != -1 && i2 < c7289c.f13447h))))) {
                z2 = false;
            }
            this.f13426c = z2;
            this.f13427d = C7286f.m5276e(i, false);
            this.f13428e = i2;
            if (i4 != -1 && i3 != -1) {
                i6 = i4 * i3;
            }
            this.f13429f = i6;
            while (true) {
                AbstractC8013s<String> abstractC8013s = c7289c.f13451l;
                if (i5 >= abstractC8013s.size()) {
                    i5 = Integer.MAX_VALUE;
                    break;
                }
                String str = c7003m0.f12287l;
                if (str != null && str.equals(abstractC8013s.get(i5))) {
                    break;
                }
                i5++;
            }
            this.f13430g = i5;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public final int compareTo(C7295g c7295g) {
            AbstractC7994m0 mo4248a;
            AbstractC7994m0<Integer> abstractC7994m0;
            boolean z = this.f13427d;
            boolean z2 = this.f13424a;
            if (z2 && z) {
                mo4248a = C7286f.f13372e;
            } else {
                mo4248a = C7286f.f13372e.mo4248a();
            }
            AbstractC7995n mo4254c = AbstractC7995n.f15781a.mo4254c(z, c7295g.f13427d).mo4254c(z2, c7295g.f13424a).mo4254c(this.f13426c, c7295g.f13426c);
            Integer valueOf = Integer.valueOf(this.f13430g);
            Integer valueOf2 = Integer.valueOf(c7295g.f13430g);
            C7985k0.f15757a.getClass();
            AbstractC7995n mo4255b = mo4254c.mo4255b(valueOf, valueOf2, C8010q0.f15813a);
            int i = this.f13428e;
            Integer valueOf3 = Integer.valueOf(i);
            int i2 = c7295g.f13428e;
            Integer valueOf4 = Integer.valueOf(i2);
            if (this.f13425b.f13460u) {
                abstractC7994m0 = C7286f.f13372e.mo4248a();
            } else {
                abstractC7994m0 = C7286f.f13373f;
            }
            return mo4255b.mo4255b(valueOf3, valueOf4, abstractC7994m0).mo4255b(Integer.valueOf(this.f13429f), Integer.valueOf(c7295g.f13429f), mo4248a).mo4255b(Integer.valueOf(i), Integer.valueOf(i2), mo4248a).mo4252e();
        }
    }

    static {
        AbstractC7994m0<Integer> c7993m;
        AbstractC7994m0<Integer> c7993m2;
        Comparator comparator = new Comparator() { // from class: com.google.android.exoplayer2.trackselection.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            }
        };
        if (comparator instanceof AbstractC7994m0) {
            c7993m = (AbstractC7994m0) comparator;
        } else {
            c7993m = new C7993m(comparator);
        }
        f13372e = c7993m;
        Comparator comparator2 = new Comparator() { // from class: com.google.android.exoplayer2.trackselection.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int[] iArr = C7286f.f13371d;
                return 0;
            }
        };
        if (comparator2 instanceof AbstractC7994m0) {
            c7993m2 = (AbstractC7994m0) comparator2;
        } else {
            c7993m2 = new C7993m(comparator2);
        }
        f13373f = c7993m2;
    }

    public C7286f(Context context) {
        C7279a.C7281b c7281b = new C7279a.C7281b();
        Parcelable.Creator<C7289c> creator = C7289c.CREATOR;
        C7289c c7289c = new C7289c(new C7291d(context));
        this.f13374b = c7281b;
        this.f13375c = new AtomicReference<>(c7289c);
    }

    /* renamed from: c */
    public static int m5278c(C7003m0 c7003m0, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c7003m0.f12278c)) {
            return 4;
        }
        String m5274g = m5274g(str);
        String m5274g2 = m5274g(c7003m0.f12278c);
        if (m5274g2 != null && m5274g != null) {
            if (!m5274g2.startsWith(m5274g) && !m5274g.startsWith(m5274g2)) {
                int i = C7408g0.f13905a;
                if (!m5274g2.split("-", 2)[0].equals(m5274g.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z || m5274g2 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList m5277d(com.google.android.exoplayer2.source.C7175j0 r16, int r17, int r18, boolean r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.f12894a
            r3.<init>(r4)
            r5 = 0
        Le:
            int r6 = r0.f12894a
            if (r5 >= r6) goto L1c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.add(r6)
            int r5 = r5 + 1
            goto Le
        L1c:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r5) goto Lab
            if (r2 != r5) goto L25
            goto Lab
        L25:
            r8 = r5
            r7 = 0
        L27:
            r9 = -1
            r10 = 1
            com.google.android.exoplayer2.m0[] r11 = r0.f12895b
            if (r7 >= r6) goto L80
            r11 = r11[r7]
            int r12 = r11.f12292q
            if (r12 <= 0) goto L7d
            int r13 = r11.f12293r
            if (r13 <= 0) goto L7d
            if (r19 == 0) goto L47
            if (r12 <= r13) goto L3d
            r14 = r10
            goto L3e
        L3d:
            r14 = 0
        L3e:
            if (r1 <= r2) goto L41
            goto L42
        L41:
            r10 = 0
        L42:
            if (r14 == r10) goto L47
            r10 = r1
            r14 = r2
            goto L49
        L47:
            r14 = r1
            r10 = r2
        L49:
            int r15 = r12 * r10
            int r4 = r13 * r14
            if (r15 < r4) goto L5a
            android.graphics.Point r10 = new android.graphics.Point
            int r15 = com.google.android.exoplayer2.util.C7408g0.f13905a
            int r4 = r4 + r12
            int r4 = r4 + r9
            int r4 = r4 / r12
            r10.<init>(r14, r4)
            goto L65
        L5a:
            android.graphics.Point r4 = new android.graphics.Point
            int r12 = com.google.android.exoplayer2.util.C7408g0.f13905a
            int r15 = r15 + r13
            int r15 = r15 + r9
            int r15 = r15 / r13
            r4.<init>(r15, r10)
            r10 = r4
        L65:
            int r4 = r11.f12292q
            int r9 = r4 * r13
            int r11 = r10.x
            float r11 = (float) r11
            r12 = 1065017672(0x3f7ae148, float:0.98)
            float r11 = r11 * r12
            int r11 = (int) r11
            if (r4 < r11) goto L7d
            int r4 = r10.y
            float r4 = (float) r4
            float r4 = r4 * r12
            int r4 = (int) r4
            if (r13 < r4) goto L7d
            if (r9 >= r8) goto L7d
            r8 = r9
        L7d:
            int r7 = r7 + 1
            goto L27
        L80:
            if (r8 == r5) goto Lab
            int r0 = r3.size()
            int r0 = r0 - r10
        L87:
            if (r0 < 0) goto Lab
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r1 = r11[r1]
            int r2 = r1.f12292q
            if (r2 == r9) goto La0
            int r1 = r1.f12293r
            if (r1 != r9) goto L9e
            goto La0
        L9e:
            int r2 = r2 * r1
            goto La1
        La0:
            r2 = r9
        La1:
            if (r2 == r9) goto La5
            if (r2 <= r8) goto La8
        La5:
            r3.remove(r0)
        La8:
            int r0 = r0 + (-1)
            goto L87
        Lab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.C7286f.m5277d(com.google.android.exoplayer2.source.j0, int, int, boolean):java.util.ArrayList");
    }

    /* renamed from: e */
    public static boolean m5276e(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* renamed from: f */
    public static boolean m5275f(C7003m0 c7003m0, @Nullable String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        if ((c7003m0.f12280e & Http2.INITIAL_MAX_FRAME_SIZE) == 0 && m5276e(i, false) && (i & i2) != 0) {
            if (str == null || C7408g0.m5105a(c7003m0.f12287l, str)) {
                int i12 = c7003m0.f12292q;
                if (i12 == -1 || (i7 <= i12 && i12 <= i3)) {
                    int i13 = c7003m0.f12293r;
                    if (i13 == -1 || (i8 <= i13 && i13 <= i4)) {
                        float f = c7003m0.f12294s;
                        return (f == -1.0f || (((float) i9) <= f && f <= ((float) i5))) && (i11 = c7003m0.f12283h) != -1 && i10 <= i11 && i11 <= i6;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Nullable
    /* renamed from: g */
    public static String m5274g(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.f$c */
    /* loaded from: classes.dex */
    public static final class C7289c extends C7304l {
        public static final Parcelable.Creator<C7289c> CREATOR;

        /* renamed from: A */
        public final boolean f13392A;

        /* renamed from: B */
        public final boolean f13393B;

        /* renamed from: C */
        public final boolean f13394C;

        /* renamed from: D */
        public final boolean f13395D;

        /* renamed from: E */
        public final boolean f13396E;

        /* renamed from: F */
        public final boolean f13397F;

        /* renamed from: G */
        public final boolean f13398G;

        /* renamed from: H */
        public final SparseArray<Map<C7178k0, C7292e>> f13399H;

        /* renamed from: I */
        public final SparseBooleanArray f13400I;

        /* renamed from: w */
        public final int f13401w;

        /* renamed from: x */
        public final boolean f13402x;

        /* renamed from: y */
        public final boolean f13403y;

        /* renamed from: z */
        public final boolean f13404z;

        /* renamed from: com.google.android.exoplayer2.trackselection.f$c$a */
        /* loaded from: classes.dex */
        public class C7290a implements Parcelable.Creator<C7289c> {
            @Override // android.os.Parcelable.Creator
            public final C7289c createFromParcel(Parcel parcel) {
                return new C7289c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C7289c[] newArray(int i) {
                return new C7289c[i];
            }
        }

        static {
            new C7289c(new C7291d());
            CREATOR = new C7290a();
        }

        public C7289c(Parcel parcel) {
            super(parcel);
            int i = C7408g0.f13905a;
            this.f13402x = parcel.readInt() != 0;
            this.f13403y = parcel.readInt() != 0;
            this.f13404z = parcel.readInt() != 0;
            this.f13392A = parcel.readInt() != 0;
            this.f13393B = parcel.readInt() != 0;
            this.f13394C = parcel.readInt() != 0;
            this.f13395D = parcel.readInt() != 0;
            this.f13401w = parcel.readInt();
            this.f13396E = parcel.readInt() != 0;
            this.f13397F = parcel.readInt() != 0;
            this.f13398G = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            SparseArray<Map<C7178k0, C7292e>> sparseArray = new SparseArray<>(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i3 = 0; i3 < readInt3; i3++) {
                    C7178k0 c7178k0 = (C7178k0) parcel.readParcelable(C7178k0.class.getClassLoader());
                    c7178k0.getClass();
                    hashMap.put(c7178k0, (C7292e) parcel.readParcelable(C7292e.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            this.f13399H = sparseArray;
            this.f13400I = parcel.readSparseBooleanArray();
        }

        @Override // com.google.android.exoplayer2.trackselection.C7304l, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00e7 A[LOOP:0: B:49:0x0090->B:66:0x00e7, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x008d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
        @Override // com.google.android.exoplayer2.trackselection.C7304l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean equals(@androidx.annotation.Nullable java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.C7286f.C7289c.equals(java.lang.Object):boolean");
        }

        @Override // com.google.android.exoplayer2.trackselection.C7304l
        public final int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f13402x ? 1 : 0)) * 31) + (this.f13403y ? 1 : 0)) * 31) + (this.f13404z ? 1 : 0)) * 31) + (this.f13392A ? 1 : 0)) * 31) + (this.f13393B ? 1 : 0)) * 31) + (this.f13394C ? 1 : 0)) * 31) + (this.f13395D ? 1 : 0)) * 31) + this.f13401w) * 31) + (this.f13396E ? 1 : 0)) * 31) + (this.f13397F ? 1 : 0)) * 31) + (this.f13398G ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.C7304l, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int i2 = C7408g0.f13905a;
            parcel.writeInt(this.f13402x ? 1 : 0);
            parcel.writeInt(this.f13403y ? 1 : 0);
            parcel.writeInt(this.f13404z ? 1 : 0);
            parcel.writeInt(this.f13392A ? 1 : 0);
            parcel.writeInt(this.f13393B ? 1 : 0);
            parcel.writeInt(this.f13394C ? 1 : 0);
            parcel.writeInt(this.f13395D ? 1 : 0);
            parcel.writeInt(this.f13401w);
            parcel.writeInt(this.f13396E ? 1 : 0);
            parcel.writeInt(this.f13397F ? 1 : 0);
            parcel.writeInt(this.f13398G ? 1 : 0);
            SparseArray<Map<C7178k0, C7292e>> sparseArray = this.f13399H;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = sparseArray.keyAt(i3);
                Map<C7178k0, C7292e> valueAt = sparseArray.valueAt(i3);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<C7178k0, C7292e> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.f13400I);
        }

        public C7289c(C7291d c7291d) {
            super(c7291d);
            this.f13402x = c7291d.f13405o;
            this.f13403y = false;
            this.f13404z = c7291d.f13406p;
            this.f13392A = c7291d.f13407q;
            this.f13393B = false;
            this.f13394C = false;
            this.f13395D = false;
            this.f13401w = 0;
            this.f13396E = c7291d.f13408r;
            this.f13397F = false;
            this.f13398G = c7291d.f13409s;
            this.f13399H = c7291d.f13410t;
            this.f13400I = c7291d.f13411u;
        }
    }
}
