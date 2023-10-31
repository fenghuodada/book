package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.AbstractC1802a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC1802a abstractC1802a) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f3512a = (AudioAttributes) abstractC1802a.m9932l(audioAttributesImplApi26.f3512a, 1);
        audioAttributesImplApi26.f3513b = abstractC1802a.m9933j(audioAttributesImplApi26.f3513b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC1802a abstractC1802a) {
        abstractC1802a.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.f3512a;
        abstractC1802a.mo9920o(1);
        abstractC1802a.mo9915u(audioAttributes);
        abstractC1802a.m9930t(audioAttributesImplApi26.f3513b, 2);
    }
}
