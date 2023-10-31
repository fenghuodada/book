package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.C0406q1;
import com.ambrose.overwall.fragment.C2402a;
import com.applovin.impl.adview.C2808x;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.gms.ads.AdRequest;
import com.google.common.base.C7929b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;

@SuppressLint({"InlinedApi"})
/* renamed from: com.google.android.exoplayer2.mediacodec.u */
/* loaded from: classes.dex */
public final class C7032u {

    /* renamed from: a */
    public static final Pattern f12477a = Pattern.compile("^\\D?(\\d+)$");
    @GuardedBy("MediaCodecUtil.class")

    /* renamed from: b */
    public static final HashMap<C7033a, List<C7024n>> f12478b = new HashMap<>();

    /* renamed from: c */
    public static int f12479c = -1;

    /* renamed from: com.google.android.exoplayer2.mediacodec.u$a */
    /* loaded from: classes.dex */
    public static final class C7033a {

        /* renamed from: a */
        public final String f12480a;

        /* renamed from: b */
        public final boolean f12481b;

        /* renamed from: c */
        public final boolean f12482c;

        public C7033a(String str, boolean z, boolean z2) {
            this.f12480a = str;
            this.f12481b = z;
            this.f12482c = z2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C7033a.class) {
                return false;
            }
            C7033a c7033a = (C7033a) obj;
            return TextUtils.equals(this.f12480a, c7033a.f12480a) && this.f12481b == c7033a.f12481b && this.f12482c == c7033a.f12482c;
        }

        public final int hashCode() {
            int i;
            int m12537a = C0406q1.m12537a(this.f12480a, 31, 31);
            int i2 = 1231;
            if (this.f12481b) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i3 = (m12537a + i) * 31;
            if (!this.f12482c) {
                i2 = 1237;
            }
            return i3 + i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.u$b */
    /* loaded from: classes.dex */
    public static class C7034b extends Exception {
        public C7034b(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.u$c */
    /* loaded from: classes.dex */
    public interface InterfaceC7035c {
        /* renamed from: a */
        MediaCodecInfo mo5561a(int i);

        /* renamed from: b */
        boolean mo5560b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        boolean mo5559c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        int mo5558d();

        /* renamed from: e */
        boolean mo5557e();
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.u$d */
    /* loaded from: classes.dex */
    public static final class C7036d implements InterfaceC7035c {
        @Override // com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7035c
        /* renamed from: a */
        public final MediaCodecInfo mo5561a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7035c
        /* renamed from: b */
        public final boolean mo5560b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7035c
        /* renamed from: c */
        public final boolean mo5559c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7035c
        /* renamed from: d */
        public final int mo5558d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7035c
        /* renamed from: e */
        public final boolean mo5557e() {
            return false;
        }
    }

    @RequiresApi(21)
    /* renamed from: com.google.android.exoplayer2.mediacodec.u$e */
    /* loaded from: classes.dex */
    public static final class C7037e implements InterfaceC7035c {

        /* renamed from: a */
        public final int f12483a;
        @Nullable

        /* renamed from: b */
        public MediaCodecInfo[] f12484b;

        public C7037e(boolean z, boolean z2) {
            this.f12483a = (z || z2) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7035c
        /* renamed from: a */
        public final MediaCodecInfo mo5561a(int i) {
            if (this.f12484b == null) {
                this.f12484b = new MediaCodecList(this.f12483a).getCodecInfos();
            }
            return this.f12484b[i];
        }

        @Override // com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7035c
        /* renamed from: b */
        public final boolean mo5560b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7035c
        /* renamed from: c */
        public final boolean mo5559c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7035c
        /* renamed from: d */
        public final int mo5558d() {
            if (this.f12484b == null) {
                this.f12484b = new MediaCodecList(this.f12483a).getCodecInfos();
            }
            return this.f12484b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7035c
        /* renamed from: e */
        public final boolean mo5557e() {
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.u$f */
    /* loaded from: classes.dex */
    public interface InterfaceC7038f<T> {
        /* renamed from: a */
        int mo5556a(T t);
    }

    /* renamed from: a */
    public static void m5569a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (C7408g0.f13905a < 26 && C7408g0.f13906b.equals("R9") && arrayList.size() == 1 && ((C7024n) arrayList.get(0)).f12389a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C7024n.m5595g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C7031t(new C2808x()));
        }
        int i = C7408g0.f13905a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((C7024n) arrayList.get(0)).f12389a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new C7031t(new C2402a()));
            }
        }
        if (i < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C7024n) arrayList.get(0)).f12389a)) {
            arrayList.add((C7024n) arrayList.remove(0));
        }
    }

