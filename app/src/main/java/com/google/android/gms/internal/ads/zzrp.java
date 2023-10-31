package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.C0235r;
import androidx.core.provider.C0758e;
import androidx.datastore.preferences.protobuf.C1169e;
import androidx.datastore.preferences.protobuf.C1194j;
import com.adcolony.sdk.C2362x3;
import com.google.android.gms.ads.AdRequest;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class zzrp {
    public final String zza;
    public final String zzb;
    public final String zzc;
    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    @VisibleForTesting
    public zzrp(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzcd.zzg(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        if ("Nexus 10".equals(r3) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzrp zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzrp r11 = new com.google.android.gms.internal.ads.zzrp
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3d
            int r3 = com.google.android.gms.internal.ads.zzfn.zza
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L3d
            int r3 = com.google.android.gms.internal.ads.zzfn.zza
            r5 = 22
            if (r3 > r5) goto L3b
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfn.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2a
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3b
        L2a:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r8 = r0
            goto L3e
        L3d:
            r8 = r2
        L3e:
            r3 = 21
            if (r4 == 0) goto L50
            int r5 = com.google.android.gms.internal.ads.zzfn.zza
            if (r5 < r3) goto L50
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L50
            r9 = r0
            goto L51
        L50:
            r9 = r2
        L51:
            if (r20 != 0) goto L64
            if (r4 == 0) goto L62
            int r5 = com.google.android.gms.internal.ads.zzfn.zza
            if (r5 < r3) goto L62
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L62
            goto L64
        L62:
            r10 = r2
            goto L65
        L64:
            r10 = r0
        L65:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrp.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzrp");
    }

    @RequiresApi(21)
    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = zzfn.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = zzfn.zze;
        StringBuilder m9460b = C2362x3.m9460b("NoSupport [", str, "] [", str2, ", ");
        m9460b.append(str3);
        m9460b.append("] [");
        m9460b.append(str4);
        m9460b.append("]");
        zzer.zza("MediaCodecInfo", m9460b.toString());
    }

    @RequiresApi(21)
    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzi = zzi(videoCapabilities, i, i2);
        int i3 = zzi.x;
        int i4 = zzi.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    private final boolean zzl(zzam zzamVar, boolean z) {
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair zzb = zzsi.zzb(zzamVar);
        if (zzb == null) {
            return true;
        }
        int intValue = ((Integer) zzb.first).intValue();
        int intValue2 = ((Integer) zzb.second).intValue();
        int i2 = 8;
        if ("video/dolby-vision".equals(zzamVar.zzm)) {
            if ("video/avc".equals(this.zzb)) {
                intValue = 8;
            } else if ("video/hevc".equals(this.zzb)) {
                intValue = 2;
            }
            intValue2 = 0;
        }
        if (!this.zzh && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] zzh = zzh();
        if (zzfn.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzh.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                i = videoCapabilities.getBitrateRange().getUpper().intValue();
            } else {
                i = 0;
            }
            if (i >= 180000000) {
                i2 = 1024;
            } else if (i >= 120000000) {
                i2 = AdRequest.MAX_CONTENT_URL_LENGTH;
            } else if (i >= 60000000) {
                i2 = 256;
            } else if (i >= 30000000) {
                i2 = 128;
            } else if (i >= 18000000) {
                i2 = 64;
            } else if (i >= 12000000) {
                i2 = 32;
            } else if (i >= 7200000) {
                i2 = 16;
            } else if (i < 3600000) {
                if (i >= 1800000) {
                    i2 = 4;
                } else if (i >= 800000) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i2;
            zzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z)) {
                if ("video/hevc".equals(this.zzb) && intValue == 2) {
                    String str = zzfn.zzb;
                    if (!"sailfish".equals(str) && !"marlin".equals(str)) {
                    }
                }
                return true;
            }
        }
        zzj(C0758e.m11827a("codec.profileLevel, ", zzamVar.zzj, ", ", this.zzc));
        return false;
    }

    private final boolean zzm(zzam zzamVar) {
        return this.zzb.equals(zzamVar.zzm) || this.zzb.equals(zzsi.zze(zzamVar));
    }

    public final String toString() {
        return this.zza;
    }

    @Nullable
    @RequiresApi(21)
    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i, i2);
    }

    public final zzht zzb(zzam zzamVar, zzam zzamVar2) {
        int i = true != zzfn.zzB(zzamVar.zzm, zzamVar2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzamVar.zzu != zzamVar2.zzu) {
                i |= 1024;
            }
            if (!this.zze && (zzamVar.zzr != zzamVar2.zzr || zzamVar.zzs != zzamVar2.zzs)) {
                i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if (!zzfn.zzB(zzamVar.zzy, zzamVar2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzfn.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzamVar.zzd(zzamVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzht(this.zza, zzamVar, zzamVar2, true != zzamVar.zzd(zzamVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzamVar.zzz != zzamVar2.zzz) {
                i |= 4096;
            }
            if (zzamVar.zzA != zzamVar2.zzA) {
                i |= 8192;
            }
            if (zzamVar.zzB != zzamVar2.zzB) {
                i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb = zzsi.zzb(zzamVar);
                Pair zzb2 = zzsi.zzb(zzamVar2);
                if (zzb != null && zzb2 != null) {
                    int intValue = ((Integer) zzb.first).intValue();
                    int intValue2 = ((Integer) zzb2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzht(this.zza, zzamVar, zzamVar2, 3, 0);
                    }
                }
            }
            if (!zzamVar.zzd(zzamVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzht(this.zza, zzamVar, zzamVar2, 1, 0);
            }
        }
        return new zzht(this.zza, zzamVar, zzamVar2, 0, i);
    }

    public final boolean zzd(zzam zzamVar) {
        return zzm(zzamVar) && zzl(zzamVar, false);
    }

    public final boolean zze(zzam zzamVar) throws zzsc {
        String m12816a;
        int i;
        String m12816a2;
        int i2;
        boolean z = false;
        if (!zzm(zzamVar) || !zzl(zzamVar, true)) {
            return false;
        }
        if (this.zzh) {
            int i3 = zzamVar.zzr;
            if (i3 <= 0 || (i2 = zzamVar.zzs) <= 0) {
                return true;
            }
            if (zzfn.zza >= 21) {
                return zzg(i3, i2, zzamVar.zzt);
            }
            if (i3 * i2 <= zzsi.zza()) {
                z = true;
            }
            if (!z) {
                zzj(C1194j.m11060a("legacyFrameSize, ", zzamVar.zzr, "x", zzamVar.zzs));
            }
            return z;
        }
        int i4 = zzfn.zza;
        if (i4 >= 21) {
            int i5 = zzamVar.zzA;
            if (i5 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities == null) {
                    m12816a2 = "sampleRate.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        m12816a2 = "sampleRate.aCaps";
                    } else if (!audioCapabilities.isSampleRateSupported(i5)) {
                        m12816a2 = C0235r.m12816a("sampleRate.support, ", i5);
                    }
                }
                zzj(m12816a2);
                return false;
            }
            int i6 = zzamVar.zzz;
            if (i6 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    m12816a = "channelCount.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        m12816a = "channelCount.aCaps";
                    } else {
                        String str = this.zza;
                        String str2 = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i4 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i = 6;
                            } else if ("audio/eac3".equals(str2)) {
                                i = 16;
                            } else {
                                i = 30;
                            }
                            zzer.zze("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + "]");
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i6) {
                            m12816a = C0235r.m12816a("channelCount.support, ", i6);
                        }
                    }
                }
                zzj(m12816a);
                return false;
            }
        }
        return true;
    }

    public final boolean zzf(zzam zzamVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb = zzsi.zzb(zzamVar);
        return zzb != null && ((Integer) zzb.first).intValue() == 42;
    }

    @RequiresApi(21)
    public final boolean zzg(int i, int i2, double d) {
        StringBuilder sb;
        String sb2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            sb2 = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                sb2 = "sizeAndRate.vCaps";
            } else {
                if (zzfn.zza >= 29) {
                    int zza = zzro.zza(videoCapabilities, i, i2, d);
                    if (zza == 2) {
                        return true;
                    }
                    if (zza == 1) {
                        sb = new StringBuilder("sizeAndRate.cover, ");
                        sb.append(i);
                        sb.append("x");
                        sb.append(i2);
                        sb.append("@");
                        sb.append(d);
                        sb2 = sb.toString();
                    }
                }
                if (!zzk(videoCapabilities, i, i2, d)) {
                    if (i < i2 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzfn.zzb)) && zzk(videoCapabilities, i2, i, d))) {
                        StringBuilder m11130b = C1169e.m11130b("sizeAndRate.rotated, ", i, "x", i2, "@");
                        m11130b.append(d);
                        String sb3 = m11130b.toString();
                        String str = this.zza;
                        String str2 = this.zzb;
                        String str3 = zzfn.zze;
                        StringBuilder m9460b = C2362x3.m9460b("AssumedSupport [", sb3, "] [", str, ", ");
                        m9460b.append(str2);
                        m9460b.append("] [");
                        m9460b.append(str3);
                        m9460b.append("]");
                        zzer.zza("MediaCodecInfo", m9460b.toString());
                    } else {
                        sb = new StringBuilder("sizeAndRate.support, ");
                        sb.append(i);
                        sb.append("x");
                        sb.append(i2);
                        sb.append("@");
                        sb.append(d);
                        sb2 = sb.toString();
                    }
                }
                return true;
            }
        }
        zzj(sb2);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
