package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.util.a */
/* loaded from: classes.dex */
public final class C3846a {

    /* renamed from: a */
    public static final AtomicReference<byte[]> f9931a = new AtomicReference<>();

    /* renamed from: com.bumptech.glide.util.a$a */
    /* loaded from: classes.dex */
    public static class C3847a extends InputStream {
        @NonNull

        /* renamed from: a */
        public final ByteBuffer f9932a;

        /* renamed from: b */
        public int f9933b = -1;

        public C3847a(@NonNull ByteBuffer byteBuffer) {
            this.f9932a = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f9932a.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i) {
            this.f9933b = this.f9932a.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.f9932a;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
            ByteBuffer byteBuffer = this.f9932a;
            if (byteBuffer.hasRemaining()) {
                int min = Math.min(i2, available());
                byteBuffer.get(bArr, i, min);
                return min;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() throws IOException {
            int i = this.f9933b;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f9932a.position(i);
        }

        @Override // java.io.InputStream
        public final long skip(long j) throws IOException {
            ByteBuffer byteBuffer = this.f9932a;
            if (byteBuffer.hasRemaining()) {
                long min = Math.min(j, available());
                byteBuffer.position((int) (byteBuffer.position() + min));
                return min;
            }
            return -1L;
        }
    }

    /* renamed from: com.bumptech.glide.util.a$b */
    /* loaded from: classes.dex */
    public static final class C3848b {

        /* renamed from: a */
        public final int f9934a;

        /* renamed from: b */
        public final int f9935b;

        /* renamed from: c */
        public final byte[] f9936c;

        public C3848b(@NonNull byte[] bArr, int i, int i2) {
            this.f9936c = bArr;
            this.f9934a = i;
            this.f9935b = i2;
        }
    }

    @NonNull
    /* renamed from: a */
    public static MappedByteBuffer m6419a(@NonNull File file) throws IOException {
        RandomAccessFile randomAccessFile;
        Throwable th;
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel = null;
                    }
                    try {
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        try {
                            fileChannel.close();
                        } catch (IOException unused) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        return load;
                    } catch (Throwable th3) {
                        th = th3;
                        Throwable th4 = th;
                        fileChannel2 = fileChannel;
                        th = th4;
                        if (fileChannel2 != null) {
                            try {
                                fileChannel2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
                throw new IOException("File unsuitable for memory mapping");
            }
            throw new IOException("File too large to map into memory");
        } catch (Throwable th5) {
            th = th5;
            randomAccessFile = null;
        }
    }

    /* renamed from: b */
    public static void m6418b(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws IOException {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            fileChannel = randomAccessFile.getChannel();
            fileChannel.write(byteBuffer);
            fileChannel.force(false);
            fileChannel.close();
            randomAccessFile.close();
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }
}
