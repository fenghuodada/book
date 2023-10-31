package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.work.o */
/* loaded from: classes.dex */
public interface InterfaceC2010o {
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})

    /* renamed from: a */
    public static final AbstractC2011a.C2014c f4876a = new AbstractC2011a.C2014c();
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})

    /* renamed from: b */
    public static final AbstractC2011a.C2013b f4877b = new AbstractC2011a.C2013b();

    /* renamed from: androidx.work.o$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2011a {

        /* renamed from: androidx.work.o$a$a */
        /* loaded from: classes.dex */
        public static final class C2012a extends AbstractC2011a {

            /* renamed from: a */
            public final Throwable f4878a;

            public C2012a(@NonNull Throwable th) {
                this.f4878a = th;
            }

            @NonNull
            public final String toString() {
                return String.format("FAILURE (%s)", this.f4878a.getMessage());
            }
        }

        /* renamed from: androidx.work.o$a$b */
        /* loaded from: classes.dex */
        public static final class C2013b extends AbstractC2011a {
            @NonNull
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* renamed from: androidx.work.o$a$c */
        /* loaded from: classes.dex */
        public static final class C2014c extends AbstractC2011a {
            @NonNull
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
