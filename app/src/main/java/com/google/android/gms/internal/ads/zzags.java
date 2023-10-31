package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.sessions.settings.RemoteSettings;

/* loaded from: classes.dex */
final class zzags {
    @VisibleForTesting
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    @Nullable
    public static zzbz zza(zzfd zzfdVar) {
        String str;
        String str2;
        int zze = zzfdVar.zze() + zzfdVar.zzc();
        int zze2 = zzfdVar.zze();
        int i = (zze2 >> 24) & 255;
        zzbz zzbzVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = zze2 & 16777215;
                if (i2 == 6516084) {
                    int zze3 = zzfdVar.zze();
                    if (zzfdVar.zze() == 1684108385) {
                        zzfdVar.zzG(8);
                        String zzw = zzfdVar.zzw(zze3 - 16);
                        zzbzVar = new zzady("und", zzw, zzw);
                    } else {
                        zzer.zze("MetadataUtil", "Failed to parse comment attribute: ".concat(zzagc.zzf(zze2)));
                    }
                    return zzbzVar;
                } else if (i2 == 7233901 || i2 == 7631467) {
                    return zze(zze2, "TIT2", zzfdVar);
                } else {
                    if (i2 == 6516589 || i2 == 7828084) {
                        return zze(zze2, "TCOM", zzfdVar);
                    }
                    if (i2 == 6578553) {
                        return zze(zze2, "TDRC", zzfdVar);
                    }
                    if (i2 == 4280916) {
                        return zze(zze2, "TPE1", zzfdVar);
                    }
                    if (i2 == 7630703) {
                        return zze(zze2, "TSSE", zzfdVar);
                    }
                    if (i2 == 6384738) {
                        return zze(zze2, "TALB", zzfdVar);
                    }
                    if (i2 == 7108978) {
                        return zze(zze2, "USLT", zzfdVar);
                    }
                    if (i2 == 6776174) {
                        return zze(zze2, "TCON", zzfdVar);
                    }
                    if (i2 == 6779504) {
                        return zze(zze2, "TIT1", zzfdVar);
                    }
                }
            } else if (zze2 == 1735291493) {
                int zzb2 = zzb(zzfdVar);
                String str3 = (zzb2 <= 0 || zzb2 > 192) ? null : zza[zzb2 - 1];
                if (str3 != null) {
                    zzbzVar = new zzaen("TCON", null, zzfrr.zzm(str3));
                } else {
                    zzer.zze("MetadataUtil", "Failed to parse standard genre code");
                }
                return zzbzVar;
            } else if (zze2 == 1684632427) {
                return zzd(1684632427, "TPOS", zzfdVar);
            } else {
                if (zze2 == 1953655662) {
                    return zzd(1953655662, "TRCK", zzfdVar);
                }
                if (zze2 == 1953329263) {
                    return zzc(1953329263, "TBPM", zzfdVar, true, false);
                }
                if (zze2 == 1668311404) {
                    return zzc(1668311404, "TCMP", zzfdVar, true, true);
                }
                if (zze2 == 1668249202) {
                    int zze4 = zzfdVar.zze();
                    if (zzfdVar.zze() == 1684108385) {
                        int zze5 = zzfdVar.zze() & 16777215;
                        if (zze5 == 13) {
                            str2 = "image/jpeg";
                        } else if (zze5 == 14) {
                            str2 = "image/png";
                            zze5 = 14;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            zzfdVar.zzG(4);
                            int i3 = zze4 - 16;
                            byte[] bArr = new byte[i3];
                            zzfdVar.zzB(bArr, 0, i3);
                            zzbzVar = new zzadq(str2, null, 3, bArr);
                            return zzbzVar;
                        }
                        str = "Unrecognized cover art flags: " + zze5;
                    } else {
                        str = "Failed to parse cover art attribute";
                    }
                    zzer.zze("MetadataUtil", str);
                    return zzbzVar;
                } else if (zze2 == 1631670868) {
                    return zze(1631670868, "TPE2", zzfdVar);
                } else {
                    if (zze2 == 1936682605) {
                        return zze(1936682605, "TSOT", zzfdVar);
                    }
                    if (zze2 == 1936679276) {
                        return zze(1936679276, "TSO2", zzfdVar);
                    }
                    if (zze2 == 1936679282) {
                        return zze(1936679282, "TSOA", zzfdVar);
                    }
                    if (zze2 == 1936679265) {
                        return zze(1936679265, "TSOP", zzfdVar);
                    }
                    if (zze2 == 1936679791) {
                        return zze(1936679791, "TSOC", zzfdVar);
                    }
                    if (zze2 == 1920233063) {
                        return zzc(1920233063, "ITUNESADVISORY", zzfdVar, false, false);
                    }
                    if (zze2 == 1885823344) {
                        return zzc(1885823344, "ITUNESGAPLESS", zzfdVar, false, true);
                    }
                    if (zze2 == 1936683886) {
                        return zze(1936683886, "TVSHOWSORT", zzfdVar);
                    }
                    if (zze2 == 1953919848) {
                        return zze(1953919848, "TVSHOW", zzfdVar);
                    }
                    if (zze2 == 757935405) {
                        int i4 = -1;
                        int i5 = -1;
                        String str4 = null;
                        String str5 = null;
                        while (zzfdVar.zzc() < zze) {
                            int zzc = zzfdVar.zzc();
                            int zze6 = zzfdVar.zze();
                            int zze7 = zzfdVar.zze();
                            zzfdVar.zzG(4);
                            if (zze7 == 1835360622) {
                                str4 = zzfdVar.zzw(zze6 - 12);
                            } else if (zze7 == 1851878757) {
                                str5 = zzfdVar.zzw(zze6 - 12);
                            } else {
                                if (zze7 == 1684108385) {
                                    i5 = zze6;
                                }
                                if (zze7 == 1684108385) {
                                    i4 = zzc;
                                }
                                zzfdVar.zzG(zze6 - 12);
                            }
                        }
                        if (str4 != null && str5 != null && i4 != -1) {
                            zzfdVar.zzF(i4);
                            zzfdVar.zzG(16);
                            zzbzVar = new zzaeh(str4, str5, zzfdVar.zzw(i5 - 16));
                        }
                        return zzbzVar;
                    }
                }
            }
            zzer.zza("MetadataUtil", "Skipped unknown metadata entry: " + zzagc.zzf(zze2));
            return null;
        } finally {
            zzfdVar.zzF(zze);
        }
    }

    private static int zzb(zzfd zzfdVar) {
        zzfdVar.zzG(4);
        if (zzfdVar.zze() == 1684108385) {
            zzfdVar.zzG(8);
            return zzfdVar.zzk();
        }
        zzer.zze("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    @Nullable
    private static zzaef zzc(int i, String str, zzfd zzfdVar, boolean z, boolean z2) {
        int zzb2 = zzb(zzfdVar);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 >= 0) {
            return z ? new zzaen(str, null, zzfrr.zzm(Integer.toString(zzb2))) : new zzady("und", str, Integer.toString(zzb2));
        }
        zzer.zze("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzagc.zzf(i)));
        return null;
    }

    @Nullable
    private static zzaen zzd(int i, String str, zzfd zzfdVar) {
        int zze = zzfdVar.zze();
        if (zzfdVar.zze() == 1684108385 && zze >= 22) {
            zzfdVar.zzG(10);
            int zzo = zzfdVar.zzo();
            if (zzo > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzo);
                String sb2 = sb.toString();
                int zzo2 = zzfdVar.zzo();
                if (zzo2 > 0) {
                    sb2 = sb2 + RemoteSettings.FORWARD_SLASH_STRING + zzo2;
                }
                return new zzaen(str, null, zzfrr.zzm(sb2));
            }
        }
        zzer.zze("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzagc.zzf(i)));
        return null;
    }

    @Nullable
    private static zzaen zze(int i, String str, zzfd zzfdVar) {
        int zze = zzfdVar.zze();
        if (zzfdVar.zze() == 1684108385) {
            zzfdVar.zzG(8);
            return new zzaen(str, null, zzfrr.zzm(zzfdVar.zzw(zze - 16)));
        }
        zzer.zze("MetadataUtil", "Failed to parse text attribute: ".concat(zzagc.zzf(i)));
        return null;
    }
}
