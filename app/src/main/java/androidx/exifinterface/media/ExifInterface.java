package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0235r;
import androidx.appcompat.widget.C0406q1;
import androidx.constraintlayout.core.widgets.C0539e;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p060j$.util.DesugarTimeZone;

/* loaded from: classes.dex */
public final class ExifInterface {

    /* renamed from: E */
    public static final String[] f3256E;

    /* renamed from: F */
    public static final int[] f3257F;

    /* renamed from: G */
    public static final byte[] f3258G;

    /* renamed from: H */
    public static final C1347d f3259H;

    /* renamed from: I */
    public static final C1347d[][] f3260I;

    /* renamed from: J */
    public static final C1347d[] f3261J;

    /* renamed from: K */
    public static final HashMap<Integer, C1347d>[] f3262K;

    /* renamed from: L */
    public static final HashMap<String, C1347d>[] f3263L;

    /* renamed from: M */
    public static final HashSet<String> f3264M;

    /* renamed from: N */
    public static final HashMap<Integer, Integer> f3265N;

    /* renamed from: O */
    public static final Charset f3266O;

    /* renamed from: P */
    public static final byte[] f3267P;

    /* renamed from: Q */
    public static final byte[] f3268Q;

    /* renamed from: a */
    public final FileDescriptor f3283a;

    /* renamed from: b */
    public final AssetManager.AssetInputStream f3284b;

    /* renamed from: c */
    public int f3285c;

    /* renamed from: d */
    public final HashMap<String, C1346c>[] f3286d;

    /* renamed from: e */
    public final HashSet f3287e;

    /* renamed from: f */
    public ByteOrder f3288f;

    /* renamed from: g */
    public boolean f3289g;

    /* renamed from: h */
    public int f3290h;

    /* renamed from: i */
    public int f3291i;

    /* renamed from: j */
    public int f3292j;

    /* renamed from: k */
    public int f3293k;

    /* renamed from: l */
    public int f3294l;

    /* renamed from: m */
    public static final boolean f3269m = Log.isLoggable("ExifInterface", 3);

    /* renamed from: n */
    public static final List<Integer> f3270n = Arrays.asList(1, 6, 3, 8);

    /* renamed from: o */
    public static final List<Integer> f3271o = Arrays.asList(2, 7, 4, 5);

    /* renamed from: p */
    public static final int[] f3272p = {8, 8, 8};

    /* renamed from: q */
    public static final int[] f3273q = {8};

    /* renamed from: r */
    public static final byte[] f3274r = {-1, -40, -1};

    /* renamed from: s */
    public static final byte[] f3275s = {102, 116, 121, 112};

    /* renamed from: t */
    public static final byte[] f3276t = {109, 105, 102, 49};

    /* renamed from: u */
    public static final byte[] f3277u = {104, 101, 105, 99};

    /* renamed from: v */
    public static final byte[] f3278v = {79, 76, 89, 77, 80, 0};

    /* renamed from: w */
    public static final byte[] f3279w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: x */
    public static final byte[] f3280x = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: y */
    public static final byte[] f3281y = {101, 88, 73, 102};

    /* renamed from: z */
    public static final byte[] f3282z = {73, 72, 68, 82};

    /* renamed from: A */
    public static final byte[] f3252A = {73, 69, 78, 68};

    /* renamed from: B */
    public static final byte[] f3253B = {82, 73, 70, 70};

    /* renamed from: C */
    public static final byte[] f3254C = {87, 69, 66, 80};

    /* renamed from: D */
    public static final byte[] f3255D = {69, 88, 73, 70};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* loaded from: classes.dex */
    public @interface ExifStreamType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* loaded from: classes.dex */
    public @interface IfdType {
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$a */
    /* loaded from: classes.dex */
    public class C1344a extends MediaDataSource {

        /* renamed from: a */
        public long f3295a;

        /* renamed from: b */
        public final /* synthetic */ C1345b f3296b;

