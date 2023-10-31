package com.google.android.exoplayer2.text.webvtt;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7436v;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.webvtt.c */
/* loaded from: classes.dex */
public final class C7267c {

    /* renamed from: c */
    public static final Pattern f13328c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    public static final Pattern f13329d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    public final C7436v f13330a = new C7436v();

    /* renamed from: b */
    public final StringBuilder f13331b = new StringBuilder();

    /* renamed from: a */
    public static String m5299a(C7436v c7436v, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = c7436v.f13979b;
        int i2 = c7436v.f13980c;
        while (i < i2 && !z) {
            char c = (char) c7436v.f13978a[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && ((c < '0' || c > '9') && c != '#' && c != '-' && c != '.' && c != '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        c7436v.m5018A(i - c7436v.f13979b);
        return sb.toString();
    }

    @Nullable
    /* renamed from: b */
    public static String m5298b(C7436v c7436v, StringBuilder sb) {
        m5297c(c7436v);
        if (c7436v.f13980c - c7436v.f13979b == 0) {
            return null;
        }
        String m5299a = m5299a(c7436v, sb);
        if (!"".equals(m5299a)) {
            return m5299a;
        }
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append((char) c7436v.m5002p());
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0067 A[LOOP:1: B:4:0x0002->B:38:0x0067, LOOP_END] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m5297c(com.google.android.exoplayer2.util.C7436v r8) {
        /*
            r0 = 1
        L1:
            r1 = r0
        L2:
            int r2 = r8.f13980c
            int r3 = r8.f13979b
            int r2 = r2 - r3
            if (r2 <= 0) goto L69
            if (r1 == 0) goto L69
            byte[] r1 = r8.f13978a
            r1 = r1[r3]
            char r1 = (char) r1
            r2 = 9
            r3 = 0
            if (r1 == r2) goto L27
            r2 = 10
            if (r1 == r2) goto L27
            r2 = 12
            if (r1 == r2) goto L27
            r2 = 13
            if (r1 == r2) goto L27
            r2 = 32
            if (r1 == r2) goto L27
            r1 = r3
            goto L2b
        L27:
            r8.m5018A(r0)
            r1 = r0
        L2b:
            if (r1 != 0) goto L1
            int r1 = r8.f13979b
            int r2 = r8.f13980c
            byte[] r4 = r8.f13978a
            int r5 = r1 + 2
            if (r5 > r2) goto L63
            int r5 = r1 + 1
            r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L63
            int r1 = r5 + 1
            r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L63
        L47:
            int r5 = r1 + 1
            if (r5 >= r2) goto L5b
            r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L59
            r1 = r4[r5]
            char r1 = (char) r1
            if (r1 != r6) goto L59
            int r2 = r5 + 1
            r1 = r2
            goto L47
        L59:
            r1 = r5
            goto L47
        L5b:
            int r1 = r8.f13979b
            int r2 = r2 - r1
            r8.m5018A(r2)
            r1 = r0
            goto L64
        L63:
            r1 = r3
        L64:
            if (r1 == 0) goto L67
            goto L1
        L67:
            r1 = r3
            goto L2
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.C7267c.m5297c(com.google.android.exoplayer2.util.v):void");
    }
}
