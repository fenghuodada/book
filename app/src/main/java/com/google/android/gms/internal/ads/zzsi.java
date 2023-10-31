package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class zzsi {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    @GuardedBy("MediaCodecUtil.class")
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzsc {
        int i;
        int i2 = zzd;
        if (i2 == -1) {
            zzrp zzc2 = zzc("video/avc", false, false);
            if (zzc2 != null) {
                int i3 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzh()) {
                    int i4 = codecProfileLevel.level;
                    if (i4 == 1 || i4 == 2) {
                        i = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                continue;
                            case 64:
                                i = 202752;
                                continue;
                            case 128:
                            case 256:
                                i = 414720;
                                continue;
                            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                                i = 921600;
                                continue;
                            case 1024:
                                i = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                continue;
                            case 8192:
                                i = 2228224;
                                continue;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                continue;
                            default:
                                i = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i, i3);
                }
                i2 = Math.max(i3, zzfn.zza >= 21 ? 345600 : 172800);
            } else {
                i2 = 0;
            }
            zzd = i2;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0495, code lost:
        if (r1.equals("L90") != false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
        if (r0.equals("03") != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x028e A[Catch: NumberFormatException -> 0x029d, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x029d, blocks: (B:150:0x023a, B:152:0x024c, B:163:0x0268, B:178:0x028e), top: B:495:0x023a }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x06f2 A[ExcHandler: NumberFormatException -> 0x06f2] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zzb(com.google.android.gms.internal.ads.zzam r17) {
        /*
            Method dump skipped, instructions count: 2216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsi.zzb(com.google.android.gms.internal.ads.zzam):android.util.Pair");
    }

    @Nullable
    public static zzrp zzc(String str, boolean z, boolean z2) throws zzsc {
        List zzf = zzf(str, false, false);
        if (zzf.isEmpty()) {
            return null;
        }
        return (zzrp) zzf.get(0);
    }

    @Nullable
    public static zzrp zzd() throws zzsc {
        return zzc("audio/raw", false, false);
    }

    @Nullable
    public static String zze(zzam zzamVar) {
        Pair zzb2;
        if ("audio/eac3-joc".equals(zzamVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzamVar.zzm) || (zzb2 = zzb(zzamVar)) == null) {
            return null;
        }
        int intValue = ((Integer) zzb2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List zzf(String str, boolean z, boolean z2) throws zzsc {
        synchronized (zzsi.class) {
            zzsa zzsaVar = new zzsa(str, z, z2);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzsaVar);
            if (list != null) {
                return list;
            }
            int i = zzfn.zza;
            ArrayList zzh = zzh(zzsaVar, i >= 21 ? new zzsg(z, z2) : new zzsf(null));
            if (z && zzh.isEmpty() && i >= 21 && i <= 23) {
                zzh = zzh(zzsaVar, new zzsf(null));
                if (!zzh.isEmpty()) {
                    String str2 = ((zzrp) zzh.get(0)).zza;
                    zzer.zze("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            if ("audio/raw".equals(str)) {
                if (i < 26 && zzfn.zzb.equals("R9") && zzh.size() == 1 && ((zzrp) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzrp.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzh, new zzsh() { // from class: com.google.android.gms.internal.ads.zzry
                    @Override // com.google.android.gms.internal.ads.zzsh
                    public final int zza(Object obj) {
                        int i2 = zzsi.zza;
                        String str3 = ((zzrp) obj).zza;
                        if (str3.startsWith("OMX.google") || str3.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzfn.zza >= 26 || !str3.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (i < 21 && zzh.size() > 1) {
                String str3 = ((zzrp) zzh.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    zzi(zzh, new zzsh() { // from class: com.google.android.gms.internal.ads.zzrz
                        @Override // com.google.android.gms.internal.ads.zzsh
                        public final int zza(Object obj) {
                            int i2 = zzsi.zza;
                            return ((zzrp) obj).zza.startsWith("OMX.google") ? 1 : 0;
                        }
                    });
                }
            }
            if (i < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzrp) zzh.get(0)).zza)) {
                zzh.add((zzrp) zzh.remove(0));
            }
            zzfrr zzj = zzfrr.zzj(zzh);
            hashMap.put(zzsaVar, zzj);
            return zzj;
        }
    }

    @CheckResult
    public static List zzg(List list, final zzam zzamVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzsh() { // from class: com.google.android.gms.internal.ads.zzrw
            @Override // com.google.android.gms.internal.ads.zzsh
            public final int zza(Object obj) {
                zzam zzamVar2 = zzam.this;
                int i = zzsi.zza;
                return ((zzrp) obj).zzd(zzamVar2) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0238, code lost:
        if (r1.zzb == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00db, code lost:
        if ("SCV31".equals(r10) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0119, code lost:
        if (r8.startsWith("t0") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r9 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ea A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f1 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0204 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0209 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b5 A[Catch: Exception -> 0x0304, TRY_ENTER, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d5 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzsa r27, com.google.android.gms.internal.ads.zzsd r28) throws com.google.android.gms.internal.ads.zzsc {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsi.zzh(com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzsd):java.util.ArrayList");
    }

    private static void zzi(List list, final zzsh zzshVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzrx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzsh zzshVar2 = zzsh.this;
                int i = zzsi.zza;
                return zzshVar2.zza(obj2) - zzshVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (zzfn.zza >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        } else if (zzcd.zzf(str)) {
            return true;
        } else {
            String zza2 = zzfof.zza(mediaCodecInfo.getName());
            if (zza2.startsWith("arc.")) {
                return false;
            }
            if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
                return true;
            }
            return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
        }
    }
}
