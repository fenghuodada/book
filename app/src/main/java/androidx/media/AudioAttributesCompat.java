package androidx.media;

import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.InterfaceC1804c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC1804c {

    /* renamed from: b */
    public static final /* synthetic */ int f3510b = 0;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: a */
    public AudioAttributesImpl f3511a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* loaded from: classes.dex */
    public @interface AttributeContentType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* loaded from: classes.dex */
    public @interface AttributeUsage {
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesCompat) {
            AudioAttributesImpl audioAttributesImpl = this.f3511a;
            AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f3511a;
            return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3511a.hashCode();
    }

    public final String toString() {
        return this.f3511a.toString();
    }
}
