package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.vungle.warren.VungleApiClient;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzfn {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;
    private static final Pattern zzg;
    private static final Pattern zzh;
    private static final Pattern zzi;
    private static final Pattern zzj;
    @Nullable
    private static HashMap zzk;
    private static final String[] zzl;
    private static final String[] zzm;
    private static final int[] zzn;
    private static final int[] zzo;

    static {
        int i = Build.VERSION.SDK_INT;
        zza = i;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i;
        zzf = new byte[0];
        zzg = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        zzh = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        zzi = Pattern.compile("%([A-Fa-f0-9]{2})");
        zzj = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzl = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", FacebookAdapter.KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzm = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzn = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzo = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static void zzA(long[] jArr, long j, long j2) {
        int i = (j2 > 1000000L ? 1 : (j2 == 1000000L ? 0 : -1));
        int i2 = 0;
        if (i >= 0 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j3;
                i2++;
            }
        } else if (i < 0 && 1000000 % j2 == 0) {
            long j4 = 1000000 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j4;
                i2++;
            }
        } else {
            double d = j2;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * (1000000.0d / d));
                i2++;
            }
        }
    }

    public static boolean zzB(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean zzC(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    public static boolean zzD(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzE(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
                return true;
            }
            return handler.post(runnable);
        }
        return false;
    }

    public static Object[] zzF(Object[] objArr, int i) {
        zzdy.zzd(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    @Nullable
    private static String zzG(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            zzer.zzc("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    private static HashMap zzH() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zzl.length;
        HashMap hashMap = new HashMap(length + 88);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zzl;
            int length3 = strArr.length;
            if (i >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static int zza(long[] jArr, long j, boolean z, boolean z2) {
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
        return !z ? binarySearch : binarySearch - 1;
    }

    public static int zzb(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i);
            i2 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static int zzc(long[] jArr, long j, boolean z, boolean z2) {
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
        return z2 ? Math.max(0, i) : i;
    }

    public static int zzd(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = zzn[(i3 >>> 24) ^ (bArr[i] & 255)] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static int zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            i4 = zzo[i4 ^ (bArr[i] & 255)];
            i++;
        }
        return i4;
    }

    @SuppressLint({"InlinedApi"})
    public static int zzf(int i) {
        if (i != 12) {
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
                    return 6396;
                default:
                    return 0;
            }
        }
        return 743676;
    }

    public static int zzg(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    public static int zzh(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i != 10) {
            if (i != 7) {
                if (i != 8) {
                    switch (i) {
                        case 15:
                            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                        case 16:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return AdError.ICONVIEW_MISSING_ERROR_CODE;
                                default:
                                    return 6006;
                            }
                    }
                }
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            }
            return 6005;
        }
        return 6004;
    }

    public static int zzi(@Nullable String str) {
        String[] split;
        int length;
        int i = 0;
        if (str != null && (length = (split = str.split("_", -1)).length) >= 2) {
            String str2 = split[length - 1];
            boolean z = length >= 3 && "neg".equals(split[length + (-2)]);
            str2.getClass();
            try {
                i = Integer.parseInt(str2);
                if (z) {
                    return -i;
                }
            } catch (NumberFormatException unused) {
            }
            return i;
        }
        return 0;
    }

    public static int zzj(int i) {
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

    public static int zzk(int i, int i2) {
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
        return i2 + i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzl(Uri uri) {
        char c;
        String scheme = uri.getScheme();
        if (scheme == null || !zzfof.zzc("rtsp", scheme)) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return 4;
            }
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String zza2 = zzfof.zza(lastPathSegment.substring(lastIndexOf + 1));
                switch (zza2.hashCode()) {
                    case 104579:
                        if (zza2.equals("ism")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108321:
                        if (zza2.equals("mpd")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3242057:
                        if (zza2.equals("isml")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3299913:
                        if (zza2.equals("m3u8")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                int i = c != 0 ? c != 1 ? (c == 2 || c == 3) ? 1 : 4 : 2 : 0;
                if (i != 4) {
                    return i;
                }
            }
            Pattern pattern = zzj;
            String path = uri.getPath();
            path.getClass();
            Matcher matcher = pattern.matcher(path);
            if (matcher.matches()) {
                String group = matcher.group(2);
                if (group != null) {
                    if (group.contains("format=mpd-time-csf")) {
                        return 0;
                    }
                    if (group.contains("format=m3u8-aapl")) {
                        return 2;
                    }
                }
                return 1;
            }
            return 4;
        }
        return 3;
    }

    public static long zzm(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    public static long zzn(long j, float f) {
        return f == 1.0f ? j : Math.round(j / f);
    }

    public static long zzo(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long zzp(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i < 0 || j3 % j2 != 0) {
            if (i >= 0 || j2 % j3 != 0) {
                return (long) ((j2 / j3) * j);
            }
            return (j2 / j3) * j;
        }
        return j / (j3 / j2);
    }

    public static long zzq(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static Point zzr(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzD(context)) {
            String zzG = zzG(zza < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(zzG)) {
                try {
                    String[] split = zzG.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzer.zzb("Util", "Invalid display size: ".concat(String.valueOf(zzG)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (zza < 23) {
            display.getRealSize(point);
            return point;
        }
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static Handler zzs(@Nullable Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        zzdy.zzb(myLooper);
        return new Handler(myLooper, null);
    }

    public static Looper zzt() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static zzam zzu(int i, int i2, int i3) {
        zzak zzakVar = new zzak();
        zzakVar.zzS("audio/raw");
        zzakVar.zzw(i2);
        zzakVar.zzT(i3);
        zzakVar.zzN(i);
        return zzakVar.zzY();
    }

    public static String zzv(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, zzfol.zzc);
    }

    public static String zzw(Locale locale) {
        return zza >= 21 ? locale.toLanguageTag() : locale.toString();
    }

    public static String zzx(int i) {
        switch (i) {
            case -2:
                return SchedulerSupport.NONE;
            case -1:
                return VungleApiClient.ConnectionTypeDetail.UNKNOWN;
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String zzy(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String zza2 = zzfof.zza(str);
        int i = 0;
        String str2 = zza2.split("-", 2)[0];
        if (zzk == null) {
            zzk = zzH();
        }
        String str3 = (String) zzk.get(str2);
        if (str3 != null) {
            zza2 = str3.concat(String.valueOf(zza2.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return zza2;
        }
        while (true) {
            String[] strArr = zzm;
            int length = strArr.length;
            if (i >= 18) {
                return zza2;
            }
            if (zza2.startsWith(strArr[i])) {
                return String.valueOf(strArr[i + 1]).concat(String.valueOf(zza2.substring(strArr[i].length())));
            }
            i += 2;
        }
    }

    public static ExecutorService zzz(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzfm
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }
}
