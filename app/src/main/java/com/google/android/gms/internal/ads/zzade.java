package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
final class zzade {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @Nullable
    public static zzada zza(String str) throws IOException {
        long j;
        String str2;
        String str3;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (zzfo.zzc(newPullParser, "x:xmpmeta")) {
                zzfrr zzl = zzfrr.zzl();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (zzfo.zzc(newPullParser, "rdf:Description")) {
                        String[] strArr = zza;
                        int i = 0;
                        for (int i2 = 0; i2 < 4; i2++) {
                            String zza2 = zzfo.zza(newPullParser, strArr[i2]);
                            if (zza2 != null) {
                                if (Integer.parseInt(zza2) != 1) {
                                    return null;
                                } else {
                                    String[] strArr2 = zzb;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= 4) {
                                            break;
                                        }
                                        String zza3 = zzfo.zza(newPullParser, strArr2[i3]);
                                        if (zza3 != null) {
                                            j = Long.parseLong(zza3);
                                            if (j == -1) {
                                            }
                                        } else {
                                            i3++;
                                        }
                                    }
                                    j = -9223372036854775807L;
                                    String[] strArr3 = zzc;
                                    while (true) {
                                        if (i >= 2) {
                                            zzl = zzfrr.zzl();
                                            break;
                                        }
                                        String zza4 = zzfo.zza(newPullParser, strArr3[i]);
                                        if (zza4 != null) {
                                            zzl = zzfrr.zzn(new zzacz("image/jpeg", "Primary", 0L, 0L), new zzacz("video/mp4", "MotionPhoto", Long.parseLong(zza4), 0L));
                                            break;
                                        }
                                        i++;
                                    }
                                    j2 = j;
                                }
                            }
                        }
                        return null;
                    }
                    if (zzfo.zzc(newPullParser, "Container:Directory")) {
                        str2 = "Container";
                        str3 = "Item";
                    } else if (zzfo.zzc(newPullParser, "GContainer:Directory")) {
                        str2 = "GContainer";
                        str3 = "GContainerItem";
                    }
                    zzl = zzb(newPullParser, str2, str3);
                } while (!zzfo.zzb(newPullParser, "x:xmpmeta"));
                if (zzl.isEmpty()) {
                    return null;
                }
                return new zzada(j2, zzl);
            }
            throw zzce.zza("Couldn't find xmp metadata", null);
        } catch (zzce | NumberFormatException | XmlPullParserException unused) {
            zzer.zze("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfrr zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfro zzfroVar = new zzfro();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfo.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzfo.zza(xmlPullParser, concat2);
                String zza3 = zzfo.zza(xmlPullParser, concat3);
                String zza4 = zzfo.zza(xmlPullParser, concat4);
                String zza5 = zzfo.zza(xmlPullParser, concat5);
                if (zza2 == null || zza3 == null) {
                    return zzfrr.zzl();
                }
                zzfroVar.zzf(new zzacz(zza2, zza3, zza4 != null ? Long.parseLong(zza4) : 0L, zza5 != null ? Long.parseLong(zza5) : 0L));
            }
        } while (!zzfo.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfroVar.zzi();
    }
}
