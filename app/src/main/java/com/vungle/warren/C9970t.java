package com.vungle.warren;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.vungle.warren.AdConfig;
import com.vungle.warren.analytics.C9752b;
import com.vungle.warren.analytics.InterfaceC9751a;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.utility.ViewUtility;
import java.util.regex.Pattern;

/* renamed from: com.vungle.warren.t */
/* loaded from: classes3.dex */
public final class C9970t {

    /* renamed from: d */
    public static final String f20017d = Pattern.quote("{{{req_width}}}");

    /* renamed from: e */
    public static final String f20018e = Pattern.quote("{{{req_height}}}");

    /* renamed from: f */
    public static final String f20019f = Pattern.quote("{{{width}}}");

    /* renamed from: g */
    public static final String f20020g = Pattern.quote("{{{height}}}");

    /* renamed from: h */
    public static final String f20021h = Pattern.quote("{{{down_x}}}");

    /* renamed from: i */
    public static final String f20022i = Pattern.quote("{{{down_y}}}");

    /* renamed from: j */
    public static final String f20023j = Pattern.quote("{{{up_x}}}");

    /* renamed from: k */
    public static final String f20024k = Pattern.quote("{{{up_y}}}");

    /* renamed from: a */
    public final Advertisement f20025a;

    /* renamed from: b */
    public final InterfaceC9751a f20026b;
    @VisibleForTesting

    /* renamed from: c */
    public C9971a f20027c;

    /* renamed from: com.vungle.warren.t$a */
    /* loaded from: classes3.dex */
    public static class C9971a {

        /* renamed from: a */
        public C9972b f20028a = new C9972b(Integer.MIN_VALUE, Integer.MIN_VALUE);

        /* renamed from: b */
        public C9972b f20029b = new C9972b(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: com.vungle.warren.t$b */
    /* loaded from: classes3.dex */
    public static class C9972b {

        /* renamed from: a */
        public final int f20030a;

        /* renamed from: b */
        public final int f20031b;

        public C9972b(int i, int i2) {
            this.f20030a = i;
            this.f20031b = i2;
        }
    }

    /* renamed from: com.vungle.warren.t$c */
    /* loaded from: classes3.dex */
    public static class C9973c {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: b */
        public static C9973c f20032b;

        /* renamed from: a */
        public final DisplayMetrics f20033a;

        public C9973c(@NonNull Context context) {
            Context applicationContext = context.getApplicationContext();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f20033a = displayMetrics;
            ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        }
    }

    public C9970t(@NonNull Advertisement advertisement, @NonNull C9752b c9752b) {
        this.f20025a = advertisement;
        this.f20026b = c9752b;
    }

    /* renamed from: a */
    public final int m1366a() {
        AdConfig adConfig;
        if (Vungle.appContext() == null || (adConfig = this.f20025a.f19757v) == null) {
            return 0;
        }
        AdConfig.AdSize m1425a = adConfig.m1425a();
        if (m1425a == AdConfig.AdSize.VUNGLE_DEFAULT) {
            if (Vungle.appContext() == null) {
                return 0;
            }
            Context appContext = Vungle.appContext();
            if (C9973c.f20032b == null) {
                C9973c.f20032b = new C9973c(appContext);
            }
            return C9973c.f20032b.f20033a.heightPixels;
        }
        return ViewUtility.m1289a(Vungle.appContext(), m1425a.getHeight());
    }

    /* renamed from: b */
    public final int m1365b() {
        AdConfig adConfig;
        if (Vungle.appContext() == null || (adConfig = this.f20025a.f19757v) == null) {
            return 0;
        }
        AdConfig.AdSize m1425a = adConfig.m1425a();
        if (m1425a == AdConfig.AdSize.VUNGLE_DEFAULT) {
            if (Vungle.appContext() == null) {
                return 0;
            }
            Context appContext = Vungle.appContext();
            if (C9973c.f20032b == null) {
                C9973c.f20032b = new C9973c(appContext);
            }
            return C9973c.f20032b.f20033a.widthPixels;
        }
        return ViewUtility.m1289a(Vungle.appContext(), m1425a.getWidth());
    }
}
