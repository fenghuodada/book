package com.google.gson.internal.bind.util;

import java.util.TimeZone;
import p060j$.util.DesugarTimeZone;

/* renamed from: com.google.gson.internal.bind.util.a */
/* loaded from: classes3.dex */
public final class C8654a {

    /* renamed from: a */
    public static final TimeZone f16447a = DesugarTimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static boolean m3254a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1 A[Catch: IllegalArgumentException -> 0x01ce, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, IndexOutOfBoundsException -> 0x01d2, TRY_LEAVE, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b6, B:57:0x00db, B:59:0x00e1, B:86:0x0196, B:68:0x00f6, B:69:0x0111, B:70:0x0112, B:74:0x012e, B:76:0x013b, B:79:0x0144, B:81:0x0163, B:84:0x0173, B:85:0x0195, B:73:0x011d, B:88:0x01c6, B:89:0x01cd, B:50:0x00c6, B:51:0x00c9, B:45:0x00b2), top: B:105:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c6 A[Catch: IllegalArgumentException -> 0x01ce, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, IndexOutOfBoundsException -> 0x01d2, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b6, B:57:0x00db, B:59:0x00e1, B:86:0x0196, B:68:0x00f6, B:69:0x0111, B:70:0x0112, B:74:0x012e, B:76:0x013b, B:79:0x0144, B:81:0x0163, B:84:0x0173, B:85:0x0195, B:73:0x011d, B:88:0x01c6, B:89:0x01cd, B:50:0x00c6, B:51:0x00c9, B:45:0x00b2), top: B:105:0x0004 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date m3253b(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.C8654a.m3253b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: c */
    public static int m3252c(int i, int i2, String str) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }
}