    @Nullable
    /* renamed from: b */
    public static String m5568b(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03a8 A[Catch: NumberFormatException -> 0x03b7, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x03b7, blocks: (B:263:0x0364, B:265:0x0378, B:277:0x0396, B:286:0x03a8), top: B:595:0x0364 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:602:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    @androidx.annotation.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m5567c(com.google.android.exoplayer2.C7003m0 r17) {
        /*
            Method dump skipped, instructions count: 2536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C7032u.m5567c(com.google.android.exoplayer2.m0):android.util.Pair");
    }

    /* renamed from: d */
    public static synchronized List<C7024n> m5566d(String str, boolean z, boolean z2) throws C7034b {
        InterfaceC7035c c7036d;
        synchronized (C7032u.class) {
            C7033a c7033a = new C7033a(str, z, z2);
            HashMap<C7033a, List<C7024n>> hashMap = f12478b;
            List<C7024n> list = hashMap.get(c7033a);
            if (list != null) {
                return list;
            }
            int i = C7408g0.f13905a;
            if (i >= 21) {
                c7036d = new C7037e(z, z2);
            } else {
                c7036d = new C7036d();
            }
            ArrayList<C7024n> m5565e = m5565e(c7033a, c7036d);
            if (z && m5565e.isEmpty() && 21 <= i && i <= 23) {
                m5565e = m5565e(c7033a, new C7036d());
                if (!m5565e.isEmpty()) {
                    String str2 = m5565e.get(0).f12389a;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            m5569a(str, m5565e);
            List<C7024n> unmodifiableList = Collections.unmodifiableList(m5565e);
            hashMap.put(c7033a, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:72:0x013e, B:13:0x0034, B:16:0x003f, B:66:0x010d, B:69:0x0115, B:71:0x011b, B:73:0x0148, B:74:0x017a), top: B:79:0x0008 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.google.android.exoplayer2.mediacodec.C7024n> m5565e(com.google.android.exoplayer2.mediacodec.C7032u.C7033a r21, com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7035c r22) throws com.google.android.exoplayer2.mediacodec.C7032u.C7034b {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C7032u.m5565e(com.google.android.exoplayer2.mediacodec.u$a, com.google.android.exoplayer2.mediacodec.u$c):java.util.ArrayList");
    }

    /* renamed from: f */
    public static boolean m5564f(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = C7408g0.f13905a;
        if (i >= 21 || !("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                String str3 = C7408g0.f13906b;
                if ("a70".equals(str3) || ("Xiaomi".equals(C7408g0.f13907c) && str3.startsWith("HM"))) {
                    return false;
                }
            }
            if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                String str4 = C7408g0.f13906b;
                if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                    return false;
                }
            }
            if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                String str5 = C7408g0.f13906b;
                if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                    return false;
                }
            }
            if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(C7408g0.f13907c))) {
                String str6 = C7408g0.f13906b;
                if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                    return false;
                }
            }
            if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C7408g0.f13907c)) {
                String str7 = C7408g0.f13906b;
                if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                    return false;
                }
            }
            if (i <= 19 && C7408g0.f13906b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
                return false;
            }
            return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m5563g(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        if (C7408g0.f13905a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        String m4294a = C7929b.m4294a(mediaCodecInfo.getName());
        if (m4294a.startsWith("arc.")) {
            return false;
        }
        if (!m4294a.startsWith("omx.google.") && !m4294a.startsWith("omx.ffmpeg.") && ((!m4294a.startsWith("omx.sec.") || !m4294a.contains(".sw.")) && !m4294a.equals("omx.qcom.video.decoder.hevcswvdec") && !m4294a.startsWith("c2.android.") && !m4294a.startsWith("c2.google.") && (m4294a.startsWith("omx.") || m4294a.startsWith("c2.")))) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static int m5562h() throws C7034b {
        C7024n c7024n;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        int i2;
        if (f12479c == -1) {
            int i3 = 0;
            List<C7024n> m5566d = m5566d("video/avc", false, false);
            if (m5566d.isEmpty()) {
                c7024n = null;
            } else {
                c7024n = m5566d.get(0);
            }
            if (c7024n != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = c7024n.f12392d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = codecProfileLevelArr[i3].level;
                    if (i5 != 1 && i5 != 2) {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                continue;
                            case 64:
                                i2 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i2 = 414720;
                                continue;
                            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                                i2 = 921600;
                                continue;
                            case 1024:
                                i2 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                continue;
                            case 8192:
                                i2 = 2228224;
                                continue;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i2 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i2 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i2 = 35651584;
                                continue;
                            default:
                                i2 = -1;
                                continue;
                        }
                    } else {
                        i2 = 25344;
                    }
                    i4 = Math.max(i2, i4);
                    i3++;
                }
                if (C7408g0.f13905a >= 21) {
                    i = 345600;
                } else {
                    i = 172800;
                }
                i3 = Math.max(i4, i);
            }
            f12479c = i3;
        }
        return f12479c;
    }
}
