package androidx.work;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashSet;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.e */
/* loaded from: classes.dex */
public final class C1835e {

    /* renamed from: a */
    public final HashSet f4454a = new HashSet();

    /* renamed from: androidx.work.e$a */
    /* loaded from: classes.dex */
    public static final class C1836a {
        @NonNull

        /* renamed from: a */
        public final Uri f4455a;

        /* renamed from: b */
        public final boolean f4456b;

        public C1836a(@NonNull Uri uri, boolean z) {
            this.f4455a = uri;
            this.f4456b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1836a.class != obj.getClass()) {
                return false;
            }
            C1836a c1836a = (C1836a) obj;
            return this.f4456b == c1836a.f4456b && this.f4455a.equals(c1836a.f4455a);
        }

        public final int hashCode() {
            return (this.f4455a.hashCode() * 31) + (this.f4456b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1835e.class != obj.getClass()) {
            return false;
        }
        return this.f4454a.equals(((C1835e) obj).f4454a);
    }

    public final int hashCode() {
        return this.f4454a.hashCode();
    }
}
