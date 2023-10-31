package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzaci implements zzaca {
    public final zzfrr zza;
    private final int zzb;

    private zzaci(int i, zzfrr zzfrrVar) {
        this.zzb = i;
        this.zza = zzfrrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaci zzc(int i, zzfd zzfdVar) {
        zzaca zzacaVar;
        String concat;
        int zzi;
        StringBuilder sb;
        String str;
        zzfro zzfroVar = new zzfro();
        int zzd = zzfdVar.zzd();
        int i2 = -2;
        while (zzfdVar.zza() > 8) {
            int zzg = zzfdVar.zzg();
            int zzc = zzfdVar.zzc() + zzfdVar.zzg();
            zzfdVar.zzE(zzc);
            if (zzg != 1414744396) {
                zzacj zzacjVar = null;
                switch (zzg) {
                    case 1718776947:
                        if (i2 == 2) {
                            zzfdVar.zzG(4);
                            int zzg2 = zzfdVar.zzg();
                            int zzg3 = zzfdVar.zzg();
                            zzfdVar.zzG(4);
                            zzi = zzfdVar.zzg();
                            switch (zzi) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                zzak zzakVar = new zzak();
                                zzakVar.zzX(zzg2);
                                zzakVar.zzF(zzg3);
                                zzakVar.zzS(str);
                                zzacjVar = new zzacj(zzakVar.zzY());
                                zzacaVar = zzacjVar;
                                break;
                            } else {
                                sb = new StringBuilder("Ignoring track with unsupported compression ");
                            }
                        } else if (i2 == 1) {
                            zzi = zzfdVar.zzi();
                            String str2 = zzi != 1 ? zzi != 85 ? zzi != 255 ? zzi != 8192 ? zzi != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int zzi2 = zzfdVar.zzi();
                                int zzg4 = zzfdVar.zzg();
                                zzfdVar.zzG(6);
                                int zzj = zzfn.zzj(zzfdVar.zzo());
                                int zzi3 = zzfdVar.zzi();
                                byte[] bArr = new byte[zzi3];
                                zzfdVar.zzB(bArr, 0, zzi3);
                                zzak zzakVar2 = new zzak();
                                zzakVar2.zzS(str2);
                                zzakVar2.zzw(zzi2);
                                zzakVar2.zzT(zzg4);
                                if ("audio/raw".equals(str2) && zzj != 0) {
                                    zzakVar2.zzN(zzj);
                                }
                                if ("audio/mp4a-latm".equals(str2) && zzi3 > 0) {
                                    zzakVar2.zzI(zzfrr.zzm(bArr));
                                }
                                zzacaVar = new zzacj(zzakVar2.zzY());
                                break;
                            } else {
                                sb = new StringBuilder("Ignoring track with unsupported format tag ");
                            }
                        } else {
                            concat = "Ignoring strf box for unsupported track type: ".concat(zzfn.zzx(i2));
                            zzer.zze("StreamFormatChunk", concat);
                            zzacaVar = zzacjVar;
                        }
                        sb.append(zzi);
                        concat = sb.toString();
                        zzer.zze("StreamFormatChunk", concat);
                        zzacaVar = zzacjVar;
                    case 1751742049:
                        zzacaVar = zzacf.zzb(zzfdVar);
                        break;
                    case 1752331379:
                        zzacaVar = zzacg.zzb(zzfdVar);
                        break;
                    case 1852994675:
                        zzacaVar = zzack.zzb(zzfdVar);
                        break;
                    default:
                        zzacaVar = zzacjVar;
                        break;
                }
            } else {
                zzacaVar = zzc(zzfdVar.zzg(), zzfdVar);
            }
            if (zzacaVar != null) {
                if (zzacaVar.zza() == 1752331379) {
                    int i3 = ((zzacg) zzacaVar).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzer.zze("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfroVar.zzf(zzacaVar);
            }
            zzfdVar.zzF(zzc);
            zzfdVar.zzE(zzd);
        }
        return new zzaci(i, zzfroVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final int zza() {
        return this.zzb;
    }

    @Nullable
    public final zzaca zzb(Class cls) {
        zzfrr zzfrrVar = this.zza;
        int size = zzfrrVar.size();
        int i = 0;
        while (i < size) {
            zzaca zzacaVar = (zzaca) zzfrrVar.get(i);
            i++;
            if (zzacaVar.getClass() == cls) {
                return zzacaVar;
            }
        }
        return null;
    }
}
