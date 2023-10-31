package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* renamed from: com.google.android.exoplayer2.source.g0 */
/* loaded from: classes.dex */
public interface InterfaceC7167g0 {

    /* renamed from: com.google.android.exoplayer2.source.g0$a */
    /* loaded from: classes.dex */
    public static class C7168a implements InterfaceC7167g0 {

        /* renamed from: a */
        public final Random f12869a;

        /* renamed from: b */
        public final int[] f12870b;

        /* renamed from: c */
        public final int[] f12871c;

        public C7168a() {
            this(new Random());
        }

        public C7168a(Random random) {
            this(new int[0], random);
        }

        public C7168a(int[] iArr, Random random) {
            this.f12870b = iArr;
            this.f12869a = random;
            this.f12871c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f12871c[iArr[i]] = i;
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7167g0
        /* renamed from: a */
        public final int mo5432a() {
            int[] iArr = this.f12870b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7167g0
        /* renamed from: b */
        public final C7168a mo5431b(int i) {
            int i2 = i + 0;
            int[] iArr = this.f12870b;
            int[] iArr2 = new int[iArr.length - i2];
            int i3 = 0;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 < 0 || i5 >= i) {
                    int i6 = i4 - i3;
                    if (i5 >= 0) {
                        i5 -= i2;
                    }
                    iArr2[i6] = i5;
                } else {
                    i3++;
                }
            }
            return new C7168a(iArr2, new Random(this.f12869a.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7167g0
        /* renamed from: c */
        public final int mo5430c(int i) {
            int i2 = this.f12871c[i] - 1;
            if (i2 >= 0) {
                return this.f12870b[i2];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7167g0
        /* renamed from: d */
        public final int mo5429d(int i) {
            int i2 = this.f12871c[i] + 1;
            int[] iArr = this.f12870b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7167g0
        /* renamed from: e */
        public final C7168a mo5428e(int i) {
            Random random;
            int[] iArr;
            int[] iArr2 = new int[i];
            int[] iArr3 = new int[i];
            int i2 = 0;
            while (true) {
                random = this.f12869a;
                iArr = this.f12870b;
                if (i2 >= i) {
                    break;
                }
                iArr2[i2] = random.nextInt(iArr.length + 1);
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr3[i2] = iArr3[nextInt];
                iArr3[nextInt] = i2 + 0;
                i2 = i3;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iArr.length + i; i6++) {
                if (i4 >= i || i5 != iArr2[i4]) {
                    int i7 = i5 + 1;
                    int i8 = iArr[i5];
                    iArr4[i6] = i8;
                    if (i8 >= 0) {
                        iArr4[i6] = i8 + i;
                    }
                    i5 = i7;
                } else {
                    iArr4[i6] = iArr3[i4];
                    i4++;
                }
            }
            return new C7168a(iArr4, new Random(random.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7167g0
        /* renamed from: f */
        public final int mo5427f() {
            int[] iArr = this.f12870b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7167g0
        /* renamed from: g */
        public final C7168a mo5426g() {
            return new C7168a(new Random(this.f12869a.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC7167g0
        public final int getLength() {
            return this.f12870b.length;
        }
    }

    /* renamed from: a */
    int mo5432a();

    /* renamed from: b */
    C7168a mo5431b(int i);

    /* renamed from: c */
    int mo5430c(int i);

    /* renamed from: d */
    int mo5429d(int i);

    /* renamed from: e */
    C7168a mo5428e(int i);

    /* renamed from: f */
    int mo5427f();

    /* renamed from: g */
    C7168a mo5426g();

    int getLength();
}
