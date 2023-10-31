package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.AbstractC1802a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1802a abstractC1802a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f3511a;
        if (abstractC1802a.mo9924h(1)) {
            obj = abstractC1802a.m9931n();
        }
        audioAttributesCompat.f3511a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1802a abstractC1802a) {
        abstractC1802a.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f3511a;
        abstractC1802a.mo9920o(1);
        abstractC1802a.m9929w(audioAttributesImpl);
    }
}
