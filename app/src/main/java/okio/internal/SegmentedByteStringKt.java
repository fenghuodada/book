package okio.internal;

import androidx.appcompat.widget.C0406q1;
import androidx.core.p003os.C0740h;
import androidx.datastore.preferences.protobuf.C1194j;
import java.util.Arrays;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.collections.C10750f;
import kotlin.collections.C10751g;
import kotlin.jvm.functions.InterfaceC10825q;
import kotlin.jvm.internal.C10843j;
import okio.Buffer;
import okio.ByteString;
import okio.Segment;
import okio.SegmentedByteString;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000P\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a]\u0010\u0012\u001a\u00020\u0010*\u00020\u00062K\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0080\bø\u0001\u0000\u001aj\u0010\u0012\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012K\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0082\b\u001a\u001d\u0010\u0016\u001a\u00020\u0015*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010\u0018\u001a\u00020\u0017*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0001*\u00020\u0006H\u0080\b\u001a\r\u0010\u001a\u001a\u00020\n*\u00020\u0006H\u0080\b\u001a%\u0010\u001d\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010!\u001a\u00020 *\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010!\u001a\u00020 *\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010#\u001a\u00020 *\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\"H\u0080\b\u001a\r\u0010$\u001a\u00020\u0001*\u00020\u0006H\u0080\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, m508d2 = {"", "", "value", "fromIndex", "toIndex", "binarySearch", "Lokio/SegmentedByteString;", "pos", "segment", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "data", "offset", "byteCount", "Lkotlin/p;", "action", "forEachSegment", "beginIndex", "endIndex", "Lokio/ByteString;", "commonSubstring", "", "commonInternalGet", "commonGetSize", "commonToByteArray", "Lokio/Buffer;", "buffer", "commonWrite", "other", "otherOffset", "", "commonRangeEquals", "", "commonEquals", "commonHashCode", "okio"}, m507k = 2, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class SegmentedByteStringKt {
    public static final int binarySearch(@NotNull int[] binarySearch, int i, int i2, int i3) {
        C10843j.m430f(binarySearch, "$this$binarySearch");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = binarySearch[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final boolean commonEquals(@NotNull SegmentedByteString commonEquals, @Nullable Object obj) {
        C10843j.m430f(commonEquals, "$this$commonEquals");
        if (obj == commonEquals) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == commonEquals.size() && commonEquals.rangeEquals(0, byteString, 0, commonEquals.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@NotNull SegmentedByteString commonGetSize) {
        C10843j.m430f(commonGetSize, "$this$commonGetSize");
        return commonGetSize.getDirectory$okio()[commonGetSize.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(@NotNull SegmentedByteString commonHashCode) {
        C10843j.m430f(commonHashCode, "$this$commonHashCode");
        int hashCode$okio = commonHashCode.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = commonHashCode.getSegments$okio().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = commonHashCode.getDirectory$okio()[length + i];
            int i5 = commonHashCode.getDirectory$okio()[i];
            byte[] bArr = commonHashCode.getSegments$okio()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        commonHashCode.setHashCode$okio(i2);
        return i2;
    }

    public static final byte commonInternalGet(@NotNull SegmentedByteString commonInternalGet, int i) {
        C10843j.m430f(commonInternalGet, "$this$commonInternalGet");
        Util.checkOffsetAndCount(commonInternalGet.getDirectory$okio()[commonInternalGet.getSegments$okio().length - 1], i, 1L);
        int segment = segment(commonInternalGet, i);
        return commonInternalGet.getSegments$okio()[segment][(i - (segment == 0 ? 0 : commonInternalGet.getDirectory$okio()[segment - 1])) + commonInternalGet.getDirectory$okio()[commonInternalGet.getSegments$okio().length + segment]];
    }

    public static final boolean commonRangeEquals(@NotNull SegmentedByteString commonRangeEquals, int i, @NotNull ByteString other, int i2, int i3) {
        C10843j.m430f(commonRangeEquals, "$this$commonRangeEquals");
        C10843j.m430f(other, "other");
        if (i < 0 || i > commonRangeEquals.size() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = segment(commonRangeEquals, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : commonRangeEquals.getDirectory$okio()[segment - 1];
            int i6 = commonRangeEquals.getDirectory$okio()[commonRangeEquals.getSegments$okio().length + segment];
            int min = Math.min(i4, (commonRangeEquals.getDirectory$okio()[segment] - i5) + i5) - i;
            if (!other.rangeEquals(i2, commonRangeEquals.getSegments$okio()[segment], (i - i5) + i6, min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }

    public static final boolean commonRangeEquals(@NotNull SegmentedByteString commonRangeEquals, int i, @NotNull byte[] other, int i2, int i3) {
        C10843j.m430f(commonRangeEquals, "$this$commonRangeEquals");
        C10843j.m430f(other, "other");
        if (i < 0 || i > commonRangeEquals.size() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = segment(commonRangeEquals, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : commonRangeEquals.getDirectory$okio()[segment - 1];
            int i6 = commonRangeEquals.getDirectory$okio()[commonRangeEquals.getSegments$okio().length + segment];
            int min = Math.min(i4, (commonRangeEquals.getDirectory$okio()[segment] - i5) + i5) - i;
            if (!Util.arrayRangeEquals(commonRangeEquals.getSegments$okio()[segment], (i - i5) + i6, other, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull SegmentedByteString commonSubstring, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        C10843j.m430f(commonSubstring, "$this$commonSubstring");
        int i3 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 <= commonSubstring.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i4 = i2 - i;
                if (i4 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (i == 0 && i2 == commonSubstring.size()) {
                        return commonSubstring;
                    }
                    if (i == i2) {
                        return ByteString.EMPTY;
                    }
                    int segment = segment(commonSubstring, i);
                    int segment2 = segment(commonSubstring, i2 - 1);
                    byte[][] segments$okio = commonSubstring.getSegments$okio();
                    int i5 = segment2 + 1;
                    C10843j.m430f(segments$okio, "<this>");
                    C10750f.m495a(i5, segments$okio.length);
                    Object[] copyOfRange = Arrays.copyOfRange(segments$okio, segment, i5);
                    C10843j.m431e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
                    byte[][] bArr = (byte[][]) copyOfRange;
                    int[] iArr = new int[bArr.length * 2];
                    if (segment <= segment2) {
                        int i6 = 0;
                        int i7 = segment;
                        while (true) {
                            iArr[i6] = Math.min(commonSubstring.getDirectory$okio()[i7] - i, i4);
                            int i8 = i6 + 1;
                            iArr[i6 + bArr.length] = commonSubstring.getDirectory$okio()[commonSubstring.getSegments$okio().length + i7];
                            if (i7 == segment2) {
                                break;
                            }
                            i7++;
                            i6 = i8;
                        }
                    }
                    if (segment != 0) {
                        i3 = commonSubstring.getDirectory$okio()[segment - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = (i - i3) + iArr[length];
                    return new SegmentedByteString(bArr, iArr);
                }
                throw new IllegalArgumentException(C1194j.m11060a("endIndex=", i2, " < beginIndex=", i).toString());
            }
            StringBuilder m12536b = C0406q1.m12536b("endIndex=", i2, " > length(");
            m12536b.append(commonSubstring.size());
            m12536b.append(')');
            throw new IllegalArgumentException(m12536b.toString().toString());
        }
        throw new IllegalArgumentException(C0740h.m11849a("beginIndex=", i, " < 0").toString());
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull SegmentedByteString commonToByteArray) {
        C10843j.m430f(commonToByteArray, "$this$commonToByteArray");
        byte[] bArr = new byte[commonToByteArray.size()];
        int length = commonToByteArray.getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = commonToByteArray.getDirectory$okio()[length + i];
            int i5 = commonToByteArray.getDirectory$okio()[i];
            int i6 = i5 - i2;
            C10751g.m494b(commonToByteArray.getSegments$okio()[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public static final void commonWrite(@NotNull SegmentedByteString commonWrite, @NotNull Buffer buffer, int i, int i2) {
        C10843j.m430f(commonWrite, "$this$commonWrite");
        C10843j.m430f(buffer, "buffer");
        int i3 = i2 + i;
        int segment = segment(commonWrite, i);
        while (i < i3) {
            int i4 = segment == 0 ? 0 : commonWrite.getDirectory$okio()[segment - 1];
            int i5 = commonWrite.getDirectory$okio()[commonWrite.getSegments$okio().length + segment];
            int min = Math.min(i3, (commonWrite.getDirectory$okio()[segment] - i4) + i4) - i;
            int i6 = (i - i4) + i5;
            Segment segment2 = new Segment(commonWrite.getSegments$okio()[segment], i6, i6 + min, true, false);
            Segment segment3 = buffer.head;
            if (segment3 == null) {
                segment2.prev = segment2;
                segment2.next = segment2;
                buffer.head = segment2;
            } else {
                C10843j.m433c(segment3);
                Segment segment4 = segment3.prev;
                C10843j.m433c(segment4);
                segment4.push(segment2);
            }
            i += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + commonWrite.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachSegment(SegmentedByteString segmentedByteString, int i, int i2, InterfaceC10825q<? super byte[], ? super Integer, ? super Integer, C10868p> interfaceC10825q) {
        int segment = segment(segmentedByteString, i);
        while (i < i2) {
            int i3 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i4 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i2, (segmentedByteString.getDirectory$okio()[segment] - i3) + i3) - i;
            interfaceC10825q.mo132a(segmentedByteString.getSegments$okio()[segment], Integer.valueOf((i - i3) + i4), Integer.valueOf(min));
            i += min;
            segment++;
        }
    }

    public static final void forEachSegment(@NotNull SegmentedByteString forEachSegment, @NotNull InterfaceC10825q<? super byte[], ? super Integer, ? super Integer, C10868p> action) {
        C10843j.m430f(forEachSegment, "$this$forEachSegment");
        C10843j.m430f(action, "action");
        int length = forEachSegment.getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = forEachSegment.getDirectory$okio()[length + i];
            int i4 = forEachSegment.getDirectory$okio()[i];
            action.mo132a(forEachSegment.getSegments$okio()[i], Integer.valueOf(i3), Integer.valueOf(i4 - i2));
            i++;
            i2 = i4;
        }
    }

    public static final int segment(@NotNull SegmentedByteString segment, int i) {
        C10843j.m430f(segment, "$this$segment");
        int binarySearch = binarySearch(segment.getDirectory$okio(), i + 1, 0, segment.getSegments$okio().length);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }
}
