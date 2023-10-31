package com.google.android.exoplayer2.extractor;

import android.util.Log;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.b */
/* loaded from: classes.dex */
public final class C6817b {
    /* renamed from: a */
    public static void m5952a(long j, C7436v c7436v, TrackOutput[] trackOutputArr) {
        int i;
        int i2;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (c7436v.f13980c - c7436v.f13979b > 1) {
                int i3 = 0;
                while (true) {
                    if (c7436v.f13980c - c7436v.f13979b == 0) {
                        i = -1;
                        break;
                    }
                    int m5002p = c7436v.m5002p();
                    i3 += m5002p;
                    if (m5002p != 255) {
                        i = i3;
                        break;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (c7436v.f13980c - c7436v.f13979b == 0) {
                        i4 = -1;
                        break;
                    }
                    int m5002p2 = c7436v.m5002p();
                    i4 += m5002p2;
                    if (m5002p2 != 255) {
                        break;
                    }
                }
                int i5 = c7436v.f13979b;
                int i6 = i5 + i4;
                if (i4 != -1 && i4 <= c7436v.f13980c - i5) {
                    if (i == 4 && i4 >= 8) {
                        int m5002p3 = c7436v.m5002p();
                        int m4997u = c7436v.m4997u();
                        if (m4997u == 49) {
                            i2 = c7436v.m5015c();
                        } else {
                            i2 = 0;
                        }
                        int m5002p4 = c7436v.m5002p();
                        if (m4997u == 47) {
                            c7436v.m5018A(1);
                        }
                        if (m5002p3 == 181 && ((m4997u == 49 || m4997u == 47) && m5002p4 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m4997u == 49) {
                            if (i2 != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            m5951b(j, c7436v, trackOutputArr);
                        }
                    }
                } else {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i6 = c7436v.f13980c;
                }
                c7436v.m4992z(i6);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m5951b(long j, C7436v c7436v, TrackOutput[] trackOutputArr) {
        boolean z;
        int m5002p = c7436v.m5002p();
        if ((m5002p & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        c7436v.m5018A(1);
        int i = (m5002p & 31) * 3;
        int i2 = c7436v.f13979b;
        for (TrackOutput trackOutput : trackOutputArr) {
            c7436v.m4992z(i2);
            trackOutput.mo5454b(i, c7436v);
            if (j != -9223372036854775807L) {
                trackOutput.mo5452d(j, 1, i, 0, null);
            }
        }
    }
}
