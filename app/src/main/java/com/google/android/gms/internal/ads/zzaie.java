package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaie implements zzajs {
    private final List zza;

    public zzaie() {
        this(0);
    }

    public zzaie(int i) {
        this.zza = zzfrr.zzl();
    }

    public zzaie(int i, List list) {
        this.zza = list;
    }

    private final zzaji zzb(zzajr zzajrVar) {
        return new zzaji(zzd(zzajrVar));
    }

    private final zzajw zzc(zzajr zzajrVar) {
        return new zzajw(zzd(zzajrVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zzd(zzajr zzajrVar) {
        String str;
        int i;
        zzfd zzfdVar = new zzfd(zzajrVar.zzd);
        ArrayList arrayList = this.zza;
        while (zzfdVar.zza() > 0) {
            int zzk = zzfdVar.zzk();
            int zzc = zzfdVar.zzc() + zzfdVar.zzk();
            if (zzk == 134) {
                arrayList = new ArrayList();
                int zzk2 = zzfdVar.zzk() & 31;
                for (int i2 = 0; i2 < zzk2; i2++) {
                    String zzx = zzfdVar.zzx(3, zzfol.zzc);
                    int zzk3 = zzfdVar.zzk();
                    boolean z = (zzk3 & 128) != 0;
                    if (z) {
                        i = zzk3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzk4 = (byte) zzfdVar.zzk();
                    zzfdVar.zzG(1);
                    List singletonList = z ? Collections.singletonList((zzk4 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    zzak zzakVar = new zzak();
                    zzakVar.zzS(str);
                    zzakVar.zzK(zzx);
                    zzakVar.zzu(i);
                    zzakVar.zzI(singletonList);
                    arrayList.add(zzakVar.zzY());
                }
            }
            zzfdVar.zzF(zzc);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    @Nullable
    public final zzaju zza(int i, zzajr zzajrVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzaiy(new zzaiv(zzajrVar.zzb));
            }
            if (i == 21) {
                return new zzaiy(new zzait());
            }
            if (i == 27) {
                return new zzaiy(new zzaiq(zzb(zzajrVar), false, false));
            }
            if (i == 36) {
                return new zzaiy(new zzais(zzb(zzajrVar)));
            }
            if (i == 89) {
                return new zzaiy(new zzaig(zzajrVar.zzc));
            }
            if (i == 138) {
                return new zzaiy(new zzaif(zzajrVar.zzb));
            }
            if (i == 172) {
                return new zzaiy(new zzaia(zzajrVar.zzb));
            }
            if (i == 257) {
                return new zzajh(new zzaix("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new zzajh(new zzaix("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new zzaiy(new zzaid(false, zzajrVar.zzb));
                            case 16:
                                return new zzaiy(new zzaim(zzc(zzajrVar)));
                            case 17:
                                return new zzaiy(new zzaiu(zzajrVar.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzaiy(new zzahx(zzajrVar.zzb));
            }
        }
        return new zzaiy(new zzaij(zzc(zzajrVar)));
    }
}
