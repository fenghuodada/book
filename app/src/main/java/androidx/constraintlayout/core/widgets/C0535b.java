package androidx.constraintlayout.core.widgets;

import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7437w;

/* renamed from: androidx.constraintlayout.core.widgets.b */
/* loaded from: classes.dex */
public final class C0535b {

    /* renamed from: a */
    public static final byte[] f1678a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final String[] f1679b = {"", "A", "B", "C"};

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0271, code lost:
        if (r2.f1700d == r8) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f1, code lost:
        if (r4.f1700d == r13) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0512 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m12280a(androidx.constraintlayout.core.widgets.C0541g r36, androidx.constraintlayout.core.C0504e r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0535b.m12280a(androidx.constraintlayout.core.widgets.g, androidx.constraintlayout.core.e, java.util.ArrayList, int):void");
    }

    /* renamed from: b */
    public static String m12279b(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: c */
    public static String m12278c(C7437w c7437w) {
        c7437w.m4982j(24);
        int m4987e = c7437w.m4987e(2);
        boolean m4988d = c7437w.m4988d();
        int m4987e2 = c7437w.m4987e(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (c7437w.m4988d()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = c7437w.m4987e(8);
        }
        int m4987e3 = c7437w.m4987e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f1679b[m4987e];
        objArr[1] = Integer.valueOf(m4987e2);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Character.valueOf(m4988d ? 'H' : 'L');
        objArr[4] = Integer.valueOf(m4987e3);
        StringBuilder sb = new StringBuilder(C7408g0.m5096j("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0) {
            int i5 = i3 - 1;
            if (iArr[i5] != 0) {
                break;
            }
            i3 = i5;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }
}
