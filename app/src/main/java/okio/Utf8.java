package okio;

import androidx.appcompat.view.menu.C0235r;
import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1194j;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\f\n\u0002\b\u0010\u001a'\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0080\b\u001a4\u0010\u0011\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\bø\u0001\u0000\u001a4\u0010\u0013\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\bø\u0001\u0000\u001a4\u0010\u0015\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\bø\u0001\u0000\u001a4\u0010\u0016\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\bø\u0001\u0000\"\u0014\u0010\u0019\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u0014\u0010 \u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0014\u0010!\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u001e\"\u0014\u0010\"\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u001e\"\u0014\u0010#\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, m508d2 = {"", "", "beginIndex", "endIndex", "", "size", "(Ljava/lang/String;II)J", "utf8Size", "codePoint", "", "isIsoControl", "", "byte", "isUtf8Continuation", "Lkotlin/Function1;", "Lkotlin/p;", "yield", "processUtf8Bytes", "", "processUtf8CodePoints", "", "processUtf16Chars", "process2Utf8Bytes", "process3Utf8Bytes", "process4Utf8Bytes", "REPLACEMENT_BYTE", "B", "REPLACEMENT_CHARACTER", "C", "REPLACEMENT_CODE_POINT", "I", "HIGH_SURROGATE_HEADER", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "okio"}, m507k = 2, m506mv = {1, 4, 0})
@JvmName(name = "Utf8")
/* loaded from: classes3.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i) {
        return (i >= 0 && 31 >= i) || (127 <= i && 159 >= i);
    }

    public static final boolean isUtf8Continuation(byte b) {
        return (b & 192) == 128;
    }

    public static final int process2Utf8Bytes(@NotNull byte[] process2Utf8Bytes, int i, int i2, @NotNull InterfaceC10820l<? super Integer, C10868p> yield) {
        C10843j.m430f(process2Utf8Bytes, "$this$process2Utf8Bytes");
        C10843j.m430f(yield, "yield");
        int i3 = i + 1;
        Integer valueOf = Integer.valueOf((int) REPLACEMENT_CODE_POINT);
        if (i2 <= i3) {
            yield.invoke(valueOf);
            return 1;
        }
        byte b = process2Utf8Bytes[i];
        byte b2 = process2Utf8Bytes[i3];
        if (!((b2 & 192) == 128)) {
            yield.invoke(valueOf);
            return 1;
        }
        int i4 = (b2 ^ 3968) ^ (b << 6);
        if (i4 < 128) {
            yield.invoke(valueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i4));
        return 2;
    }

    public static final int process3Utf8Bytes(@NotNull byte[] process3Utf8Bytes, int i, int i2, @NotNull InterfaceC10820l<? super Integer, C10868p> yield) {
        C10843j.m430f(process3Utf8Bytes, "$this$process3Utf8Bytes");
        C10843j.m430f(yield, "yield");
        int i3 = i + 2;
        Integer valueOf = Integer.valueOf((int) REPLACEMENT_CODE_POINT);
        if (i2 <= i3) {
            yield.invoke(valueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((process3Utf8Bytes[i4] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b = process3Utf8Bytes[i];
        byte b2 = process3Utf8Bytes[i + 1];
        if (!((b2 & 192) == 128)) {
            yield.invoke(valueOf);
            return 1;
        }
        byte b3 = process3Utf8Bytes[i3];
        if (!((b3 & 192) == 128)) {
            yield.invoke(valueOf);
            return 2;
        }
        int i5 = ((b3 ^ (-123008)) ^ (b2 << 6)) ^ (b << 12);
        if (i5 >= 2048 && (55296 > i5 || 57343 < i5)) {
            yield.invoke(Integer.valueOf(i5));
            return 3;
        }
        yield.invoke(valueOf);
        return 3;
    }

    public static final int process4Utf8Bytes(@NotNull byte[] process4Utf8Bytes, int i, int i2, @NotNull InterfaceC10820l<? super Integer, C10868p> yield) {
        C10843j.m430f(process4Utf8Bytes, "$this$process4Utf8Bytes");
        C10843j.m430f(yield, "yield");
        int i3 = i + 3;
        Integer valueOf = Integer.valueOf((int) REPLACEMENT_CODE_POINT);
        if (i2 <= i3) {
            yield.invoke(valueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((process4Utf8Bytes[i4] & 192) == 128) {
                    int i5 = i + 2;
                    if (i2 > i5) {
                        if ((process4Utf8Bytes[i5] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b = process4Utf8Bytes[i];
        byte b2 = process4Utf8Bytes[i + 1];
        if (!((b2 & 192) == 128)) {
            yield.invoke(valueOf);
            return 1;
        }
        byte b3 = process4Utf8Bytes[i + 2];
        if (!((b3 & 192) == 128)) {
            yield.invoke(valueOf);
            return 2;
        }
        byte b4 = process4Utf8Bytes[i3];
        if (!((b4 & 192) == 128)) {
            yield.invoke(valueOf);
            return 3;
        }
        int i6 = (((b4 ^ 3678080) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
        if (i6 <= 1114111 && ((55296 > i6 || 57343 < i6) && i6 >= 65536)) {
            yield.invoke(Integer.valueOf(i6));
            return 4;
        }
        yield.invoke(valueOf);
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0112, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processUtf16Chars(@org.jetbrains.annotations.NotNull byte[] r16, int r17, int r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.InterfaceC10820l<? super java.lang.Character, kotlin.C10868p> r19) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf16Chars(byte[], int, int, kotlin.jvm.functions.l):void");
    }

    public static final void processUtf8Bytes(@NotNull String processUtf8Bytes, int i, int i2, @NotNull InterfaceC10820l<? super Byte, C10868p> yield) {
        int i3;
        Byte valueOf;
        int i4;
        char charAt;
        C10843j.m430f(processUtf8Bytes, "$this$processUtf8Bytes");
        C10843j.m430f(yield, "yield");
        while (i < i2) {
            char charAt2 = processUtf8Bytes.charAt(i);
            if (C10843j.m428h(charAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) charAt2));
                i++;
                while (i < i2 && C10843j.m428h(processUtf8Bytes.charAt(i), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) processUtf8Bytes.charAt(i)));
                    i++;
                }
            } else {
                if (C10843j.m428h(charAt2, 2048) < 0) {
                    i3 = (charAt2 >> 6) | 192;
                } else if (55296 > charAt2 || 57343 < charAt2) {
                    yield.invoke(Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    i3 = ((charAt2 >> 6) & 63) | 128;
                } else if (C10843j.m428h(charAt2, 56319) > 0 || i2 <= (i4 = i + 1) || 56320 > (charAt = processUtf8Bytes.charAt(i4)) || 57343 < charAt) {
                    valueOf = Byte.valueOf((byte) REPLACEMENT_BYTE);
                    yield.invoke(valueOf);
                    i++;
                } else {
                    int charAt3 = (processUtf8Bytes.charAt(i4) + (charAt2 << '\n')) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i += 2;
                }
                yield.invoke(Byte.valueOf((byte) i3));
                valueOf = Byte.valueOf((byte) ((charAt2 & '?') | 128));
                yield.invoke(valueOf);
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0110, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processUtf8CodePoints(@org.jetbrains.annotations.NotNull byte[] r16, int r17, int r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.InterfaceC10820l<? super java.lang.Integer, kotlin.C10868p> r19) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf8CodePoints(byte[], int, int, kotlin.jvm.functions.l):void");
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(@NotNull String str) {
        return size$default(str, 0, 0, 3, null);
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(@NotNull String str, int i) {
        return size$default(str, i, 0, 2, null);
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(@NotNull String utf8Size, int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        char c;
        C10843j.m430f(utf8Size, "$this$utf8Size");
        boolean z3 = true;
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
                if (i2 > utf8Size.length()) {
                    z3 = false;
                }
                if (z3) {
                    long j = 0;
                    while (i < i2) {
                        char charAt = utf8Size.charAt(i);
                        if (charAt < 128) {
                            j++;
                        } else {
                            if (charAt < 2048) {
                                i3 = 2;
                            } else if (charAt >= 55296 && charAt <= 57343) {
                                int i4 = i + 1;
                                if (i4 < i2) {
                                    c = utf8Size.charAt(i4);
                                } else {
                                    c = 0;
                                }
                                if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                    j += 4;
                                    i += 2;
                                } else {
                                    j++;
                                    i = i4;
                                }
                            } else {
                                i3 = 3;
                            }
                            j += i3;
                        }
                        i++;
                    }
                    return j;
                }
                StringBuilder m12536b = C0406q1.m12536b("endIndex > string.length: ", i2, " > ");
                m12536b.append(utf8Size.length());
                throw new IllegalArgumentException(m12536b.toString().toString());
            }
            throw new IllegalArgumentException(C1194j.m11060a("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(C0235r.m12816a("beginIndex < 0: ", i).toString());
    }

    public static /* synthetic */ long size$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return size(str, i, i2);
    }
}
