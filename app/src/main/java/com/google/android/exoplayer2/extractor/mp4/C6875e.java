package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.C0510h;
import com.google.android.exoplayer2.metadata.id3.AbstractC7083h;
import com.google.android.exoplayer2.metadata.id3.C7068a;
import com.google.android.exoplayer2.metadata.id3.C7076e;
import com.google.android.exoplayer2.metadata.id3.C7090l;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.e */
/* loaded from: classes.dex */
public final class C6875e {
    @VisibleForTesting

    /* renamed from: a */
    public static final String[] f11491a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @Nullable
    /* renamed from: a */
    public static C7076e m5876a(int i, C7436v c7436v) {
        String str;
        int m5015c = c7436v.m5015c();
        if (c7436v.m5015c() == 1684108385) {
            c7436v.m5018A(8);
            String m5006l = c7436v.m5006l(m5015c - 16);
            return new C7076e("und", m5006l, m5006l);
        }
        String valueOf = String.valueOf(AbstractC6865a.m5888a(i));
        if (valueOf.length() != 0) {
            str = "Failed to parse comment attribute: ".concat(valueOf);
        } else {
            str = new String("Failed to parse comment attribute: ");
        }
        Log.w("MetadataUtil", str);
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static C7068a m5875b(C7436v c7436v) {
        String str;
        String str2;
        int m5015c = c7436v.m5015c();
        if (c7436v.m5015c() == 1684108385) {
            int m5015c2 = c7436v.m5015c() & 16777215;
            if (m5015c2 == 13) {
                str2 = "image/jpeg";
            } else if (m5015c2 == 14) {
                str2 = "image/png";
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str = C0510h.m12340a(41, "Unrecognized cover art flags: ", m5015c2);
            } else {
                c7436v.m5018A(4);
                int i = m5015c - 16;
                byte[] bArr = new byte[i];
                c7436v.m5016b(0, bArr, i);
                return new C7068a(str2, null, 3, bArr);
            }
        } else {
            str = "Failed to parse cover art attribute";
        }
        Log.w("MetadataUtil", str);
        return null;
    }

    @Nullable
    /* renamed from: c */
    public static C7090l m5874c(int i, C7436v c7436v, String str) {
        String str2;
        int m5015c = c7436v.m5015c();
        if (c7436v.m5015c() == 1684108385) {
            c7436v.m5018A(8);
            return new C7090l(str, null, c7436v.m5006l(m5015c - 16));
        }
        String valueOf = String.valueOf(AbstractC6865a.m5888a(i));
        if (valueOf.length() != 0) {
            str2 = "Failed to parse text attribute: ".concat(valueOf);
        } else {
            str2 = new String("Failed to parse text attribute: ");
        }
        Log.w("MetadataUtil", str2);
        return null;
    }

    @Nullable
    /* renamed from: d */
    public static AbstractC7083h m5873d(int i, String str, C7436v c7436v, boolean z, boolean z2) {
        String str2;
        int m5872e = m5872e(c7436v);
        if (z2) {
            m5872e = Math.min(1, m5872e);
        }
        if (m5872e >= 0) {
            if (z) {
                return new C7090l(str, null, Integer.toString(m5872e));
            }
            return new C7076e("und", str, Integer.toString(m5872e));
        }
        String valueOf = String.valueOf(AbstractC6865a.m5888a(i));
        if (valueOf.length() != 0) {
            str2 = "Failed to parse uint8 attribute: ".concat(valueOf);
        } else {
            str2 = new String("Failed to parse uint8 attribute: ");
        }
        Log.w("MetadataUtil", str2);
        return null;
    }

    /* renamed from: e */
    public static int m5872e(C7436v c7436v) {
        c7436v.m5018A(4);
        if (c7436v.m5015c() == 1684108385) {
            c7436v.m5018A(8);
            return c7436v.m5002p();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
