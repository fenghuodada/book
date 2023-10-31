package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.datastore.preferences.protobuf.C1169e;
import androidx.datastore.preferences.protobuf.C1194j;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import com.bumptech.glide.util.C3860j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k */
/* loaded from: classes.dex */
public final class C3704k implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f9665a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f9666b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k$a */
    /* loaded from: classes.dex */
    public static final class C3705a implements InterfaceC3707c {

        /* renamed from: a */
        public final ByteBuffer f9667a;

        public C3705a(ByteBuffer byteBuffer) {
            this.f9667a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C3704k.InterfaceC3707c
        /* renamed from: a */
        public final int mo6558a() throws InterfaceC3707c.C3708a {
            return (mo6557b() << 8) | mo6557b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C3704k.InterfaceC3707c
        /* renamed from: b */
        public final short mo6557b() throws InterfaceC3707c.C3708a {
            ByteBuffer byteBuffer = this.f9667a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new InterfaceC3707c.C3708a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C3704k.InterfaceC3707c
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.f9667a;
            int min = (int) Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k$b */
    /* loaded from: classes.dex */
    public static final class C3706b {

        /* renamed from: a */
        public final ByteBuffer f9668a;

        public C3706b(byte[] bArr, int i) {
            this.f9668a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public final short m6559a(int i) {
            boolean z;
            ByteBuffer byteBuffer = this.f9668a;
            if (byteBuffer.remaining() - i >= 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return byteBuffer.getShort(i);
            }
            return (short) -1;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3707c {

        /* renamed from: com.bumptech.glide.load.resource.bitmap.k$c$a */
        /* loaded from: classes.dex */
        public static final class C3708a extends IOException {
            public C3708a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo6558a() throws IOException;

        /* renamed from: b */
        short mo6557b() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k$d */
    /* loaded from: classes.dex */
    public static final class C3709d implements InterfaceC3707c {

        /* renamed from: a */
        public final InputStream f9669a;

        public C3709d(InputStream inputStream) {
            this.f9669a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C3704k.InterfaceC3707c
        /* renamed from: a */
        public final int mo6558a() throws IOException {
            return (mo6557b() << 8) | mo6557b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C3704k.InterfaceC3707c
        /* renamed from: b */
        public final short mo6557b() throws IOException {
            int read = this.f9669a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new InterfaceC3707c.C3708a();
        }

        /* renamed from: c */
        public final int m6556c(int i, byte[] bArr) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f9669a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new InterfaceC3707c.C3708a();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C3704k.InterfaceC3707c
        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                InputStream inputStream = this.f9669a;
                long skip = inputStream.skip(j2);
                if (skip > 0) {
                    j2 -= skip;
                } else if (inputStream.read() == -1) {
                    break;
                } else {
                    j2--;
                }
            }
            return j - j2;
        }
    }

    @NonNull
    /* renamed from: d */
    public static ImageHeaderParser.ImageType m6562d(InterfaceC3707c interfaceC3707c) throws IOException {
        try {
            int mo6558a = interfaceC3707c.mo6558a();
            if (mo6558a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int mo6557b = (mo6558a << 8) | interfaceC3707c.mo6557b();
            if (mo6557b == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int mo6557b2 = (mo6557b << 8) | interfaceC3707c.mo6557b();
            if (mo6557b2 == -1991225785) {
                interfaceC3707c.skip(21L);
                try {
                    return interfaceC3707c.mo6557b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (InterfaceC3707c.C3708a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (mo6557b2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                interfaceC3707c.skip(4L);
                if (((interfaceC3707c.mo6558a() << 16) | interfaceC3707c.mo6558a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int mo6558a2 = (interfaceC3707c.mo6558a() << 16) | interfaceC3707c.mo6558a();
                if ((mo6558a2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = mo6558a2 & 255;
                if (i == 88) {
                    interfaceC3707c.skip(4L);
                    return (interfaceC3707c.mo6557b() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i == 76) {
                    interfaceC3707c.skip(4L);
                    return (interfaceC3707c.mo6557b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (InterfaceC3707c.C3708a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: e */
    public static int m6561e(C3709d c3709d) throws IOException {
        short mo6557b;
        short mo6557b2;
        int mo6558a;
        long j;
        long skip;
        do {
            if (c3709d.mo6557b() != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) mo6557b));
                }
                return -1;
            }
            mo6557b2 = c3709d.mo6557b();
            if (mo6557b2 == 218) {
                return -1;
            }
            if (mo6557b2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            mo6558a = c3709d.mo6558a() - 2;
            if (mo6557b2 != 225) {
                j = mo6558a;
                skip = c3709d.skip(j);
            } else {
                return mo6558a;
            }
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder m11130b = C1169e.m11130b("Unable to skip enough data, type: ", mo6557b2, ", wanted to skip: ", mo6558a, ", but actually skipped: ");
            m11130b.append(skip);
            Log.d("DfltImageHeaderParser", m11130b.toString());
        }
        return -1;
    }

    /* renamed from: f */
    public static int m6560f(C3709d c3709d, byte[] bArr, int i) throws IOException {
        boolean z;
        ByteOrder byteOrder;
        boolean z2;
        int i2;
        StringBuilder sb;
        String sb2;
        int i3;
        int m6556c = c3709d.m6556c(i, bArr);
        if (m6556c != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + m6556c);
            }
            return -1;
        }
        short s = 1;
        byte[] bArr2 = f9665a;
        if (bArr != null && i > bArr2.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i4 = 0;
            while (true) {
                if (i4 >= bArr2.length) {
                    break;
                } else if (bArr[i4] != bArr2[i4]) {
                    z = false;
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (z) {
            C3706b c3706b = new C3706b(bArr, i);
            short m6559a = c3706b.m6559a(6);
            if (m6559a != 18761) {
                if (m6559a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) m6559a));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = c3706b.f9668a;
            byteBuffer.order(byteOrder);
            if (byteBuffer.remaining() - 10 >= 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i2 = byteBuffer.getInt(10);
            } else {
                i2 = -1;
            }
            int i5 = i2 + 6;
            short m6559a2 = c3706b.m6559a(i5);
            int i6 = 0;
            while (i6 < m6559a2) {
                int i7 = (i6 * 12) + i5 + 2;
                short m6559a3 = c3706b.m6559a(i7);
                if (m6559a3 == 274) {
                    short m6559a4 = c3706b.m6559a(i7 + 2);
                    if (m6559a4 >= s && m6559a4 <= 12) {
                        int i8 = i7 + 4;
                        if (byteBuffer.remaining() - i8 < 4) {
                            s = 0;
                        }
                        if (s != 0) {
                            i3 = byteBuffer.getInt(i8);
                        } else {
                            i3 = -1;
                        }
                        if (i3 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                sb2 = "Negative tiff component count";
                                Log.d("DfltImageHeaderParser", sb2);
                            }
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder m11130b = C1169e.m11130b("Got tagIndex=", i6, " tagType=", m6559a3, " formatCode=");
                                m11130b.append((int) m6559a4);
                                m11130b.append(" componentCount=");
                                m11130b.append(i3);
                                Log.d("DfltImageHeaderParser", m11130b.toString());
                            }
                            int i9 = i3 + f9666b[m6559a4];
                            if (i9 > 4) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb = new StringBuilder("Got byte count > 4, not orientation, continuing, formatCode=");
                                    sb.append((int) m6559a4);
                                }
                            } else {
                                int i10 = i7 + 8;
                                if (i10 >= 0 && i10 <= byteBuffer.remaining()) {
                                    if (i9 >= 0 && i9 + i10 <= byteBuffer.remaining()) {
                                        return c3706b.m6559a(i10);
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        sb = new StringBuilder("Illegal number of bytes for TI tag data tagType=");
                                        sb.append((int) m6559a3);
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb2 = C1194j.m11060a("Illegal tagValueOffset=", i10, " tagType=", m6559a3);
                                    Log.d("DfltImageHeaderParser", sb2);
                                }
                            }
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        sb = new StringBuilder("Got invalid format code = ");
                        sb.append((int) m6559a4);
                    }
                    sb2 = sb.toString();
                    Log.d("DfltImageHeaderParser", sb2);
                }
                i6++;
                s = 1;
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* renamed from: a */
    public final ImageHeaderParser.ImageType mo6537a(@NonNull ByteBuffer byteBuffer) throws IOException {
        C3860j.m6404b(byteBuffer);
        return m6562d(new C3705a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* renamed from: b */
    public final ImageHeaderParser.ImageType mo6536b(@NonNull InputStream inputStream) throws IOException {
        C3860j.m6404b(inputStream);
        return m6562d(new C3709d(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public final int mo6535c(@NonNull InputStream inputStream, @NonNull InterfaceC3483b interfaceC3483b) throws IOException {
        boolean z;
        String str;
        C3860j.m6404b(inputStream);
        C3709d c3709d = new C3709d(inputStream);
        C3860j.m6404b(interfaceC3483b);
        try {
            int mo6558a = c3709d.mo6558a();
            if ((mo6558a & 65496) != 65496 && mo6558a != 19789 && mo6558a != 18761) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                str = "Parser doesn't handle magic number: " + mo6558a;
            } else {
                int m6561e = m6561e(c3709d);
                if (m6561e == -1) {
                    if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                        return -1;
                    }
                    str = "Failed to parse exif segment length, or exif segment not found";
                } else {
                    byte[] bArr = (byte[]) interfaceC3483b.mo6702c(m6561e, byte[].class);
                    int m6560f = m6560f(c3709d, bArr, m6561e);
                    interfaceC3483b.put(bArr);
                    return m6560f;
                }
            }
            Log.d("DfltImageHeaderParser", str);
            return -1;
        } catch (InterfaceC3707c.C3708a unused) {
            return -1;
        }
    }
}
