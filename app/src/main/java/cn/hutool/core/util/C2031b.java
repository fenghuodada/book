package cn.hutool.core.util;

import java.nio.charset.Charset;

/* renamed from: cn.hutool.core.util.b */
/* loaded from: classes.dex */
public final class C2031b {
    /* renamed from: a */
    public static byte[] m9717a(CharSequence charSequence, Charset charset) {
        if (charSequence == null) {
            return null;
        }
        String charSequence2 = charSequence.toString();
        return charset == null ? charSequence2.getBytes() : charSequence2.getBytes(charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x015a, code lost:
        return r3.toString();
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m9716b(java.lang.CharSequence r12, java.lang.Object... r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.hutool.core.util.C2031b.m9716b(java.lang.CharSequence, java.lang.Object[]):java.lang.String");
    }

    /* renamed from: c */
    public static boolean m9715c(CharSequence charSequence) {
        int length;
        boolean z;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i = 0; i < length; i++) {
                char charAt = charSequence.charAt(i);
                if (!Character.isWhitespace((int) charAt) && !Character.isSpaceChar((int) charAt) && charAt != 65279 && charAt != 8234) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    public static String m9714d(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return charset == null ? new String(bArr) : new String(bArr, charset);
    }
}
