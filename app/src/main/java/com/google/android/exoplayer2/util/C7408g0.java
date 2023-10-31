package com.google.android.exoplayer2.util;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.common.base.C7929b;
import com.google.common.base.C7935d;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.util.g0 */
/* loaded from: classes.dex */
public final class C7408g0 {

    /* renamed from: a */
    public static final int f13905a;

    /* renamed from: b */
    public static final String f13906b;

    /* renamed from: c */
    public static final String f13907c;

    /* renamed from: d */
    public static final String f13908d;

    /* renamed from: e */
    public static final String f13909e;

    /* renamed from: f */
    public static final byte[] f13910f;
    @Nullable

    /* renamed from: g */
    public static HashMap<String, String> f13911g;

    /* renamed from: h */
    public static final String[] f13912h;

    /* renamed from: i */
    public static final String[] f13913i;

    /* renamed from: j */
    public static final int[] f13914j;

    /* renamed from: k */
    public static final int[] f13915k;

    static {
        int i;
        String str = Build.VERSION.CODENAME;
        if ("S".equals(str)) {
            i = 31;
        } else if ("R".equals(str)) {
            i = 30;
        } else {
            i = Build.VERSION.SDK_INT;
        }
        f13905a = i;
        String str2 = Build.DEVICE;
        f13906b = str2;
        String str3 = Build.MANUFACTURER;
        f13907c = str3;
        String str4 = Build.MODEL;
        f13908d = str4;
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str3, C0552c.m12193a(str4, C0552c.m12193a(str2, 17))), str2, ", ", str4, ", ");
        m9043a.append(str3);
        m9043a.append(", ");
        m9043a.append(i);
        f13909e = m9043a.toString();
        f13910f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f13912h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", FacebookAdapter.KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f13913i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f13914j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f13915k = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: a */
    public static boolean m5105a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m5104b(long[] jArr, long j, boolean z) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j);
        return z ? binarySearch - 1 : binarySearch;
    }

    /* renamed from: c */
    public static int m5103c(C7422o c7422o, long j) {
        int i = c7422o.f13939a - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (c7422o.m5053b(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 < c7422o.f13939a && c7422o.m5053b(i4) == j) {
            return i4;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* renamed from: d */
    public static int m5102d(int[] iArr, int i) {
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i);
        return binarySearch;
    }

    /* renamed from: e */
    public static int m5101e(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = binarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: f */
    public static float m5100f(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: g */
    public static int m5099g(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: h */
    public static long m5098h(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: i */
    public static Handler m5097i(@Nullable Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        C7394a.m5130e(myLooper);
        return new Handler(myLooper, callback);
    }

    /* renamed from: j */
    public static String m5096j(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: k */
    public static String m5095k(int i, byte[] bArr, int i2) {
        return new String(bArr, i, i2, C7935d.f15693c);
    }

    /* renamed from: l */
    public static int m5094l(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f13905a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: m */
    public static long m5093m(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    /* renamed from: n */
    public static int m5092n(int i) {
        if (i != 8) {
            if (i != 16) {
                if (i != 24) {
                    return i != 32 ? 0 : 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    /* renamed from: o */
    public static int m5091o(int i, int i2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 268435456) {
                        if (i == 536870912) {
                            return i2 * 3;
                        }
                        if (i != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i2 * 4;
            }
            return i2;
        }
        return i2 * 2;
    }

    /* renamed from: p */
    public static int m5090p(int i) {
        if (i != 13) {
            switch (i) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
        return 1;
    }

    /* renamed from: q */
    public static String m5089q(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        String str = j < 0 ? "-" : "";
        long abs = (Math.abs(j) + 500) / 1000;
        long j2 = abs % 60;
        long j3 = (abs / 60) % 60;
        long j4 = abs / 3600;
        sb.setLength(0);
        return (j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)) : formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2))).toString();
    }

    /* renamed from: r */
    public static byte[] m5088r(String str) {
        return str.getBytes(C7935d.f15693c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        return false;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m5087s(com.google.android.exoplayer2.util.C7436v r3, com.google.android.exoplayer2.util.C7436v r4, @androidx.annotation.Nullable java.util.zip.Inflater r5) {
        /*
            int r0 = r3.f13980c
            int r1 = r3.f13979b
            int r0 = r0 - r1
            r1 = 0
            if (r0 > 0) goto L9
            return r1
        L9:
            byte[] r2 = r4.f13978a
            int r2 = r2.length
            if (r2 >= r0) goto L13
            int r0 = r0 * 2
            r4.m5017a(r0)
        L13:
            if (r5 != 0) goto L1a
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L1a:
            byte[] r0 = r3.f13978a
            int r2 = r3.f13979b
            int r3 = r3.f13980c
            int r3 = r3 - r2
            r5.setInput(r0, r2, r3)
            r3 = r1
        L25:
            byte[] r0 = r4.f13978a     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r2 = r0.length     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r0 == 0) goto L3c
            r4.m4993y(r3)     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            r5.reset()
            r3 = 1
            return r3
        L3c:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r0 != 0) goto L55
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r0 == 0) goto L49
            goto L55
        L49:
            byte[] r0 = r4.f13978a     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r2 = r0.length     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r3 != r2) goto L25
            int r0 = r0.length     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r0 = r0 * 2
            r4.m5017a(r0)     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            goto L25
        L55:
            r5.reset()
            return r1
        L59:
            r3 = move-exception
            r5.reset()
            throw r3
        L5e:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.C7408g0.m5087s(com.google.android.exoplayer2.util.v, com.google.android.exoplayer2.util.v, java.util.zip.Inflater):boolean");
    }

    /* renamed from: t */
    public static boolean m5086t(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: u */
    public static boolean m5085u(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: v */
    public static String m5084v(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String m4294a = C7929b.m4294a(str);
        int i = 0;
        String str2 = m4294a.split("-", 2)[0];
        if (f13911g == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f13912h;
            HashMap<String, String> hashMap = new HashMap<>(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                hashMap.put(strArr[i2], strArr[i2 + 1]);
            }
            f13911g = hashMap;
        }
        String str4 = f13911g.get(str2);
        if (str4 != null) {
            String valueOf = String.valueOf(m4294a.substring(str2.length()));
            if (valueOf.length() != 0) {
                m4294a = str4.concat(valueOf);
            } else {
                m4294a = new String(str4);
            }
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return m4294a;
        }
        while (true) {
            String[] strArr2 = f13913i;
            if (i < strArr2.length) {
                if (m4294a.startsWith(strArr2[i])) {
                    String valueOf2 = String.valueOf(strArr2[i + 1]);
                    String valueOf3 = String.valueOf(m4294a.substring(strArr2[i].length()));
                    if (valueOf3.length() != 0) {
                        return valueOf2.concat(valueOf3);
                    }
                    return new String(valueOf2);
                }
                i += 2;
            } else {
                return m4294a;
            }
        }
    }

    /* renamed from: w */
    public static Object[] m5083w(int i, Object[] objArr) {
        C7394a.m5134a(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: x */
    public static void m5082x(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: y */
    public static long m5081y(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i < 0 || j3 % j2 != 0) {
            if (i >= 0 || j2 % j3 != 0) {
                return (long) (j * (j2 / j3));
            }
            return (j2 / j3) * j;
        }
        return j / (j3 / j2);
    }

    /* renamed from: z */
    public static void m5080z(long[] jArr, long j) {
        int i = (j > 1000000L ? 1 : (j == 1000000L ? 0 : -1));
        int i2 = 0;
        if (i >= 0 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j2;
                i2++;
            }
        } else if (i >= 0 || 1000000 % j != 0) {
            double d = 1000000 / j;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d);
                i2++;
            }
        } else {
            long j3 = 1000000 / j;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j3;
                i2++;
            }
        }
    }
}
