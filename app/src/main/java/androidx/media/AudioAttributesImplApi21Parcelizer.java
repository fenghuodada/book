package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.AbstractC1802a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC1802a abstractC1802a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3512a = (AudioAttributes) abstractC1802a.m9932l(audioAttributesImplApi21.f3512a, 1);
        audioAttributesImplApi21.f3513b = abstractC1802a.m9933j(audioAttributesImplApi21.f3513b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC1802a abstractC1802a) {
        abstractC1802a.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f3512a;
        abstractC1802a.mo9920o(1);
        abstractC1802a.mo9915u(audioAttributes);
        abstractC1802a.m9930t(audioAttributesImplApi21.f3513b, 2);
    }
}
