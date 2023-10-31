package com.google.android.exoplayer2.audio;

import android.util.Log;
import androidx.constraintlayout.core.C0510h;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.util.C7435u;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class AacUtil {

    /* renamed from: a */
    public static final int[] f10592a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    public static final int[] f10593b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AacAudioObjectType {
    }

    /* renamed from: com.google.android.exoplayer2.audio.AacUtil$a */
    /* loaded from: classes.dex */
    public static final class C6666a {

        /* renamed from: a */
        public final int f10594a;

        /* renamed from: b */
        public final int f10595b;

        /* renamed from: c */
        public final String f10596c;

        public C6666a(int i, int i2, String str) {
            this.f10594a = i;
            this.f10595b = i2;
            this.f10596c = str;
        }
    }

    /* renamed from: a */
    public static int m6128a(int i) {
        if (i != 2) {
            if (i != 5) {
                if (i != 29) {
                    if (i != 42) {
                        if (i != 22) {
                            return i != 23 ? 0 : 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    /* renamed from: b */
    public static int m6127b(C7435u c7435u) throws C7506y0 {
        int m5026f = c7435u.m5026f(4);
        if (m5026f == 15) {
            return c7435u.m5026f(24);
        }
        if (m5026f < 13) {
            return f10592a[m5026f];
        }
        throw C7506y0.m4869a(null, null);
    }

    /* renamed from: c */
    public static C6666a m6126c(C7435u c7435u, boolean z) throws C7506y0 {
        int m5026f = c7435u.m5026f(5);
        if (m5026f == 31) {
            m5026f = c7435u.m5026f(6) + 32;
        }
        int m6127b = m6127b(c7435u);
        int m5026f2 = c7435u.m5026f(4);
        String m12340a = C0510h.m12340a(19, "mp4a.40.", m5026f);
        if (m5026f == 5 || m5026f == 29) {
            m6127b = m6127b(c7435u);
            int m5026f3 = c7435u.m5026f(5);
            if (m5026f3 == 31) {
                m5026f3 = c7435u.m5026f(6) + 32;
            }
            m5026f = m5026f3;
            if (m5026f == 22) {
                m5026f2 = c7435u.m5026f(4);
            }
        }
        if (z) {
            if (m5026f != 1 && m5026f != 2 && m5026f != 3 && m5026f != 4 && m5026f != 6 && m5026f != 7 && m5026f != 17) {
                switch (m5026f) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Unsupported audio object type: ");
                        sb.append(m5026f);
                        throw C7506y0.m4868b(sb.toString());
                }
            }
            if (c7435u.m5027e()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c7435u.m5027e()) {
                c7435u.m5020l(14);
            }
            boolean m5027e = c7435u.m5027e();
            if (m5026f2 != 0) {
                if (m5026f == 6 || m5026f == 20) {
                    c7435u.m5020l(3);
                }
                if (m5027e) {
                    if (m5026f == 22) {
                        c7435u.m5020l(16);
                    }
                    if (m5026f == 17 || m5026f == 19 || m5026f == 20 || m5026f == 23) {
                        c7435u.m5020l(3);
                    }
                    c7435u.m5020l(1);
                }
                switch (m5026f) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int m5026f4 = c7435u.m5026f(2);
                        if (m5026f4 == 2 || m5026f4 == 3) {
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Unsupported epConfig: ");
                            sb2.append(m5026f4);
                            throw C7506y0.m4868b(sb2.toString());
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i = f10593b[m5026f2];
        if (i != -1) {
            return new C6666a(m6127b, i, m12340a);
        }
        throw C7506y0.m4869a(null, null);
    }
}
