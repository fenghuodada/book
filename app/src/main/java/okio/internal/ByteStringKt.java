package okio.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C10751g;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10925n;
import okio.Base64;
import okio.Buffer;
import okio.ByteString;
import okio.Platform;
import okio.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\u0005\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0080\b\u001a\u0015\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0080\b\u001a\r\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0080\b\u001a\r\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0080\b\u001a\r\u0010\u0012\u001a\u00020\u0010*\u00020\u0000H\u0080\b\u001a-\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0080\b\u001a-\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0010H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0010H\u0080\b\u001a\u001d\u0010\u001e\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\bH\u0080\b\u001a\u001d\u0010\u001f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\bH\u0080\b\u001a\u001d\u0010\u001f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\bH\u0080\b\u001a\u0017\u0010!\u001a\u00020\u0017*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010 H\u0080\b\u001a\r\u0010\"\u001a\u00020\b*\u00020\u0000H\u0080\b\u001a\u0015\u0010#\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0080\b\u001a\u0011\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0010H\u0080\b\u001a\u001d\u0010&\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0080\b\u001a\r\u0010'\u001a\u00020\u0000*\u00020\u0001H\u0080\b\u001a\u000f\u0010(\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0080\b\u001a\r\u0010)\u001a\u00020\u0000*\u00020\u0001H\u0080\b\u001a$\u0010-\u001a\u00020,*\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0000\u001a\u0010\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020.H\u0002\u001a\r\u00101\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\u0018\u00104\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\bH\u0002\"\u001a\u00106\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, m508d2 = {"Lokio/ByteString;", "", "commonUtf8", "commonBase64", "commonBase64Url", "commonHex", "commonToAsciiLowercase", "commonToAsciiUppercase", "", "beginIndex", "endIndex", "commonSubstring", "pos", "", "commonGetByte", "commonGetSize", "", "commonToByteArray", "commonInternalArray", "offset", "other", "otherOffset", "byteCount", "", "commonRangeEquals", "prefix", "commonStartsWith", "suffix", "commonEndsWith", "fromIndex", "commonIndexOf", "commonLastIndexOf", "", "commonEquals", "commonHashCode", "commonCompareTo", "data", "commonOf", "commonToByteString", "commonEncodeUtf8", "commonDecodeBase64", "commonDecodeHex", "Lokio/Buffer;", "buffer", "Lkotlin/p;", "commonWrite", "", "c", "decodeHexDigit", "commonToString", "s", "codePointCount", "codePointIndexToCharIndex", "", "HEX_DIGIT_CHARS", "[C", "getHEX_DIGIT_CHARS", "()[C", "okio"}, m507k = 2, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ByteStringKt {
    @NotNull
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Code restructure failed: missing block: B:304:0x0069, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int codePointIndexToCharIndex(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ByteStringKt.codePointIndexToCharIndex(byte[], int):int");
    }

    @NotNull
    public static final String commonBase64(@NotNull ByteString commonBase64) {
        C10843j.m430f(commonBase64, "$this$commonBase64");
        return Base64.encodeBase64$default(commonBase64.getData$okio(), null, 1, null);
    }

    @NotNull
    public static final String commonBase64Url(@NotNull ByteString commonBase64Url) {
        C10843j.m430f(commonBase64Url, "$this$commonBase64Url");
        return Base64.encodeBase64(commonBase64Url.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(@NotNull ByteString commonCompareTo, @NotNull ByteString other) {
        C10843j.m430f(commonCompareTo, "$this$commonCompareTo");
        C10843j.m430f(other, "other");
        int size = commonCompareTo.size();
        int size2 = other.size();
        int min = Math.min(size, size2);
        for (int i = 0; i < min; i++) {
            int i2 = commonCompareTo.getByte(i) & 255;
            int i3 = other.getByte(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    @Nullable
    public static final ByteString commonDecodeBase64(@NotNull String commonDecodeBase64) {
        C10843j.m430f(commonDecodeBase64, "$this$commonDecodeBase64");
        byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(commonDecodeBase64);
        if (decodeBase64ToArray != null) {
            return new ByteString(decodeBase64ToArray);
        }
        return null;
    }

    @NotNull
    public static final ByteString commonDecodeHex(@NotNull String commonDecodeHex) {
        C10843j.m430f(commonDecodeHex, "$this$commonDecodeHex");
        if (commonDecodeHex.length() % 2 == 0) {
            int length = commonDecodeHex.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (decodeHexDigit(commonDecodeHex.charAt(i2 + 1)) + (decodeHexDigit(commonDecodeHex.charAt(i2)) << 4));
            }
            return new ByteString(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(commonDecodeHex).toString());
    }

    @NotNull
    public static final ByteString commonEncodeUtf8(@NotNull String commonEncodeUtf8) {
        C10843j.m430f(commonEncodeUtf8, "$this$commonEncodeUtf8");
        ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(commonEncodeUtf8));
        byteString.setUtf8$okio(commonEncodeUtf8);
        return byteString;
    }

    public static final boolean commonEndsWith(@NotNull ByteString commonEndsWith, @NotNull ByteString suffix) {
        C10843j.m430f(commonEndsWith, "$this$commonEndsWith");
        C10843j.m430f(suffix, "suffix");
        return commonEndsWith.rangeEquals(commonEndsWith.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEndsWith(@NotNull ByteString commonEndsWith, @NotNull byte[] suffix) {
        C10843j.m430f(commonEndsWith, "$this$commonEndsWith");
        C10843j.m430f(suffix, "suffix");
        return commonEndsWith.rangeEquals(commonEndsWith.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final boolean commonEquals(@NotNull ByteString commonEquals, @Nullable Object obj) {
        C10843j.m430f(commonEquals, "$this$commonEquals");
        if (obj == commonEquals) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == commonEquals.getData$okio().length && byteString.rangeEquals(0, commonEquals.getData$okio(), 0, commonEquals.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(@NotNull ByteString commonGetByte, int i) {
        C10843j.m430f(commonGetByte, "$this$commonGetByte");
        return commonGetByte.getData$okio()[i];
    }

    public static final int commonGetSize(@NotNull ByteString commonGetSize) {
        C10843j.m430f(commonGetSize, "$this$commonGetSize");
        return commonGetSize.getData$okio().length;
    }

    public static final int commonHashCode(@NotNull ByteString commonHashCode) {
        C10843j.m430f(commonHashCode, "$this$commonHashCode");
        int hashCode$okio = commonHashCode.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(commonHashCode.getData$okio());
        commonHashCode.setHashCode$okio(hashCode);
        return hashCode;
    }

    @NotNull
    public static final String commonHex(@NotNull ByteString commonHex) {
        byte[] data$okio;
        C10843j.m430f(commonHex, "$this$commonHex");
        char[] cArr = new char[commonHex.getData$okio().length * 2];
        int i = 0;
        for (byte b : commonHex.getData$okio()) {
            int i2 = i + 1;
            cArr[i] = getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = getHEX_DIGIT_CHARS()[b & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(@NotNull ByteString commonIndexOf, @NotNull byte[] other, int i) {
        C10843j.m430f(commonIndexOf, "$this$commonIndexOf");
        C10843j.m430f(other, "other");
        int length = commonIndexOf.getData$okio().length - other.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!Util.arrayRangeEquals(commonIndexOf.getData$okio(), max, other, 0, other.length)) {
                if (max == length) {
                    return -1;
                }
                max++;
            }
            return max;
        }
        return -1;
    }

    @NotNull
    public static final byte[] commonInternalArray(@NotNull ByteString commonInternalArray) {
        C10843j.m430f(commonInternalArray, "$this$commonInternalArray");
        return commonInternalArray.getData$okio();
    }

    public static final int commonLastIndexOf(@NotNull ByteString commonLastIndexOf, @NotNull ByteString other, int i) {
        C10843j.m430f(commonLastIndexOf, "$this$commonLastIndexOf");
        C10843j.m430f(other, "other");
        return commonLastIndexOf.lastIndexOf(other.internalArray$okio(), i);
    }

    public static final int commonLastIndexOf(@NotNull ByteString commonLastIndexOf, @NotNull byte[] other, int i) {
        C10843j.m430f(commonLastIndexOf, "$this$commonLastIndexOf");
        C10843j.m430f(other, "other");
        for (int min = Math.min(i, commonLastIndexOf.getData$okio().length - other.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(commonLastIndexOf.getData$okio(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    @NotNull
    public static final ByteString commonOf(@NotNull byte[] data) {
        C10843j.m430f(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        C10843j.m431e(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copyOf);
    }

    public static final boolean commonRangeEquals(@NotNull ByteString commonRangeEquals, int i, @NotNull ByteString other, int i2, int i3) {
        C10843j.m430f(commonRangeEquals, "$this$commonRangeEquals");
        C10843j.m430f(other, "other");
        return other.rangeEquals(i2, commonRangeEquals.getData$okio(), i, i3);
    }

    public static final boolean commonRangeEquals(@NotNull ByteString commonRangeEquals, int i, @NotNull byte[] other, int i2, int i3) {
        C10843j.m430f(commonRangeEquals, "$this$commonRangeEquals");
        C10843j.m430f(other, "other");
        return i >= 0 && i <= commonRangeEquals.getData$okio().length - i3 && i2 >= 0 && i2 <= other.length - i3 && Util.arrayRangeEquals(commonRangeEquals.getData$okio(), i, other, i2, i3);
    }

    public static final boolean commonStartsWith(@NotNull ByteString commonStartsWith, @NotNull ByteString prefix) {
        C10843j.m430f(commonStartsWith, "$this$commonStartsWith");
        C10843j.m430f(prefix, "prefix");
        return commonStartsWith.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final boolean commonStartsWith(@NotNull ByteString commonStartsWith, @NotNull byte[] prefix) {
        C10843j.m430f(commonStartsWith, "$this$commonStartsWith");
        C10843j.m430f(prefix, "prefix");
        return commonStartsWith.rangeEquals(0, prefix, 0, prefix.length);
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull ByteString commonSubstring, int i, int i2) {
        C10843j.m430f(commonSubstring, "$this$commonSubstring");
        if (i >= 0) {
            if (i2 <= commonSubstring.getData$okio().length) {
                if (i2 - i >= 0) {
                    return (i == 0 && i2 == commonSubstring.getData$okio().length) ? commonSubstring : new ByteString(C10751g.m492d(i, commonSubstring.getData$okio(), i2));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + commonSubstring.getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    @NotNull
    public static final ByteString commonToAsciiLowercase(@NotNull ByteString commonToAsciiLowercase) {
        byte b;
        C10843j.m430f(commonToAsciiLowercase, "$this$commonToAsciiLowercase");
        for (int i = 0; i < commonToAsciiLowercase.getData$okio().length; i++) {
            byte b2 = commonToAsciiLowercase.getData$okio()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] data$okio = commonToAsciiLowercase.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                C10843j.m431e(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return commonToAsciiLowercase;
    }

    @NotNull
    public static final ByteString commonToAsciiUppercase(@NotNull ByteString commonToAsciiUppercase) {
        byte b;
        C10843j.m430f(commonToAsciiUppercase, "$this$commonToAsciiUppercase");
        for (int i = 0; i < commonToAsciiUppercase.getData$okio().length; i++) {
            byte b2 = commonToAsciiUppercase.getData$okio()[i];
            byte b3 = (byte) 97;
            if (b2 >= b3 && b2 <= (b = (byte) 122)) {
                byte[] data$okio = commonToAsciiUppercase.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                C10843j.m431e(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return commonToAsciiUppercase;
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull ByteString commonToByteArray) {
        C10843j.m430f(commonToByteArray, "$this$commonToByteArray");
        byte[] data$okio = commonToByteArray.getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        C10843j.m431e(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public static final ByteString commonToByteString(@NotNull byte[] commonToByteString, int i, int i2) {
        C10843j.m430f(commonToByteString, "$this$commonToByteString");
        Util.checkOffsetAndCount(commonToByteString.length, i, i2);
        return new ByteString(C10751g.m492d(i, commonToByteString, i2 + i));
    }

    @NotNull
    public static final String commonToString(@NotNull ByteString commonToString) {
        StringBuilder sb;
        StringBuilder sb2;
        C10843j.m430f(commonToString, "$this$commonToString");
        if (commonToString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int codePointIndexToCharIndex = codePointIndexToCharIndex(commonToString.getData$okio(), 64);
        if (codePointIndexToCharIndex != -1) {
            String utf8 = commonToString.utf8();
            if (utf8 != null) {
                String substring = utf8.substring(0, codePointIndexToCharIndex);
                C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String m394i = C10925n.m394i(C10925n.m394i(C10925n.m394i(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
                if (codePointIndexToCharIndex < utf8.length()) {
                    sb = new StringBuilder("[size=");
                    sb.append(commonToString.getData$okio().length);
                    sb.append(" text=");
                    sb.append(m394i);
                    sb.append("…]");
                } else {
                    sb = new StringBuilder("[text=");
                    sb.append(m394i);
                    sb.append(']');
                }
                return sb.toString();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        if (commonToString.getData$okio().length <= 64) {
            sb2 = new StringBuilder("[hex=");
            sb2.append(commonToString.hex());
            sb2.append(']');
        } else {
            sb2 = new StringBuilder("[size=");
            sb2.append(commonToString.getData$okio().length);
            sb2.append(" hex=");
            if (!(64 <= commonToString.getData$okio().length)) {
                throw new IllegalArgumentException(("endIndex > length(" + commonToString.getData$okio().length + ')').toString());
            }
            if (64 != commonToString.getData$okio().length) {
                commonToString = new ByteString(C10751g.m492d(0, commonToString.getData$okio(), 64));
            }
            sb2.append(commonToString.hex());
            sb2.append("…]");
        }
        return sb2.toString();
    }

    @NotNull
    public static final String commonUtf8(@NotNull ByteString commonUtf8) {
        C10843j.m430f(commonUtf8, "$this$commonUtf8");
        String utf8$okio = commonUtf8.getUtf8$okio();
        if (utf8$okio == null) {
            String utf8String = Platform.toUtf8String(commonUtf8.internalArray$okio());
            commonUtf8.setUtf8$okio(utf8String);
            return utf8String;
        }
        return utf8$okio;
    }

    public static final void commonWrite(@NotNull ByteString commonWrite, @NotNull Buffer buffer, int i, int i2) {
        C10843j.m430f(commonWrite, "$this$commonWrite");
        C10843j.m430f(buffer, "buffer");
        buffer.write(commonWrite.getData$okio(), i, i2);
    }

    public static final int decodeHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    @NotNull
    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }
}
