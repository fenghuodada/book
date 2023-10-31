package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0535b;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.util.C7427r;
import com.google.android.exoplayer2.util.C7436v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.video.a */
/* loaded from: classes.dex */
public final class C7444a {

    /* renamed from: a */
    public final List<byte[]> f14000a;

    /* renamed from: b */
    public final int f14001b;

    /* renamed from: c */
    public final int f14002c;

    /* renamed from: d */
    public final int f14003d;

    /* renamed from: e */
    public final float f14004e;
    @Nullable

    /* renamed from: f */
    public final String f14005f;

    public C7444a(ArrayList arrayList, int i, int i2, int i3, float f, @Nullable String str) {
        this.f14000a = arrayList;
        this.f14001b = i;
        this.f14002c = i2;
        this.f14003d = i3;
        this.f14004e = f;
        this.f14005f = str;
    }

    /* renamed from: a */
    public static C7444a m4979a(C7436v c7436v) throws C7506y0 {
        byte[] bArr;
        int i;
        int i2;
        float f;
        String str;
        try {
            c7436v.m5018A(4);
            int m5002p = (c7436v.m5002p() & 3) + 1;
            if (m5002p != 3) {
                ArrayList arrayList = new ArrayList();
                int m5002p2 = c7436v.m5002p() & 31;
                int i3 = 0;
                while (true) {
                    bArr = C0535b.f1678a;
                    if (i3 >= m5002p2) {
                        break;
                    }
                    int m4997u = c7436v.m4997u();
                    int i4 = c7436v.f13979b;
                    c7436v.m5018A(m4997u);
                    byte[] bArr2 = c7436v.f13978a;
                    byte[] bArr3 = new byte[m4997u + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i4, bArr3, 4, m4997u);
                    arrayList.add(bArr3);
                    i3++;
                }
                int m5002p3 = c7436v.m5002p();
                for (int i5 = 0; i5 < m5002p3; i5++) {
                    int m4997u2 = c7436v.m4997u();
                    int i6 = c7436v.f13979b;
                    c7436v.m5018A(m4997u2);
                    byte[] bArr4 = c7436v.f13978a;
                    byte[] bArr5 = new byte[m4997u2 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i6, bArr5, 4, m4997u2);
                    arrayList.add(bArr5);
                }
                if (m5002p2 > 0) {
                    C7427r.C7429b m5036d = C7427r.m5036d(m5002p, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                    int i7 = m5036d.f13956e;
                    int i8 = m5036d.f13957f;
                    float f2 = m5036d.f13958g;
                    str = C0535b.m12279b(m5036d.f13952a, m5036d.f13953b, m5036d.f13954c);
                    i = i7;
                    i2 = i8;
                    f = f2;
                } else {
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                    str = null;
                }
                return new C7444a(arrayList, m5002p, i, i2, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C7506y0.m4869a("Error parsing AVC config", e);
        }
    }
}
