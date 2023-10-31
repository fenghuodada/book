package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.AbstractC1802a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC1802a abstractC1802a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3514a = abstractC1802a.m9933j(audioAttributesImplBase.f3514a, 1);
        audioAttributesImplBase.f3515b = abstractC1802a.m9933j(audioAttributesImplBase.f3515b, 2);
        audioAttributesImplBase.f3516c = abstractC1802a.m9933j(audioAttributesImplBase.f3516c, 3);
        audioAttributesImplBase.f3517d = abstractC1802a.m9933j(audioAttributesImplBase.f3517d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC1802a abstractC1802a) {
        abstractC1802a.getClass();
        abstractC1802a.m9930t(audioAttributesImplBase.f3514a, 1);
        abstractC1802a.m9930t(audioAttributesImplBase.f3515b, 2);
        abstractC1802a.m9930t(audioAttributesImplBase.f3516c, 3);
        abstractC1802a.m9930t(audioAttributesImplBase.f3517d, 4);
    }
}
