package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.core.p003os.C0740h;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: androidx.datastore.preferences.protobuf.i */
/* loaded from: classes.dex */
public abstract class AbstractC1183i implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final C1188e f2982b = new C1188e(C1157b0.f2945b);

    /* renamed from: c */
    public static final InterfaceC1186c f2983c;

    /* renamed from: a */
    public int f2984a = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1184a implements Iterator, p060j$.util.Iterator {
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
            C1180h c1180h = (C1180h) this;
            int i = c1180h.f2979a;
            if (i < c1180h.f2980b) {
                c1180h.f2979a = i + 1;
                return Byte.valueOf(c1180h.f2981c.mo11118j(i));
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$b */
    /* loaded from: classes.dex */
    public static final class C1185b implements InterfaceC1186c {
        @Override // androidx.datastore.preferences.protobuf.AbstractC1183i.InterfaceC1186c
        /* renamed from: a */
        public final byte[] mo11112a(int i, byte[] bArr, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1186c {
        /* renamed from: a */
        byte[] mo11112a(int i, byte[] bArr, int i2);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1187d extends AbstractC1183i {
        @Override // androidx.datastore.preferences.protobuf.AbstractC1183i, java.lang.Iterable
        public final java.util.Iterator<Byte> iterator() {
            return new C1180h(this);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$e */
    /* loaded from: classes.dex */
    public static class C1188e extends AbstractC1187d {

        /* renamed from: d */
        public final byte[] f2985d;

        public C1188e(byte[] bArr) {
            bArr.getClass();
            this.f2985d = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1183i
        /* renamed from: a */
        public byte mo11119a(int i) {
            return this.f2985d[i];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1183i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1183i) || size() != ((AbstractC1183i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof C1188e) {
                C1188e c1188e = (C1188e) obj;
                int i = this.f2984a;
                int i2 = c1188e.f2984a;
                if (i != 0 && i2 != 0 && i != i2) {
                    return false;
                }
                int size = size();
                if (size <= c1188e.size()) {
                    if (0 + size <= c1188e.size()) {
                        int m11113p = m11113p() + size;
                        int m11113p2 = m11113p();
                        int m11113p3 = c1188e.m11113p() + 0;
                        while (m11113p2 < m11113p) {
                            if (this.f2985d[m11113p2] != c1188e.f2985d[m11113p3]) {
                                return false;
                            }
                            m11113p2++;
                            m11113p3++;
                        }
                        return true;
                    }
                    StringBuilder m12536b = C0406q1.m12536b("Ran off end of other: 0, ", size, ", ");
                    m12536b.append(c1188e.size());
                    throw new IllegalArgumentException(m12536b.toString());
                }
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            return obj.equals(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1183i
        /* renamed from: j */
        public byte mo11118j(int i) {
            return this.f2985d[i];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1183i
        /* renamed from: k */
        public final boolean mo11117k() {
            int m11113p = m11113p();
            if (C1250t1.f3086a.mo10779c(m11113p, size() + m11113p, this.f2985d) == 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1183i
        /* renamed from: m */
        public final int mo11116m(int i, int i2) {
            int m11113p = m11113p() + 0;
            Charset charset = C1157b0.f2944a;
            for (int i3 = m11113p; i3 < m11113p + i2; i3++) {
                i = (i * 31) + this.f2985d[i3];
            }
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1183i
        /* renamed from: n */
        public final String mo11115n(Charset charset) {
            return new String(this.f2985d, m11113p(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1183i
        /* renamed from: o */
        public final void mo11114o(AbstractC1177g abstractC1177g) throws IOException {
            abstractC1177g.mo10904a(m11113p(), this.f2985d, size());
        }

        /* renamed from: p */
        public int m11113p() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1183i
        public int size() {
            return this.f2985d.length;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$f */
    /* loaded from: classes.dex */
    public static final class C1189f implements InterfaceC1186c {
        @Override // androidx.datastore.preferences.protobuf.AbstractC1183i.InterfaceC1186c
        /* renamed from: a */
        public final byte[] mo11112a(int i, byte[] bArr, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        f2983c = C1166d.m11133a() ? new C1189f() : new C1185b();
    }

    /* renamed from: b */
    public static int m11121b(int i, int i2, int i3) {
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
    public static C1188e m11120i(int i, byte[] bArr, int i2) {
        m11121b(i, i + i2, bArr.length);
        return new C1188e(f2983c.mo11112a(i, bArr, i2));
    }

    /* renamed from: a */
    public abstract byte mo11119a(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f2984a;
        if (i == 0) {
            int size = size();
            i = mo11116m(size, size);
            if (i == 0) {
                i = 1;
            }
            this.f2984a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<Byte> iterator() {
        return new C1180h(this);
    }

    /* renamed from: j */
    public abstract byte mo11118j(int i);

    /* renamed from: k */
    public abstract boolean mo11117k();

    /* renamed from: m */
    public abstract int mo11116m(int i, int i2);

    /* renamed from: n */
    public abstract String mo11115n(Charset charset);

    /* renamed from: o */
    public abstract void mo11114o(AbstractC1177g abstractC1177g) throws IOException;

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
