package com.google.crypto.tink.shaded.protobuf;

import androidx.constraintlayout.motion.widget.C0552c;
import com.google.crypto.tink.shaded.protobuf.C8280q1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l */
/* loaded from: classes3.dex */
public abstract class AbstractC8253l extends AbstractC8220g {

    /* renamed from: b */
    public static final Logger f16040b = Logger.getLogger(AbstractC8253l.class.getName());

    /* renamed from: c */
    public static final boolean f16041c = C8271p1.f16068f;

    /* renamed from: a */
    public C8258m f16042a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l$a */
    /* loaded from: classes3.dex */
    public static class C8254a extends AbstractC8253l {

        /* renamed from: d */
        public final byte[] f16043d;

        /* renamed from: e */
        public final int f16044e;

        /* renamed from: f */
        public int f16045f;

        public C8254a(byte[] bArr, int i) {
            int i2 = 0 + i;
            if ((0 | i | (bArr.length - i2)) >= 0) {
                this.f16043d = bArr;
                this.f16045f = 0;
                this.f16044e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: A */
        public final void mo3694A(int i, AbstractC8228i abstractC8228i) throws IOException {
            mo3683L(i, 2);
            m3676S(abstractC8228i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: B */
        public final void mo3693B(int i, int i2) throws IOException {
            mo3683L(i, 5);
            mo3692C(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: C */
        public final void mo3692C(int i) throws IOException {
            try {
                byte[] bArr = this.f16043d;
                int i2 = this.f16045f;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f16045f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C8255b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16045f), Integer.valueOf(this.f16044e), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: D */
        public final void mo3691D(int i, long j) throws IOException {
            mo3683L(i, 1);
            mo3690E(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: E */
        public final void mo3690E(long j) throws IOException {
            try {
                byte[] bArr = this.f16043d;
                int i = this.f16045f;
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
                this.f16045f = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C8255b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16045f), Integer.valueOf(this.f16044e), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: F */
        public final void mo3689F(int i, int i2) throws IOException {
            mo3683L(i, 0);
            mo3688G(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: G */
        public final void mo3688G(int i) throws IOException {
            if (i >= 0) {
                mo3681N(i);
            } else {
                mo3679P(i);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: H */
        public final void mo3687H(int i, InterfaceC8287r0 interfaceC8287r0, InterfaceC8219f1 interfaceC8219f1) throws IOException {
            mo3683L(i, 2);
            AbstractC8194a abstractC8194a = (AbstractC8194a) interfaceC8287r0;
            int mo3476e = abstractC8194a.mo3476e();
            if (mo3476e == -1) {
                mo3476e = interfaceC8219f1.mo3490e(abstractC8194a);
                abstractC8194a.mo3473j(mo3476e);
            }
            mo3681N(mo3476e);
            interfaceC8219f1.mo3487h(interfaceC8287r0, this.f16042a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: I */
        public final void mo3686I(int i, InterfaceC8287r0 interfaceC8287r0) throws IOException {
            mo3683L(1, 3);
            mo3682M(2, i);
            mo3683L(3, 2);
            m3675T(interfaceC8287r0);
            mo3683L(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: J */
        public final void mo3685J(int i, AbstractC8228i abstractC8228i) throws IOException {
            mo3683L(1, 3);
            mo3682M(2, i);
            mo3694A(3, abstractC8228i);
            mo3683L(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: K */
        public final void mo3684K(int i, String str) throws IOException {
            mo3683L(i, 2);
            m3674U(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: L */
        public final void mo3683L(int i, int i2) throws IOException {
            mo3681N((i << 3) | i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: M */
        public final void mo3682M(int i, int i2) throws IOException {
            mo3683L(i, 0);
            mo3681N(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: N */
        public final void mo3681N(int i) throws IOException {
            boolean z = AbstractC8253l.f16041c;
            int i2 = this.f16044e;
            byte[] bArr = this.f16043d;
            if (z && !C8208d.m3919a()) {
                int i3 = this.f16045f;
                if (i2 - i3 >= 5) {
                    if ((i & (-128)) != 0) {
                        this.f16045f = i3 + 1;
                        C8271p1.m3595q(bArr, i3, (byte) (i | 128));
                        i >>>= 7;
                        if ((i & (-128)) != 0) {
                            int i4 = this.f16045f;
                            this.f16045f = i4 + 1;
                            C8271p1.m3595q(bArr, i4, (byte) (i | 128));
                            i >>>= 7;
                            if ((i & (-128)) != 0) {
                                int i5 = this.f16045f;
                                this.f16045f = i5 + 1;
                                C8271p1.m3595q(bArr, i5, (byte) (i | 128));
                                i >>>= 7;
                                if ((i & (-128)) != 0) {
                                    int i6 = this.f16045f;
                                    this.f16045f = i6 + 1;
                                    C8271p1.m3595q(bArr, i6, (byte) (i | 128));
                                    i >>>= 7;
                                    i3 = this.f16045f;
                                }
                            }
                        }
                        i3 = this.f16045f;
                    }
                    this.f16045f = i3 + 1;
                    C8271p1.m3595q(bArr, i3, (byte) i);
                    return;
                }
            }
            while ((i & (-128)) != 0) {
                try {
                    int i7 = this.f16045f;
                    this.f16045f = i7 + 1;
                    bArr[i7] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C8255b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16045f), Integer.valueOf(i2), 1), e);
                }
            }
            int i8 = this.f16045f;
            this.f16045f = i8 + 1;
            bArr[i8] = (byte) i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: O */
        public final void mo3680O(int i, long j) throws IOException {
            mo3683L(i, 0);
            mo3679P(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: P */
        public final void mo3679P(long j) throws IOException {
            boolean z = AbstractC8253l.f16041c;
            int i = this.f16044e;
            byte[] bArr = this.f16043d;
            if (z && i - this.f16045f >= 10) {
                while ((j & (-128)) != 0) {
                    int i2 = this.f16045f;
                    this.f16045f = i2 + 1;
                    C8271p1.m3595q(bArr, i2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i3 = this.f16045f;
                this.f16045f = i3 + 1;
                C8271p1.m3595q(bArr, i3, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i4 = this.f16045f;
                    this.f16045f = i4 + 1;
                    bArr[i4] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C8255b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16045f), Integer.valueOf(i), 1), e);
                }
            }
            int i5 = this.f16045f;
            this.f16045f = i5 + 1;
            bArr[i5] = (byte) j;
        }

        /* renamed from: Q */
        public final int m3678Q() {
            return this.f16044e - this.f16045f;
        }

        /* renamed from: R */
        public final void m3677R(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f16043d, this.f16045f, i2);
                this.f16045f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C8255b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16045f), Integer.valueOf(this.f16044e), Integer.valueOf(i2)), e);
            }
        }

        /* renamed from: S */
        public final void m3676S(AbstractC8228i abstractC8228i) throws IOException {
            mo3681N(abstractC8228i.size());
            abstractC8228i.mo3811t(this);
        }

        /* renamed from: T */
        public final void m3675T(InterfaceC8287r0 interfaceC8287r0) throws IOException {
            mo3681N(interfaceC8287r0.mo3478c());
            interfaceC8287r0.mo3477d(this);
        }

        /* renamed from: U */
        public final void m3674U(String str) throws IOException {
            int mo3560b;
            int i = this.f16045f;
            try {
                int m3697v = AbstractC8253l.m3697v(str.length() * 3);
                int m3697v2 = AbstractC8253l.m3697v(str.length());
                int i2 = this.f16044e;
                byte[] bArr = this.f16043d;
                if (m3697v2 == m3697v) {
                    int i3 = i + m3697v2;
                    this.f16045f = i3;
                    mo3560b = C8280q1.f16077a.mo3560b(str, bArr, i3, i2 - i3);
                    this.f16045f = i;
                    mo3681N((mo3560b - i) - m3697v2);
                } else {
                    mo3681N(C8280q1.m3568a(str));
                    int i4 = this.f16045f;
                    mo3560b = C8280q1.f16077a.mo3560b(str, bArr, i4, i2 - i4);
                }
                this.f16045f = mo3560b;
            } catch (C8280q1.C8284d e) {
                this.f16045f = i;
                AbstractC8253l.f16040b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                byte[] bytes = str.getBytes(C8196a0.f15949a);
                try {
                    mo3681N(bytes.length);
                    m3677R(bytes, 0, bytes.length);
                } catch (C8255b e2) {
                    throw e2;
                } catch (IndexOutOfBoundsException e3) {
                    throw new C8255b(e3);
                }
            } catch (IndexOutOfBoundsException e4) {
                throw new C8255b(e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8220g
        /* renamed from: a */
        public final void mo3673a(int i, byte[] bArr, int i2) throws IOException {
            m3677R(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: y */
        public final void mo3672y(byte b) throws IOException {
            try {
                byte[] bArr = this.f16043d;
                int i = this.f16045f;
                this.f16045f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C8255b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16045f), Integer.valueOf(this.f16044e), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8253l
        /* renamed from: z */
        public final void mo3671z(int i, boolean z) throws IOException {
            mo3683L(i, 0);
            mo3672y(z ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l$b */
    /* loaded from: classes3.dex */
    public static class C8255b extends IOException {
        public C8255b(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public C8255b(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(C0552c.m12192b("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }
    }

    /* renamed from: b */
    public static int m3717b(int i) {
        return m3699t(i) + 1;
    }

    /* renamed from: c */
    public static int m3716c(int i, AbstractC8228i abstractC8228i) {
        int m3699t = m3699t(i);
        int size = abstractC8228i.size();
        return m3697v(size) + size + m3699t;
    }

    /* renamed from: d */
    public static int m3715d(int i) {
        return m3699t(i) + 8;
    }

    /* renamed from: e */
    public static int m3714e(int i, int i2) {
        return m3708k(i2) + m3699t(i);
    }

    /* renamed from: f */
    public static int m3713f(int i) {
        return m3699t(i) + 4;
    }

    /* renamed from: g */
    public static int m3712g(int i) {
        return m3699t(i) + 8;
    }

    /* renamed from: h */
    public static int m3711h(int i) {
        return m3699t(i) + 4;
    }

    @Deprecated
    /* renamed from: i */
    public static int m3710i(int i, InterfaceC8287r0 interfaceC8287r0, InterfaceC8219f1 interfaceC8219f1) {
        int m3699t = m3699t(i) * 2;
        AbstractC8194a abstractC8194a = (AbstractC8194a) interfaceC8287r0;
        int mo3476e = abstractC8194a.mo3476e();
        if (mo3476e == -1) {
            mo3476e = interfaceC8219f1.mo3490e(abstractC8194a);
            abstractC8194a.mo3473j(mo3476e);
        }
        return mo3476e + m3699t;
    }

    /* renamed from: j */
    public static int m3709j(int i, int i2) {
        return m3708k(i2) + m3699t(i);
    }

    /* renamed from: k */
    public static int m3708k(int i) {
        if (i >= 0) {
            return m3697v(i);
        }
        return 10;
    }

    /* renamed from: l */
    public static int m3707l(int i, long j) {
        return m3695x(j) + m3699t(i);
    }

    /* renamed from: m */
    public static int m3706m(C8215e0 c8215e0) {
        int i;
        if (c8215e0.f15984b != null) {
            i = c8215e0.f15984b.size();
        } else if (c8215e0.f15983a != null) {
            i = c8215e0.f15983a.mo3478c();
        } else {
            i = 0;
        }
        return m3697v(i) + i;
    }

    /* renamed from: n */
    public static int m3705n(int i) {
        return m3699t(i) + 4;
    }

    /* renamed from: o */
    public static int m3704o(int i) {
        return m3699t(i) + 8;
    }

    /* renamed from: p */
    public static int m3703p(int i, int i2) {
        return m3697v((i2 >> 31) ^ (i2 << 1)) + m3699t(i);
    }

    /* renamed from: q */
    public static int m3702q(int i, long j) {
        return m3695x((j >> 63) ^ (j << 1)) + m3699t(i);
    }

    /* renamed from: r */
    public static int m3701r(int i, String str) {
        return m3700s(str) + m3699t(i);
    }

    /* renamed from: s */
    public static int m3700s(String str) {
        int length;
        try {
            length = C8280q1.m3568a(str);
        } catch (C8280q1.C8284d unused) {
            length = str.getBytes(C8196a0.f15949a).length;
        }
        return m3697v(length) + length;
    }

    /* renamed from: t */
    public static int m3699t(int i) {
        return m3697v((i << 3) | 0);
    }

    /* renamed from: u */
    public static int m3698u(int i, int i2) {
        return m3697v(i2) + m3699t(i);
    }

    /* renamed from: v */
    public static int m3697v(int i) {
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
    public static int m3696w(int i, long j) {
        return m3695x(j) + m3699t(i);
    }

    /* renamed from: x */
    public static int m3695x(long j) {
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
    public abstract void mo3694A(int i, AbstractC8228i abstractC8228i) throws IOException;

    /* renamed from: B */
    public abstract void mo3693B(int i, int i2) throws IOException;

    /* renamed from: C */
    public abstract void mo3692C(int i) throws IOException;

    /* renamed from: D */
    public abstract void mo3691D(int i, long j) throws IOException;

    /* renamed from: E */
    public abstract void mo3690E(long j) throws IOException;

    /* renamed from: F */
    public abstract void mo3689F(int i, int i2) throws IOException;

    /* renamed from: G */
    public abstract void mo3688G(int i) throws IOException;

    /* renamed from: H */
    public abstract void mo3687H(int i, InterfaceC8287r0 interfaceC8287r0, InterfaceC8219f1 interfaceC8219f1) throws IOException;

    /* renamed from: I */
    public abstract void mo3686I(int i, InterfaceC8287r0 interfaceC8287r0) throws IOException;

    /* renamed from: J */
    public abstract void mo3685J(int i, AbstractC8228i abstractC8228i) throws IOException;

    /* renamed from: K */
    public abstract void mo3684K(int i, String str) throws IOException;

    /* renamed from: L */
    public abstract void mo3683L(int i, int i2) throws IOException;

    /* renamed from: M */
    public abstract void mo3682M(int i, int i2) throws IOException;

    /* renamed from: N */
    public abstract void mo3681N(int i) throws IOException;

    /* renamed from: O */
    public abstract void mo3680O(int i, long j) throws IOException;

    /* renamed from: P */
    public abstract void mo3679P(long j) throws IOException;

    /* renamed from: y */
    public abstract void mo3672y(byte b) throws IOException;

    /* renamed from: z */
    public abstract void mo3671z(int i, boolean z) throws IOException;
}
