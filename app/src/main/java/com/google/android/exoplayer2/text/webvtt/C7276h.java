package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.webvtt.h */
/* loaded from: classes.dex */
public final class C7276h {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    /* renamed from: a */
    public static float m5286a(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: b */
    public static long m5285b(String str) throws NumberFormatException {
        int i = C7408g0.f13905a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: c */
    public static void m5284c(C7436v c7436v) throws C7506y0 {
        boolean z;
        String str;
        int i = c7436v.f13979b;
        String m5014d = c7436v.m5014d();
        if (m5014d != null && m5014d.startsWith("WEBVTT")) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            c7436v.m4992z(i);
            String valueOf = String.valueOf(c7436v.m5014d());
            if (valueOf.length() != 0) {
                str = "Expected WEBVTT. Got ".concat(valueOf);
            } else {
                str = new String("Expected WEBVTT. Got ");
            }
            throw C7506y0.m4869a(str, null);
        }
    }
}