        public C1344a(C1345b c1345b) {
            this.f3296b = c1345b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public final long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f3295a;
                int i3 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                C1345b c1345b = this.f3296b;
                if (i3 != 0) {
                    if (j2 >= 0 && j >= j2 + c1345b.available()) {
                        return -1;
                    }
                    c1345b.m10619a(j);
                    this.f3295a = j;
                }
                if (i2 > c1345b.available()) {
                    i2 = c1345b.available();
                }
                int read = c1345b.read(bArr, i, i2);
                if (read >= 0) {
                    this.f3295a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f3295a = -1L;
            return -1;
        }
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$b */
    /* loaded from: classes.dex */
    public static class C1345b extends InputStream implements DataInput {

        /* renamed from: e */
        public static final ByteOrder f3297e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f */
        public static final ByteOrder f3298f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a */
        public final DataInputStream f3299a;

        /* renamed from: b */
        public ByteOrder f3300b;

        /* renamed from: c */
        public final int f3301c;

        /* renamed from: d */
        public int f3302d;

        public C1345b(InputStream inputStream) throws IOException {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.f3300b = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f3299a = dataInputStream;
            int available = dataInputStream.available();
            this.f3301c = available;
            this.f3302d = 0;
            dataInputStream.mark(available);
            this.f3300b = byteOrder;
        }

        public C1345b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }

        /* renamed from: a */
        public final void m10619a(long j) throws IOException {
            int i = this.f3302d;
            if (i > j) {
                this.f3302d = 0;
                DataInputStream dataInputStream = this.f3299a;
                dataInputStream.reset();
                dataInputStream.mark(this.f3301c);
            } else {
                j -= i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f3299a.available();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.f3302d++;
            return this.f3299a.read();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f3299a.read(bArr, i, i2);
            this.f3302d += read;
            return read;
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.f3302d++;
            return this.f3299a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            int i = this.f3302d + 1;
            this.f3302d = i;
            if (i <= this.f3301c) {
                int read = this.f3299a.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.f3302d += 2;
            return this.f3299a.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            int length = this.f3302d + bArr.length;
            this.f3302d = length;
            if (length > this.f3301c) {
                throw new EOFException();
            }
            if (this.f3299a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f3302d + i2;
            this.f3302d = i3;
            if (i3 > this.f3301c) {
                throw new EOFException();
            }
            if (this.f3299a.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            int i = this.f3302d + 4;
            this.f3302d = i;
            if (i <= this.f3301c) {
                DataInputStream dataInputStream = this.f3299a;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                int read3 = dataInputStream.read();
                int read4 = dataInputStream.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f3300b;
                    if (byteOrder == f3297e) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f3298f) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f3300b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            int i = this.f3302d + 8;
            this.f3302d = i;
            if (i <= this.f3301c) {
                DataInputStream dataInputStream = this.f3299a;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                int read3 = dataInputStream.read();
                int read4 = dataInputStream.read();
                int read5 = dataInputStream.read();
                int read6 = dataInputStream.read();
                int read7 = dataInputStream.read();
                int read8 = dataInputStream.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f3300b;
                    if (byteOrder == f3297e) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f3298f) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    throw new IOException("Invalid byte order: " + this.f3300b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            int i = this.f3302d + 2;
            this.f3302d = i;
            if (i <= this.f3301c) {
                DataInputStream dataInputStream = this.f3299a;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f3300b;
                    if (byteOrder == f3297e) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f3298f) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f3300b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.f3302d += 2;
            return this.f3299a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.f3302d++;
            return this.f3299a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            int i = this.f3302d + 2;
            this.f3302d = i;
            if (i <= this.f3301c) {
                DataInputStream dataInputStream = this.f3299a;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f3300b;
                    if (byteOrder == f3297e) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f3298f) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f3300b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f3301c - this.f3302d);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f3299a.skipBytes(min - i2);
            }
            this.f3302d += i2;
            return i2;
        }
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$c */
    /* loaded from: classes.dex */
    public static class C1346c {

        /* renamed from: a */
        public final int f3303a;

        /* renamed from: b */
        public final int f3304b;

        /* renamed from: c */
        public final byte[] f3305c;

        public C1346c(int i, byte[] bArr, int i2) {
            this(bArr, i, i2);
        }

        public C1346c(byte[] bArr, int i, int i2) {
            this.f3303a = i;
            this.f3304b = i2;
            this.f3305c = bArr;
        }

        /* renamed from: a */
        public static C1346c m10618a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(ExifInterface.f3266O);
            return new C1346c(bytes, 2, bytes.length);
        }

        /* renamed from: b */
        public static C1346c m10617b(long j, ByteOrder byteOrder) {
            long[] jArr = {j};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.f3257F[4] * 1]);
            wrap.order(byteOrder);
            wrap.putInt((int) jArr[0]);
            return new C1346c(4, wrap.array(), 1);
        }

        /* renamed from: c */
        public static C1346c m10616c(C1348e c1348e, ByteOrder byteOrder) {
            C1348e[] c1348eArr = {c1348e};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.f3257F[5] * 1]);
            wrap.order(byteOrder);
            C1348e c1348e2 = c1348eArr[0];
            wrap.putInt((int) c1348e2.f3310a);
            wrap.putInt((int) c1348e2.f3311b);
            return new C1346c(5, wrap.array(), 1);
        }

        /* renamed from: d */
        public static C1346c m10615d(int i, ByteOrder byteOrder) {
            int[] iArr = {i};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.f3257F[3] * 1]);
            wrap.order(byteOrder);
            wrap.putShort((short) iArr[0]);
            return new C1346c(3, wrap.array(), 1);
        }

