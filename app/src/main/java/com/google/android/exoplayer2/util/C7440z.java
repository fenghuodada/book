package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.util.C7440z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.util.z */
/* loaded from: classes.dex */
public final class C7440z {

    /* renamed from: h */
    public static final C7438x f13985h = new Comparator() { // from class: com.google.android.exoplayer2.util.x
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((C7440z.C7441a) obj).f13994a - ((C7440z.C7441a) obj2).f13994a;
        }
    };

    /* renamed from: i */
    public static final C7439y f13986i = new Comparator() { // from class: com.google.android.exoplayer2.util.y
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((C7440z.C7441a) obj).f13996c, ((C7440z.C7441a) obj2).f13996c);
        }
    };

    /* renamed from: a */
    public final int f13987a;

    /* renamed from: e */
    public int f13991e;

    /* renamed from: f */
    public int f13992f;

    /* renamed from: g */
    public int f13993g;

    /* renamed from: c */
    public final C7441a[] f13989c = new C7441a[5];

    /* renamed from: b */
    public final ArrayList<C7441a> f13988b = new ArrayList<>();

    /* renamed from: d */
    public int f13990d = -1;

    /* renamed from: com.google.android.exoplayer2.util.z$a */
    /* loaded from: classes.dex */
    public static class C7441a {

        /* renamed from: a */
        public int f13994a;

        /* renamed from: b */
        public int f13995b;

        /* renamed from: c */
        public float f13996c;
    }

    public C7440z(int i) {
        this.f13987a = i;
    }

    /* renamed from: a */
    public final void m4981a(float f, int i) {
        C7441a c7441a;
        int i2 = this.f13990d;
        ArrayList<C7441a> arrayList = this.f13988b;
        if (i2 != 1) {
            Collections.sort(arrayList, f13985h);
            this.f13990d = 1;
        }
        int i3 = this.f13993g;
        C7441a[] c7441aArr = this.f13989c;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f13993g = i4;
            c7441a = c7441aArr[i4];
        } else {
            c7441a = new C7441a();
        }
        int i5 = this.f13991e;
        this.f13991e = i5 + 1;
        c7441a.f13994a = i5;
        c7441a.f13995b = i;
        c7441a.f13996c = f;
        arrayList.add(c7441a);
        this.f13992f += i;
        while (true) {
            int i6 = this.f13992f;
            int i7 = this.f13987a;
            if (i6 > i7) {
                int i8 = i6 - i7;
                C7441a c7441a2 = arrayList.get(0);
                int i9 = c7441a2.f13995b;
                if (i9 <= i8) {
                    this.f13992f -= i9;
                    arrayList.remove(0);
                    int i10 = this.f13993g;
                    if (i10 < 5) {
                        this.f13993g = i10 + 1;
                        c7441aArr[i10] = c7441a2;
                    }
                } else {
                    c7441a2.f13995b = i9 - i8;
                    this.f13992f -= i8;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final float m4980b() {
        int i = this.f13990d;
        ArrayList<C7441a> arrayList = this.f13988b;
        if (i != 0) {
            Collections.sort(arrayList, f13986i);
            this.f13990d = 0;
        }
        float f = 0.5f * this.f13992f;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C7441a c7441a = arrayList.get(i3);
            i2 += c7441a.f13995b;
            if (i2 >= f) {
                return c7441a.f13996c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return arrayList.get(arrayList.size() - 1).f13996c;
    }
}
