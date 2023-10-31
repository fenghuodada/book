package androidx.appcompat.app;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.C0153z;
import androidx.appcompat.app.LayoutInflater$Factory2C0114h;
import androidx.appcompat.app.ServiceC0150x;
import androidx.appcompat.view.AbstractC0178a;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C0472d;
import androidx.core.p003os.C0735e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* renamed from: a */
    public static final C0153z.ExecutorC0154a f205a = new C0153z.ExecutorC0154a(new C0153z.ExecutorC0155b());

    /* renamed from: b */
    public static final int f206b = -100;

    /* renamed from: c */
    public static C0735e f207c = null;

    /* renamed from: d */
    public static C0735e f208d = null;

    /* renamed from: e */
    public static Boolean f209e = null;

    /* renamed from: f */
    public static boolean f210f = false;

    /* renamed from: g */
    public static final C0472d<WeakReference<AppCompatDelegate>> f211g = new C0472d<>();

    /* renamed from: h */
    public static final Object f212h = new Object();

    /* renamed from: i */
    public static final Object f213i = new Object();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface NightMode {
    }

    @RequiresApi(24)
    /* renamed from: androidx.appcompat.app.AppCompatDelegate$a */
    /* loaded from: classes.dex */
    public static class C0086a {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m13036a(String str) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(str);
            return forLanguageTags;
        }
    }

    @RequiresApi(33)
    /* renamed from: androidx.appcompat.app.AppCompatDelegate$b */
    /* loaded from: classes.dex */
    public static class C0087b {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m13035a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m13034b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* renamed from: n */
    public static boolean m13038n(Context context) {
        int i;
        if (f209e == null) {
            try {
                int i2 = ServiceC0150x.f400a;
                if (Build.VERSION.SDK_INT >= 24) {
                    i = ServiceC0150x.C0151a.m12928a() | 128;
                } else {
                    i = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, ServiceC0150x.class), i).metaData;
                if (bundle != null) {
                    f209e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f209e = Boolean.FALSE;
            }
        }
        return f209e.booleanValue();
    }

    /* renamed from: w */
    public static void m13037w(@NonNull AppCompatDelegate appCompatDelegate) {
        synchronized (f212h) {
            Iterator<WeakReference<AppCompatDelegate>> it = f211g.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate2 = it.next().get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract void mo13008A(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: B */
    public abstract void mo13007B(@Nullable Toolbar toolbar);

    /* renamed from: C */
    public void mo13006C(@StyleRes int i) {
    }

    /* renamed from: D */
    public abstract void mo13005D(@Nullable CharSequence charSequence);

    @Nullable
    /* renamed from: E */
    public abstract AbstractC0178a mo13004E(@NonNull AbstractC0178a.InterfaceC0179a interfaceC0179a);

    /* renamed from: c */
    public abstract void mo12980c(View view, ViewGroup.LayoutParams layoutParams);

    @NonNull
    @CallSuper
    /* renamed from: d */
    public Context mo12979d(@NonNull Context context) {
        return context;
    }

    /* renamed from: e */
    public abstract View mo12978e(String str, @NonNull Context context, @NonNull AttributeSet attributeSet);

    @Nullable
    /* renamed from: f */
    public abstract <T extends View> T mo12977f(@IdRes int i);

    @Nullable
    /* renamed from: g */
    public Context mo12976g() {
        return null;
    }

    @Nullable
    /* renamed from: h */
    public abstract LayoutInflater$Factory2C0114h.C0116b mo12975h();

    /* renamed from: i */
    public int mo12974i() {
        return -100;
    }

    /* renamed from: j */
    public abstract MenuInflater mo12973j();

    @Nullable
    /* renamed from: k */
    public abstract ActionBar mo12972k();

    /* renamed from: l */
    public abstract void mo12971l();

    /* renamed from: m */
    public abstract void mo12970m();

    /* renamed from: o */
    public abstract void mo12969o(Configuration configuration);

    /* renamed from: p */
    public abstract void mo12968p();

    /* renamed from: q */
    public abstract void mo12967q();

    /* renamed from: r */
    public abstract void mo12966r();

    /* renamed from: s */
    public abstract void mo12965s();

    /* renamed from: t */
    public abstract void mo12964t();

    /* renamed from: u */
    public abstract void mo12963u();

    /* renamed from: v */
    public abstract void mo12962v();

    /* renamed from: x */
    public abstract boolean mo12961x(int i);

    /* renamed from: y */
    public abstract void mo12960y(@LayoutRes int i);

    /* renamed from: z */
    public abstract void mo12959z(View view);
}
