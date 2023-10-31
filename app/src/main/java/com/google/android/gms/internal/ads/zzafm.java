package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class zzafm {
    public byte[] zzM;
    public zzabs zzS;
    public boolean zzT;
    public zzabr zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzabq zzi;
    public byte[] zzj;
    public zzad zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    private static Pair zzf(zzfd zzfdVar) throws zzce {
        try {
            zzfdVar.zzG(16);
            long zzq = zzfdVar.zzq();
            if (zzq == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzq == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzq != 826496599) {
                zzer.zze("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzc = zzfdVar.zzc() + 20;
            byte[] zzH = zzfdVar.zzH();
            while (true) {
                int length = zzH.length;
                if (zzc >= length - 4) {
                    throw zzce.zza("Failed to find FourCC VC1 initialization data", null);
                }
                if (zzH[zzc] == 0 && zzH[zzc + 1] == 0 && zzH[zzc + 2] == 1 && zzH[zzc + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzH, zzc, length)));
                }
                zzc++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzce.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzce {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4] & 255;
                    if (i != 255) {
                        break;
                    }
                    i4++;
                    i3 += 255;
                }
                int i5 = i3 + i;
                int i6 = i4 + 1;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i6] & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i6++;
                    i7 += 255;
                }
                int i8 = i6 + 1;
                int i9 = i7 + i2;
                if (bArr[i8] == 1) {
                    byte[] bArr2 = new byte[i5];
                    System.arraycopy(bArr, i8, bArr2, 0, i5);
                    int i10 = i8 + i5;
                    if (bArr[i10] == 3) {
                        int i11 = i10 + i9;
                        if (bArr[i11] == 5) {
                            int length = bArr.length - i11;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i11, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzce.zza("Error parsing vorbis codec private", null);
                    }
                    throw zzce.zza("Error parsing vorbis codec private", null);
                }
                throw zzce.zza("Error parsing vorbis codec private", null);
            }
            throw zzce.zza("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzce.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzfd zzfdVar) throws zzce {
        UUID uuid;
        UUID uuid2;
        try {
            int zzi = zzfdVar.zzi();
            if (zzi == 1) {
                return true;
            }
            if (zzi == 65534) {
                zzfdVar.zzF(24);
                long zzr = zzfdVar.zzr();
                uuid = zzafn.zzf;
                if (zzr == uuid.getMostSignificantBits()) {
                    long zzr2 = zzfdVar.zzr();
                    uuid2 = zzafn.zzf;
                    if (zzr2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzce.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzce {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzce.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    public final void zze(zzaar zzaarVar, int i) throws zzce {
        char c;
        List singletonList;
        List list;
        String str;
        String str2;
        int i2;
        int i3;
        ArrayList arrayList;
        String str3;
        int i4;
        StringBuilder sb;
        byte[] bArr;
        int i5;
        zzs zzsVar;
        Map map;
        Map map2;
        byte[] bArr2;
        int i6;
        Map map3;
        zzaak zza;
        String str4 = this.zzb;
        int i7 = 1;
        int i8 = 4;
        int i9 = 0;
        int i10 = -1;
        switch (str4.hashCode()) {
            case -2095576542:
                if (str4.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str4.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str4.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str4.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str4.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str4.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str4.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str4.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str4.equals("S_DVBSUB")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str4.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str4.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str4.equals("S_VOBSUB")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str4.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str4.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str4.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str4.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str4.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str4.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str4.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str4.equals("S_HDMV/PGS")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str4.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str4.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str4.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str4.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str4.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str4.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str4.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str4.equals("S_TEXT/WEBVTT")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str4.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str4.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str4.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str4.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str4.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str5 = "audio/raw";
        switch (c) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                i2 = -1;
                i8 = -1;
                list = null;
                str2 = null;
                break;
            case 1:
                str5 = "video/x-vnd.on2.vp9";
                i2 = -1;
                i8 = -1;
                list = null;
                str2 = null;
                break;
            case 2:
                str5 = "video/av01";
                i2 = -1;
                i8 = -1;
                list = null;
                str2 = null;
                break;
            case 3:
                str5 = "video/mpeg2";
                i2 = -1;
                i8 = -1;
                list = null;
                str2 = null;
                break;
            case 4:
            case 5:
            case 6:
                byte[] bArr3 = this.zzj;
                singletonList = bArr3 == null ? null : Collections.singletonList(bArr3);
                str5 = "video/mp4v-es";
                list = singletonList;
                i2 = -1;
                i8 = -1;
                str2 = null;
                break;
            case 7:
                zzzt zza2 = zzzt.zza(new zzfd(zzi(this.zzb)));
                list = zza2.zza;
                this.zzW = zza2.zzb;
                str = zza2.zzi;
                str5 = "video/avc";
                str2 = str;
                i2 = -1;
                i8 = -1;
                break;
            case '\b':
                zzabe zza3 = zzabe.zza(new zzfd(zzi(this.zzb)));
                list = zza3.zza;
                this.zzW = zza3.zzb;
                str = zza3.zzg;
                str5 = "video/hevc";
                str2 = str;
                i2 = -1;
                i8 = -1;
                break;
            case '\t':
                Pair zzf = zzf(new zzfd(zzi(this.zzb)));
                str5 = (String) zzf.first;
                singletonList = (List) zzf.second;
                list = singletonList;
                i2 = -1;
                i8 = -1;
                str2 = null;
                break;
            case '\n':
                str5 = "video/x-unknown";
                i2 = -1;
                i8 = -1;
                list = null;
                str2 = null;
                break;
            case 11:
                i3 = 8192;
                str5 = "audio/vorbis";
                arrayList = zzg(zzi(str4));
                list = arrayList;
                i8 = -1;
                i2 = i3;
                str2 = null;
                break;
            case '\f':
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(zzi(this.zzb));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList2.add(allocate.order(byteOrder).putLong(this.zzQ).array());
                arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzR).array());
                i3 = 5760;
                str5 = "audio/opus";
                arrayList = arrayList2;
                list = arrayList;
                i8 = -1;
                i2 = i3;
                str2 = null;
                break;
            case '\r':
                List singletonList2 = Collections.singletonList(zzi(str4));
                zzzl zza4 = zzzm.zza(this.zzj);
                this.zzP = zza4.zza;
                this.zzN = zza4.zzb;
                str5 = "audio/mp4a-latm";
                str2 = zza4.zzc;
                i8 = -1;
                list = singletonList2;
                i2 = -1;
                break;
            case 14:
                str5 = "audio/mpeg-L2";
                i8 = -1;
                i2 = 4096;
                list = null;
                str2 = null;
                break;
            case 15:
                str5 = "audio/mpeg";
                i8 = -1;
                i2 = 4096;
                list = null;
                str2 = null;
                break;
            case 16:
                str5 = "audio/ac3";
                i2 = -1;
                i8 = -1;
                list = null;
                str2 = null;
                break;
            case 17:
                str5 = "audio/eac3";
                i2 = -1;
                i8 = -1;
                list = null;
                str2 = null;
                break;
            case 18:
                this.zzS = new zzabs();
                str5 = "audio/true-hd";
                i2 = -1;
                i8 = -1;
                list = null;
                str2 = null;
                break;
            case 19:
            case 20:
                str5 = "audio/vnd.dts";
                i2 = -1;
                i8 = -1;
                list = null;
                str2 = null;
                break;
            case 21:
                str5 = "audio/vnd.dts.hd";
                i2 = -1;
                i8 = -1;
                list = null;
                str2 = null;
                break;
            case 22:
                singletonList = Collections.singletonList(zzi(str4));
                str5 = "audio/flac";
                list = singletonList;
                i2 = -1;
                i8 = -1;
                str2 = null;
                break;
            case 23:
                if (zzh(new zzfd(zzi(this.zzb)))) {
                    i8 = zzfn.zzj(this.zzO);
                    if (i8 == 0) {
                        i4 = this.zzO;
                        sb = new StringBuilder("Unsupported PCM bit depth: ");
                        sb.append(i4);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        str3 = sb.toString();
                        zzer.zze("MatroskaExtractor", str3);
                        i2 = -1;
                        i8 = -1;
                        str5 = "audio/x-unknown";
                        list = null;
                        str2 = null;
                        break;
                    }
                    i2 = -1;
                    list = null;
                    str2 = null;
                } else {
                    str3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
                    zzer.zze("MatroskaExtractor", str3);
                    i2 = -1;
                    i8 = -1;
                    str5 = "audio/x-unknown";
                    list = null;
                    str2 = null;
                }
            case 24:
                i8 = zzfn.zzj(this.zzO);
                if (i8 == 0) {
                    i4 = this.zzO;
                    sb = new StringBuilder("Unsupported little endian PCM bit depth: ");
                    sb.append(i4);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    str3 = sb.toString();
                    zzer.zze("MatroskaExtractor", str3);
                    i2 = -1;
                    i8 = -1;
                    str5 = "audio/x-unknown";
                    list = null;
                    str2 = null;
                    break;
                }
                i2 = -1;
                list = null;
                str2 = null;
            case 25:
                i4 = this.zzO;
                if (i4 != 8) {
                    if (i4 != 16) {
                        sb = new StringBuilder("Unsupported big endian PCM bit depth: ");
                        sb.append(i4);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        str3 = sb.toString();
                        zzer.zze("MatroskaExtractor", str3);
                        i2 = -1;
                        i8 = -1;
                        str5 = "audio/x-unknown";
                        list = null;
                        str2 = null;
                        break;
                    } else {
                        i8 = 268435456;
                    }
                } else {
                    i8 = 3;
                }
                i2 = -1;
                list = null;
                str2 = null;
            case 26:
                i4 = this.zzO;
                if (i4 != 32) {
                    sb = new StringBuilder("Unsupported floating point PCM bit depth: ");
                    sb.append(i4);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    str3 = sb.toString();
                    zzer.zze("MatroskaExtractor", str3);
                    i2 = -1;
                    i8 = -1;
                    str5 = "audio/x-unknown";
                    list = null;
                    str2 = null;
                    break;
                }
                i2 = -1;
                list = null;
                str2 = null;
            case 27:
                i2 = -1;
                i8 = -1;
                str5 = "application/x-subrip";
                list = null;
                str2 = null;
                break;
            case 28:
                bArr = zzafn.zzc;
                list = zzfrr.zzn(bArr, zzi(this.zzb));
                i2 = -1;
                i8 = -1;
                str5 = "text/x-ssa";
                str2 = null;
                break;
            case 29:
                i2 = -1;
                i8 = -1;
                str5 = "text/vtt";
                list = null;
                str2 = null;
                break;
            case 30:
                singletonList = zzfrr.zzm(zzi(str4));
                str5 = "application/vobsub";
                list = singletonList;
                i2 = -1;
                i8 = -1;
                str2 = null;
                break;
            case 31:
                str5 = "application/pgs";
                i2 = -1;
                i8 = -1;
                list = null;
                str2 = null;
                break;
            case ' ':
                byte[] bArr4 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr4, 0, 4);
                singletonList = zzfrr.zzm(bArr4);
                str5 = "application/dvbsubs";
                list = singletonList;
                i2 = -1;
                i8 = -1;
                str2 = null;
                break;
            default:
                throw zzce.zza("Unrecognized codec identifier.", null);
        }
        if (this.zzM != null && (zza = zzaak.zza(new zzfd(this.zzM))) != null) {
            str2 = zza.zza;
            str5 = "video/dolby-vision";
        }
        String str6 = str5;
        int i11 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
        zzak zzakVar = new zzak();
        if (zzcd.zzf(str6)) {
            zzakVar.zzw(this.zzN);
            zzakVar.zzT(this.zzP);
            zzakVar.zzN(i8);
        } else if (zzcd.zzg(str6)) {
            if (this.zzp == 0) {
                int i12 = this.zzn;
                if (i12 == -1) {
                    i12 = this.zzl;
                }
                this.zzn = i12;
                int i13 = this.zzo;
                if (i13 == -1) {
                    i13 = this.zzm;
                }
                this.zzo = i13;
            }
            float f = (this.zzn == -1 || (i6 = this.zzo) == -1) ? -1.0f : (this.zzm * i5) / (this.zzl * i6);
            if (this.zzw) {
                if (this.zzC == -1.0f || this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f) {
                    bArr2 = null;
                } else {
                    bArr2 = new byte[25];
                    ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                    order.put((byte) 0);
                    order.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                    order.putShort((short) (this.zzK + 0.5f));
                    order.putShort((short) (this.zzL + 0.5f));
                    order.putShort((short) this.zzA);
                    order.putShort((short) this.zzB);
                }
                zzsVar = new zzs(this.zzx, this.zzz, this.zzy, bArr2);
            } else {
                zzsVar = null;
            }
            if (this.zza != null) {
                map = zzafn.zzg;
                if (map.containsKey(this.zza)) {
                    map2 = zzafn.zzg;
                    i10 = ((Integer) map2.get(this.zza)).intValue();
                }
            }
            if (this.zzq == 0 && Float.compare(this.zzr, 0.0f) == 0 && Float.compare(this.zzs, 0.0f) == 0) {
                if (Float.compare(this.zzt, 0.0f) != 0) {
                    if (Float.compare(this.zzs, 90.0f) == 0) {
                        i9 = 90;
                    } else if (Float.compare(this.zzs, -180.0f) == 0 || Float.compare(this.zzs, 180.0f) == 0) {
                        i9 = 180;
                    } else if (Float.compare(this.zzs, -90.0f) == 0) {
                        i9 = 270;
                    }
                }
                zzakVar.zzX(this.zzl);
                zzakVar.zzF(this.zzm);
                zzakVar.zzP(f);
                zzakVar.zzR(i9);
                zzakVar.zzQ(this.zzu);
                zzakVar.zzV(this.zzv);
                zzakVar.zzy(zzsVar);
                i7 = 2;
            }
            i9 = i10;
            zzakVar.zzX(this.zzl);
            zzakVar.zzF(this.zzm);
            zzakVar.zzP(f);
            zzakVar.zzR(i9);
            zzakVar.zzQ(this.zzu);
            zzakVar.zzV(this.zzv);
            zzakVar.zzy(zzsVar);
            i7 = 2;
        } else if (!"application/x-subrip".equals(str6) && !"text/x-ssa".equals(str6) && !"text/vtt".equals(str6) && !"application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
            throw zzce.zza("Unexpected MIME type.", null);
        } else {
            i7 = 3;
        }
        if (this.zza != null) {
            map3 = zzafn.zzg;
            if (!map3.containsKey(this.zza)) {
                zzakVar.zzJ(this.zza);
            }
        }
        zzakVar.zzG(i);
        zzakVar.zzS(str6);
        zzakVar.zzL(i2);
        zzakVar.zzK(this.zzY);
        zzakVar.zzU(i11);
        zzakVar.zzI(list);
        zzakVar.zzx(str2);
        zzakVar.zzB(this.zzk);
        zzam zzY = zzakVar.zzY();
        zzabr zzv = zzaarVar.zzv(this.zzc, i7);
        this.zzV = zzv;
        zzv.zzk(zzY);
    }
}
