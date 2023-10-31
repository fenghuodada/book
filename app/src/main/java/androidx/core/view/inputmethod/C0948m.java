package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.core.view.inputmethod.m */
/* loaded from: classes.dex */
public final class C0948m {

    /* renamed from: a */
    public final InterfaceC0951c f2642a;

    @RequiresApi(25)
    /* renamed from: androidx.core.view.inputmethod.m$a */
    /* loaded from: classes.dex */
    public static final class C0949a implements InterfaceC0951c {
        @NonNull

        /* renamed from: a */
        public final InputContentInfo f2643a;

        public C0949a(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f2643a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public C0949a(@NonNull Object obj) {
            this.f2643a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.C0948m.InterfaceC0951c
        @NonNull
        /* renamed from: a */
        public final Uri mo11439a() {
            Uri contentUri;
            contentUri = this.f2643a.getContentUri();
            return contentUri;
        }

        @Override // androidx.core.view.inputmethod.C0948m.InterfaceC0951c
        /* renamed from: b */
        public final void mo11438b() {
            this.f2643a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.C0948m.InterfaceC0951c
        @Nullable
        /* renamed from: c */
        public final Uri mo11437c() {
            Uri linkUri;
            linkUri = this.f2643a.getLinkUri();
            return linkUri;
        }

        @Override // androidx.core.view.inputmethod.C0948m.InterfaceC0951c
        @NonNull
        /* renamed from: d */
        public final Object mo11436d() {
            return this.f2643a;
        }

        @Override // androidx.core.view.inputmethod.C0948m.InterfaceC0951c
        @NonNull
        public final ClipDescription getDescription() {
            ClipDescription description;
            description = this.f2643a.getDescription();
            return description;
        }
    }

    /* renamed from: androidx.core.view.inputmethod.m$b */
    /* loaded from: classes.dex */
    public static final class C0950b implements InterfaceC0951c {
        @NonNull

        /* renamed from: a */
        public final Uri f2644a;
        @NonNull

        /* renamed from: b */
        public final ClipDescription f2645b;
        @Nullable

        /* renamed from: c */
        public final Uri f2646c;

        public C0950b(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f2644a = uri;
            this.f2645b = clipDescription;
            this.f2646c = uri2;
        }

        @Override // androidx.core.view.inputmethod.C0948m.InterfaceC0951c
        @NonNull
        /* renamed from: a */
        public final Uri mo11439a() {
            return this.f2644a;
        }

        @Override // androidx.core.view.inputmethod.C0948m.InterfaceC0951c
        /* renamed from: b */
        public final void mo11438b() {
        }

        @Override // androidx.core.view.inputmethod.C0948m.InterfaceC0951c
        @Nullable
        /* renamed from: c */
        public final Uri mo11437c() {
            return this.f2646c;
        }

        @Override // androidx.core.view.inputmethod.C0948m.InterfaceC0951c
        @Nullable
        /* renamed from: d */
        public final Object mo11436d() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.C0948m.InterfaceC0951c
        @NonNull
        public final ClipDescription getDescription() {
            return this.f2645b;
        }
    }

    /* renamed from: androidx.core.view.inputmethod.m$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0951c {
        @NonNull
        /* renamed from: a */
        Uri mo11439a();

        /* renamed from: b */
        void mo11438b();

        @Nullable
        /* renamed from: c */
        Uri mo11437c();

        @Nullable
        /* renamed from: d */
        Object mo11436d();

        @NonNull
        ClipDescription getDescription();
    }

    public C0948m(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
        this.f2642a = Build.VERSION.SDK_INT >= 25 ? new C0949a(uri, clipDescription, uri2) : new C0950b(uri, clipDescription, uri2);
    }

    public C0948m(@NonNull C0949a c0949a) {
        this.f2642a = c0949a;
    }
}
