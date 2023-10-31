package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1163c0;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.p1 */
/* loaded from: classes.dex */
public final class C1229p1 {

    /* renamed from: f */
    public static final C1229p1 f3062f = new C1229p1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f3063a;

    /* renamed from: b */
    public int[] f3064b;

    /* renamed from: c */
    public Object[] f3065c;

    /* renamed from: d */
    public int f3066d;

    /* renamed from: e */
    public boolean f3067e;

    public C1229p1() {
        this(0, new int[8], new Object[8], true);
    }

    public C1229p1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f3066d = -1;
        this.f3063a = i;
        this.f3064b = iArr;
        this.f3065c = objArr;
        this.f3067e = z;
    }

    /* renamed from: a */
    public final int m10866a() {
        int m10934w;
        int i = this.f3066d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3063a; i3++) {
            int i4 = this.f3064b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                ((Integer) this.f3065c[i3]).intValue();
                                m10934w = AbstractC1214m.m10951f(i5);
                            } else {
                                int i7 = C1163c0.f2947a;
                                throw new IllegalStateException(new C1163c0.C1164a());
                            }
                        } else {
                            i2 = ((C1229p1) this.f3065c[i3]).m10866a() + (AbstractC1214m.m10937t(i5) * 2) + i2;
                        }
                    } else {
                        m10934w = AbstractC1214m.m10954c(i5, (AbstractC1183i) this.f3065c[i3]);
                    }
                } else {
                    ((Long) this.f3065c[i3]).longValue();
                    m10934w = AbstractC1214m.m10950g(i5);
                }
            } else {
                m10934w = AbstractC1214m.m10934w(i5, ((Long) this.f3065c[i3]).longValue());
            }
            i2 = m10934w + i2;
        }
        this.f3066d = i2;
        return i2;
    }

    /* renamed from: b */
    public final void m10865b(int i, Object obj) {
        int i2;
        if (this.f3067e) {
            int i3 = this.f3063a;
            int[] iArr = this.f3064b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f3064b = Arrays.copyOf(iArr, i4);
                this.f3065c = Arrays.copyOf(this.f3065c, i4);
            }
            int[] iArr2 = this.f3064b;
            int i5 = this.f3063a;
            iArr2[i5] = i;
            this.f3065c[i5] = obj;
            this.f3063a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void m10864c(C1221n c1221n) throws IOException {
        if (this.f3063a == 0) {
            return;
        }
        c1221n.getClass();
        for (int i = 0; i < this.f3063a; i++) {
            int i2 = this.f3064b[i];
            Object obj = this.f3065c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                c1221n.m10891e(i3, ((Integer) obj).intValue());
                            } else {
                                int i5 = C1163c0.f2947a;
                                throw new RuntimeException(new C1163c0.C1164a());
                            }
                        } else {
                            AbstractC1214m abstractC1214m = c1221n.f3057a;
                            abstractC1214m.mo10909Q(i3, 3);
                            ((C1229p1) obj).m10864c(c1221n);
                            abstractC1214m.mo10909Q(i3, 4);
                        }
                    } else {
                        c1221n.m10894b(i3, (AbstractC1183i) obj);
                    }
                } else {
                    c1221n.m10890f(i3, ((Long) obj).longValue());
                }
            } else {
                c1221n.m10886j(i3, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1229p1)) {
            return false;
        }
        C1229p1 c1229p1 = (C1229p1) obj;
        int i = this.f3063a;
        if (i == c1229p1.f3063a) {
            int[] iArr = this.f3064b;
            int[] iArr2 = c1229p1.f3064b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                Object[] objArr = this.f3065c;
                Object[] objArr2 = c1229p1.f3065c;
                int i3 = this.f3063a;
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        }
                        i4++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f3063a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f3064b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f3065c;
        int i7 = this.f3063a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
