package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(21)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: a */
    public AudioAttributes f3512a;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: b */
    public int f3513b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f3512a.equals(((AudioAttributesImplApi21) obj).f3512a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3512a.hashCode();
    }

    @NonNull
    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3512a;
    }
}
