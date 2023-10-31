package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7424q;
import com.google.android.gms.ads.AdRequest;
import okhttp3.internal.http2.Http2;

/* renamed from: com.google.android.exoplayer2.mediacodec.n */
/* loaded from: classes.dex */
public final class C7024n {

    /* renamed from: a */
    public final String f12389a;

    /* renamed from: b */
    public final String f12390b;

    /* renamed from: c */
    public final String f12391c;
    @Nullable

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f12392d;

    /* renamed from: e */
    public final boolean f12393e;

    /* renamed from: f */
    public final boolean f12394f;

    /* renamed from: g */
    public final boolean f12395g;

    @VisibleForTesting
    public C7024n(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        str.getClass();
        this.f12389a = str;
        this.f12390b = str2;
        this.f12391c = str3;
        this.f12392d = codecCapabilities;
        this.f12393e = z;
        this.f12394f = z2;
        this.f12395g = C7424q.m5040j(str2);
    }

    @RequiresApi(21)
    /* renamed from: a */
    public static boolean m5601a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = C7408g0.f13905a;
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        if (com.google.android.exoplayer2.util.C7408g0.f13905a < 21) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
        if (r10.isFeatureSupported("secure-playback") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
        if (r14 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0070, code lost:
        r6 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.mediacodec.C7024n m5595g(java.lang.String r7, java.lang.String r8, java.lang.String r9, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            com.google.android.exoplayer2.mediacodec.n r11 = new com.google.android.exoplayer2.mediacodec.n
            r12 = 1
            r13 = 0
            if (r10 == 0) goto L46
            int r0 = com.google.android.exoplayer2.util.C7408g0.f13905a
            r1 = 19
            if (r0 < r1) goto L16
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r10.isFeatureSupported(r1)
            if (r1 == 0) goto L16
            r1 = r12
            goto L17
        L16:
            r1 = r13
        L17:
            if (r1 == 0) goto L46
            r1 = 22
            if (r0 > r1) goto L41
            java.lang.String r0 = com.google.android.exoplayer2.util.C7408g0.f13908d
            java.lang.String r1 = "ODROID-XU3"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2f
            java.lang.String r1 = "Nexus 10"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
        L2f:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L3f
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L41
        L3f:
            r0 = r12
            goto L42
        L41:
            r0 = r13
        L42:
            if (r0 != 0) goto L46
            r5 = r12
            goto L47
        L46:
            r5 = r13
        L47:
            r0 = 21
            if (r10 == 0) goto L5a
            int r1 = com.google.android.exoplayer2.util.C7408g0.f13905a
            if (r1 < r0) goto L59
            java.lang.String r1 = "tunneled-playback"
            boolean r1 = r10.isFeatureSupported(r1)
            if (r1 == 0) goto L59
            r1 = r12
            goto L5a
        L59:
            r1 = r13
        L5a:
            if (r14 != 0) goto L72
            if (r10 == 0) goto L70
            int r14 = com.google.android.exoplayer2.util.C7408g0.f13905a
            if (r14 < r0) goto L6c
            java.lang.String r14 = "secure-playback"
            boolean r14 = r10.isFeatureSupported(r14)
            if (r14 == 0) goto L6c
            r14 = r12
            goto L6d
        L6c:
            r14 = r13
        L6d:
            if (r14 == 0) goto L70
            goto L72
        L70:
            r6 = r13
            goto L73
        L72:
            r6 = r12
        L73:
            r0 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C7024n.m5595g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.google.android.exoplayer2.mediacodec.n");
    }

    /* renamed from: b */
    public final DecoderReuseEvaluation m5600b(C7003m0 c7003m0, C7003m0 c7003m02) {
        int i;
        int i2;
        boolean z = false;
        if (!C7408g0.m5105a(c7003m0.f12287l, c7003m02.f12287l)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f12395g) {
            if (c7003m0.f12295t != c7003m02.f12295t) {
                i |= 1024;
            }
            if (!this.f12393e && (c7003m0.f12292q != c7003m02.f12292q || c7003m0.f12293r != c7003m02.f12293r)) {
                i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if (!C7408g0.m5105a(c7003m0.f12299x, c7003m02.f12299x)) {
                i |= 2048;
            }
            if (C7408g0.f13908d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f12389a)) {
                z = true;
            }
            if (z && !c7003m0.m5615c(c7003m02)) {
                i |= 2;
            }
            if (i == 0) {
                String str = this.f12389a;
                if (c7003m0.m5615c(c7003m02)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new DecoderReuseEvaluation(str, c7003m0, c7003m02, i2, 0);
            }
        } else {
            if (c7003m0.f12300y != c7003m02.f12300y) {
                i |= 4096;
            }
            if (c7003m0.f12301z != c7003m02.f12301z) {
                i |= 8192;
            }
            if (c7003m0.f12270A != c7003m02.f12270A) {
                i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str2 = this.f12390b;
            if (i == 0 && "audio/mp4a-latm".equals(str2)) {
                Pair<Integer, Integer> m5567c = C7032u.m5567c(c7003m0);
                Pair<Integer, Integer> m5567c2 = C7032u.m5567c(c7003m02);
                if (m5567c != null && m5567c2 != null) {
                    int intValue = ((Integer) m5567c.first).intValue();
                    int intValue2 = ((Integer) m5567c2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new DecoderReuseEvaluation(this.f12389a, c7003m0, c7003m02, 3, 0);
                    }
                }
            }
            if (!c7003m0.m5615c(c7003m02)) {
                i |= 32;
            }
            if ("audio/opus".equals(str2)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.f12389a, c7003m0, c7003m02, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.f12389a, c7003m0, c7003m02, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5599c(com.google.android.exoplayer2.C7003m0 r15) throws com.google.android.exoplayer2.mediacodec.C7032u.C7034b {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C7024n.m5599c(com.google.android.exoplayer2.m0):boolean");
    }

    /* renamed from: d */
    public final boolean m5598d(C7003m0 c7003m0) {
        if (this.f12395g) {
            return this.f12393e;
        }
        Pair<Integer, Integer> m5567c = C7032u.m5567c(c7003m0);
        return m5567c != null && ((Integer) m5567c.first).intValue() == 42;
    }

    @RequiresApi(21)
    /* renamed from: e */
    public final boolean m5597e(int i, int i2, double d) {
        String sb;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12392d;
        if (codecCapabilities == null) {
            sb = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                sb = "sizeAndRate.vCaps";
            } else {
                if (!m5601a(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        String str = this.f12389a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(C7408g0.f13906b)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && m5601a(videoCapabilities, i2, i, d)) {
                            StringBuilder sb2 = new StringBuilder(69);
                            sb2.append("sizeAndRate.rotated, ");
                            sb2.append(i);
                            sb2.append("x");
                            sb2.append(i2);
                            sb2.append("x");
                            sb2.append(d);
                            String sb3 = sb2.toString();
                            String str2 = C7408g0.f13909e;
                            int m12193a = C0552c.m12193a(str, C0552c.m12193a(sb3, 25));
                            String str3 = this.f12390b;
                            StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str2, C0552c.m12193a(str3, m12193a)), "AssumedSupport [", sb3, "] [", str);
                            m9043a.append(", ");
                            m9043a.append(str3);
                            m9043a.append("] [");
                            m9043a.append(str2);
                            m9043a.append("]");
                            Log.d("MediaCodecInfo", m9043a.toString());
                        }
                    }
                    StringBuilder sb4 = new StringBuilder(69);
                    sb4.append("sizeAndRate.support, ");
                    sb4.append(i);
                    sb4.append("x");
                    sb4.append(i2);
                    sb4.append("x");
                    sb4.append(d);
                    sb = sb4.toString();
                }
                return true;
            }
        }
        m5596f(sb);
        return false;
    }

    /* renamed from: f */
    public final void m5596f(String str) {
        String str2 = C7408g0.f13909e;
        int m12193a = C0552c.m12193a(str, 20);
        String str3 = this.f12389a;
        int m12193a2 = C0552c.m12193a(str3, m12193a);
        String str4 = this.f12390b;
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str2, C0552c.m12193a(str4, m12193a2)), "NoSupport [", str, "] [", str3);
        m9043a.append(", ");
        m9043a.append(str4);
        m9043a.append("] [");
        m9043a.append(str2);
        m9043a.append("]");
        Log.d("MediaCodecInfo", m9043a.toString());
    }

    public final String toString() {
        return this.f12389a;
    }
}
