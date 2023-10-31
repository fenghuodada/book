package androidx.datastore.preferences.protobuf;

import androidx.constraintlayout.motion.widget.C0552c;
import androidx.datastore.core.C1107q;
import androidx.datastore.preferences.protobuf.C1250t1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.m */
/* loaded from: classes.dex */
public abstract class AbstractC1214m extends AbstractC1177g {

    /* renamed from: b */
    public static final Logger f3045b = Logger.getLogger(AbstractC1214m.class.getName());

    /* renamed from: c */
    public static final boolean f3046c = C1242s1.f3082f;

    /* renamed from: a */
    public C1221n f3047a;

    /* renamed from: androidx.datastore.preferences.protobuf.m$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1215a extends AbstractC1214m {

        /* renamed from: d */
        public final byte[] f3048d;

        /* renamed from: e */
        public final int f3049e;

        /* renamed from: f */
        public int f3050f;

        public AbstractC1215a(int i) {
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f3048d = bArr;
                this.f3049e = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* renamed from: V */
        public final void m10931V(int i) {
            int i2 = this.f3050f;
            int i3 = i2 + 1;
            byte[] bArr = this.f3048d;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f3050f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        /* renamed from: W */
        public final void m10930W(long j) {
            int i = this.f3050f;
            int i2 = i + 1;
            byte[] bArr = this.f3048d;
            bArr[i] = (byte) (j & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f3050f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        }

        /* renamed from: X */
        public final void m10929X(int i, int i2) {
            m10928Y((i << 3) | i2);
        }

        /* renamed from: Y */
        public final void m10928Y(int i) {
            boolean z = AbstractC1214m.f3046c;
            byte[] bArr = this.f3048d;
            if (z) {
                while ((i & (-128)) != 0) {
                    int i2 = this.f3050f;
                    this.f3050f = i2 + 1;
                    C1242s1.m10821p(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                int i3 = this.f3050f;
                this.f3050f = i3 + 1;
                C1242s1.m10821p(bArr, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                int i4 = this.f3050f;
                this.f3050f = i4 + 1;
                bArr[i4] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            int i5 = this.f3050f;
            this.f3050f = i5 + 1;
            bArr[i5] = (byte) i;
        }

        /* renamed from: Z */
        public final void m10927Z(long j) {
            boolean z = AbstractC1214m.f3046c;
            byte[] bArr = this.f3048d;
            if (z) {
                while ((j & (-128)) != 0) {
                    int i = this.f3050f;
                    this.f3050f = i + 1;
                    C1242s1.m10821p(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i2 = this.f3050f;
                this.f3050f = i2 + 1;
                C1242s1.m10821p(bArr, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                int i3 = this.f3050f;
                this.f3050f = i3 + 1;
                bArr[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            int i4 = this.f3050f;
            this.f3050f = i4 + 1;
            bArr[i4] = (byte) j;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.m$b */
    /* loaded from: classes.dex */
    public static class C1216b extends AbstractC1214m {

        /* renamed from: d */
        public final byte[] f3051d;

        /* renamed from: e */
        public final int f3052e;

        /* renamed from: f */
        public int f3053f;

        public C1216b(byte[] bArr, int i) {
            int i2 = 0 + i;
            if ((0 | i | (bArr.length - i2)) >= 0) {
                this.f3051d = bArr;
                this.f3053f = 0;
                this.f3052e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: A */
        public final void mo10925A(int i, boolean z) throws IOException {
            mo10909Q(i, 0);
            mo10900z(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: B */
        public final void mo10924B(byte[] bArr, int i) throws IOException {
            mo10907S(i);
            m10926V(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: C */
        public final void mo10923C(int i, AbstractC1183i abstractC1183i) throws IOException {
            mo10909Q(i, 2);
            mo10922D(abstractC1183i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: D */
        public final void mo10922D(AbstractC1183i abstractC1183i) throws IOException {
            mo10907S(abstractC1183i.size());
            abstractC1183i.mo11114o(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: E */
        public final void mo10921E(int i, int i2) throws IOException {
            mo10909Q(i, 5);
            mo10920F(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: F */
        public final void mo10920F(int i) throws IOException {
            try {
                byte[] bArr = this.f3051d;
                int i2 = this.f3053f;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f3053f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C1217c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3053f), Integer.valueOf(this.f3052e), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: G */
        public final void mo10919G(int i, long j) throws IOException {
            mo10909Q(i, 1);
            mo10918H(j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: H */
        public final void mo10918H(long j) throws IOException {
            try {
                byte[] bArr = this.f3051d;
                int i = this.f3053f;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f3053f = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C1217c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3053f), Integer.valueOf(this.f3052e), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: I */
        public final void mo10917I(int i, int i2) throws IOException {
            mo10909Q(i, 0);
            mo10916J(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: J */
        public final void mo10916J(int i) throws IOException {
            if (i >= 0) {
                mo10907S(i);
            } else {
                mo10905U(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: K */
        public final void mo10915K(int i, InterfaceC1240s0 interfaceC1240s0, InterfaceC1182h1 interfaceC1182h1) throws IOException {
            mo10909Q(i, 2);
            mo10907S(((AbstractC1152a) interfaceC1240s0).m11150h(interfaceC1182h1));
            interfaceC1182h1.mo10723i(interfaceC1240s0, this.f3047a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: L */
        public final void mo10914L(InterfaceC1240s0 interfaceC1240s0) throws IOException {
            mo10907S(interfaceC1240s0.mo10715c());
            interfaceC1240s0.mo10713f(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: M */
        public final void mo10913M(int i, InterfaceC1240s0 interfaceC1240s0) throws IOException {
            mo10909Q(1, 3);
            mo10908R(2, i);
            mo10909Q(3, 2);
            mo10914L(interfaceC1240s0);
            mo10909Q(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: N */
        public final void mo10912N(int i, AbstractC1183i abstractC1183i) throws IOException {
            mo10909Q(1, 3);
            mo10908R(2, i);
            mo10923C(3, abstractC1183i);
            mo10909Q(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: O */
        public final void mo10911O(int i, String str) throws IOException {
            mo10909Q(i, 2);
            mo10910P(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: P */
        public final void mo10910P(String str) throws IOException {
            int mo10780b;
            int i = this.f3053f;
            try {
                int m10935v = AbstractC1214m.m10935v(str.length() * 3);
                int m10935v2 = AbstractC1214m.m10935v(str.length());
                int i2 = this.f3052e;
                byte[] bArr = this.f3051d;
                if (m10935v2 == m10935v) {
                    int i3 = i + m10935v2;
                    this.f3053f = i3;
                    mo10780b = C1250t1.f3086a.mo10780b(str, bArr, i3, i2 - i3);
                    this.f3053f = i;
                    mo10907S((mo10780b - i) - m10935v2);
                } else {
                    mo10907S(C1250t1.m10787a(str));
                    int i4 = this.f3053f;
                    mo10780b = C1250t1.f3086a.mo10780b(str, bArr, i4, i2 - i4);
                }
                this.f3053f = mo10780b;
            } catch (C1250t1.C1254d e) {
                this.f3053f = i;
                m10932y(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C1217c(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: Q */
        public final void mo10909Q(int i, int i2) throws IOException {
            mo10907S((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: R */
        public final void mo10908R(int i, int i2) throws IOException {
            mo10909Q(i, 0);
            mo10907S(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: S */
        public final void mo10907S(int i) throws IOException {
            boolean z = AbstractC1214m.f3046c;
            int i2 = this.f3052e;
            byte[] bArr = this.f3051d;
            if (z && !C1166d.m11133a()) {
                int i3 = this.f3053f;
                if (i2 - i3 >= 5) {
                    if ((i & (-128)) != 0) {
                        this.f3053f = i3 + 1;
                        C1242s1.m10821p(bArr, i3, (byte) (i | 128));
                        i >>>= 7;
                        if ((i & (-128)) != 0) {
                            int i4 = this.f3053f;
                            this.f3053f = i4 + 1;
                            C1242s1.m10821p(bArr, i4, (byte) (i | 128));
                            i >>>= 7;
                            if ((i & (-128)) != 0) {
                                int i5 = this.f3053f;
                                this.f3053f = i5 + 1;
                                C1242s1.m10821p(bArr, i5, (byte) (i | 128));
                                i >>>= 7;
                                if ((i & (-128)) != 0) {
                                    int i6 = this.f3053f;
                                    this.f3053f = i6 + 1;
                                    C1242s1.m10821p(bArr, i6, (byte) (i | 128));
                                    i >>>= 7;
                                    i3 = this.f3053f;
                                }
                            }
                        }
                        i3 = this.f3053f;
                    }
                    this.f3053f = i3 + 1;
                    C1242s1.m10821p(bArr, i3, (byte) i);
                    return;
                }
            }
            while ((i & (-128)) != 0) {
                try {
                    int i7 = this.f3053f;
                    this.f3053f = i7 + 1;
                    bArr[i7] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C1217c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3053f), Integer.valueOf(i2), 1), e);
                }
            }
            int i8 = this.f3053f;
            this.f3053f = i8 + 1;
            bArr[i8] = (byte) i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: T */
        public final void mo10906T(int i, long j) throws IOException {
            mo10909Q(i, 0);
            mo10905U(j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: U */
        public final void mo10905U(long j) throws IOException {
            boolean z = AbstractC1214m.f3046c;
            int i = this.f3052e;
            byte[] bArr = this.f3051d;
            if (z && i - this.f3053f >= 10) {
                while ((j & (-128)) != 0) {
                    int i2 = this.f3053f;
                    this.f3053f = i2 + 1;
                    C1242s1.m10821p(bArr, i2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i3 = this.f3053f;
                this.f3053f = i3 + 1;
                C1242s1.m10821p(bArr, i3, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i4 = this.f3053f;
                    this.f3053f = i4 + 1;
                    bArr[i4] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C1217c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3053f), Integer.valueOf(i), 1), e);
                }
            }
            int i5 = this.f3053f;
            this.f3053f = i5 + 1;
            bArr[i5] = (byte) j;
        }

        /* renamed from: V */
        public final void m10926V(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f3051d, this.f3053f, i2);
                this.f3053f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C1217c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3053f), Integer.valueOf(this.f3052e), Integer.valueOf(i2)), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1177g
        /* renamed from: a */
        public final void mo10904a(int i, byte[] bArr, int i2) throws IOException {
            m10926V(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: z */
        public final void mo10900z(byte b) throws IOException {
            try {
                byte[] bArr = this.f3051d;
                int i = this.f3053f;
                this.f3053f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C1217c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3053f), Integer.valueOf(this.f3052e), 1), e);
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.m$c */
    /* loaded from: classes.dex */
    public static class C1217c extends IOException {
        public C1217c(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public C1217c(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(C0552c.m12192b("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.m$d */
    /* loaded from: classes.dex */
    public static final class C1218d extends AbstractC1215a {

        /* renamed from: g */
        public final OutputStream f3054g;

        public C1218d(C1107q.C1111b c1111b, int i) {
            super(i);
            this.f3054g = c1111b;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: A */
        public final void mo10925A(int i, boolean z) throws IOException {
            m10902b0(11);
            m10929X(i, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            int i2 = this.f3050f;
            this.f3050f = i2 + 1;
            this.f3048d[i2] = b;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: B */
        public final void mo10924B(byte[] bArr, int i) throws IOException {
            mo10907S(i);
            m10901c0(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: C */
        public final void mo10923C(int i, AbstractC1183i abstractC1183i) throws IOException {
            mo10909Q(i, 2);
            mo10922D(abstractC1183i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: D */
        public final void mo10922D(AbstractC1183i abstractC1183i) throws IOException {
            mo10907S(abstractC1183i.size());
            abstractC1183i.mo11114o(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: E */
        public final void mo10921E(int i, int i2) throws IOException {
            m10902b0(14);
            m10929X(i, 5);
            m10931V(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: F */
        public final void mo10920F(int i) throws IOException {
            m10902b0(4);
            m10931V(i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: G */
        public final void mo10919G(int i, long j) throws IOException {
            m10902b0(18);
            m10929X(i, 1);
            m10930W(j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: H */
        public final void mo10918H(long j) throws IOException {
            m10902b0(8);
            m10930W(j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: I */
        public final void mo10917I(int i, int i2) throws IOException {
            m10902b0(20);
            m10929X(i, 0);
            if (i2 >= 0) {
                m10928Y(i2);
            } else {
                m10927Z(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: J */
        public final void mo10916J(int i) throws IOException {
            if (i >= 0) {
                mo10907S(i);
            } else {
                mo10905U(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: K */
        public final void mo10915K(int i, InterfaceC1240s0 interfaceC1240s0, InterfaceC1182h1 interfaceC1182h1) throws IOException {
            mo10909Q(i, 2);
            mo10907S(((AbstractC1152a) interfaceC1240s0).m11150h(interfaceC1182h1));
            interfaceC1182h1.mo10723i(interfaceC1240s0, this.f3047a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: L */
        public final void mo10914L(InterfaceC1240s0 interfaceC1240s0) throws IOException {
            mo10907S(interfaceC1240s0.mo10715c());
            interfaceC1240s0.mo10713f(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: M */
        public final void mo10913M(int i, InterfaceC1240s0 interfaceC1240s0) throws IOException {
            mo10909Q(1, 3);
            mo10908R(2, i);
            mo10909Q(3, 2);
            mo10914L(interfaceC1240s0);
            mo10909Q(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: N */
        public final void mo10912N(int i, AbstractC1183i abstractC1183i) throws IOException {
            mo10909Q(1, 3);
            mo10908R(2, i);
            mo10923C(3, abstractC1183i);
            mo10909Q(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: O */
        public final void mo10911O(int i, String str) throws IOException {
            mo10909Q(i, 2);
            mo10910P(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: P */
        public final void mo10910P(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int m10935v = AbstractC1214m.m10935v(length);
                int i = m10935v + length;
                int i2 = this.f3049e;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int mo10780b = C1250t1.f3086a.mo10780b(str, bArr, 0, length);
                    mo10907S(mo10780b);
                    m10901c0(bArr, 0, mo10780b);
                    return;
                }
                if (i > i2 - this.f3050f) {
                    m10903a0();
                }
                int m10935v2 = AbstractC1214m.m10935v(str.length());
                int i3 = this.f3050f;
                byte[] bArr2 = this.f3048d;
                try {
                    if (m10935v2 == m10935v) {
                        int i4 = i3 + m10935v2;
                        this.f3050f = i4;
                        int mo10780b2 = C1250t1.f3086a.mo10780b(str, bArr2, i4, i2 - i4);
                        this.f3050f = i3;
                        m10928Y((mo10780b2 - i3) - m10935v2);
                        this.f3050f = mo10780b2;
                    } else {
                        int m10787a = C1250t1.m10787a(str);
                        m10928Y(m10787a);
                        this.f3050f = C1250t1.f3086a.mo10780b(str, bArr2, this.f3050f, m10787a);
                    }
                } catch (C1250t1.C1254d e) {
                    this.f3050f = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new C1217c(e2);
                }
            } catch (C1250t1.C1254d e3) {
                m10932y(str, e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: Q */
        public final void mo10909Q(int i, int i2) throws IOException {
            mo10907S((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: R */
        public final void mo10908R(int i, int i2) throws IOException {
            m10902b0(20);
            m10929X(i, 0);
            m10928Y(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: S */
        public final void mo10907S(int i) throws IOException {
            m10902b0(5);
            m10928Y(i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: T */
        public final void mo10906T(int i, long j) throws IOException {
            m10902b0(20);
            m10929X(i, 0);
            m10927Z(j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: U */
        public final void mo10905U(long j) throws IOException {
            m10902b0(10);
            m10927Z(j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1177g
        /* renamed from: a */
        public final void mo10904a(int i, byte[] bArr, int i2) throws IOException {
            m10901c0(bArr, i, i2);
        }

        /* renamed from: a0 */
        public final void m10903a0() throws IOException {
            this.f3054g.write(this.f3048d, 0, this.f3050f);
            this.f3050f = 0;
        }

        /* renamed from: b0 */
        public final void m10902b0(int i) throws IOException {
            if (this.f3049e - this.f3050f < i) {
                m10903a0();
            }
        }

        /* renamed from: c0 */
        public final void m10901c0(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f3050f;
            int i4 = this.f3049e;
            int i5 = i4 - i3;
            byte[] bArr2 = this.f3048d;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f3050f += i2;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f3050f = i4;
            m10903a0();
            if (i7 > i4) {
                this.f3054g.write(bArr, i6, i7);
                return;
            }
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f3050f = i7;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1214m
        /* renamed from: z */
        public final void mo10900z(byte b) throws IOException {
            if (this.f3050f == this.f3049e) {
                m10903a0();
            }
            int i = this.f3050f;
            this.f3050f = i + 1;
            this.f3048d[i] = b;
        }
    }

    /* renamed from: b */
    public static int m10955b(int i) {
        return m10937t(i) + 1;
    }

    /* renamed from: c */
    public static int m10954c(int i, AbstractC1183i abstractC1183i) {
        int m10937t = m10937t(i);
        int size = abstractC1183i.size();
        return m10935v(size) + size + m10937t;
    }

    /* renamed from: d */
    public static int m10953d(int i) {
        return m10937t(i) + 8;
    }

    /* renamed from: e */
    public static int m10952e(int i, int i2) {
        return m10946k(i2) + m10937t(i);
    }

    /* renamed from: f */
    public static int m10951f(int i) {
        return m10937t(i) + 4;
    }

    /* renamed from: g */
    public static int m10950g(int i) {
        return m10937t(i) + 8;
    }

    /* renamed from: h */
    public static int m10949h(int i) {
        return m10937t(i) + 4;
    }

    @Deprecated
    /* renamed from: i */
    public static int m10948i(int i, InterfaceC1240s0 interfaceC1240s0, InterfaceC1182h1 interfaceC1182h1) {
        return ((AbstractC1152a) interfaceC1240s0).m11150h(interfaceC1182h1) + (m10937t(i) * 2);
    }

    /* renamed from: j */
    public static int m10947j(int i, int i2) {
        return m10946k(i2) + m10937t(i);
    }

    /* renamed from: k */
    public static int m10946k(int i) {
        if (i >= 0) {
            return m10935v(i);
        }
        return 10;
    }

    /* renamed from: l */
    public static int m10945l(int i, long j) {
        return m10933x(j) + m10937t(i);
    }

    /* renamed from: m */
    public static int m10944m(C1175f0 c1175f0) {
        int i;
        if (c1175f0.f2973b != null) {
            i = c1175f0.f2973b.size();
        } else if (c1175f0.f2972a != null) {
            i = c1175f0.f2972a.mo10715c();
        } else {
            i = 0;
        }
        return m10935v(i) + i;
    }

    /* renamed from: n */
    public static int m10943n(int i) {
        return m10937t(i) + 4;
    }

    /* renamed from: o */
    public static int m10942o(int i) {
        return m10937t(i) + 8;
    }

    /* renamed from: p */
    public static int m10941p(int i, int i2) {
        return m10935v((i2 >> 31) ^ (i2 << 1)) + m10937t(i);
    }

    /* renamed from: q */
    public static int m10940q(int i, long j) {
        return m10933x((j >> 63) ^ (j << 1)) + m10937t(i);
    }

    /* renamed from: r */
    public static int m10939r(int i, String str) {
        return m10938s(str) + m10937t(i);
    }

    /* renamed from: s */
    public static int m10938s(String str) {
        int length;
        try {
            length = C1250t1.m10787a(str);
        } catch (C1250t1.C1254d unused) {
            length = str.getBytes(C1157b0.f2944a).length;
        }
        return m10935v(length) + length;
    }

    /* renamed from: t */
    public static int m10937t(int i) {
        return m10935v((i << 3) | 0);
    }

    /* renamed from: u */
    public static int m10936u(int i, int i2) {
        return m10935v(i2) + m10937t(i);
    }

    /* renamed from: v */
    public static int m10935v(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: w */
    public static int m10934w(int i, long j) {
        return m10933x(j) + m10937t(i);
    }

    /* renamed from: x */
    public static int m10933x(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: A */
    public abstract void mo10925A(int i, boolean z) throws IOException;

    /* renamed from: B */
    public abstract void mo10924B(byte[] bArr, int i) throws IOException;

    /* renamed from: C */
    public abstract void mo10923C(int i, AbstractC1183i abstractC1183i) throws IOException;

    /* renamed from: D */
    public abstract void mo10922D(AbstractC1183i abstractC1183i) throws IOException;

    /* renamed from: E */
    public abstract void mo10921E(int i, int i2) throws IOException;

    /* renamed from: F */
    public abstract void mo10920F(int i) throws IOException;

    /* renamed from: G */
    public abstract void mo10919G(int i, long j) throws IOException;

    /* renamed from: H */
    public abstract void mo10918H(long j) throws IOException;

    /* renamed from: I */
    public abstract void mo10917I(int i, int i2) throws IOException;

    /* renamed from: J */
    public abstract void mo10916J(int i) throws IOException;

    /* renamed from: K */
    public abstract void mo10915K(int i, InterfaceC1240s0 interfaceC1240s0, InterfaceC1182h1 interfaceC1182h1) throws IOException;

    /* renamed from: L */
    public abstract void mo10914L(InterfaceC1240s0 interfaceC1240s0) throws IOException;

    /* renamed from: M */
    public abstract void mo10913M(int i, InterfaceC1240s0 interfaceC1240s0) throws IOException;

    /* renamed from: N */
    public abstract void mo10912N(int i, AbstractC1183i abstractC1183i) throws IOException;

    /* renamed from: O */
    public abstract void mo10911O(int i, String str) throws IOException;

    /* renamed from: P */
    public abstract void mo10910P(String str) throws IOException;

    /* renamed from: Q */
    public abstract void mo10909Q(int i, int i2) throws IOException;

    /* renamed from: R */
    public abstract void mo10908R(int i, int i2) throws IOException;

    /* renamed from: S */
    public abstract void mo10907S(int i) throws IOException;

    /* renamed from: T */
    public abstract void mo10906T(int i, long j) throws IOException;

    /* renamed from: U */
    public abstract void mo10905U(long j) throws IOException;

    /* renamed from: y */
    public final void m10932y(String str, C1250t1.C1254d c1254d) throws IOException {
        f3045b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c1254d);
        byte[] bytes = str.getBytes(C1157b0.f2944a);
        try {
            mo10907S(bytes.length);
            mo10904a(0, bytes, bytes.length);
        } catch (C1217c e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new C1217c(e2);
        }
    }

    /* renamed from: z */
    public abstract void mo10900z(byte b) throws IOException;
}
