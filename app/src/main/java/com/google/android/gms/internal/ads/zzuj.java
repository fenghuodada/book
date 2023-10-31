package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzuj implements zzxv, zzta {
    final /* synthetic */ zzuo zza;
    private final Uri zzc;
    private final zzgy zzd;
    private final zzue zze;
    private final zzaar zzf;
    private final zzeb zzg;
    private volatile boolean zzi;
    private long zzk;
    @Nullable
    private zzabr zzm;
    private boolean zzn;
    private final zzabk zzh = new zzabk();
    private boolean zzj = true;
    private final long zzb = zztc.zza();
    private zzgc zzl = zzi(0);

    public zzuj(zzuo zzuoVar, Uri uri, zzfx zzfxVar, zzue zzueVar, zzaar zzaarVar, zzeb zzebVar) {
        this.zza = zzuoVar;
        this.zzc = uri;
        this.zzd = new zzgy(zzfxVar);
        this.zze = zzueVar;
        this.zzf = zzaarVar;
        this.zzg = zzebVar;
    }

    public static /* bridge */ /* synthetic */ long zzb(zzuj zzujVar) {
        return zzujVar.zzb;
    }

    public static /* bridge */ /* synthetic */ long zzc(zzuj zzujVar) {
        return zzujVar.zzk;
    }

    public static /* bridge */ /* synthetic */ zzgc zzd(zzuj zzujVar) {
        return zzujVar.zzl;
    }

    public static /* bridge */ /* synthetic */ zzgy zze(zzuj zzujVar) {
        return zzujVar.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzuj zzujVar, long j, long j2) {
        zzujVar.zzh.zza = j;
        zzujVar.zzk = j2;
        zzujVar.zzj = true;
        zzujVar.zzn = false;
    }

    private final zzgc zzi(long j) {
        Map map;
        zzga zzgaVar = new zzga();
        zzgaVar.zzd(this.zzc);
        zzgaVar.zzc(j);
        zzgaVar.zza(6);
        map = zzuo.zzb;
        zzgaVar.zzb(map);
        return zzgaVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzta
    public final void zza(zzfd zzfdVar) {
        long zzQ;
        long max;
        if (this.zzn) {
            zzQ = this.zza.zzQ(true);
            max = Math.max(zzQ, this.zzk);
        } else {
            max = this.zzk;
        }
        int zza = zzfdVar.zza();
        zzabr zzabrVar = this.zzm;
        zzabrVar.getClass();
        zzabp.zzb(zzabrVar, zzfdVar, zza);
        zzabrVar.zzs(max, 1, zza, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0082 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0098 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00ae A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00c4 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00e0 A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0116 A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x012a A[Catch: all -> 0x01ec, TryCatch #7 {all -> 0x01ec, blocks: (B:142:0x000b, B:144:0x001f, B:145:0x0025, B:148:0x003b, B:149:0x0041, B:158:0x0077, B:160:0x0082, B:162:0x008e, B:164:0x0098, B:166:0x00a4, B:168:0x00ae, B:170:0x00ba, B:172:0x00c4, B:174:0x00d6, B:176:0x00e0, B:177:0x00e6, B:186:0x0116, B:187:0x011d, B:189:0x012a, B:191:0x0132, B:193:0x014f, B:180:0x00f0, B:183:0x0104, B:153:0x004d, B:156:0x0063), top: B:259:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x016a A[Catch: all -> 0x01e9, TryCatch #5 {all -> 0x01e9, blocks: (B:195:0x015f, B:197:0x016a, B:198:0x016f, B:200:0x0173), top: B:255:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0173 A[Catch: all -> 0x01e9, TRY_LEAVE, TryCatch #5 {all -> 0x01e9, blocks: (B:195:0x015f, B:197:0x016a, B:198:0x016f, B:200:0x0173), top: B:255:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01c7 A[EDGE_INSN: B:265:0x01c7->B:220:0x01c7 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzxv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuj.zzh():void");
    }
}
