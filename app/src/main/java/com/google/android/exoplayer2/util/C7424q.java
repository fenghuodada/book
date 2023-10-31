package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.common.base.C7929b;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.util.q */
/* loaded from: classes.dex */
public final class C7424q {

    /* renamed from: a */
    public static final ArrayList<C7425a> f13941a = new ArrayList<>();

    /* renamed from: b */
    public static final Pattern f13942b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: com.google.android.exoplayer2.util.q$a */
    /* loaded from: classes.dex */
    public static final class C7425a {
    }

    @VisibleForTesting
    /* renamed from: com.google.android.exoplayer2.util.q$b */
    /* loaded from: classes.dex */
    public static final class C7426b {

        /* renamed from: a */
        public final int f13943a;

        /* renamed from: b */
        public final int f13944b;

        public C7426b(int i, int i2) {
            this.f13943a = i;
            this.f13944b = i2;
        }
    }

    /* renamed from: a */
    public static boolean m5049a(@Nullable String str, @Nullable String str2) {
        C7426b m5045e;
        int m6128a;
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                return (str2 == null || (m5045e = m5045e(str2)) == null || (m6128a = AacUtil.m6128a(m5045e.f13944b)) == 0 || m6128a == 16) ? false : true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static int m5048b(String str, @Nullable String str2) {
        C7426b m5045e;
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (m5045e = m5045e(str2)) == null) {
                    return 0;
                }
                return AacUtil.m6128a(m5045e.f13944b);
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    @Nullable
    /* renamed from: c */
    public static String m5047c(@Nullable String str) {
        C7426b m5045e;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String m4294a = C7929b.m4294a(str.trim());
        if (!m4294a.startsWith("avc1") && !m4294a.startsWith("avc3")) {
            if (!m4294a.startsWith("hev1") && !m4294a.startsWith("hvc1")) {
                if (!m4294a.startsWith("dvav") && !m4294a.startsWith("dva1") && !m4294a.startsWith("dvhe") && !m4294a.startsWith("dvh1")) {
                    if (m4294a.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!m4294a.startsWith("vp9") && !m4294a.startsWith("vp09")) {
                        if (!m4294a.startsWith("vp8") && !m4294a.startsWith("vp08")) {
                            if (m4294a.startsWith("mp4a")) {
                                if (m4294a.startsWith("mp4a.") && (m5045e = m5045e(m4294a)) != null) {
                                    str2 = m5046d(m5045e.f13943a);
                                }
                                if (str2 == null) {
                                    return "audio/mp4a-latm";
                                }
                                return str2;
                            } else if (m4294a.startsWith("mha1")) {
                                return "audio/mha1";
                            } else {
                                if (m4294a.startsWith("mhm1")) {
                                    return "audio/mhm1";
                                }
                                if (!m4294a.startsWith("ac-3") && !m4294a.startsWith("dac3")) {
                                    if (!m4294a.startsWith("ec-3") && !m4294a.startsWith("dec3")) {
                                        if (m4294a.startsWith("ec+3")) {
                                            return "audio/eac3-joc";
                                        }
                                        if (!m4294a.startsWith("ac-4") && !m4294a.startsWith("dac4")) {
                                            if (m4294a.startsWith("dtsc")) {
                                                return "audio/vnd.dts";
                                            }
                                            if (m4294a.startsWith("dtse")) {
                                                return "audio/vnd.dts.hd;profile=lbr";
                                            }
                                            if (!m4294a.startsWith("dtsh") && !m4294a.startsWith("dtsl")) {
                                                if (m4294a.startsWith("dtsx")) {
                                                    return "audio/vnd.dts.uhd";
                                                }
                                                if (m4294a.startsWith("opus")) {
                                                    return "audio/opus";
                                                }
                                                if (m4294a.startsWith("vorbis")) {
                                                    return "audio/vorbis";
                                                }
                                                if (m4294a.startsWith("flac")) {
                                                    return "audio/flac";
                                                }
                                                if (m4294a.startsWith("stpp")) {
                                                    return "application/ttml+xml";
                                                }
                                                if (m4294a.startsWith("wvtt")) {
                                                    return "text/vtt";
                                                }
                                                if (m4294a.contains("cea708")) {
                                                    return "application/cea-708";
                                                }
                                                if (!m4294a.contains("eia608") && !m4294a.contains("cea608")) {
                                                    ArrayList<C7425a> arrayList = f13941a;
                                                    int size = arrayList.size();
                                                    for (int i = 0; i < size; i++) {
                                                        arrayList.get(i).getClass();
                                                        if (m4294a.startsWith(null)) {
                                                            break;
                                                        }
                                                    }
                                                    return null;
                                                }
                                                return "application/cea-608";
                                            }
                                            return "audio/vnd.dts.hd";
                                        }
                                        return "audio/ac4";
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    @Nullable
    /* renamed from: d */
    public static String m5046d(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 165) {
                                    if (i != 166) {
                                        switch (i) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return "video/mpeg2";
                                            case 102:
                                            case 103:
                                            case 104:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case 107:
                                                return "audio/mpeg";
                                            case 106:
                                                return "video/mpeg";
                                            default:
                                                switch (i) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: e */
    public static C7426b m5045e(String str) {
        int i;
        Matcher matcher = f13942b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i = Integer.parseInt(group2);
            } else {
                i = 0;
            }
            return new C7426b(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    public static String m5044f(@Nullable String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: g */
    public static int m5043g(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m5042h(str)) {
            return 1;
        }
        if (m5040j(str)) {
            return 2;
        }
        if (m5041i(str)) {
            return 3;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
            if ("application/x-camera-motion".equals(str)) {
                return 6;
            }
            ArrayList<C7425a> arrayList = f13941a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).getClass();
                if (str.equals(null)) {
                    return 0;
                }
            }
            return -1;
        }
        return 5;
    }

    /* renamed from: h */
    public static boolean m5042h(@Nullable String str) {
        return "audio".equals(m5044f(str));
    }

    /* renamed from: i */
    public static boolean m5041i(@Nullable String str) {
        return "text".equals(m5044f(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: j */
    public static boolean m5040j(@Nullable String str) {
        return "video".equals(m5044f(str));
    }
}
