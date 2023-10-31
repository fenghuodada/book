package okio.internal;

import androidx.appcompat.view.menu.C0235r;
import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1194j;
import com.applovin.impl.sdk.p033e.C3132a0;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.collections.C10751g;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10843j;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ByteString;
import okio.Options;
import okio.Platform;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000f\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aA\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000b2\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0011H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0018\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\bH\u0000\u001a%\u0010\u001c\u001a\u00020\n*\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u001e*\u00020\nH\u0080\b\u001a\r\u0010!\u001a\u00020 *\u00020\nH\u0080\b\u001a\r\u0010\"\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a\r\u0010#\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\u0015\u0010%\u001a\u00020\u001e*\u00020\n2\u0006\u0010$\u001a\u00020\u000bH\u0080\b\u001a\r\u0010'\u001a\u00020&*\u00020\nH\u0080\b\u001a\u0015\u0010(\u001a\u00020&*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a)\u0010+\u001a\u00020\n*\u00020\n2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010.\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u0015\u00100\u001a\u00020\u0000*\u00020\n2\u0006\u0010/\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010+\u001a\u00020\n*\u00020\n2\u0006\u00101\u001a\u00020\u0004H\u0080\b\u001a%\u0010+\u001a\u00020\n*\u00020\n2\u0006\u00101\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\r\u00102\u001a\u00020\u0004*\u00020\nH\u0080\b\u001a\u0015\u00102\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u00104\u001a\u00020\u0002*\u00020\n2\u0006\u00103\u001a\u00020\u0004H\u0080\b\u001a\u0015\u00105\u001a\u00020&*\u00020\n2\u0006\u00103\u001a\u00020\u0004H\u0080\b\u001a%\u00104\u001a\u00020\u0002*\u00020\n2\u0006\u00103\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\r\u00106\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u00107\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u00108\u001a\u00020)*\u00020\nH\u0080\b\u001a\u0015\u00108\u001a\u00020)*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u00109\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0080\b\u001a\u001d\u00105\u001a\u00020&*\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010;\u001a\u00020\u000b*\u00020\n2\u0006\u00103\u001a\u00020:H\u0080\b\u001a\u0015\u0010<\u001a\u00020\r*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u000f\u0010=\u001a\u0004\u0018\u00010\r*\u00020\nH\u0080\b\u001a\u0015\u0010?\u001a\u00020\r*\u00020\n2\u0006\u0010>\u001a\u00020\u000bH\u0080\b\u001a\r\u0010@\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a%\u0010D\u001a\u00020\n*\u00020\n2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010F\u001a\u00020\n*\u00020\n2\u0006\u0010E\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010H\u001a\u00020\u000b*\u00020\n2\u0006\u00101\u001a\u00020GH\u0080\b\u001a\u001d\u0010+\u001a\u00020\n*\u00020\n2\u0006\u00101\u001a\u00020G2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010L\u001a\u00020\n*\u00020\n2\u0006\u0010K\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010+\u001a\u00020&*\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u001d\u00104\u001a\u00020\u000b*\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a%\u0010Q\u001a\u00020\u000b*\u00020\n2\u0006\u0010I\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010S\u001a\u00020\u000b*\u00020\n2\u0006\u0010R\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000bH\u0080\b\u001a-\u0010T\u001a\u00020\b*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\u0017\u0010W\u001a\u00020\b*\u00020\n2\b\u0010V\u001a\u0004\u0018\u00010UH\u0080\b\u001a\r\u0010X\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a\r\u0010Y\u001a\u00020\n*\u00020\nH\u0080\b\u001a\r\u0010Z\u001a\u00020)*\u00020\nH\u0080\b\u001a\u0015\u0010Z\u001a\u00020)*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\"\u001a\u0010[\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0014\u0010_\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b_\u0010`\"\u0014\u0010a\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\ba\u0010b\"\u0014\u0010c\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\bc\u0010b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006d"}, m508d2 = {"Lokio/Segment;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "rangeEquals", "Lokio/Buffer;", "", "newline", "", "readUtf8Line", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "fromIndex", "Lkotlin/Function2;", "lambda", "seek", "(Lokio/Buffer;JLkotlin/jvm/functions/p;)Ljava/lang/Object;", "Lokio/Options;", "options", "selectTruncated", "selectPrefix", "out", "offset", "byteCount", "commonCopyTo", "commonCompleteSegmentByteCount", "", "commonReadByte", "", "commonReadShort", "commonReadInt", "commonReadLong", "pos", "commonGet", "Lkotlin/p;", "commonClear", "commonSkip", "Lokio/ByteString;", "byteString", "commonWrite", "v", "commonWriteDecimalLong", "commonWriteHexadecimalUnsignedLong", "minimumCapacity", "commonWritableSegment", FirebaseAnalytics.Param.SOURCE, "commonReadByteArray", "sink", "commonRead", "commonReadFully", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonReadByteString", "commonSelect", "Lokio/Sink;", "commonReadAll", "commonReadUtf8", "commonReadUtf8Line", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "string", "beginIndex", "endIndex", "commonWriteUtf8", "codePoint", "commonWriteUtf8CodePoint", "Lokio/Source;", "commonWriteAll", "b", "commonWriteByte", "s", "commonWriteShort", "i", "commonWriteInt", "commonWriteLong", "toIndex", "commonIndexOf", "targetBytes", "commonIndexOfElement", "commonRangeEquals", "", "other", "commonEquals", "commonHashCode", "commonCopy", "commonSnapshot", "HEX_DIGIT_BYTES", "[B", "getHEX_DIGIT_BYTES", "()[B", "SEGMENTING_THRESHOLD", "I", "OVERFLOW_ZONE", "J", "OVERFLOW_DIGIT_START", "okio"}, m507k = 2, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class BufferKt {
    @NotNull
    private static final byte[] HEX_DIGIT_BYTES = Platform.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(@NotNull Buffer commonClear) {
        C10843j.m430f(commonClear, "$this$commonClear");
        commonClear.skip(commonClear.size());
    }

    public static final long commonCompleteSegmentByteCount(@NotNull Buffer commonCompleteSegmentByteCount) {
        C10843j.m430f(commonCompleteSegmentByteCount, "$this$commonCompleteSegmentByteCount");
        long size = commonCompleteSegmentByteCount.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = commonCompleteSegmentByteCount.head;
        C10843j.m433c(segment);
        Segment segment2 = segment.prev;
        C10843j.m433c(segment2);
        int i = segment2.limit;
        return (i >= 8192 || !segment2.owner) ? size : size - (i - segment2.pos);
    }

    @NotNull
    public static final Buffer commonCopy(@NotNull Buffer commonCopy) {
        C10843j.m430f(commonCopy, "$this$commonCopy");
        Buffer buffer = new Buffer();
        if (commonCopy.size() == 0) {
            return buffer;
        }
        Segment segment = commonCopy.head;
        C10843j.m433c(segment);
        Segment sharedCopy = segment.sharedCopy();
        buffer.head = sharedCopy;
        sharedCopy.prev = sharedCopy;
        sharedCopy.next = sharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = sharedCopy.prev;
            C10843j.m433c(segment3);
            C10843j.m433c(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer.setSize$okio(commonCopy.size());
        return buffer;
    }

    @NotNull
    public static final Buffer commonCopyTo(@NotNull Buffer commonCopyTo, @NotNull Buffer out, long j, long j2) {
        C10843j.m430f(commonCopyTo, "$this$commonCopyTo");
        C10843j.m430f(out, "out");
        Util.checkOffsetAndCount(commonCopyTo.size(), j, j2);
        if (j2 == 0) {
            return commonCopyTo;
        }
        out.setSize$okio(out.size() + j2);
        Segment segment = commonCopyTo.head;
        while (true) {
            C10843j.m433c(segment);
            int i = segment.limit;
            int i2 = segment.pos;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            segment = segment.next;
        }
        while (j2 > 0) {
            C10843j.m433c(segment);
            Segment sharedCopy = segment.sharedCopy();
            int i3 = sharedCopy.pos + ((int) j);
            sharedCopy.pos = i3;
            sharedCopy.limit = Math.min(i3 + ((int) j2), sharedCopy.limit);
            Segment segment2 = out.head;
            if (segment2 == null) {
                sharedCopy.prev = sharedCopy;
                sharedCopy.next = sharedCopy;
                out.head = sharedCopy;
            } else {
                C10843j.m433c(segment2);
                Segment segment3 = segment2.prev;
                C10843j.m433c(segment3);
                segment3.push(sharedCopy);
            }
            j2 -= sharedCopy.limit - sharedCopy.pos;
            segment = segment.next;
            j = 0;
        }
        return commonCopyTo;
    }

    public static final boolean commonEquals(@NotNull Buffer commonEquals, @Nullable Object obj) {
        C10843j.m430f(commonEquals, "$this$commonEquals");
        if (commonEquals == obj) {
            return true;
        }
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            if (commonEquals.size() != buffer.size()) {
                return false;
            }
            if (commonEquals.size() == 0) {
                return true;
            }
            Segment segment = commonEquals.head;
            C10843j.m433c(segment);
            Segment segment2 = buffer.head;
            C10843j.m433c(segment2);
            int i = segment.pos;
            int i2 = segment2.pos;
            long j = 0;
            while (j < commonEquals.size()) {
                long min = Math.min(segment.limit - i, segment2.limit - i2);
                long j2 = 0;
                while (j2 < min) {
                    int i3 = i + 1;
                    int i4 = i2 + 1;
                    if (segment.data[i] != segment2.data[i2]) {
                        return false;
                    }
                    j2++;
                    i = i3;
                    i2 = i4;
                }
                if (i == segment.limit) {
                    segment = segment.next;
                    C10843j.m433c(segment);
                    i = segment.pos;
                }
                if (i2 == segment2.limit) {
                    segment2 = segment2.next;
                    C10843j.m433c(segment2);
                    i2 = segment2.pos;
                }
                j += min;
            }
            return true;
        }
        return false;
    }

    public static final byte commonGet(@NotNull Buffer commonGet, long j) {
        C10843j.m430f(commonGet, "$this$commonGet");
        Util.checkOffsetAndCount(commonGet.size(), j, 1L);
        Segment segment = commonGet.head;
        if (segment == null) {
            C10843j.m433c(null);
            throw null;
        } else if (commonGet.size() - j < j) {
            long size = commonGet.size();
            while (size > j) {
                segment = segment.prev;
                C10843j.m433c(segment);
                size -= segment.limit - segment.pos;
            }
            return segment.data[(int) ((segment.pos + j) - size)];
        } else {
            long j2 = 0;
            while (true) {
                int i = segment.limit;
                int i2 = segment.pos;
                long j3 = (i - i2) + j2;
                if (j3 > j) {
                    return segment.data[(int) ((i2 + j) - j2)];
                }
                segment = segment.next;
                C10843j.m433c(segment);
                j2 = j3;
            }
        }
    }

    public static final int commonHashCode(@NotNull Buffer commonHashCode) {
        C10843j.m430f(commonHashCode, "$this$commonHashCode");
        Segment segment = commonHashCode.head;
        if (segment != null) {
            int i = 1;
            do {
                int i2 = segment.limit;
                for (int i3 = segment.pos; i3 < i2; i3++) {
                    i = (i * 31) + segment.data[i3];
                }
                segment = segment.next;
                C10843j.m433c(segment);
            } while (segment != commonHashCode.head);
            return i;
        }
        return 0;
    }

    public static final long commonIndexOf(@NotNull Buffer commonIndexOf, byte b, long j, long j2) {
        Segment segment;
        int i;
        C10843j.m430f(commonIndexOf, "$this$commonIndexOf");
        long j3 = 0;
        if (!(0 <= j && j2 >= j)) {
            throw new IllegalArgumentException(("size=" + commonIndexOf.size() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > commonIndexOf.size()) {
            j2 = commonIndexOf.size();
        }
        if (j == j2 || (segment = commonIndexOf.head) == null) {
            return -1L;
        }
        if (commonIndexOf.size() - j < j) {
            j3 = commonIndexOf.size();
            while (j3 > j) {
                segment = segment.prev;
                C10843j.m433c(segment);
                j3 -= segment.limit - segment.pos;
            }
            while (j3 < j2) {
                byte[] bArr = segment.data;
                int min = (int) Math.min(segment.limit, (segment.pos + j2) - j3);
                i = (int) ((segment.pos + j) - j3);
                while (i < min) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                j3 += segment.limit - segment.pos;
                segment = segment.next;
                C10843j.m433c(segment);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j4 = (segment.limit - segment.pos) + j3;
            if (j4 > j) {
                break;
            }
            segment = segment.next;
            C10843j.m433c(segment);
            j3 = j4;
        }
        while (j3 < j2) {
            byte[] bArr2 = segment.data;
            int min2 = (int) Math.min(segment.limit, (segment.pos + j2) - j3);
            i = (int) ((segment.pos + j) - j3);
            while (i < min2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            j3 += segment.limit - segment.pos;
            segment = segment.next;
            C10843j.m433c(segment);
            j = j3;
        }
        return -1L;
        return (i - segment.pos) + j3;
    }

    public static final long commonIndexOf(@NotNull Buffer commonIndexOf, @NotNull ByteString bytes, long j) {
        boolean z;
        boolean z2;
        int i;
        C10843j.m430f(commonIndexOf, "$this$commonIndexOf");
        C10843j.m430f(bytes, "bytes");
        if (bytes.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = 0;
            if (j >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Segment segment = commonIndexOf.head;
                if (segment != null) {
                    if (commonIndexOf.size() - j < j) {
                        j2 = commonIndexOf.size();
                        while (j2 > j) {
                            segment = segment.prev;
                            C10843j.m433c(segment);
                            j2 -= segment.limit - segment.pos;
                        }
                        byte[] internalArray$okio = bytes.internalArray$okio();
                        byte b = internalArray$okio[0];
                        int size = bytes.size();
                        long size2 = (commonIndexOf.size() - size) + 1;
                        while (j2 < size2) {
                            byte[] bArr = segment.data;
                            int min = (int) Math.min(segment.limit, (segment.pos + size2) - j2);
                            i = (int) ((segment.pos + j) - j2);
                            while (i < min) {
                                if (bArr[i] != b || !rangeEquals(segment, i + 1, internalArray$okio, 1, size)) {
                                    i++;
                                }
                            }
                            j2 += segment.limit - segment.pos;
                            segment = segment.next;
                            C10843j.m433c(segment);
                            j = j2;
                        }
                        return -1L;
                    }
                    while (true) {
                        long j3 = (segment.limit - segment.pos) + j2;
                        if (j3 > j) {
                            break;
                        }
                        segment = segment.next;
                        C10843j.m433c(segment);
                        j2 = j3;
                    }
                    byte[] internalArray$okio2 = bytes.internalArray$okio();
                    byte b2 = internalArray$okio2[0];
                    int size3 = bytes.size();
                    long size4 = (commonIndexOf.size() - size3) + 1;
                    while (j2 < size4) {
                        byte[] bArr2 = segment.data;
                        int min2 = (int) Math.min(segment.limit, (segment.pos + size4) - j2);
                        i = (int) ((segment.pos + j) - j2);
                        while (i < min2) {
                            if (bArr2[i] != b2 || !rangeEquals(segment, i + 1, internalArray$okio2, 1, size3)) {
                                i++;
                            }
                        }
                        j2 += segment.limit - segment.pos;
                        segment = segment.next;
                        C10843j.m433c(segment);
                        j = j2;
                    }
                    return -1L;
                    return (i - segment.pos) + j2;
                }
                return -1L;
            }
            throw new IllegalArgumentException(C3132a0.m7696a("fromIndex < 0: ", j).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public static final long commonIndexOfElement(@NotNull Buffer commonIndexOfElement, @NotNull ByteString targetBytes, long j) {
        boolean z;
        int i;
        C10843j.m430f(commonIndexOfElement, "$this$commonIndexOfElement");
        C10843j.m430f(targetBytes, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Segment segment = commonIndexOfElement.head;
            if (segment == null) {
                return -1L;
            }
            if (commonIndexOfElement.size() - j < j) {
                j2 = commonIndexOfElement.size();
                while (j2 > j) {
                    segment = segment.prev;
                    C10843j.m433c(segment);
                    j2 -= segment.limit - segment.pos;
                }
                if (targetBytes.size() == 2) {
                    byte b = targetBytes.getByte(0);
                    byte b2 = targetBytes.getByte(1);
                    while (j2 < commonIndexOfElement.size()) {
                        byte[] bArr = segment.data;
                        i = (int) ((segment.pos + j) - j2);
                        int i2 = segment.limit;
                        while (i < i2) {
                            byte b3 = bArr[i];
                            if (b3 != b && b3 != b2) {
                                i++;
                            }
                        }
                        j2 += segment.limit - segment.pos;
                        segment = segment.next;
                        C10843j.m433c(segment);
                        j = j2;
                    }
                    return -1L;
                }
                byte[] internalArray$okio = targetBytes.internalArray$okio();
                while (j2 < commonIndexOfElement.size()) {
                    byte[] bArr2 = segment.data;
                    i = (int) ((segment.pos + j) - j2);
                    int i3 = segment.limit;
                    while (i < i3) {
                        byte b4 = bArr2[i];
                        for (byte b5 : internalArray$okio) {
                            if (b4 != b5) {
                            }
                        }
                        i++;
                    }
                    j2 += segment.limit - segment.pos;
                    segment = segment.next;
                    C10843j.m433c(segment);
                    j = j2;
                }
                return -1L;
            }
            while (true) {
                long j3 = (segment.limit - segment.pos) + j2;
                if (j3 > j) {
                    break;
                }
                segment = segment.next;
                C10843j.m433c(segment);
                j2 = j3;
            }
            if (targetBytes.size() == 2) {
                byte b6 = targetBytes.getByte(0);
                byte b7 = targetBytes.getByte(1);
                while (j2 < commonIndexOfElement.size()) {
                    byte[] bArr3 = segment.data;
                    i = (int) ((segment.pos + j) - j2);
                    int i4 = segment.limit;
                    while (i < i4) {
                        byte b8 = bArr3[i];
                        if (b8 != b6 && b8 != b7) {
                            i++;
                        }
                    }
                    j2 += segment.limit - segment.pos;
                    segment = segment.next;
                    C10843j.m433c(segment);
                    j = j2;
                }
                return -1L;
            }
            byte[] internalArray$okio2 = targetBytes.internalArray$okio();
            while (j2 < commonIndexOfElement.size()) {
                byte[] bArr4 = segment.data;
                i = (int) ((segment.pos + j) - j2);
                int i5 = segment.limit;
                while (i < i5) {
                    byte b9 = bArr4[i];
                    for (byte b10 : internalArray$okio2) {
                        if (b9 != b10) {
                        }
                    }
                    i++;
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
                C10843j.m433c(segment);
                j = j2;
            }
            return -1L;
            return (i - segment.pos) + j2;
        }
        throw new IllegalArgumentException(C3132a0.m7696a("fromIndex < 0: ", j).toString());
    }

    public static final boolean commonRangeEquals(@NotNull Buffer commonRangeEquals, long j, @NotNull ByteString bytes, int i, int i2) {
        C10843j.m430f(commonRangeEquals, "$this$commonRangeEquals");
        C10843j.m430f(bytes, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || commonRangeEquals.size() - j < i2 || bytes.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (commonRangeEquals.getByte(i3 + j) != bytes.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull Buffer commonRead, @NotNull byte[] sink) {
        C10843j.m430f(commonRead, "$this$commonRead");
        C10843j.m430f(sink, "sink");
        return commonRead.read(sink, 0, sink.length);
    }

    public static final int commonRead(@NotNull Buffer commonRead, @NotNull byte[] sink, int i, int i2) {
        C10843j.m430f(commonRead, "$this$commonRead");
        C10843j.m430f(sink, "sink");
        Util.checkOffsetAndCount(sink.length, i, i2);
        Segment segment = commonRead.head;
        if (segment != null) {
            int min = Math.min(i2, segment.limit - segment.pos);
            byte[] bArr = segment.data;
            int i3 = segment.pos;
            C10751g.m494b(bArr, i, sink, i3, i3 + min);
            segment.pos += min;
            commonRead.setSize$okio(commonRead.size() - min);
            if (segment.pos == segment.limit) {
                commonRead.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            return min;
        }
        return -1;
    }

    public static final long commonRead(@NotNull Buffer commonRead, @NotNull Buffer sink, long j) {
        boolean z;
        C10843j.m430f(commonRead, "$this$commonRead");
        C10843j.m430f(sink, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (commonRead.size() == 0) {
                return -1L;
            }
            if (j > commonRead.size()) {
                j = commonRead.size();
            }
            sink.write(commonRead, j);
            return j;
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount < 0: ", j).toString());
    }

    public static final long commonReadAll(@NotNull Buffer commonReadAll, @NotNull Sink sink) {
        C10843j.m430f(commonReadAll, "$this$commonReadAll");
        C10843j.m430f(sink, "sink");
        long size = commonReadAll.size();
        if (size > 0) {
            sink.write(commonReadAll, size);
        }
        return size;
    }

    public static final byte commonReadByte(@NotNull Buffer commonReadByte) {
        C10843j.m430f(commonReadByte, "$this$commonReadByte");
        if (commonReadByte.size() != 0) {
            Segment segment = commonReadByte.head;
            C10843j.m433c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            int i3 = i + 1;
            byte b = segment.data[i];
            commonReadByte.setSize$okio(commonReadByte.size() - 1);
            if (i3 == i2) {
                commonReadByte.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull Buffer commonReadByteArray) {
        C10843j.m430f(commonReadByteArray, "$this$commonReadByteArray");
        return commonReadByteArray.readByteArray(commonReadByteArray.size());
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull Buffer commonReadByteArray, long j) {
        boolean z;
        C10843j.m430f(commonReadByteArray, "$this$commonReadByteArray");
        if (j >= 0 && j <= Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (commonReadByteArray.size() >= j) {
                byte[] bArr = new byte[(int) j];
                commonReadByteArray.readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount: ", j).toString());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull Buffer commonReadByteString) {
        C10843j.m430f(commonReadByteString, "$this$commonReadByteString");
        return commonReadByteString.readByteString(commonReadByteString.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull Buffer commonReadByteString, long j) {
        boolean z;
        C10843j.m430f(commonReadByteString, "$this$commonReadByteString");
        if (j >= 0 && j <= Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (commonReadByteString.size() >= j) {
                if (j >= 4096) {
                    ByteString snapshot = commonReadByteString.snapshot((int) j);
                    commonReadByteString.skip(j);
                    return snapshot;
                }
                return new ByteString(commonReadByteString.readByteArray(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount: ", j).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00b2 A[EDGE_INSN: B:102:0x00b2->B:94:0x00b2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull okio.Buffer r15) {
        /*
            java.lang.String r0 = "$this$commonReadDecimalLong"
            kotlin.jvm.internal.C10843j.m430f(r15, r0)
            long r0 = r15.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc0
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L16:
            okio.Segment r7 = r15.head
            kotlin.jvm.internal.C10843j.m433c(r7)
            byte[] r8 = r7.data
            int r9 = r7.pos
            int r10 = r7.limit
        L21:
            if (r9 >= r10) goto L9e
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L71
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L71
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L47
            if (r13 != 0) goto L41
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L41
            goto L47
        L41:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L7d
        L47:
            okio.Buffer r15 = new okio.Buffer
            r15.<init>()
            okio.Buffer r15 = r15.writeDecimalLong(r3)
            okio.Buffer r15 = r15.writeByte(r11)
            if (r1 != 0) goto L59
            r15.readByte()
        L59:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number too large: "
            r1.<init>(r2)
            java.lang.String r15 = r15.readUtf8()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L71:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L82
            if (r0 != 0) goto L82
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L7d:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L21
        L82:
            if (r0 == 0) goto L86
            r2 = r13
            goto L9e
        L86:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            r0.<init>(r1)
            java.lang.String r1 = okio.Util.toHexString(r11)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L9e:
            if (r9 != r10) goto Laa
            okio.Segment r8 = r7.pop()
            r15.head = r8
            okio.SegmentPool.recycle(r7)
            goto Lac
        Laa:
            r7.pos = r9
        Lac:
            if (r2 != 0) goto Lb2
            okio.Segment r7 = r15.head
            if (r7 != 0) goto L16
        Lb2:
            long r5 = r15.size()
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.setSize$okio(r5)
            if (r1 == 0) goto Lbe
            goto Lbf
        Lbe:
            long r3 = -r3
        Lbf:
            return r3
        Lc0:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadDecimalLong(okio.Buffer):long");
    }

    public static final void commonReadFully(@NotNull Buffer commonReadFully, @NotNull Buffer sink, long j) {
        C10843j.m430f(commonReadFully, "$this$commonReadFully");
        C10843j.m430f(sink, "sink");
        if (commonReadFully.size() >= j) {
            sink.write(commonReadFully, j);
        } else {
            sink.write(commonReadFully, commonReadFully.size());
            throw new EOFException();
        }
    }

    public static final void commonReadFully(@NotNull Buffer commonReadFully, @NotNull byte[] sink) {
        C10843j.m430f(commonReadFully, "$this$commonReadFully");
        C10843j.m430f(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int read = commonReadFully.read(sink, i, sink.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ad A[EDGE_INSN: B:90:0x00ad->B:85:0x00ad ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull okio.Buffer r14) {
        /*
            java.lang.String r0 = "$this$commonReadHexadecimalUnsignedLong"
            kotlin.jvm.internal.C10843j.m430f(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb7
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            okio.Segment r6 = r14.head
            kotlin.jvm.internal.C10843j.m433c(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L99
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L2e
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L2e
            int r11 = r10 - r11
            goto L48
        L2e:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L3d
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L3d
        L38:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L48
        L3d:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7d
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7d
            goto L38
        L48:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L58
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L58:
            okio.Buffer r14 = new okio.Buffer
            r14.<init>()
            okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number too large: "
            r1.<init>(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L7d:
            if (r0 == 0) goto L81
            r1 = 1
            goto L99
        L81:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.<init>(r1)
            java.lang.String r1 = okio.Util.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L99:
            if (r8 != r9) goto La5
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto La7
        La5:
            r6.pos = r8
        La7:
            if (r1 != 0) goto Lad
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L12
        Lad:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb7:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.BufferKt.commonReadHexadecimalUnsignedLong(okio.Buffer):long");
    }

    public static final int commonReadInt(@NotNull Buffer commonReadInt) {
        C10843j.m430f(commonReadInt, "$this$commonReadInt");
        if (commonReadInt.size() >= 4) {
            Segment segment = commonReadInt.head;
            C10843j.m433c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 4) {
                return (commonReadInt.readByte() & 255) | ((commonReadInt.readByte() & 255) << 24) | ((commonReadInt.readByte() & 255) << 16) | ((commonReadInt.readByte() & 255) << 8);
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            commonReadInt.setSize$okio(commonReadInt.size() - 4);
            if (i8 == i2) {
                commonReadInt.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    public static final long commonReadLong(@NotNull Buffer commonReadLong) {
        C10843j.m430f(commonReadLong, "$this$commonReadLong");
        if (commonReadLong.size() >= 8) {
            Segment segment = commonReadLong.head;
            C10843j.m433c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 8) {
                return ((commonReadLong.readInt() & 4294967295L) << 32) | (4294967295L & commonReadLong.readInt());
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i3] & 255) << 48) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
            commonReadLong.setSize$okio(commonReadLong.size() - 8);
            if (i10 == i2) {
                commonReadLong.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    public static final short commonReadShort(@NotNull Buffer commonReadShort) {
        C10843j.m430f(commonReadShort, "$this$commonReadShort");
        if (commonReadShort.size() >= 2) {
            Segment segment = commonReadShort.head;
            C10843j.m433c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 2) {
                return (short) ((commonReadShort.readByte() & 255) | ((commonReadShort.readByte() & 255) << 8));
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            commonReadShort.setSize$okio(commonReadShort.size() - 2);
            if (i4 == i2) {
                commonReadShort.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull Buffer commonReadUtf8, long j) {
        boolean z;
        C10843j.m430f(commonReadUtf8, "$this$commonReadUtf8");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (commonReadUtf8.size() >= j) {
                if (i == 0) {
                    return "";
                }
                Segment segment = commonReadUtf8.head;
                C10843j.m433c(segment);
                int i2 = segment.pos;
                if (i2 + j > segment.limit) {
                    return _Utf8Kt.commonToUtf8String$default(commonReadUtf8.readByteArray(j), 0, 0, 3, null);
                }
                int i3 = (int) j;
                String commonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i2, i2 + i3);
                segment.pos += i3;
                commonReadUtf8.setSize$okio(commonReadUtf8.size() - j);
                if (segment.pos == segment.limit) {
                    commonReadUtf8.head = segment.pop();
                    SegmentPool.recycle(segment);
                }
                return commonToUtf8String;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount: ", j).toString());
    }

    public static final int commonReadUtf8CodePoint(@NotNull Buffer commonReadUtf8CodePoint) {
        int i;
        int i2;
        int i3;
        C10843j.m430f(commonReadUtf8CodePoint, "$this$commonReadUtf8CodePoint");
        if (commonReadUtf8CodePoint.size() != 0) {
            byte b = commonReadUtf8CodePoint.getByte(0L);
            if ((b & 128) == 0) {
                i = b & Byte.MAX_VALUE;
                i3 = 0;
                i2 = 1;
            } else if ((b & 224) == 192) {
                i = b & 31;
                i2 = 2;
                i3 = 128;
            } else if ((b & 240) == 224) {
                i = b & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((b & 248) == 240) {
                i = b & 7;
                i2 = 4;
                i3 = 65536;
            } else {
                commonReadUtf8CodePoint.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            long j = i2;
            if (commonReadUtf8CodePoint.size() >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte b2 = commonReadUtf8CodePoint.getByte(j2);
                    if ((b2 & 192) == 128) {
                        i = (i << 6) | (b2 & Utf8.REPLACEMENT_BYTE);
                    } else {
                        commonReadUtf8CodePoint.skip(j2);
                        return Utf8.REPLACEMENT_CODE_POINT;
                    }
                }
                commonReadUtf8CodePoint.skip(j);
                if (i > 1114111) {
                    return Utf8.REPLACEMENT_CODE_POINT;
                }
                if ((55296 <= i && 57343 >= i) || i < i3) {
                    return Utf8.REPLACEMENT_CODE_POINT;
                }
                return i;
            }
            StringBuilder m12536b = C0406q1.m12536b("size < ", i2, ": ");
            m12536b.append(commonReadUtf8CodePoint.size());
            m12536b.append(" (to read code point prefixed 0x");
            m12536b.append(Util.toHexString(b));
            m12536b.append(')');
            throw new EOFException(m12536b.toString());
        }
        throw new EOFException();
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull Buffer commonReadUtf8Line) {
        C10843j.m430f(commonReadUtf8Line, "$this$commonReadUtf8Line");
        long indexOf = commonReadUtf8Line.indexOf((byte) 10);
        if (indexOf != -1) {
            return readUtf8Line(commonReadUtf8Line, indexOf);
        }
        if (commonReadUtf8Line.size() != 0) {
            return commonReadUtf8Line.readUtf8(commonReadUtf8Line.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull Buffer commonReadUtf8LineStrict, long j) {
        boolean z;
        C10843j.m430f(commonReadUtf8LineStrict, "$this$commonReadUtf8LineStrict");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long indexOf = commonReadUtf8LineStrict.indexOf(b, 0L, j2);
            if (indexOf != -1) {
                return readUtf8Line(commonReadUtf8LineStrict, indexOf);
            }
            if (j2 < commonReadUtf8LineStrict.size() && commonReadUtf8LineStrict.getByte(j2 - 1) == ((byte) 13) && commonReadUtf8LineStrict.getByte(j2) == b) {
                return readUtf8Line(commonReadUtf8LineStrict, j2);
            }
            Buffer buffer = new Buffer();
            commonReadUtf8LineStrict.copyTo(buffer, 0L, Math.min(32, commonReadUtf8LineStrict.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(commonReadUtf8LineStrict.size(), j) + " content=" + buffer.readByteString().hex() + (char) 8230);
        }
        throw new IllegalArgumentException(C3132a0.m7696a("limit < 0: ", j).toString());
    }

    public static final int commonSelect(@NotNull Buffer commonSelect, @NotNull Options options) {
        C10843j.m430f(commonSelect, "$this$commonSelect");
        C10843j.m430f(options, "options");
        int selectPrefix$default = selectPrefix$default(commonSelect, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        commonSelect.skip(options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public static final void commonSkip(@NotNull Buffer commonSkip, long j) {
        C10843j.m430f(commonSkip, "$this$commonSkip");
        while (j > 0) {
            Segment segment = commonSkip.head;
            if (segment == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, segment.limit - segment.pos);
            long j2 = min;
            commonSkip.setSize$okio(commonSkip.size() - j2);
            j -= j2;
            int i = segment.pos + min;
            segment.pos = i;
            if (i == segment.limit) {
                commonSkip.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull Buffer commonSnapshot) {
        C10843j.m430f(commonSnapshot, "$this$commonSnapshot");
        if (commonSnapshot.size() <= ((long) Integer.MAX_VALUE)) {
            return commonSnapshot.snapshot((int) commonSnapshot.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + commonSnapshot.size()).toString());
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull Buffer commonSnapshot, int i) {
        C10843j.m430f(commonSnapshot, "$this$commonSnapshot");
        if (i == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(commonSnapshot.size(), 0L, i);
        Segment segment = commonSnapshot.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C10843j.m433c(segment);
            int i5 = segment.limit;
            int i6 = segment.pos;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = commonSnapshot.head;
        int i7 = 0;
        while (i2 < i) {
            C10843j.m433c(segment2);
            bArr[i7] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.pos;
            segment2.shared = true;
            i7++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull Buffer commonWritableSegment, int i) {
        C10843j.m430f(commonWritableSegment, "$this$commonWritableSegment");
        boolean z = true;
        if ((i < 1 || i > 8192) ? false : false) {
            Segment segment = commonWritableSegment.head;
            if (segment != null) {
                C10843j.m433c(segment);
                Segment segment2 = segment.prev;
                C10843j.m433c(segment2);
                return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
            }
            Segment take = SegmentPool.take();
            commonWritableSegment.head = take;
            take.prev = take;
            take.next = take;
            return take;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer commonWrite, @NotNull ByteString byteString, int i, int i2) {
        C10843j.m430f(commonWrite, "$this$commonWrite");
        C10843j.m430f(byteString, "byteString");
        byteString.write$okio(commonWrite, i, i2);
        return commonWrite;
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer commonWrite, @NotNull Source source, long j) {
        C10843j.m430f(commonWrite, "$this$commonWrite");
        C10843j.m430f(source, "source");
        while (j > 0) {
            long read = source.read(commonWrite, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
        }
        return commonWrite;
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer commonWrite, @NotNull byte[] source) {
        C10843j.m430f(commonWrite, "$this$commonWrite");
        C10843j.m430f(source, "source");
        return commonWrite.write(source, 0, source.length);
    }

    @NotNull
    public static final Buffer commonWrite(@NotNull Buffer commonWrite, @NotNull byte[] source, int i, int i2) {
        C10843j.m430f(commonWrite, "$this$commonWrite");
        C10843j.m430f(source, "source");
        long j = i2;
        Util.checkOffsetAndCount(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment writableSegment$okio = commonWrite.writableSegment$okio(1);
            int min = Math.min(i3 - i, 8192 - writableSegment$okio.limit);
            int i4 = i + min;
            C10751g.m494b(source, writableSegment$okio.limit, writableSegment$okio.data, i, i4);
            writableSegment$okio.limit += min;
            i = i4;
        }
        commonWrite.setSize$okio(commonWrite.size() + j);
        return commonWrite;
    }

    public static final void commonWrite(@NotNull Buffer commonWrite, @NotNull Buffer source, long j) {
        Segment segment;
        Segment segment2;
        C10843j.m430f(commonWrite, "$this$commonWrite");
        C10843j.m430f(source, "source");
        if (!(source != commonWrite)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        Util.checkOffsetAndCount(source.size(), 0L, j);
        while (j > 0) {
            Segment segment3 = source.head;
            C10843j.m433c(segment3);
            int i = segment3.limit;
            C10843j.m433c(source.head);
            if (j < i - segment.pos) {
                Segment segment4 = commonWrite.head;
                if (segment4 != null) {
                    C10843j.m433c(segment4);
                    segment2 = segment4.prev;
                } else {
                    segment2 = null;
                }
                if (segment2 != null && segment2.owner) {
                    if ((segment2.limit + j) - (segment2.shared ? 0 : segment2.pos) <= 8192) {
                        Segment segment5 = source.head;
                        C10843j.m433c(segment5);
                        segment5.writeTo(segment2, (int) j);
                        source.setSize$okio(source.size() - j);
                        commonWrite.setSize$okio(commonWrite.size() + j);
                        return;
                    }
                }
                Segment segment6 = source.head;
                C10843j.m433c(segment6);
                source.head = segment6.split((int) j);
            }
            Segment segment7 = source.head;
            C10843j.m433c(segment7);
            long j2 = segment7.limit - segment7.pos;
            source.head = segment7.pop();
            Segment segment8 = commonWrite.head;
            if (segment8 == null) {
                commonWrite.head = segment7;
                segment7.prev = segment7;
                segment7.next = segment7;
            } else {
                C10843j.m433c(segment8);
                Segment segment9 = segment8.prev;
                C10843j.m433c(segment9);
                segment9.push(segment7).compact();
            }
            source.setSize$okio(source.size() - j2);
            commonWrite.setSize$okio(commonWrite.size() + j2);
            j -= j2;
        }
    }

    public static /* synthetic */ Buffer commonWrite$default(Buffer commonWrite, ByteString byteString, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.size();
        }
        C10843j.m430f(commonWrite, "$this$commonWrite");
        C10843j.m430f(byteString, "byteString");
        byteString.write$okio(commonWrite, i, i2);
        return commonWrite;
    }

    public static final long commonWriteAll(@NotNull Buffer commonWriteAll, @NotNull Source source) {
        C10843j.m430f(commonWriteAll, "$this$commonWriteAll");
        C10843j.m430f(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(commonWriteAll, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @NotNull
    public static final Buffer commonWriteByte(@NotNull Buffer commonWriteByte, int i) {
        C10843j.m430f(commonWriteByte, "$this$commonWriteByte");
        Segment writableSegment$okio = commonWriteByte.writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        writableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        commonWriteByte.setSize$okio(commonWriteByte.size() + 1);
        return commonWriteByte;
    }

    @NotNull
    public static final Buffer commonWriteDecimalLong(@NotNull Buffer commonWriteDecimalLong, long j) {
        boolean z;
        C10843j.m430f(commonWriteDecimalLong, "$this$commonWriteDecimalLong");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return commonWriteDecimalLong.writeByte(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return commonWriteDecimalLong.writeUtf8("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        Segment writableSegment$okio = commonWriteDecimalLong.writableSegment$okio(i2);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = getHEX_DIGIT_BYTES()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        writableSegment$okio.limit += i2;
        commonWriteDecimalLong.setSize$okio(commonWriteDecimalLong.size() + i2);
        return commonWriteDecimalLong;
    }

    @NotNull
    public static final Buffer commonWriteHexadecimalUnsignedLong(@NotNull Buffer commonWriteHexadecimalUnsignedLong, long j) {
        C10843j.m430f(commonWriteHexadecimalUnsignedLong, "$this$commonWriteHexadecimalUnsignedLong");
        if (j == 0) {
            return commonWriteHexadecimalUnsignedLong.writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        Segment writableSegment$okio = commonWriteHexadecimalUnsignedLong.writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        writableSegment$okio.limit += i;
        commonWriteHexadecimalUnsignedLong.setSize$okio(commonWriteHexadecimalUnsignedLong.size() + i);
        return commonWriteHexadecimalUnsignedLong;
    }

    @NotNull
    public static final Buffer commonWriteInt(@NotNull Buffer commonWriteInt, int i) {
        C10843j.m430f(commonWriteInt, "$this$commonWriteInt");
        Segment writableSegment$okio = commonWriteInt.writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        writableSegment$okio.limit = i5 + 1;
        commonWriteInt.setSize$okio(commonWriteInt.size() + 4);
        return commonWriteInt;
    }

    @NotNull
    public static final Buffer commonWriteLong(@NotNull Buffer commonWriteLong, long j) {
        C10843j.m430f(commonWriteLong, "$this$commonWriteLong");
        Segment writableSegment$okio = commonWriteLong.writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        writableSegment$okio.limit = i8 + 1;
        commonWriteLong.setSize$okio(commonWriteLong.size() + 8);
        return commonWriteLong;
    }

    @NotNull
    public static final Buffer commonWriteShort(@NotNull Buffer commonWriteShort, int i) {
        C10843j.m430f(commonWriteShort, "$this$commonWriteShort");
        Segment writableSegment$okio = commonWriteShort.writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        writableSegment$okio.limit = i3 + 1;
        commonWriteShort.setSize$okio(commonWriteShort.size() + 2);
        return commonWriteShort;
    }

    @NotNull
    public static final Buffer commonWriteUtf8(@NotNull Buffer commonWriteUtf8, @NotNull String string, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        char charAt;
        long size;
        long j;
        char c;
        C10843j.m430f(commonWriteUtf8, "$this$commonWriteUtf8");
        C10843j.m430f(string, "string");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= string.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt2 = string.charAt(i);
                        if (charAt2 < 128) {
                            Segment writableSegment$okio = commonWriteUtf8.writableSegment$okio(1);
                            byte[] bArr = writableSegment$okio.data;
                            int i3 = writableSegment$okio.limit - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = string.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = writableSegment$okio.limit;
                            int i6 = (i3 + i) - i5;
                            writableSegment$okio.limit = i5 + i6;
                            commonWriteUtf8.setSize$okio(commonWriteUtf8.size() + i6);
                        } else {
                            if (charAt2 < 2048) {
                                Segment writableSegment$okio2 = commonWriteUtf8.writableSegment$okio(2);
                                byte[] bArr2 = writableSegment$okio2.data;
                                int i7 = writableSegment$okio2.limit;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                writableSegment$okio2.limit = i7 + 2;
                                size = commonWriteUtf8.size();
                                j = 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = string.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c && 57343 >= c) {
                                    int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                    Segment writableSegment$okio3 = commonWriteUtf8.writableSegment$okio(4);
                                    byte[] bArr3 = writableSegment$okio3.data;
                                    int i10 = writableSegment$okio3.limit;
                                    bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                    writableSegment$okio3.limit = i10 + 4;
                                    commonWriteUtf8.setSize$okio(commonWriteUtf8.size() + 4);
                                    i += 2;
                                } else {
                                    commonWriteUtf8.writeByte(63);
                                    i = i8;
                                }
                            } else {
                                Segment writableSegment$okio4 = commonWriteUtf8.writableSegment$okio(3);
                                byte[] bArr4 = writableSegment$okio4.data;
                                int i11 = writableSegment$okio4.limit;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                writableSegment$okio4.limit = i11 + 3;
                                size = commonWriteUtf8.size();
                                j = 3;
                            }
                            commonWriteUtf8.setSize$okio(size + j);
                            i++;
                        }
                    }
                    return commonWriteUtf8;
                }
                StringBuilder m12536b = C0406q1.m12536b("endIndex > string.length: ", i2, " > ");
                m12536b.append(string.length());
                throw new IllegalArgumentException(m12536b.toString().toString());
            }
            throw new IllegalArgumentException(C1194j.m11060a("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(C0235r.m12816a("beginIndex < 0: ", i).toString());
    }

    @NotNull
    public static final Buffer commonWriteUtf8CodePoint(@NotNull Buffer commonWriteUtf8CodePoint, int i) {
        long size;
        long j;
        C10843j.m430f(commonWriteUtf8CodePoint, "$this$commonWriteUtf8CodePoint");
        if (i < 128) {
            commonWriteUtf8CodePoint.writeByte(i);
        } else {
            if (i < 2048) {
                Segment writableSegment$okio = commonWriteUtf8CodePoint.writableSegment$okio(2);
                byte[] bArr = writableSegment$okio.data;
                int i2 = writableSegment$okio.limit;
                bArr[i2] = (byte) ((i >> 6) | 192);
                bArr[i2 + 1] = (byte) ((i & 63) | 128);
                writableSegment$okio.limit = i2 + 2;
                size = commonWriteUtf8CodePoint.size();
                j = 2;
            } else if (55296 <= i && 57343 >= i) {
                commonWriteUtf8CodePoint.writeByte(63);
            } else if (i < 65536) {
                Segment writableSegment$okio2 = commonWriteUtf8CodePoint.writableSegment$okio(3);
                byte[] bArr2 = writableSegment$okio2.data;
                int i3 = writableSegment$okio2.limit;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                writableSegment$okio2.limit = i3 + 3;
                size = commonWriteUtf8CodePoint.size();
                j = 3;
            } else if (i > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + Util.toHexString(i));
            } else {
                Segment writableSegment$okio3 = commonWriteUtf8CodePoint.writableSegment$okio(4);
                byte[] bArr3 = writableSegment$okio3.data;
                int i4 = writableSegment$okio3.limit;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                writableSegment$okio3.limit = i4 + 4;
                size = commonWriteUtf8CodePoint.size();
                j = 4;
            }
            commonWriteUtf8CodePoint.setSize$okio(size + j);
        }
        return commonWriteUtf8CodePoint;
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i, @NotNull byte[] bytes, int i2, int i3) {
        C10843j.m430f(segment, "segment");
        C10843j.m430f(bytes, "bytes");
        int i4 = segment.limit;
        byte[] bArr = segment.data;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.next;
                C10843j.m433c(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i = segment.pos;
                i4 = segment.limit;
            }
            if (bArr[i] != bytes[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull Buffer readUtf8Line, long j) {
        C10843j.m430f(readUtf8Line, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (readUtf8Line.getByte(j2) == ((byte) 13)) {
                String readUtf8 = readUtf8Line.readUtf8(j2);
                readUtf8Line.skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = readUtf8Line.readUtf8(j);
        readUtf8Line.skip(1L);
        return readUtf82;
    }

    public static final <T> T seek(@NotNull Buffer seek, long j, @NotNull InterfaceC10824p<? super Segment, ? super Long, ? extends T> lambda) {
        C10843j.m430f(seek, "$this$seek");
        C10843j.m430f(lambda, "lambda");
        Segment segment = seek.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (seek.size() - j < j) {
            long size = seek.size();
            while (size > j) {
                segment = segment.prev;
                C10843j.m433c(segment);
                size -= segment.limit - segment.pos;
            }
            return lambda.invoke(segment, Long.valueOf(size));
        }
        long j2 = 0;
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 > j) {
                return lambda.invoke(segment, Long.valueOf(j2));
            }
            segment = segment.next;
            C10843j.m433c(segment);
            j2 = j3;
        }
    }

    public static final int selectPrefix(@NotNull Buffer selectPrefix, @NotNull Options options, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Segment segment;
        C10843j.m430f(selectPrefix, "$this$selectPrefix");
        C10843j.m430f(options, "options");
        Segment segment2 = selectPrefix.head;
        if (segment2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = segment2.data;
        int i5 = segment2.pos;
        int i6 = segment2.limit;
        int[] trie$okio = options.getTrie$okio();
        Segment segment3 = segment2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = trie$okio[i8];
            int i11 = i9 + 1;
            int i12 = trie$okio[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (segment3 == null) {
                break;
            }
            if (i10 >= 0) {
                i = i5 + 1;
                int i13 = bArr[i5] & 255;
                int i14 = i11 + i10;
                while (i11 != i14) {
                    if (i13 == trie$okio[i11]) {
                        i2 = trie$okio[i11 + i10];
                        if (i == i6) {
                            segment3 = segment3.next;
                            C10843j.m433c(segment3);
                            i = segment3.pos;
                            bArr = segment3.data;
                            i6 = segment3.limit;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i15 = (i10 * (-1)) + i11;
            while (true) {
                int i16 = i5 + 1;
                int i17 = i11 + 1;
                if ((bArr[i5] & 255) != trie$okio[i11]) {
                    return i7;
                }
                boolean z2 = i17 == i15;
                if (i16 == i6) {
                    C10843j.m433c(segment3);
                    Segment segment4 = segment3.next;
                    C10843j.m433c(segment4);
                    i4 = segment4.pos;
                    byte[] bArr2 = segment4.data;
                    i3 = segment4.limit;
                    if (segment4 != segment2) {
                        segment = segment4;
                        bArr = bArr2;
                    } else if (!z2) {
                        break loop0;
                    } else {
                        bArr = bArr2;
                        segment = null;
                    }
                } else {
                    Segment segment5 = segment3;
                    i3 = i6;
                    i4 = i16;
                    segment = segment5;
                }
                if (z2) {
                    i2 = trie$okio[i17];
                    i = i4;
                    i6 = i3;
                    segment3 = segment;
                    break;
                }
                i5 = i4;
                i6 = i3;
                i11 = i17;
                segment3 = segment;
            }
            if (i2 >= 0) {
                return i2;
            }
            i8 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    public static /* synthetic */ int selectPrefix$default(Buffer buffer, Options options, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return selectPrefix(buffer, options, z);
    }
}
