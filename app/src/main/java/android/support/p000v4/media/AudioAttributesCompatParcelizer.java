package android.support.p000v4.media;

import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.AbstractC1802a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: android.support.v4.media.AudioAttributesCompatParcelizer */
/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1802a abstractC1802a) {
        return androidx.media.AudioAttributesCompatParcelizer.read(abstractC1802a);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1802a abstractC1802a) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, abstractC1802a);
    }
}
