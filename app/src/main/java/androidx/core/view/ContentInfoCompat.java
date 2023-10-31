package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.C0484a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ContentInfoCompat {
    @NonNull

    /* renamed from: a */
    public final InterfaceC0809e f2505a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface Source {
    }

    @RequiresApi(31)
    /* renamed from: androidx.core.view.ContentInfoCompat$a */
    /* loaded from: classes.dex */
    public static final class C0805a implements InterfaceC0806b {
        @NonNull

        /* renamed from: a */
        public final ContentInfo.Builder f2506a;

        public C0805a(@NonNull ClipData clipData, int i) {
            this.f2506a = new ContentInfo.Builder(clipData, i);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0806b
        /* renamed from: a */
        public final void mo11790a(@Nullable Uri uri) {
            this.f2506a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0806b
        /* renamed from: b */
        public final void mo11789b(int i) {
            this.f2506a.setFlags(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0806b
        @NonNull
        public final ContentInfoCompat build() {
            ContentInfo build;
            build = this.f2506a.build();
            return new ContentInfoCompat(new C0808d(build));
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0806b
        public final void setExtras(@Nullable Bundle bundle) {
            this.f2506a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0806b {
        /* renamed from: a */
        void mo11790a(@Nullable Uri uri);

        /* renamed from: b */
        void mo11789b(int i);

        @NonNull
        ContentInfoCompat build();

        void setExtras(@Nullable Bundle bundle);
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$c */
    /* loaded from: classes.dex */
    public static final class C0807c implements InterfaceC0806b {
        @NonNull

        /* renamed from: a */
        public final ClipData f2507a;

        /* renamed from: b */
        public final int f2508b;

        /* renamed from: c */
        public int f2509c;
        @Nullable

        /* renamed from: d */
        public Uri f2510d;
        @Nullable

        /* renamed from: e */
        public Bundle f2511e;

        public C0807c(@NonNull ClipData clipData, int i) {
            this.f2507a = clipData;
            this.f2508b = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0806b
        /* renamed from: a */
        public final void mo11790a(@Nullable Uri uri) {
            this.f2510d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0806b
        /* renamed from: b */
        public final void mo11789b(int i) {
            this.f2509c = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0806b
        @NonNull
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new C0810f(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0806b
        public final void setExtras(@Nullable Bundle bundle) {
            this.f2511e = bundle;
        }
    }

    @RequiresApi(31)
    /* renamed from: androidx.core.view.ContentInfoCompat$d */
    /* loaded from: classes.dex */
    public static final class C0808d implements InterfaceC0809e {
        @NonNull

        /* renamed from: a */
        public final ContentInfo f2512a;

        public C0808d(@NonNull ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f2512a = contentInfo;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0809e
        @NonNull
        /* renamed from: a */
        public final ClipData mo11788a() {
            ClipData clip;
            clip = this.f2512a.getClip();
            return clip;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0809e
        /* renamed from: b */
        public final int mo11787b() {
            int flags;
            flags = this.f2512a.getFlags();
            return flags;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0809e
        @NonNull
        /* renamed from: c */
        public final ContentInfo mo11786c() {
            return this.f2512a;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0809e
        /* renamed from: d */
        public final int mo11785d() {
            int source;
            source = this.f2512a.getSource();
            return source;
        }

        @NonNull
        public final String toString() {
            return "ContentInfoCompat{" + this.f2512a + "}";
        }
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0809e {
        @NonNull
        /* renamed from: a */
        ClipData mo11788a();

        /* renamed from: b */
        int mo11787b();

        @Nullable
        /* renamed from: c */
        ContentInfo mo11786c();

        /* renamed from: d */
        int mo11785d();
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$f */
    /* loaded from: classes.dex */
    public static final class C0810f implements InterfaceC0809e {
        @NonNull

        /* renamed from: a */
        public final ClipData f2513a;

        /* renamed from: b */
        public final int f2514b;

        /* renamed from: c */
        public final int f2515c;
        @Nullable

        /* renamed from: d */
        public final Uri f2516d;
        @Nullable

        /* renamed from: e */
        public final Bundle f2517e;

        public C0810f(C0807c c0807c) {
            ClipData clipData = c0807c.f2507a;
            clipData.getClass();
            this.f2513a = clipData;
            int i = c0807c.f2508b;
            if (i >= 0) {
                if (i <= 5) {
                    this.f2514b = i;
                    int i2 = c0807c.f2509c;
                    if ((i2 & 1) == i2) {
                        this.f2515c = i2;
                        this.f2516d = c0807c.f2510d;
                        this.f2517e = c0807c.f2511e;
                        return;
                    }
                    throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
                }
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", FirebaseAnalytics.Param.SOURCE, 0, 5));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", FirebaseAnalytics.Param.SOURCE, 0, 5));
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0809e
        @NonNull
        /* renamed from: a */
        public final ClipData mo11788a() {
            return this.f2513a;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0809e
        /* renamed from: b */
        public final int mo11787b() {
            return this.f2515c;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0809e
        @Nullable
        /* renamed from: c */
        public final ContentInfo mo11786c() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC0809e
        /* renamed from: d */
        public final int mo11785d() {
            return this.f2514b;
        }

        @NonNull
        public final String toString() {
            String str;
            String valueOf;
            Uri uri;
            String str2;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f2513a.getDescription());
            sb.append(", source=");
            int i = this.f2514b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    str = String.valueOf(i);
                                } else {
                                    str = "SOURCE_PROCESS_TEXT";
                                }
                            } else {
                                str = "SOURCE_AUTOFILL";
                            }
                        } else {
                            str = "SOURCE_DRAG_AND_DROP";
                        }
                    } else {
                        str = "SOURCE_INPUT_METHOD";
                    }
                } else {
                    str = "SOURCE_CLIPBOARD";
                }
            } else {
                str = "SOURCE_APP";
            }
            sb.append(str);
            sb.append(", flags=");
            int i2 = this.f2515c;
            if ((i2 & 1) != 0) {
                valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                valueOf = String.valueOf(i2);
            }
            sb.append(valueOf);
            String str3 = "";
            if (this.f2516d == null) {
                str2 = "";
            } else {
                str2 = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str2);
            if (this.f2517e != null) {
                str3 = ", hasExtras";
            }
            return C0484a.m12392a(sb, str3, "}");
        }
    }

    public ContentInfoCompat(@NonNull InterfaceC0809e interfaceC0809e) {
        this.f2505a = interfaceC0809e;
    }

    @NonNull
    public final String toString() {
        return this.f2505a.toString();
    }
}
