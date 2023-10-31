package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C8202b0;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.crypto.tink.shaded.protobuf.m1 */
/* loaded from: classes3.dex */
public final class C8260m1 {

    /* renamed from: f */
    public static final C8260m1 f16049f = new C8260m1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f16050a;

    /* renamed from: b */
    public int[] f16051b;

    /* renamed from: c */
    public Object[] f16052c;

    /* renamed from: d */
    public int f16053d;

    /* renamed from: e */
    public boolean f16054e;

    public C8260m1() {
        this(0, new int[8], new Object[8], true);
    }

    public C8260m1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f16053d = -1;
        this.f16050a = i;
        this.f16051b = iArr;
        this.f16052c = objArr;
        this.f16054e = z;
    }

    /* renamed from: a */
    public final int m3649a() {
        int m3696w;
        int i = this.f16053d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16050a; i3++) {
            int i4 = this.f16051b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                ((Integer) this.f16052c[i3]).intValue();
                                m3696w = AbstractC8253l.m3713f(i5);
                            } else {
                                int i7 = C8202b0.f15951a;
                                throw new IllegalStateException(new C8202b0.C8203a());
                            }
                        } else {
                            i2 = ((C8260m1) this.f16052c[i3]).m3649a() + (AbstractC8253l.m3699t(i5) * 2) + i2;
                        }
                    } else {
                        m3696w = AbstractC8253l.m3716c(i5, (AbstractC8228i) this.f16052c[i3]);
                    }
                } else {
                    ((Long) this.f16052c[i3]).longValue();
                    m3696w = AbstractC8253l.m3712g(i5);
                }
            } else {
                m3696w = AbstractC8253l.m3696w(i5, ((Long) this.f16052c[i3]).longValue());
            }
            i2 = m3696w + i2;
        }
        this.f16053d = i2;
        return i2;
    }

    /* renamed from: b */
    public final void m3648b(int i, Object obj) {
        int i2;
        if (this.f16054e) {
            int i3 = this.f16050a;
            int[] iArr = this.f16051b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f16051b = Arrays.copyOf(iArr, i4);
                this.f16052c = Arrays.copyOf(this.f16052c, i4);
            }
            int[] iArr2 = this.f16051b;
            int i5 = this.f16050a;
            iArr2[i5] = i;
            this.f16052c[i5] = obj;
            this.f16050a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void m3647c(C8258m c8258m) throws IOException {
        if (this.f16050a == 0) {
            return;
        }
        c8258m.getClass();
        for (int i = 0; i < this.f16050a; i++) {
            int i2 = this.f16051b[i];
            Object obj = this.f16052c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                c8258m.m3663e(i3, ((Integer) obj).intValue());
                            } else {
                                int i5 = C8202b0.f15951a;
                                throw new RuntimeException(new C8202b0.C8203a());
                            }
                        } else {
                            AbstractC8253l abstractC8253l = c8258m.f16048a;
                            abstractC8253l.mo3683L(i3, 3);
                            ((C8260m1) obj).m3647c(c8258m);
                            abstractC8253l.mo3683L(i3, 4);
                        }
                    } else {
                        c8258m.m3666b(i3, (AbstractC8228i) obj);
                    }
                } else {
                    c8258m.m3662f(i3, ((Long) obj).longValue());
                }
            } else {
                c8258m.m3658j(i3, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8260m1)) {
            return false;
        }
        C8260m1 c8260m1 = (C8260m1) obj;
        int i = this.f16050a;
        if (i == c8260m1.f16050a) {
            int[] iArr = this.f16051b;
            int[] iArr2 = c8260m1.f16051b;
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
                Object[] objArr = this.f16052c;
                Object[] objArr2 = c8260m1.f16052c;
                int i3 = this.f16050a;
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
        int i = this.f16050a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f16051b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f16052c;
        int i7 = this.f16050a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