        /* renamed from: e */
        public final double m10614e(ByteOrder byteOrder) {
            Serializable m10611h = m10611h(byteOrder);
            if (m10611h != null) {
                if (m10611h instanceof String) {
                    return Double.parseDouble((String) m10611h);
                }
                if (m10611h instanceof long[]) {
                    long[] jArr = (long[]) m10611h;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m10611h instanceof int[]) {
                    int[] iArr = (int[]) m10611h;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m10611h instanceof double[]) {
                    double[] dArr = (double[]) m10611h;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m10611h instanceof C1348e[]) {
                    C1348e[] c1348eArr = (C1348e[]) m10611h;
                    if (c1348eArr.length == 1) {
                        C1348e c1348e = c1348eArr[0];
                        return c1348e.f3310a / c1348e.f3311b;
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        /* renamed from: f */
        public final int m10613f(ByteOrder byteOrder) {
            Serializable m10611h = m10611h(byteOrder);
            if (m10611h != null) {
                if (m10611h instanceof String) {
                    return Integer.parseInt((String) m10611h);
                }
                if (m10611h instanceof long[]) {
                    long[] jArr = (long[]) m10611h;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m10611h instanceof int[]) {
                    int[] iArr = (int[]) m10611h;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        /* renamed from: g */
        public final String m10612g(ByteOrder byteOrder) {
            Serializable m10611h = m10611h(byteOrder);
            if (m10611h == null) {
                return null;
            }
            if (m10611h instanceof String) {
                return (String) m10611h;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (m10611h instanceof long[]) {
                long[] jArr = (long[]) m10611h;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (m10611h instanceof int[]) {
                int[] iArr = (int[]) m10611h;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (m10611h instanceof double[]) {
                double[] dArr = (double[]) m10611h;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (m10611h instanceof C1348e[]) {
                C1348e[] c1348eArr = (C1348e[]) m10611h;
                while (i < c1348eArr.length) {
                    sb.append(c1348eArr[i].f3310a);
                    sb.append('/');
                    sb.append(c1348eArr[i].f3311b);
                    i++;
                    if (i != c1348eArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:89|(3:91|(2:92|(1:101)(2:94|(2:97|98)(1:96)))|(1:100))|102|(2:104|(6:113|114|115|116|117|118)(3:106|(2:108|109)(2:111|112)|110))|122|115|116|117|118) */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x012a, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x012b, code lost:
            android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
         */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0167: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:132:0x0167 */
        /* JADX WARN: Removed duplicated region for block: B:174:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v25, types: [androidx.exifinterface.media.ExifInterface$e[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v28, types: [androidx.exifinterface.media.ExifInterface$e[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.io.Serializable m10611h(java.nio.ByteOrder r15) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.C1346c.m10611h(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(ExifInterface.f3256E[this.f3303a]);
            sb.append(", data length:");
            return C0539e.m12264b(sb, this.f3305c.length, ")");
        }
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$d */
    /* loaded from: classes.dex */
    public static class C1347d {

        /* renamed from: a */
        public final int f3306a;

        /* renamed from: b */
        public final String f3307b;

        /* renamed from: c */
        public final int f3308c;

        /* renamed from: d */
        public final int f3309d;

        public C1347d(int i, String str) {
            this.f3307b = str;
            this.f3306a = i;
            this.f3308c = 3;
            this.f3309d = 4;
        }

        public C1347d(String str, int i, int i2) {
            this.f3307b = str;
            this.f3306a = i;
            this.f3308c = i2;
            this.f3309d = -1;
        }
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$e */
    /* loaded from: classes.dex */
    public static class C1348e {

        /* renamed from: a */
        public final long f3310a;

        /* renamed from: b */
        public final long f3311b;

        public C1348e(long j, long j2) {
            if (j2 == 0) {
                this.f3310a = 0L;
                this.f3311b = 1L;
                return;
            }
            this.f3310a = j;
            this.f3311b = j2;
        }

        public final String toString() {
            return this.f3310a + RemoteSettings.FORWARD_SLASH_STRING + this.f3311b;
        }
    }

    static {
        C1347d[] c1347dArr;
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        "XMP ".getBytes(Charset.defaultCharset());
        f3256E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f3257F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f3258G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C1347d[] c1347dArr2 = {new C1347d("NewSubfileType", 254, 4), new C1347d("SubfileType", 255, 4), new C1347d(256, "ImageWidth"), new C1347d(257, "ImageLength"), new C1347d("BitsPerSample", 258, 3), new C1347d("Compression", 259, 3), new C1347d("PhotometricInterpretation", 262, 3), new C1347d("ImageDescription", 270, 2), new C1347d("Make", 271, 2), new C1347d("Model", 272, 2), new C1347d(273, "StripOffsets"), new C1347d("Orientation", 274, 3), new C1347d("SamplesPerPixel", 277, 3), new C1347d(278, "RowsPerStrip"), new C1347d(279, "StripByteCounts"), new C1347d("XResolution", 282, 5), new C1347d("YResolution", 283, 5), new C1347d("PlanarConfiguration", 284, 3), new C1347d("ResolutionUnit", 296, 3), new C1347d("TransferFunction", 301, 3), new C1347d("Software", 305, 2), new C1347d("DateTime", 306, 2), new C1347d("Artist", 315, 2), new C1347d("WhitePoint", 318, 5), new C1347d("PrimaryChromaticities", 319, 5), new C1347d("SubIFDPointer", 330, 4), new C1347d("JPEGInterchangeFormat", 513, 4), new C1347d("JPEGInterchangeFormatLength", 514, 4), new C1347d("YCbCrCoefficients", 529, 5), new C1347d("YCbCrSubSampling", 530, 3), new C1347d("YCbCrPositioning", 531, 3), new C1347d("ReferenceBlackWhite", 532, 5), new C1347d("Copyright", 33432, 2), new C1347d("ExifIFDPointer", 34665, 4), new C1347d("GPSInfoIFDPointer", 34853, 4), new C1347d("SensorTopBorder", 4, 4), new C1347d("SensorLeftBorder", 5, 4), new C1347d("SensorBottomBorder", 6, 4), new C1347d("SensorRightBorder", 7, 4), new C1347d("ISO", 23, 3), new C1347d("JpgFromRaw", 46, 7), new C1347d("Xmp", 700, 1)};
        C1347d[] c1347dArr3 = {new C1347d("ExposureTime", 33434, 5), new C1347d("FNumber", 33437, 5), new C1347d("ExposureProgram", 34850, 3), new C1347d("SpectralSensitivity", 34852, 2), new C1347d("PhotographicSensitivity", 34855, 3), new C1347d("OECF", 34856, 7), new C1347d("SensitivityType", 34864, 3), new C1347d("StandardOutputSensitivity", 34865, 4), new C1347d("RecommendedExposureIndex", 34866, 4), new C1347d("ISOSpeed", 34867, 4), new C1347d("ISOSpeedLatitudeyyy", 34868, 4), new C1347d("ISOSpeedLatitudezzz", 34869, 4), new C1347d("ExifVersion", 36864, 2), new C1347d("DateTimeOriginal", 36867, 2), new C1347d("DateTimeDigitized", 36868, 2), new C1347d("OffsetTime", 36880, 2), new C1347d("OffsetTimeOriginal", 36881, 2), new C1347d("OffsetTimeDigitized", 36882, 2), new C1347d("ComponentsConfiguration", 37121, 7), new C1347d("CompressedBitsPerPixel", 37122, 5), new C1347d("ShutterSpeedValue", 37377, 10), new C1347d("ApertureValue", 37378, 5), new C1347d("BrightnessValue", 37379, 10), new C1347d("ExposureBiasValue", 37380, 10), new C1347d("MaxApertureValue", 37381, 5), new C1347d("SubjectDistance", 37382, 5), new C1347d("MeteringMode", 37383, 3), new C1347d("LightSource", 37384, 3), new C1347d("Flash", 37385, 3), new C1347d("FocalLength", 37386, 5), new C1347d("SubjectArea", 37396, 3), new C1347d("MakerNote", 37500, 7), new C1347d("UserComment", 37510, 7), new C1347d("SubSecTime", 37520, 2), new C1347d("SubSecTimeOriginal", 37521, 2), new C1347d("SubSecTimeDigitized", 37522, 2), new C1347d("FlashpixVersion", 40960, 7), new C1347d("ColorSpace", 40961, 3), new C1347d(40962, "PixelXDimension"), new C1347d(40963, "PixelYDimension"), new C1347d("RelatedSoundFile", 40964, 2), new C1347d("InteroperabilityIFDPointer", 40965, 4), new C1347d("FlashEnergy", 41483, 5), new C1347d("SpatialFrequencyResponse", 41484, 7), new C1347d("FocalPlaneXResolution", 41486, 5), new C1347d("FocalPlaneYResolution", 41487, 5), new C1347d("FocalPlaneResolutionUnit", 41488, 3), new C1347d("SubjectLocation", 41492, 3), new C1347d("ExposureIndex", 41493, 5), new C1347d("SensingMethod", 41495, 3), new C1347d("FileSource", 41728, 7), new C1347d("SceneType", 41729, 7), new C1347d("CFAPattern", 41730, 7), new C1347d("CustomRendered", 41985, 3), new C1347d("ExposureMode", 41986, 3), new C1347d("WhiteBalance", 41987, 3), new C1347d("DigitalZoomRatio", 41988, 5), new C1347d("FocalLengthIn35mmFilm", 41989, 3), new C1347d("SceneCaptureType", 41990, 3), new C1347d("GainControl", 41991, 3), new C1347d("Contrast", 41992, 3), new C1347d("Saturation", 41993, 3), new C1347d("Sharpness", 41994, 3), new C1347d("DeviceSettingDescription", 41995, 7), new C1347d("SubjectDistanceRange", 41996, 3), new C1347d("ImageUniqueID", 42016, 2), new C1347d("CameraOwnerName", 42032, 2), new C1347d("BodySerialNumber", 42033, 2), new C1347d("LensSpecification", 42034, 5), new C1347d("LensMake", 42035, 2), new C1347d("LensModel", 42036, 2), new C1347d("Gamma", 42240, 5), new C1347d("DNGVersion", 50706, 1), new C1347d(50720, "DefaultCropSize")};
        C1347d[] c1347dArr4 = {new C1347d("GPSVersionID", 0, 1), new C1347d("GPSLatitudeRef", 1, 2), new C1347d("GPSLatitude", 2, 5), new C1347d("GPSLongitudeRef", 3, 2), new C1347d("GPSLongitude", 4, 5), new C1347d("GPSAltitudeRef", 5, 1), new C1347d("GPSAltitude", 6, 5), new C1347d("GPSTimeStamp", 7, 5), new C1347d("GPSSatellites", 8, 2), new C1347d("GPSStatus", 9, 2), new C1347d("GPSMeasureMode", 10, 2), new C1347d("GPSDOP", 11, 5), new C1347d("GPSSpeedRef", 12, 2), new C1347d("GPSSpeed", 13, 5), new C1347d("GPSTrackRef", 14, 2), new C1347d("GPSTrack", 15, 5), new C1347d("GPSImgDirectionRef", 16, 2), new C1347d("GPSImgDirection", 17, 5), new C1347d("GPSMapDatum", 18, 2), new C1347d("GPSDestLatitudeRef", 19, 2), new C1347d("GPSDestLatitude", 20, 5), new C1347d("GPSDestLongitudeRef", 21, 2), new C1347d("GPSDestLongitude", 22, 5), new C1347d("GPSDestBearingRef", 23, 2), new C1347d("GPSDestBearing", 24, 5), new C1347d("GPSDestDistanceRef", 25, 2), new C1347d("GPSDestDistance", 26, 5), new C1347d("GPSProcessingMethod", 27, 7), new C1347d("GPSAreaInformation", 28, 7), new C1347d("GPSDateStamp", 29, 2), new C1347d("GPSDifferential", 30, 3), new C1347d("GPSHPositioningError", 31, 5)};
        C1347d[] c1347dArr5 = {new C1347d("InteroperabilityIndex", 1, 2)};
        C1347d[] c1347dArr6 = {new C1347d("NewSubfileType", 254, 4), new C1347d("SubfileType", 255, 4), new C1347d(256, "ThumbnailImageWidth"), new C1347d(257, "ThumbnailImageLength"), new C1347d("BitsPerSample", 258, 3), new C1347d("Compression", 259, 3), new C1347d("PhotometricInterpretation", 262, 3), new C1347d("ImageDescription", 270, 2), new C1347d("Make", 271, 2), new C1347d("Model", 272, 2), new C1347d(273, "StripOffsets"), new C1347d("ThumbnailOrientation", 274, 3), new C1347d("SamplesPerPixel", 277, 3), new C1347d(278, "RowsPerStrip"), new C1347d(279, "StripByteCounts"), new C1347d("XResolution", 282, 5), new C1347d("YResolution", 283, 5), new C1347d("PlanarConfiguration", 284, 3), new C1347d("ResolutionUnit", 296, 3), new C1347d("TransferFunction", 301, 3), new C1347d("Software", 305, 2), new C1347d("DateTime", 306, 2), new C1347d("Artist", 315, 2), new C1347d("WhitePoint", 318, 5), new C1347d("PrimaryChromaticities", 319, 5), new C1347d("SubIFDPointer", 330, 4), new C1347d("JPEGInterchangeFormat", 513, 4), new C1347d("JPEGInterchangeFormatLength", 514, 4), new C1347d("YCbCrCoefficients", 529, 5), new C1347d("YCbCrSubSampling", 530, 3), new C1347d("YCbCrPositioning", 531, 3), new C1347d("ReferenceBlackWhite", 532, 5), new C1347d("Copyright", 33432, 2), new C1347d("ExifIFDPointer", 34665, 4), new C1347d("GPSInfoIFDPointer", 34853, 4), new C1347d("DNGVersion", 50706, 1), new C1347d(50720, "DefaultCropSize")};
        f3259H = new C1347d("StripOffsets", 273, 3);
        f3260I = new C1347d[][]{c1347dArr2, c1347dArr3, c1347dArr4, c1347dArr5, c1347dArr6, c1347dArr2, new C1347d[]{new C1347d("ThumbnailImage", 256, 7), new C1347d("CameraSettingsIFDPointer", 8224, 4), new C1347d("ImageProcessingIFDPointer", 8256, 4)}, new C1347d[]{new C1347d("PreviewImageStart", 257, 4), new C1347d("PreviewImageLength", 258, 4)}, new C1347d[]{new C1347d("AspectFrame", 4371, 3)}, new C1347d[]{new C1347d("ColorSpace", 55, 3)}};
        f3261J = new C1347d[]{new C1347d("SubIFDPointer", 330, 4), new C1347d("ExifIFDPointer", 34665, 4), new C1347d("GPSInfoIFDPointer", 34853, 4), new C1347d("InteroperabilityIFDPointer", 40965, 4), new C1347d("CameraSettingsIFDPointer", 8224, 1), new C1347d("ImageProcessingIFDPointer", 8256, 1)};
        f3262K = new HashMap[10];
        f3263L = new HashMap[10];
        f3264M = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f3265N = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f3266O = forName;
        f3267P = "Exif\u0000\u0000".getBytes(forName);
        f3268Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C1347d[][] c1347dArr7 = f3260I;
            if (i >= c1347dArr7.length) {
                HashMap<Integer, Integer> hashMap = f3265N;
                C1347d[] c1347dArr8 = f3261J;
                hashMap.put(Integer.valueOf(c1347dArr8[0].f3306a), 5);
                hashMap.put(Integer.valueOf(c1347dArr8[1].f3306a), 1);
                hashMap.put(Integer.valueOf(c1347dArr8[2].f3306a), 2);
                hashMap.put(Integer.valueOf(c1347dArr8[3].f3306a), 3);
                hashMap.put(Integer.valueOf(c1347dArr8[4].f3306a), 7);
                hashMap.put(Integer.valueOf(c1347dArr8[5].f3306a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            f3262K[i] = new HashMap<>();
            f3263L[i] = new HashMap<>();
            for (C1347d c1347d : c1347dArr7[i]) {
                f3262K[i].put(Integer.valueOf(c1347d.f3306a), c1347d);
                f3263L[i].put(c1347d.f3307b, c1347d);
            }
            i++;
        }
    }

    public ExifInterface(@NonNull InputStream inputStream) throws IOException {
        boolean z;
        C1347d[][] c1347dArr = f3260I;
        this.f3286d = new HashMap[c1347dArr.length];
        this.f3287e = new HashSet(c1347dArr.length);
        this.f3288f = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            boolean z2 = inputStream instanceof AssetManager.AssetInputStream;
            FileDescriptor fileDescriptor = null;
            boolean z3 = f3269m;
            if (z2) {
                this.f3284b = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        z = true;
                    } catch (Exception unused) {
                        if (z3) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z = false;
                    }
                    if (z) {
                        this.f3284b = null;
                        fileDescriptor = fileInputStream.getFD();
                    }
                }
                this.f3284b = null;
            }
            this.f3283a = fileDescriptor;
            for (int i = 0; i < c1347dArr.length; i++) {
                try {
                    try {
                        this.f3286d[i] = new HashMap<>();
                    } catch (IOException e) {
                        if (z3) {
                            Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                        }
                        m10644a();
                        if (!z3) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    m10644a();
                    if (z3) {
                        m10627r();
                    }
                    throw th;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f3285c = m10637h(bufferedInputStream);
            C1345b c1345b = new C1345b(bufferedInputStream);
            switch (this.f3285c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    m10633l(c1345b);
                    break;
                case 4:
                    m10638g(c1345b, 0, 0);
                    break;
                case 7:
                    m10636i(c1345b);
                    break;
                case 9:
                    m10634k(c1345b);
                    break;
                case 10:
                    m10632m(c1345b);
                    break;
                case 12:
                    m10639f(c1345b);
                    break;
                case 13:
                    m10635j(c1345b);
                    break;
                case 14:
                    m10631n(c1345b);
                    break;
            }
            m10623v(c1345b);
            m10644a();
            if (!z3) {
                return;
            }
            m10627r();
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* renamed from: b */
    public static String m10643b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static long[] m10642c(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* renamed from: s */
    public static ByteOrder m10626s(C1345b c1345b) throws IOException {
        short readShort = c1345b.readShort();
        boolean z = f3269m;
        if (readShort == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    /* renamed from: a */
    public final void m10644a() {
        String m10641d = m10641d("DateTimeOriginal");
        HashMap<String, C1346c>[] hashMapArr = this.f3286d;
        if (m10641d != null && m10641d("DateTime") == null) {
            hashMapArr[0].put("DateTime", C1346c.m10618a(m10641d));
        }
        if (m10641d("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C1346c.m10617b(0L, this.f3288f));
        }
        if (m10641d("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C1346c.m10617b(0L, this.f3288f));
        }
        if (m10641d("Orientation") == null) {
            hashMapArr[0].put("Orientation", C1346c.m10617b(0L, this.f3288f));
        }
        if (m10641d("LightSource") == null) {
            hashMapArr[1].put("LightSource", C1346c.m10617b(0L, this.f3288f));
        }
    }

    @Nullable
    /* renamed from: d */
    public final String m10641d(@NonNull String str) {
        String str2;
        C1346c m10640e = m10640e(str);
        if (m10640e != null) {
            if (!f3264M.contains(str)) {
                return m10640e.m10612g(this.f3288f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = m10640e.f3303a;
                if (i != 5 && i != 10) {
                    str2 = C0235r.m12816a("GPS Timestamp format is not rational. format=", i);
                } else {
                    C1348e[] c1348eArr = (C1348e[]) m10640e.m10611h(this.f3288f);
                    if (c1348eArr != null && c1348eArr.length == 3) {
                        C1348e c1348e = c1348eArr[0];
                        C1348e c1348e2 = c1348eArr[1];
                        C1348e c1348e3 = c1348eArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) c1348e.f3310a) / ((float) c1348e.f3311b))), Integer.valueOf((int) (((float) c1348e2.f3310a) / ((float) c1348e2.f3311b))), Integer.valueOf((int) (((float) c1348e3.f3310a) / ((float) c1348e3.f3311b))));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(c1348eArr);
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(m10640e.m10614e(this.f3288f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public final C1346c m10640e(@NonNull String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f3269m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f3260I.length; i++) {
            C1346c c1346c = this.f3286d[i].get(str);
            if (c1346c != null) {
                return c1346c;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m10639f(C1345b c1345b) throws IOException {
        String str;
        String str2;
        String str3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C1344a(c1345b));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            HashMap<String, C1346c>[] hashMapArr = this.f3286d;
            if (str != null) {
                hashMapArr[0].put("ImageWidth", C1346c.m10615d(Integer.parseInt(str), this.f3288f));
            }
            if (str2 != null) {
                hashMapArr[0].put("ImageLength", C1346c.m10615d(Integer.parseInt(str2), this.f3288f));
            }
            if (str3 != null) {
                int parseInt = Integer.parseInt(str3);
                hashMapArr[0].put("Orientation", C1346c.m10615d(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f3288f));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                c1345b.m10619a(parseInt2);
                byte[] bArr = new byte[6];
                if (c1345b.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i = parseInt2 + 6;
                int i2 = parseInt3 - 6;
                if (!Arrays.equals(bArr, f3267P)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i2];
                if (c1345b.read(bArr2) != i2) {
                    throw new IOException("Can't read exif");
                }
                this.f3290h = i;
                m10625t(0, bArr2);
            }
            if (f3269m) {
                Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a0, code lost:
        r17.f3300b = r16.f3288f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a4, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10638g(androidx.exifinterface.media.ExifInterface.C1345b r17, int r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m10638g(androidx.exifinterface.media.ExifInterface$b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cf, code lost:
        if (r8 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f A[RETURN] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m10637h(java.io.BufferedInputStream r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m10637h(java.io.BufferedInputStream):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10636i(androidx.exifinterface.media.ExifInterface.C1345b r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m10636i(androidx.exifinterface.media.ExifInterface$b):void");
    }

    /* renamed from: j */
    public final void m10635j(C1345b c1345b) throws IOException {
        if (f3269m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c1345b);
        }
        c1345b.f3300b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f3280x;
        c1345b.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = c1345b.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (c1345b.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16 && !Arrays.equals(bArr2, f3282z)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, f3252A)) {
                        if (Arrays.equals(bArr2, f3281y)) {
                            byte[] bArr3 = new byte[readInt];
                            if (c1345b.read(bArr3) == readInt) {
                                int readInt2 = c1345b.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f3290h = i2;
                                    m10625t(0, bArr3);
                                    m10620y();
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + m10643b(bArr2));
                        }
                        int i3 = readInt + 4;
                        c1345b.skipBytes(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: k */
    public final void m10634k(C1345b c1345b) throws IOException {
        c1345b.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        c1345b.read(bArr);
        c1345b.skipBytes(4);
        c1345b.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m10638g(c1345b, i, 5);
        c1345b.m10619a(i2);
        c1345b.f3300b = ByteOrder.BIG_ENDIAN;
        int readInt = c1345b.readInt();
        boolean z = f3269m;
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = c1345b.readUnsignedShort();
            int readUnsignedShort2 = c1345b.readUnsignedShort();
            if (readUnsignedShort == f3259H.f3306a) {
                short readShort = c1345b.readShort();
                short readShort2 = c1345b.readShort();
                C1346c m10615d = C1346c.m10615d(readShort, this.f3288f);
                C1346c m10615d2 = C1346c.m10615d(readShort2, this.f3288f);
                HashMap<String, C1346c>[] hashMapArr = this.f3286d;
                hashMapArr[0].put("ImageLength", m10615d);
                hashMapArr[0].put("ImageWidth", m10615d2);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c1345b.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: l */
    public final void m10633l(C1345b c1345b) throws IOException {
        m10628q(c1345b, c1345b.available());
        m10624u(c1345b, 0);
        m10621x(c1345b, 0);
        m10621x(c1345b, 5);
        m10621x(c1345b, 4);
        m10620y();
        if (this.f3285c == 8) {
            HashMap<String, C1346c>[] hashMapArr = this.f3286d;
            C1346c c1346c = hashMapArr[1].get("MakerNote");
            if (c1346c != null) {
                C1345b c1345b2 = new C1345b(c1346c.f3305c);
                c1345b2.f3300b = this.f3288f;
                c1345b2.m10619a(6L);
                m10624u(c1345b2, 9);
                C1346c c1346c2 = hashMapArr[9].get("ColorSpace");
                if (c1346c2 != null) {
                    hashMapArr[1].put("ColorSpace", c1346c2);
                }
            }
        }
    }

    /* renamed from: m */
    public final void m10632m(C1345b c1345b) throws IOException {
        m10633l(c1345b);
        HashMap<String, C1346c>[] hashMapArr = this.f3286d;
        if (hashMapArr[0].get("JpgFromRaw") != null) {
            m10638g(c1345b, this.f3294l, 5);
        }
        C1346c c1346c = hashMapArr[0].get("ISO");
        C1346c c1346c2 = hashMapArr[1].get("PhotographicSensitivity");
        if (c1346c == null || c1346c2 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", c1346c);
    }

    /* renamed from: n */
    public final void m10631n(C1345b c1345b) throws IOException {
        if (f3269m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c1345b);
        }
        c1345b.f3300b = ByteOrder.LITTLE_ENDIAN;
        c1345b.skipBytes(f3253B.length);
        int readInt = c1345b.readInt() + 8;
        int skipBytes = c1345b.skipBytes(f3254C.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (c1345b.read(bArr) == 4) {
                    int readInt2 = c1345b.readInt();
                    int i = skipBytes + 4 + 4;
                    if (Arrays.equals(f3255D, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (c1345b.read(bArr2) == readInt2) {
                            this.f3290h = i;
                            m10625t(0, bArr2);
                            this.f3290h = i;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m10643b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i2 = i + readInt2;
                    if (i2 == readInt) {
                        return;
                    }
                    if (i2 <= readInt) {
                        int skipBytes2 = c1345b.skipBytes(readInt2);
                        if (skipBytes2 == readInt2) {
                            skipBytes = i + skipBytes2;
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: o */
    public final void m10630o(C1345b c1345b, HashMap hashMap) throws IOException {
        C1346c c1346c = (C1346c) hashMap.get("JPEGInterchangeFormat");
        C1346c c1346c2 = (C1346c) hashMap.get("JPEGInterchangeFormatLength");
        if (c1346c != null && c1346c2 != null) {
            int m10613f = c1346c.m10613f(this.f3288f);
            int m10613f2 = c1346c2.m10613f(this.f3288f);
            if (this.f3285c == 7) {
                m10613f += this.f3291i;
            }
            int min = Math.min(m10613f2, c1345b.f3301c - m10613f);
            if (m10613f > 0 && min > 0) {
                int i = this.f3290h + m10613f;
                if (this.f3284b == null && this.f3283a == null) {
                    c1345b.m10619a(i);
                    c1345b.readFully(new byte[min]);
                }
            }
            if (f3269m) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m10613f + ", length: " + min);
            }
        }
    }

    /* renamed from: p */
    public final boolean m10629p(HashMap hashMap) throws IOException {
        C1346c c1346c = (C1346c) hashMap.get("ImageLength");
        C1346c c1346c2 = (C1346c) hashMap.get("ImageWidth");
        if (c1346c == null || c1346c2 == null) {
            return false;
        }
        return c1346c.m10613f(this.f3288f) <= 512 && c1346c2.m10613f(this.f3288f) <= 512;
    }

    /* renamed from: q */
    public final void m10628q(C1345b c1345b, int i) throws IOException {
        ByteOrder m10626s = m10626s(c1345b);
        this.f3288f = m10626s;
        c1345b.f3300b = m10626s;
        int readUnsignedShort = c1345b.readUnsignedShort();
        int i2 = this.f3285c;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c1345b.readInt();
        if (readInt >= 8 && readInt < i) {
            int i3 = readInt - 8;
            if (i3 > 0 && c1345b.skipBytes(i3) != i3) {
                throw new IOException(C0235r.m12816a("Couldn't jump to first Ifd: ", i3));
            }
            return;
        }
        throw new IOException(C0235r.m12816a("Invalid first Ifd offset: ", readInt));
    }

    /* renamed from: r */
    public final void m10627r() {
        int i = 0;
        while (true) {
            HashMap<String, C1346c>[] hashMapArr = this.f3286d;
            if (i < hashMapArr.length) {
                StringBuilder m12536b = C0406q1.m12536b("The size of tag group[", i, "]: ");
                m12536b.append(hashMapArr[i].size());
                Log.d("ExifInterface", m12536b.toString());
                for (Map.Entry<String, C1346c> entry : hashMapArr[i].entrySet()) {
                    C1346c value = entry.getValue();
                    Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m10612g(this.f3288f) + "'");
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    public final void m10625t(int i, byte[] bArr) throws IOException {
        C1345b c1345b = new C1345b(bArr);
        m10628q(c1345b, bArr.length);
        m10624u(c1345b, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0177  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10624u(androidx.exifinterface.media.ExifInterface.C1345b r26, int r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m10624u(androidx.exifinterface.media.ExifInterface$b, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10623v(androidx.exifinterface.media.ExifInterface.C1345b r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m10623v(androidx.exifinterface.media.ExifInterface$b):void");
    }

    /* renamed from: w */
    public final void m10622w(int i, int i2) throws IOException {
        String str;
        HashMap<String, C1346c>[] hashMapArr = this.f3286d;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z = f3269m;
        if (isEmpty || hashMapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C1346c c1346c = hashMapArr[i].get("ImageLength");
        C1346c c1346c2 = hashMapArr[i].get("ImageWidth");
        C1346c c1346c3 = hashMapArr[i2].get("ImageLength");
        C1346c c1346c4 = hashMapArr[i2].get("ImageWidth");
        if (c1346c == null || c1346c2 == null) {
            if (!z) {
                return;
            }
            str = "First image does not contain valid size information";
        } else if (c1346c3 != null && c1346c4 != null) {
            int m10613f = c1346c.m10613f(this.f3288f);
            int m10613f2 = c1346c2.m10613f(this.f3288f);
            int m10613f3 = c1346c3.m10613f(this.f3288f);
            int m10613f4 = c1346c4.m10613f(this.f3288f);
            if (m10613f >= m10613f3 || m10613f2 >= m10613f4) {
                return;
            }
            HashMap<String, C1346c> hashMap = hashMapArr[i];
            hashMapArr[i] = hashMapArr[i2];
            hashMapArr[i2] = hashMap;
            return;
        } else if (!z) {
            return;
        } else {
            str = "Second image does not contain valid size information";
        }
        Log.d("ExifInterface", str);
    }

    /* renamed from: x */
    public final void m10621x(C1345b c1345b, int i) throws IOException {
        C1346c c1346c;
        StringBuilder sb;
        String arrays;
        C1346c m10615d;
        C1346c m10615d2;
        HashMap<String, C1346c>[] hashMapArr = this.f3286d;
        C1346c c1346c2 = hashMapArr[i].get("DefaultCropSize");
        C1346c c1346c3 = hashMapArr[i].get("SensorTopBorder");
        C1346c c1346c4 = hashMapArr[i].get("SensorLeftBorder");
        C1346c c1346c5 = hashMapArr[i].get("SensorBottomBorder");
        C1346c c1346c6 = hashMapArr[i].get("SensorRightBorder");
        if (c1346c2 != null) {
            if (c1346c2.f3303a == 5) {
                C1348e[] c1348eArr = (C1348e[]) c1346c2.m10611h(this.f3288f);
                if (c1348eArr != null && c1348eArr.length == 2) {
                    m10615d = C1346c.m10616c(c1348eArr[0], this.f3288f);
                    m10615d2 = C1346c.m10616c(c1348eArr[1], this.f3288f);
                    hashMapArr[i].put("ImageWidth", m10615d);
                    hashMapArr[i].put("ImageLength", m10615d2);
                    return;
                }
                sb = new StringBuilder("Invalid crop size values. cropSize=");
                arrays = Arrays.toString(c1348eArr);
                sb.append(arrays);
                Log.w("ExifInterface", sb.toString());
            }
            int[] iArr = (int[]) c1346c2.m10611h(this.f3288f);
            if (iArr != null && iArr.length == 2) {
                m10615d = C1346c.m10615d(iArr[0], this.f3288f);
                m10615d2 = C1346c.m10615d(iArr[1], this.f3288f);
                hashMapArr[i].put("ImageWidth", m10615d);
                hashMapArr[i].put("ImageLength", m10615d2);
                return;
            }
            sb = new StringBuilder("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(iArr);
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        } else if (c1346c3 != null && c1346c4 != null && c1346c5 != null && c1346c6 != null) {
            int m10613f = c1346c3.m10613f(this.f3288f);
            int m10613f2 = c1346c5.m10613f(this.f3288f);
            int m10613f3 = c1346c6.m10613f(this.f3288f);
            int m10613f4 = c1346c4.m10613f(this.f3288f);
            if (m10613f2 > m10613f && m10613f3 > m10613f4) {
                C1346c m10615d3 = C1346c.m10615d(m10613f2 - m10613f, this.f3288f);
                C1346c m10615d4 = C1346c.m10615d(m10613f3 - m10613f4, this.f3288f);
                hashMapArr[i].put("ImageLength", m10615d3);
                hashMapArr[i].put("ImageWidth", m10615d4);
            }
        } else {
            C1346c c1346c7 = hashMapArr[i].get("ImageLength");
            C1346c c1346c8 = hashMapArr[i].get("ImageWidth");
            if ((c1346c7 == null || c1346c8 == null) && (c1346c = hashMapArr[i].get("JPEGInterchangeFormat")) != null) {
                m10638g(c1345b, c1346c.m10613f(this.f3288f), i);
            }
        }
    }

    /* renamed from: y */
    public final void m10620y() throws IOException {
        m10622w(0, 5);
        m10622w(0, 4);
        m10622w(5, 4);
        HashMap<String, C1346c>[] hashMapArr = this.f3286d;
        C1346c c1346c = hashMapArr[1].get("PixelXDimension");
        C1346c c1346c2 = hashMapArr[1].get("PixelYDimension");
        if (c1346c != null && c1346c2 != null) {
            hashMapArr[0].put("ImageWidth", c1346c);
            hashMapArr[0].put("ImageLength", c1346c2);
        }
        if (hashMapArr[4].isEmpty() && m10629p(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (m10629p(hashMapArr[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }
}
