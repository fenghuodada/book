package okio;

import androidx.concurrent.futures.C0486c;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C10843j;
import okio.internal.ByteStringKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u00006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\bH\u0000\u001a\f\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\u0015\u0010\u000b\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\f\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\r\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0080\f\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\b2\u0006\u0010\n\u001a\u00020\u0000H\u0080\f\u001a\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\bH\u0080\b\u001a\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0000H\u0080\b\u001a0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0000\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\tH\u0000\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\bH\u0000\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0000¨\u0006\u0018"}, m508d2 = {"", "size", "offset", "byteCount", "Lkotlin/p;", "checkOffsetAndCount", "", "reverseBytes", "", "", "other", "shr", "shl", "and", "a", "b", "minOf", "", "aOffset", "bOffset", "", "arrayRangeEquals", "", "toHexString", "okio"}, m507k = 2, m506mv = {1, 4, 0})
@JvmName(name = "-Util")
/* renamed from: okio.-Util  reason: invalid class name */
/* loaded from: classes3.dex */
public final class Util {
    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final long and(byte b, long j) {
        return b & j;
    }

    public static final long and(int i, long j) {
        return i & j;
    }

    public static final boolean arrayRangeEquals(@NotNull byte[] a, int i, @NotNull byte[] b, int i2, int i3) {
        C10843j.m430f(a, "a");
        C10843j.m430f(b, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (a[i4 + i] != b[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        StringBuilder m12390a = C0486c.m12390a("size=", j, " offset=");
        m12390a.append(j2);
        m12390a.append(" byteCount=");
        m12390a.append(j3);
        throw new ArrayIndexOutOfBoundsException(m12390a.toString());
    }

    public static final long minOf(int i, long j) {
        return Math.min(i, j);
    }

    public static final long minOf(long j, int i) {
        return Math.min(j, i);
    }

    public static final int reverseBytes(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long reverseBytes(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final short reverseBytes(short s) {
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    public static final int shl(byte b, int i) {
        return b << i;
    }

    public static final int shr(byte b, int i) {
        return b >> i;
    }

    @NotNull
    public static final String toHexString(byte b) {
        return new String(new char[]{ByteStringKt.getHEX_DIGIT_CHARS()[(b >> 4) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[b & 15]});
    }

    @NotNull
    public static final String toHexString(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 28) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 24) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 20) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 16) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 12) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 8) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[(i >> 4) & 15], ByteStringKt.getHEX_DIGIT_CHARS()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }

    @NotNull
    public static final String toHexString(long j) {
        if (j == 0) {
            return "0";
        }
        int i = 0;
        char[] cArr = {ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 60) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 56) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 52) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 48) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 44) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 40) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 36) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 32) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 28) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 24) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 20) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 16) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 12) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 8) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) ((j >> 4) & 15)], ByteStringKt.getHEX_DIGIT_CHARS()[(int) (j & 15)]};
        while (i < 16 && cArr[i] == '0') {
            i++;
        }
        return new String(cArr, i, 16 - i);
    }
}
