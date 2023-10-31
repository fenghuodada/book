package androidx.multidex;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* renamed from: androidx.multidex.d */
/* loaded from: classes.dex */
public final class C1528d {

    /* renamed from: androidx.multidex.d$a */
    /* loaded from: classes.dex */
    public static class C1529a {

        /* renamed from: a */
        public long f3527a;

        /* renamed from: b */
        public long f3528b;
    }

    /* renamed from: a */
    public static C1529a m10493a(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j = length - 65536;
        long j2 = j >= 0 ? j : 0L;
        int reverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                C1529a c1529a = new C1529a();
                c1529a.f3528b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                c1529a.f3527a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return c1529a;
            }
            length--;
        } while (length >= j2);
        throw new ZipException("End Of Central Directory signature not found");
    }
}
