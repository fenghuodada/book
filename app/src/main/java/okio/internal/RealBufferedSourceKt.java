package okio.internal;

import androidx.concurrent.futures.C0486c;
import com.applovin.impl.sdk.p033e.C3132a0;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10909a;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Timeout;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0080\b\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\r\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0080\b\u001a\r\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\r\u0010\u0014\u001a\u00020\u0013*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u0015\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0013H\u0080\b\u001a%\u0010\u0005\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0080\b\u001a\u001d\u0010\u0015\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0017H\u0080\b\u001a\r\u0010\u001a\u001a\u00020\u0019*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0019*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\u0019*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\u0011*\u00020\u0000H\u0080\b\u001a\r\u0010 \u001a\u00020\u001f*\u00020\u0000H\u0080\b\u001a\r\u0010!\u001a\u00020\u001f*\u00020\u0000H\u0080\b\u001a\r\u0010\"\u001a\u00020\u0011*\u00020\u0000H\u0080\b\u001a\r\u0010#\u001a\u00020\u0011*\u00020\u0000H\u0080\b\u001a\r\u0010$\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\r\u0010%\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\r\u0010&\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\r\u0010'\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\u0015\u0010(\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a%\u0010,\u001a\u00020\u0003*\u00020\u00002\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0080\b\u001a\u001d\u0010,\u001a\u00020\u0003*\u00020\u00002\u0006\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0003H\u0080\b\u001a\u001d\u0010/\u001a\u00020\u0003*\u00020\u00002\u0006\u0010.\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0003H\u0080\b\u001a-\u00101\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\r2\u0006\u00100\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0080\b\u001a\r\u00103\u001a\u000202*\u00020\u0000H\u0080\b\u001a\r\u00104\u001a\u00020\b*\u00020\u0000H\u0080\b\u001a\r\u00106\u001a\u000205*\u00020\u0000H\u0080\b\u001a\r\u00107\u001a\u00020\u0019*\u00020\u0000H\u0080\b¨\u00068"}, m508d2 = {"Lokio/RealBufferedSource;", "Lokio/Buffer;", "sink", "", "byteCount", "commonRead", "", "commonExhausted", "Lkotlin/p;", "commonRequire", "commonRequest", "", "commonReadByte", "Lokio/ByteString;", "commonReadByteString", "Lokio/Options;", "options", "", "commonSelect", "", "commonReadByteArray", "commonReadFully", "offset", "Lokio/Sink;", "commonReadAll", "", "commonReadUtf8", "commonReadUtf8Line", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "", "commonReadShort", "commonReadShortLe", "commonReadInt", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonSkip", "b", "fromIndex", "toIndex", "commonIndexOf", "bytes", "targetBytes", "commonIndexOfElement", "bytesOffset", "commonRangeEquals", "Lokio/BufferedSource;", "commonPeek", "commonClose", "Lokio/Timeout;", "commonTimeout", "commonToString", "okio"}, m507k = 2, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RealBufferedSourceKt {
    public static final void commonClose(@NotNull RealBufferedSource commonClose) {
        C10843j.m430f(commonClose, "$this$commonClose");
        if (commonClose.closed) {
            return;
        }
        commonClose.closed = true;
        commonClose.source.close();
        commonClose.bufferField.clear();
    }

    public static final boolean commonExhausted(@NotNull RealBufferedSource commonExhausted) {
        C10843j.m430f(commonExhausted, "$this$commonExhausted");
        if (!commonExhausted.closed) {
            return commonExhausted.bufferField.exhausted() && commonExhausted.source.read(commonExhausted.bufferField, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long commonIndexOf(@NotNull RealBufferedSource commonIndexOf, byte b, long j, long j2) {
        C10843j.m430f(commonIndexOf, "$this$commonIndexOf");
        boolean z = true;
        if (!commonIndexOf.closed) {
            if ((0 > j || j2 < j) ? false : false) {
                while (j < j2) {
                    long indexOf = commonIndexOf.bufferField.indexOf(b, j, j2);
                    if (indexOf != -1) {
                        return indexOf;
                    }
                    long size = commonIndexOf.bufferField.size();
                    if (size >= j2 || commonIndexOf.source.read(commonIndexOf.bufferField, 8192) == -1) {
                        break;
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

    public static final long commonIndexOf(@NotNull RealBufferedSource commonIndexOf, @NotNull ByteString bytes, long j) {
        C10843j.m430f(commonIndexOf, "$this$commonIndexOf");
        C10843j.m430f(bytes, "bytes");
        if (!(!commonIndexOf.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long indexOf = commonIndexOf.bufferField.indexOf(bytes, j);
            if (indexOf != -1) {
                return indexOf;
            }
            long size = commonIndexOf.bufferField.size();
            if (commonIndexOf.source.read(commonIndexOf.bufferField, 8192) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - bytes.size()) + 1);
        }
    }

    public static final long commonIndexOfElement(@NotNull RealBufferedSource commonIndexOfElement, @NotNull ByteString targetBytes, long j) {
        C10843j.m430f(commonIndexOfElement, "$this$commonIndexOfElement");
        C10843j.m430f(targetBytes, "targetBytes");
        if (!(!commonIndexOfElement.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long indexOfElement = commonIndexOfElement.bufferField.indexOfElement(targetBytes, j);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long size = commonIndexOfElement.bufferField.size();
            if (commonIndexOfElement.source.read(commonIndexOfElement.bufferField, 8192) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    @NotNull
    public static final BufferedSource commonPeek(@NotNull RealBufferedSource commonPeek) {
        C10843j.m430f(commonPeek, "$this$commonPeek");
        return Okio.buffer(new PeekSource(commonPeek));
    }

    public static final boolean commonRangeEquals(@NotNull RealBufferedSource commonRangeEquals, long j, @NotNull ByteString bytes, int i, int i2) {
        C10843j.m430f(commonRangeEquals, "$this$commonRangeEquals");
        C10843j.m430f(bytes, "bytes");
        if (!commonRangeEquals.closed) {
            if (j < 0 || i < 0 || i2 < 0 || bytes.size() - i < i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = i3 + j;
                if (!commonRangeEquals.request(1 + j2) || commonRangeEquals.bufferField.getByte(j2) != bytes.getByte(i + i3)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final int commonRead(@NotNull RealBufferedSource commonRead, @NotNull byte[] sink, int i, int i2) {
        C10843j.m430f(commonRead, "$this$commonRead");
        C10843j.m430f(sink, "sink");
        long j = i2;
        Util.checkOffsetAndCount(sink.length, i, j);
        if (commonRead.bufferField.size() == 0 && commonRead.source.read(commonRead.bufferField, 8192) == -1) {
            return -1;
        }
        return commonRead.bufferField.read(sink, i, (int) Math.min(j, commonRead.bufferField.size()));
    }

    public static final long commonRead(@NotNull RealBufferedSource commonRead, @NotNull Buffer sink, long j) {
        boolean z;
        C10843j.m430f(commonRead, "$this$commonRead");
        C10843j.m430f(sink, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!commonRead.closed) {
                if (commonRead.bufferField.size() == 0 && commonRead.source.read(commonRead.bufferField, 8192) == -1) {
                    return -1L;
                }
                return commonRead.bufferField.read(sink, Math.min(j, commonRead.bufferField.size()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount < 0: ", j).toString());
    }

    public static final long commonReadAll(@NotNull RealBufferedSource commonReadAll, @NotNull Sink sink) {
        C10843j.m430f(commonReadAll, "$this$commonReadAll");
        C10843j.m430f(sink, "sink");
        long j = 0;
        while (commonReadAll.source.read(commonReadAll.bufferField, 8192) != -1) {
            long completeSegmentByteCount = commonReadAll.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(commonReadAll.bufferField, completeSegmentByteCount);
            }
        }
        if (commonReadAll.bufferField.size() > 0) {
            long size = j + commonReadAll.bufferField.size();
            Buffer buffer = commonReadAll.bufferField;
            sink.write(buffer, buffer.size());
            return size;
        }
        return j;
    }

    public static final byte commonReadByte(@NotNull RealBufferedSource commonReadByte) {
        C10843j.m430f(commonReadByte, "$this$commonReadByte");
        commonReadByte.require(1L);
        return commonReadByte.bufferField.readByte();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull RealBufferedSource commonReadByteArray) {
        C10843j.m430f(commonReadByteArray, "$this$commonReadByteArray");
        commonReadByteArray.bufferField.writeAll(commonReadByteArray.source);
        return commonReadByteArray.bufferField.readByteArray();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull RealBufferedSource commonReadByteArray, long j) {
        C10843j.m430f(commonReadByteArray, "$this$commonReadByteArray");
        commonReadByteArray.require(j);
        return commonReadByteArray.bufferField.readByteArray(j);
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull RealBufferedSource commonReadByteString) {
        C10843j.m430f(commonReadByteString, "$this$commonReadByteString");
        commonReadByteString.bufferField.writeAll(commonReadByteString.source);
        return commonReadByteString.bufferField.readByteString();
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull RealBufferedSource commonReadByteString, long j) {
        C10843j.m430f(commonReadByteString, "$this$commonReadByteString");
        commonReadByteString.require(j);
        return commonReadByteString.bufferField.readByteString(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        kotlin.text.C10909a.m407a(16);
        kotlin.text.C10909a.m407a(16);
        r0 = java.lang.Integer.toString(r8, 16);
        kotlin.jvm.internal.C10843j.m431e(r0, "java.lang.Integer.toStri…(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9] or '-' character but was 0x".concat(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull okio.RealBufferedSource r10) {
        /*
            java.lang.String r0 = "$this$commonReadDecimalLong"
            kotlin.jvm.internal.C10843j.m430f(r10, r0)
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        Ld:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L51
            okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L25
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2f
        L25:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L31
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2f
            goto L31
        L2f:
            r4 = r6
            goto Ld
        L31:
            if (r4 == 0) goto L34
            goto L51
        L34:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            r0 = 16
            kotlin.text.C10909a.m407a(r0)
            kotlin.text.C10909a.m407a(r0)
            java.lang.String r0 = java.lang.Integer.toString(r8, r0)
            java.lang.String r1 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.C10843j.m431e(r0, r1)
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r10.<init>(r0)
            throw r10
        L51:
            okio.Buffer r10 = r10.bufferField
            long r0 = r10.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.RealBufferedSourceKt.commonReadDecimalLong(okio.RealBufferedSource):long");
    }

    public static final void commonReadFully(@NotNull RealBufferedSource commonReadFully, @NotNull Buffer sink, long j) {
        C10843j.m430f(commonReadFully, "$this$commonReadFully");
        C10843j.m430f(sink, "sink");
        try {
            commonReadFully.require(j);
            commonReadFully.bufferField.readFully(sink, j);
        } catch (EOFException e) {
            sink.writeAll(commonReadFully.bufferField);
            throw e;
        }
    }

    public static final void commonReadFully(@NotNull RealBufferedSource commonReadFully, @NotNull byte[] sink) {
        C10843j.m430f(commonReadFully, "$this$commonReadFully");
        C10843j.m430f(sink, "sink");
        try {
            commonReadFully.require(sink.length);
            commonReadFully.bufferField.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (commonReadFully.bufferField.size() > 0) {
                Buffer buffer = commonReadFully.bufferField;
                int read = buffer.read(sink, i, (int) buffer.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(@NotNull RealBufferedSource commonReadHexadecimalUnsignedLong) {
        byte b;
        C10843j.m430f(commonReadHexadecimalUnsignedLong, "$this$commonReadHexadecimalUnsignedLong");
        commonReadHexadecimalUnsignedLong.require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!commonReadHexadecimalUnsignedLong.request(i2)) {
                break;
            }
            b = commonReadHexadecimalUnsignedLong.bufferField.getByte(i);
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
        return commonReadHexadecimalUnsignedLong.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(@NotNull RealBufferedSource commonReadInt) {
        C10843j.m430f(commonReadInt, "$this$commonReadInt");
        commonReadInt.require(4L);
        return commonReadInt.bufferField.readInt();
    }

    public static final int commonReadIntLe(@NotNull RealBufferedSource commonReadIntLe) {
        C10843j.m430f(commonReadIntLe, "$this$commonReadIntLe");
        commonReadIntLe.require(4L);
        return commonReadIntLe.bufferField.readIntLe();
    }

    public static final long commonReadLong(@NotNull RealBufferedSource commonReadLong) {
        C10843j.m430f(commonReadLong, "$this$commonReadLong");
        commonReadLong.require(8L);
        return commonReadLong.bufferField.readLong();
    }

    public static final long commonReadLongLe(@NotNull RealBufferedSource commonReadLongLe) {
        C10843j.m430f(commonReadLongLe, "$this$commonReadLongLe");
        commonReadLongLe.require(8L);
        return commonReadLongLe.bufferField.readLongLe();
    }

    public static final short commonReadShort(@NotNull RealBufferedSource commonReadShort) {
        C10843j.m430f(commonReadShort, "$this$commonReadShort");
        commonReadShort.require(2L);
        return commonReadShort.bufferField.readShort();
    }

    public static final short commonReadShortLe(@NotNull RealBufferedSource commonReadShortLe) {
        C10843j.m430f(commonReadShortLe, "$this$commonReadShortLe");
        commonReadShortLe.require(2L);
        return commonReadShortLe.bufferField.readShortLe();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull RealBufferedSource commonReadUtf8) {
        C10843j.m430f(commonReadUtf8, "$this$commonReadUtf8");
        commonReadUtf8.bufferField.writeAll(commonReadUtf8.source);
        return commonReadUtf8.bufferField.readUtf8();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull RealBufferedSource commonReadUtf8, long j) {
        C10843j.m430f(commonReadUtf8, "$this$commonReadUtf8");
        commonReadUtf8.require(j);
        return commonReadUtf8.bufferField.readUtf8(j);
    }

    public static final int commonReadUtf8CodePoint(@NotNull RealBufferedSource commonReadUtf8CodePoint) {
        long j;
        C10843j.m430f(commonReadUtf8CodePoint, "$this$commonReadUtf8CodePoint");
        commonReadUtf8CodePoint.require(1L);
        byte b = commonReadUtf8CodePoint.bufferField.getByte(0L);
        if ((b & 224) == 192) {
            j = 2;
        } else if ((b & 240) != 224) {
            if ((b & 248) == 240) {
                j = 4;
            }
            return commonReadUtf8CodePoint.bufferField.readUtf8CodePoint();
        } else {
            j = 3;
        }
        commonReadUtf8CodePoint.require(j);
        return commonReadUtf8CodePoint.bufferField.readUtf8CodePoint();
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull RealBufferedSource commonReadUtf8Line) {
        C10843j.m430f(commonReadUtf8Line, "$this$commonReadUtf8Line");
        long indexOf = commonReadUtf8Line.indexOf((byte) 10);
        if (indexOf == -1) {
            if (commonReadUtf8Line.bufferField.size() != 0) {
                return commonReadUtf8Line.readUtf8(commonReadUtf8Line.bufferField.size());
            }
            return null;
        }
        return BufferKt.readUtf8Line(commonReadUtf8Line.bufferField, indexOf);
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull RealBufferedSource commonReadUtf8LineStrict, long j) {
        boolean z;
        long j2;
        C10843j.m430f(commonReadUtf8LineStrict, "$this$commonReadUtf8LineStrict");
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
            long indexOf = commonReadUtf8LineStrict.indexOf(b, 0L, j2);
            if (indexOf != -1) {
                return BufferKt.readUtf8Line(commonReadUtf8LineStrict.bufferField, indexOf);
            }
            if (j2 < Long.MAX_VALUE && commonReadUtf8LineStrict.request(j2) && commonReadUtf8LineStrict.bufferField.getByte(j2 - 1) == ((byte) 13) && commonReadUtf8LineStrict.request(1 + j2) && commonReadUtf8LineStrict.bufferField.getByte(j2) == b) {
                return BufferKt.readUtf8Line(commonReadUtf8LineStrict.bufferField, j2);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = commonReadUtf8LineStrict.bufferField;
            buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(commonReadUtf8LineStrict.bufferField.size(), j) + " content=" + buffer.readByteString().hex() + "…");
        }
        throw new IllegalArgumentException(C3132a0.m7696a("limit < 0: ", j).toString());
    }

    public static final boolean commonRequest(@NotNull RealBufferedSource commonRequest, long j) {
        boolean z;
        C10843j.m430f(commonRequest, "$this$commonRequest");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!commonRequest.closed) {
                while (commonRequest.bufferField.size() < j) {
                    if (commonRequest.source.read(commonRequest.bufferField, 8192) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount < 0: ", j).toString());
    }

    public static final void commonRequire(@NotNull RealBufferedSource commonRequire, long j) {
        C10843j.m430f(commonRequire, "$this$commonRequire");
        if (!commonRequire.request(j)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(@NotNull RealBufferedSource commonSelect, @NotNull Options options) {
        C10843j.m430f(commonSelect, "$this$commonSelect");
        C10843j.m430f(options, "options");
        if (!commonSelect.closed) {
            do {
                int selectPrefix = BufferKt.selectPrefix(commonSelect.bufferField, options, true);
                if (selectPrefix != -2) {
                    if (selectPrefix != -1) {
                        commonSelect.bufferField.skip(options.getByteStrings$okio()[selectPrefix].size());
                        return selectPrefix;
                    }
                    return -1;
                }
            } while (commonSelect.source.read(commonSelect.bufferField, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final void commonSkip(@NotNull RealBufferedSource commonSkip, long j) {
        C10843j.m430f(commonSkip, "$this$commonSkip");
        if (!(!commonSkip.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (commonSkip.bufferField.size() == 0 && commonSkip.source.read(commonSkip.bufferField, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, commonSkip.bufferField.size());
            commonSkip.bufferField.skip(min);
            j -= min;
        }
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull RealBufferedSource commonTimeout) {
        C10843j.m430f(commonTimeout, "$this$commonTimeout");
        return commonTimeout.source.timeout();
    }

    @NotNull
    public static final String commonToString(@NotNull RealBufferedSource commonToString) {
        C10843j.m430f(commonToString, "$this$commonToString");
        return "buffer(" + commonToString.source + ')';
    }
}
