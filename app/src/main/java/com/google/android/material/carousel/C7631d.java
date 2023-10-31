package com.google.android.material.carousel;

import android.view.animation.LinearInterpolator;
import androidx.appcompat.graphics.drawable.C0171d;
import com.google.android.material.animation.C7556a;
import com.google.android.material.carousel.C7628c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.material.carousel.d */
/* loaded from: classes3.dex */
public final class C7631d {

    /* renamed from: a */
    public final C7628c f14640a;

    /* renamed from: b */
    public final List<C7628c> f14641b;

    /* renamed from: c */
    public final List<C7628c> f14642c;

    /* renamed from: d */
    public final float[] f14643d;

    /* renamed from: e */
    public final float[] f14644e;

    /* renamed from: f */
    public final float f14645f;

    /* renamed from: g */
    public final float f14646g;

    public C7631d(C7628c c7628c, ArrayList arrayList, ArrayList arrayList2) {
        this.f14640a = c7628c;
        this.f14641b = Collections.unmodifiableList(arrayList);
        this.f14642c = Collections.unmodifiableList(arrayList2);
        float f = ((C7628c) arrayList.get(arrayList.size() - 1)).m4683b().f14636a - c7628c.m4683b().f14636a;
        this.f14645f = f;
        float f2 = c7628c.m4681d().f14636a - ((C7628c) arrayList2.get(arrayList2.size() - 1)).m4681d().f14636a;
        this.f14646g = f2;
        this.f14643d = m4678a(f, arrayList, true);
        this.f14644e = m4678a(f2, arrayList2, false);
    }

    /* renamed from: a */
    public static float[] m4678a(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            C7628c c7628c = (C7628c) arrayList.get(i2);
            C7628c c7628c2 = (C7628c) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? c7628c2.m4683b().f14636a - c7628c.m4683b().f14636a : c7628c.m4681d().f14636a - c7628c2.m4681d().f14636a) / f);
            i++;
        }
        return fArr;
    }

    /* renamed from: b */
    public static C7628c m4677b(List<C7628c> list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                float m4809a = C7556a.m4809a(0.0f, 1.0f, f2, f3, f);
                C7628c c7628c = list.get(i - 1);
                C7628c c7628c2 = list.get(i);
                if (c7628c.f14625a == c7628c2.f14625a) {
                    List<C7628c.C7630b> list2 = c7628c.f14626b;
                    int size2 = list2.size();
                    List<C7628c.C7630b> list3 = c7628c2.f14626b;
                    if (size2 == list3.size()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < list2.size(); i2++) {
                            C7628c.C7630b c7630b = list2.get(i2);
                            C7628c.C7630b c7630b2 = list3.get(i2);
                            float f4 = c7630b.f14636a;
                            float f5 = c7630b2.f14636a;
                            LinearInterpolator linearInterpolator = C7556a.f14282a;
                            float m12907a = C0171d.m12907a(f5, f4, m4809a, f4);
                            float f6 = c7630b2.f14637b;
                            float f7 = c7630b.f14637b;
                            float m12907a2 = C0171d.m12907a(f6, f7, m4809a, f7);
                            float f8 = c7630b2.f14638c;
                            float f9 = c7630b.f14638c;
                            float m12907a3 = C0171d.m12907a(f8, f9, m4809a, f9);
                            float f10 = c7630b2.f14639d;
                            float f11 = c7630b.f14639d;
                            arrayList.add(new C7628c.C7630b(m12907a, m12907a2, m12907a3, C0171d.m12907a(f10, f11, m4809a, f11)));
                        }
                        int i3 = c7628c2.f14627c;
                        int i4 = c7628c.f14627c;
                        int round = Math.round((i3 - i4) * m4809a) + i4;
                        int i5 = c7628c2.f14628d;
                        int i6 = c7628c.f14628d;
                        return new C7628c(c7628c.f14625a, arrayList, round, Math.round(m4809a * (i5 - i6)) + i6);
                    }
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
                }
                throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
            }
            i++;
            f2 = f3;
        }
        return list.get(0);
    }

    /* renamed from: c */
    public static C7628c m4676c(C7628c c7628c, int i, int i2, float f, int i3, int i4) {
        boolean z;
        ArrayList arrayList = new ArrayList(c7628c.f14626b);
        arrayList.add(i2, (C7628c.C7630b) arrayList.remove(i));
        C7628c.C7629a c7629a = new C7628c.C7629a(c7628c.f14625a);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C7628c.C7630b c7630b = (C7628c.C7630b) arrayList.get(i5);
            float f2 = c7630b.f14639d;
            float f3 = (f2 / 2.0f) + f;
            if (i5 >= i3 && i5 <= i4) {
                z = true;
            } else {
                z = false;
            }
            c7629a.m4680a(f3, c7630b.f14638c, f2, z);
            f += c7630b.f14639d;
        }
        return c7629a.m4679b();
    }
}
