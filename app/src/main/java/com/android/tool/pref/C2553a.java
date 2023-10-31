package com.android.tool.pref;

import android.graphics.drawable.Drawable;
import java.util.Comparator;

/* renamed from: com.android.tool.pref.a */
/* loaded from: classes.dex */
public final class C2553a {

    /* renamed from: f */
    public static final C2554a f6045f = new C2554a();

    /* renamed from: g */
    public static final C2555b f6046g = new C2555b();

    /* renamed from: a */
    public final String f6047a;

    /* renamed from: b */
    public final String f6048b;

    /* renamed from: c */
    public final Drawable f6049c;

    /* renamed from: d */
    public boolean f6050d;

    /* renamed from: e */
    public final String f6051e;

    /* renamed from: com.android.tool.pref.a$a */
    /* loaded from: classes.dex */
    public class C2554a implements Comparator<C2553a> {
        @Override // java.util.Comparator
        public final int compare(C2553a c2553a, C2553a c2553a2) {
            return c2553a.f6047a.compareTo(c2553a2.f6047a);
        }
    }

    /* renamed from: com.android.tool.pref.a$b */
    /* loaded from: classes.dex */
    public class C2555b implements Comparator<C2553a> {
        @Override // java.util.Comparator
        public final int compare(C2553a c2553a, C2553a c2553a2) {
            return c2553a.f6051e.compareTo(c2553a2.f6051e);
        }
    }

    public C2553a(String str, String str2, Drawable drawable, boolean z, String str3) {
        this.f6047a = str;
        this.f6049c = drawable;
        this.f6048b = str2;
        this.f6050d = z;
        this.f6051e = str3;
    }
}
