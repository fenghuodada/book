package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzebr implements zzebs {
    @Nullable
    private static zzfgt zzf(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return zzfgt.VIDEO;
            }
            return zzfgt.NATIVE_DISPLAY;
        }
        return zzfgt.HTML_DISPLAY;
    }

    private static zzfgv zzg(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? zzfgv.UNSPECIFIED : zzfgv.ONE_PIXEL : zzfgv.DEFINED_BY_JAVASCRIPT : zzfgv.BEGIN_TO_RENDER;
    }

    private static zzfgw zzh(@Nullable String str) {
        return "native".equals(str) ? zzfgw.NATIVE : "javascript".equals(str) ? zzfgw.JAVASCRIPT : zzfgw.NONE;
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    @Nullable
    public final zzfgo zza(String str, WebView webView, String str2, String str3, @Nullable String str4, zzebu zzebuVar, zzebt zzebtVar, @Nullable String str5) {
        String valueOf;
        String str6;
        String concat;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeK)).booleanValue() && zzfgm.zzb()) {
            zzfgx zza = zzfgx.zza("Google", str);
            zzfgw zzh = zzh("javascript");
            zzfgt zzf = zzf(zzebtVar.toString());
            zzfgw zzfgwVar = zzfgw.NONE;
            if (zzh == zzfgwVar) {
                concat = "Omid html session error; Unable to parse impression owner: javascript";
            } else {
                if (zzf == null) {
                    valueOf = String.valueOf(zzebtVar);
                    str6 = "Omid html session error; Unable to parse creative type: ";
                } else {
                    zzfgw zzh2 = zzh(str4);
                    if (zzf != zzfgt.VIDEO || zzh2 != zzfgwVar) {
                        return zzfgo.zza(zzfgp.zza(zzf, zzg(zzebuVar.toString()), zzh, zzh2, true), zzfgq.zzb(zza, webView, str5, ""));
                    }
                    valueOf = String.valueOf(str4);
                    str6 = "Omid html session error; Video events owner unknown for video creative: ";
                }
                concat = str6.concat(valueOf);
            }
            zzbzt.zzj(concat);
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    @Nullable
    public final zzfgo zzb(String str, WebView webView, String str2, String str3, @Nullable String str4, String str5, zzebu zzebuVar, zzebt zzebtVar, @Nullable String str6) {
        String valueOf;
        String str7;
        String concat;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeK)).booleanValue() && zzfgm.zzb()) {
            zzfgx zza = zzfgx.zza(str5, str);
            zzfgw zzh = zzh("javascript");
            zzfgw zzh2 = zzh(str4);
            zzfgt zzf = zzf(zzebtVar.toString());
            zzfgw zzfgwVar = zzfgw.NONE;
            if (zzh == zzfgwVar) {
                concat = "Omid js session error; Unable to parse impression owner: javascript";
            } else {
                if (zzf == null) {
                    valueOf = String.valueOf(zzebtVar);
                    str7 = "Omid js session error; Unable to parse creative type: ";
                } else if (zzf != zzfgt.VIDEO || zzh2 != zzfgwVar) {
                    return zzfgo.zza(zzfgp.zza(zzf, zzg(zzebuVar.toString()), zzh, zzh2, true), zzfgq.zzc(zza, webView, str6, ""));
                } else {
                    valueOf = String.valueOf(str4);
                    str7 = "Omid js session error; Video events owner unknown for video creative: ";
                }
                concat = str7.concat(valueOf);
            }
            zzbzt.zzj(concat);
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zzc(zzfgo zzfgoVar, View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeK)).booleanValue() && zzfgm.zzb()) {
            zzfgoVar.zzd(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zzd(zzfgo zzfgoVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeK)).booleanValue() && zzfgm.zzb()) {
            zzfgoVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final boolean zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeK)).booleanValue()) {
            zzbzt.zzj("Omid flag is disabled");
            return false;
        } else if (zzfgm.zzb()) {
            return true;
        } else {
            zzfgm.zza(context);
            return zzfgm.zzb();
        }
    }
}
