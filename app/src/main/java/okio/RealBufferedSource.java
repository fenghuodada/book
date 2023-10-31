package okio;

import androidx.concurrent.futures.C0486c;
import com.applovin.impl.sdk.p033e.C3132a0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10909a;
import okio.internal.BufferKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0015H\u0016J \u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0016J\u0010\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0019H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0013H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020\u0013H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\rH\u0016J\u0018\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\r2\u0006\u00101\u001a\u00020\u0005H\u0016J \u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000fH\u0016J\u0018\u00100\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0005H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000fH\u0016J\u0018\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0005H\u0016J\u0018\u00106\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000fH\u0016J(\u00106\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0016J\b\u00108\u001a\u00020\u0001H\u0016J\b\u0010:\u001a\u000209H\u0016J\b\u0010;\u001a\u00020\bH\u0016J\b\u0010<\u001a\u00020\nH\u0016J\b\u0010>\u001a\u00020=H\u0016J\b\u0010?\u001a\u00020\u001cH\u0016R\u0014\u0010@\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001b\u0010\u0003\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bI\u0010J\u001a\u0004\bG\u0010H¨\u0006M"}, m508d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "Lokio/Buffer;", "buffer", "sink", "", "byteCount", "read", "", "exhausted", "Lkotlin/p;", "require", "request", "", "readByte", "Lokio/ByteString;", "readByteString", "Lokio/Options;", "options", "", "select", "", "readByteArray", "readFully", "offset", "Ljava/nio/ByteBuffer;", "Lokio/Sink;", "readAll", "", "readUtf8", "Ljava/nio/charset/Charset;", "charset", "readString", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "", "readShort", "readShortLe", "readInt", "readIntLe", "readLong", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "skip", "b", "indexOf", "fromIndex", "toIndex", "bytes", "targetBytes", "indexOfElement", "rangeEquals", "bytesOffset", "peek", "Ljava/io/InputStream;", "inputStream", "isOpen", "close", "Lokio/Timeout;", "timeout", "toString", "bufferField", "Lokio/Buffer;", "closed", "Z", "Lokio/Source;", FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "getBuffer", "()Lokio/Buffer;", "getBuffer$annotations", "()V", "<init>", "(Lokio/Source;)V", "okio"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RealBufferedSource implements BufferedSource {
    @JvmField
    @NotNull
    public final Buffer bufferField;
    @JvmField
    public boolean closed;
    @JvmField
    @NotNull
    public final Source source;

    public RealBufferedSource(@NotNull Source source) {
        C10843j.m430f(source, "source");
        this.source = source;
        this.bufferField = new Buffer();
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer buffer() {
        return this.bufferField;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        if (!this.closed) {
            return this.bufferField.exhausted() && this.source.read(this.bufferField, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j) {
        return indexOf(b, j, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j, long j2) {
        boolean z = true;
        if (!this.closed) {
            if ((0 > j || j2 < j) ? false : false) {
                while (j < j2) {
                    long indexOf = this.bufferField.indexOf(b, j, j2);
                    if (indexOf != -1) {
                        return indexOf;
                    }
                    long size = this.bufferField.size();
                    if (size >= j2 || this.source.read(this.bufferField, 8192) == -1) {
                        return -1L;
                    }
                    j = Math.max(j, size);
                }
                return -1L;
            }
            StringBuilder m12390a = C0486c.m12390a("fromIndex=", j, " toIndex=");
            m12390a.append(j2);
            throw new IllegalArgumentException(m12390a.toString().toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes) {
        C10843j.m430f(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes, long j) {
        C10843j.m430f(bytes, "bytes");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long indexOf = this.bufferField.indexOf(bytes, j);
            if (indexOf != -1) {
                return indexOf;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - bytes.size()) + 1);
        }
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes) {
        C10843j.m430f(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes, long j) {
        C10843j.m430f(targetBytes, "targetBytes");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long indexOfElement = this.bufferField.indexOfElement(targetBytes, j);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.RealBufferedSource$inputStream$1
            @Override // java.io.InputStream
            public int available() {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (realBufferedSource.closed) {
                    throw new IOException("closed");
                }
                return (int) Math.min(realBufferedSource.bufferField.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                RealBufferedSource.this.close();
            }

            @Override // java.io.InputStream
            public int read() {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (realBufferedSource.closed) {
                    throw new IOException("closed");
                }
                if (realBufferedSource.bufferField.size() == 0) {
                    RealBufferedSource realBufferedSource2 = RealBufferedSource.this;
                    if (realBufferedSource2.source.read(realBufferedSource2.bufferField, 8192) == -1) {
                        return -1;
                    }
                }
                return RealBufferedSource.this.bufferField.readByte() & 255;
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] data, int i, int i2) {
                C10843j.m430f(data, "data");
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                }
                Util.checkOffsetAndCount(data.length, i, i2);
                if (RealBufferedSource.this.bufferField.size() == 0) {
                    RealBufferedSource realBufferedSource = RealBufferedSource.this;
                    if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192) == -1) {
                        return -1;
                    }
                }
                return RealBufferedSource.this.bufferField.read(data, i, i2);
            }

            @NotNull
            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, @NotNull ByteString bytes) {
        C10843j.m430f(bytes, "bytes");
        return rangeEquals(j, bytes, 0, bytes.size());
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, @NotNull ByteString bytes, int i, int i2) {
        int i3;
        C10843j.m430f(bytes, "bytes");
        if (!this.closed) {
            if (j >= 0 && i >= 0 && i2 >= 0 && bytes.size() - i >= i2) {
                for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                    long j2 = i3 + j;
                    i3 = (request(1 + j2) && this.bufferField.getByte(j2) == bytes.getByte(i + i3)) ? i3 + 1 : 0;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) {
        C10843j.m430f(sink, "sink");
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink) {
        C10843j.m430f(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink, int i, int i2) {
        C10843j.m430f(sink, "sink");
        long j = i2;
        Util.checkOffsetAndCount(sink.length, i, j);
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192) == -1) {
            return -1;
        }
        return this.bufferField.read(sink, i, (int) Math.min(j, this.bufferField.size()));
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j) {
        boolean z;
        C10843j.m430f(sink, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.closed) {
                if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192) == -1) {
                    return -1L;
                }
                return this.bufferField.read(sink, Math.min(j, this.bufferField.size()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount < 0: ", j).toString());
    }

    @Override // okio.BufferedSource
    public long readAll(@NotNull Sink sink) {
        C10843j.m430f(sink, "sink");
        long j = 0;
        while (this.source.read(this.bufferField, 8192) != -1) {
            long completeSegmentByteCount = this.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(this.bufferField, completeSegmentByteCount);
            }
        }
        if (this.bufferField.size() > 0) {
            long size = j + this.bufferField.size();
            Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
            return size;
        }
        return j;
    }

    @Override // okio.BufferedSource
    public byte readByte() {
        require(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteArray();
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long j) {
        require(j);
        return this.bufferField.readByteArray(j);
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long j) {
        require(j);
        return this.bufferField.readByteString(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        kotlin.text.C10909a.m407a(16);
        kotlin.text.C10909a.m407a(16);
        r1 = java.lang.Integer.toString(r8, 16);
        kotlin.jvm.internal.C10843j.m431e(r1, "java.lang.Integer.toStri…(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9] or '-' character but was 0x".concat(r1));
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() {
        /*
            r10 = this;
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L4c
            okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r4 == 0) goto L2f
            goto L4c
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            kotlin.text.C10909a.m407a(r1)
            kotlin.text.C10909a.m407a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.C10843j.m431e(r1, r2)
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L4c:
            okio.Buffer r0 = r10.bufferField
            long r0 = r0.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.RealBufferedSource.readDecimalLong():long");
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull Buffer sink, long j) {
        C10843j.m430f(sink, "sink");
        try {
            require(j);
            this.bufferField.readFully(sink, j);
        } catch (EOFException e) {
            sink.writeAll(this.bufferField);
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] sink) {
        C10843j.m430f(sink, "sink");
        try {
            require(sink.length);
            this.bufferField.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (this.bufferField.size() > 0) {
                Buffer buffer = this.bufferField;
                int read = buffer.read(sink, i, (int) buffer.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() {
        byte b;
        require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            b = this.bufferField.getByte(i);
            if ((b < ((byte) 48) || b > ((byte) 57)) && ((b < ((byte) 97) || b > ((byte) 102)) && (b < ((byte) 65) || b > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            C10909a.m407a(16);
            C10909a.m407a(16);
            String num = Integer.toString(b, 16);
            C10843j.m431e(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    @Override // okio.BufferedSource
    public int readInt() {
        require(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.BufferedSource
    public int readIntLe() {
        require(4L);
        return this.bufferField.readIntLe();
    }

    @Override // okio.BufferedSource
    public long readLong() {
        require(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.BufferedSource
    public long readLongLe() {
        require(8L);
        return this.bufferField.readLongLe();
    }

    @Override // okio.BufferedSource
    public short readShort() {
        require(2L);
        return this.bufferField.readShort();
    }

    @Override // okio.BufferedSource
    public short readShortLe() {
        require(2L);
        return this.bufferField.readShortLe();
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(long j, @NotNull Charset charset) {
        C10843j.m430f(charset, "charset");
        require(j);
        return this.bufferField.readString(j, charset);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) {
        C10843j.m430f(charset, "charset");
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readUtf8();
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long j) {
        require(j);
        return this.bufferField.readUtf8(j);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() {
        long j;
        require(1L);
        byte b = this.bufferField.getByte(0L);
        if ((b & 224) == 192) {
            j = 2;
        } else if ((b & 240) != 224) {
            if ((b & 248) == 240) {
                j = 4;
            }
            return this.bufferField.readUtf8CodePoint();
        } else {
            j = 3;
        }
        require(j);
        return this.bufferField.readUtf8CodePoint();
    }

    @Override // okio.BufferedSource
    @Nullable
    public String readUtf8Line() {
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            if (this.bufferField.size() != 0) {
                return readUtf8(this.bufferField.size());
            }
            return null;
        }
        return BufferKt.readUtf8Line(this.bufferField, indexOf);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long j) {
        boolean z;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long indexOf = indexOf(b, 0L, j2);
            if (indexOf != -1) {
                return BufferKt.readUtf8Line(this.bufferField, indexOf);
            }
            if (j2 < Long.MAX_VALUE && request(j2) && this.bufferField.getByte(j2 - 1) == ((byte) 13) && request(1 + j2) && this.bufferField.getByte(j2) == b) {
                return BufferKt.readUtf8Line(this.bufferField, j2);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = this.bufferField;
            buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.size(), j) + " content=" + buffer.readByteString().hex() + "…");
        }
        throw new IllegalArgumentException(C3132a0.m7696a("limit < 0: ", j).toString());
    }

    @Override // okio.BufferedSource
    public boolean request(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.closed) {
                while (this.bufferField.size() < j) {
                    if (this.source.read(this.bufferField, 8192) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount < 0: ", j).toString());
    }

    @Override // okio.BufferedSource
    public void require(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(@NotNull Options options) {
        C10843j.m430f(options, "options");
        if (!this.closed) {
            while (true) {
                int selectPrefix = BufferKt.selectPrefix(this.bufferField, options, true);
                if (selectPrefix == -2) {
                    if (this.source.read(this.bufferField, 8192) == -1) {
                        break;
                    }
                } else if (selectPrefix != -1) {
                    this.bufferField.skip(options.getByteStrings$okio()[selectPrefix].size());
                    return selectPrefix;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource
    public void skip(long j) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.bufferField.size());
            this.bufferField.skip(min);
            j -= min;
        }
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.source.timeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.source + ')';
    }
}
