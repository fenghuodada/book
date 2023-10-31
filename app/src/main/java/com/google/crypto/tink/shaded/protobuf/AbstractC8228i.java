package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.view.menu.C0235r;
import androidx.appcompat.widget.C0406q1;
import androidx.core.p003os.C0740h;
import androidx.datastore.preferences.protobuf.C1194j;
import com.google.android.datatransport.cct.C6436d;
import com.google.crypto.tink.shaded.protobuf.AbstractC8244j;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i */
/* loaded from: classes3.dex */
public abstract class AbstractC8228i implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final C8234f f15998b = new C8234f(C8196a0.f15950b);

    /* renamed from: c */
    public static final InterfaceC8232d f15999c;

    /* renamed from: a */
    public int f16000a = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8229a implements Iterator, p060j$.util.Iterator {
        @Override // p060j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final Object next() {
            C8223h c8223h = (C8223h) this;
            int i = c8223h.f15992a;
            if (i < c8223h.f15993b) {
                c8223h.f15992a = i + 1;
                return Byte.valueOf(c8223h.f15994c.mo3817k(i));
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$b */
    /* loaded from: classes3.dex */
    public static final class C8230b implements InterfaceC8232d {
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i.InterfaceC8232d
        /* renamed from: a */
        public final byte[] mo3809a(int i, byte[] bArr, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$c */
    /* loaded from: classes3.dex */
    public static final class C8231c extends C8234f {

        /* renamed from: e */
        public final int f16001e;

        /* renamed from: f */
        public final int f16002f;

        public C8231c(byte[] bArr, int i, int i2) {
            super(bArr);
            AbstractC8228i.m3822b(i, i + i2, bArr.length);
            this.f16001e = i;
            this.f16002f = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i.C8234f, com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        /* renamed from: a */
        public final byte mo3819a(int i) {
            int i2 = this.f16002f;
            if (((i2 - (i + 1)) | i) < 0) {
                if (i < 0) {
                    throw new ArrayIndexOutOfBoundsException(C0235r.m12816a("Index < 0: ", i));
                }
                throw new ArrayIndexOutOfBoundsException(C1194j.m11060a("Index > length: ", i, ", ", i2));
            }
            return this.f16003d[this.f16001e + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i.C8234f, com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        /* renamed from: j */
        public final void mo3818j(int i, byte[] bArr) {
            System.arraycopy(this.f16003d, this.f16001e + 0, bArr, 0, i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i.C8234f, com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        /* renamed from: k */
        public final byte mo3817k(int i) {
            return this.f16003d[this.f16001e + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i.C8234f, com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        public final int size() {
            return this.f16002f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i.C8234f
        /* renamed from: u */
        public final int mo3810u() {
            return this.f16001e;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC8232d {
        /* renamed from: a */
        byte[] mo3809a(int i, byte[] bArr, int i2);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$e */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8233e extends AbstractC8228i {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$f */
    /* loaded from: classes3.dex */
    public static class C8234f extends AbstractC8233e {

        /* renamed from: d */
        public final byte[] f16003d;

        public C8234f(byte[] bArr) {
            bArr.getClass();
            this.f16003d = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        /* renamed from: a */
        public byte mo3819a(int i) {
            return this.f16003d[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC8228i) || size() != ((AbstractC8228i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof C8234f) {
                C8234f c8234f = (C8234f) obj;
                int i = this.f16000a;
                int i2 = c8234f.f16000a;
                if (i != 0 && i2 != 0 && i != i2) {
                    return false;
                }
                int size = size();
                if (size <= c8234f.size()) {
                    if (0 + size <= c8234f.size()) {
                        int mo3810u = mo3810u() + size;
                        int mo3810u2 = mo3810u();
                        int mo3810u3 = c8234f.mo3810u() + 0;
                        while (mo3810u2 < mo3810u) {
                            if (this.f16003d[mo3810u2] != c8234f.f16003d[mo3810u3]) {
                                return false;
                            }
                            mo3810u2++;
                            mo3810u3++;
                        }
                        return true;
                    }
                    StringBuilder m12536b = C0406q1.m12536b("Ran off end of other: 0, ", size, ", ");
                    m12536b.append(c8234f.size());
                    throw new IllegalArgumentException(m12536b.toString());
                }
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            return obj.equals(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        /* renamed from: j */
        public void mo3818j(int i, byte[] bArr) {
            System.arraycopy(this.f16003d, 0, bArr, 0, i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        /* renamed from: k */
        public byte mo3817k(int i) {
            return this.f16003d[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        /* renamed from: m */
        public final boolean mo3816m() {
            int mo3810u = mo3810u();
            return C8280q1.m3565d(mo3810u, this.f16003d, size() + mo3810u);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        /* renamed from: n */
        public final AbstractC8244j.C8245a mo3815n() {
            int mo3810u = mo3810u();
            int size = size();
            AbstractC8244j.C8245a c8245a = new AbstractC8244j.C8245a(this.f16003d, mo3810u, size, true);
            try {
                c8245a.mo3784g(size);
                return c8245a;
            } catch (C8202b0 e) {
                throw new IllegalArgumentException(e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        /* renamed from: o */
        public final int mo3814o(int i, int i2) {
            int mo3810u = mo3810u() + 0;
            Charset charset = C8196a0.f15949a;
            for (int i3 = mo3810u; i3 < mo3810u + i2; i3++) {
                i = (i * 31) + this.f16003d[i3];
            }
            return i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        /* renamed from: p */
        public final C8234f mo3813p(int i) {
            int m3822b = AbstractC8228i.m3822b(0, i, size());
            if (m3822b == 0) {
                return AbstractC8228i.f15998b;
            }
            return new C8231c(this.f16003d, mo3810u() + 0, m3822b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        /* renamed from: s */
        public final String mo3812s(Charset charset) {
            return new String(this.f16003d, mo3810u(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        public int size() {
            return this.f16003d.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i
        /* renamed from: t */
        public final void mo3811t(AbstractC8220g abstractC8220g) throws IOException {
            abstractC8220g.mo3673a(mo3810u(), this.f16003d, size());
        }

        /* renamed from: u */
        public int mo3810u() {
            return 0;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$g */
    /* loaded from: classes3.dex */
    public static final class C8235g implements InterfaceC8232d {
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8228i.InterfaceC8232d
        /* renamed from: a */
        public final byte[] mo3809a(int i, byte[] bArr, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        f15999c = C8208d.m3919a() ? new C8235g() : new C8230b();
    }

    /* renamed from: b */
    public static int m3822b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(C1194j.m11060a("Beginning index larger than ending index: ", i, ", ", i2));
                }
                throw new IndexOutOfBoundsException(C1194j.m11060a("End index: ", i2, " >= ", i3));
            }
            throw new IndexOutOfBoundsException(C0740h.m11849a("Beginning index: ", i, " < 0"));
        }
        return i4;
    }

    /* renamed from: i */
    public static C8234f m3821i(int i, byte[] bArr, int i2) {
        m3822b(i, i + i2, bArr.length);
        return new C8234f(f15999c.mo3809a(i, bArr, i2));
    }

    /* renamed from: a */
    public abstract byte mo3819a(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f16000a;
        if (i == 0) {
            int size = size();
            i = mo3814o(size, size);
            if (i == 0) {
                i = 1;
            }
            this.f16000a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<Byte> iterator() {
        return new C8223h(this);
    }

    /* renamed from: j */
    public abstract void mo3818j(int i, byte[] bArr);

    /* renamed from: k */
    public abstract byte mo3817k(int i);

    /* renamed from: m */
    public abstract boolean mo3816m();

    /* renamed from: n */
    public abstract AbstractC8244j.C8245a mo3815n();

    /* renamed from: o */
    public abstract int mo3814o(int i, int i2);

    /* renamed from: p */
    public abstract C8234f mo3813p(int i);

    /* renamed from: r */
    public final byte[] m3820r() {
        int size = size();
        if (size == 0) {
            return C8196a0.f15950b;
        }
        byte[] bArr = new byte[size];
        mo3818j(size, bArr);
        return bArr;
    }

    /* renamed from: s */
    public abstract String mo3812s(Charset charset);

    public abstract int size();

    /* renamed from: t */
    public abstract void mo3811t(AbstractC8220g abstractC8220g) throws IOException;

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = C6436d.m6351b(this);
        } else {
            str = C6436d.m6351b(mo3813p(47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
