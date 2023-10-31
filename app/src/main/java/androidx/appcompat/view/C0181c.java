package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;

/* renamed from: androidx.appcompat.view.c */
/* loaded from: classes.dex */
public final class C0181c extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f508f;

    /* renamed from: a */
    public int f509a;

    /* renamed from: b */
    public Resources.Theme f510b;

    /* renamed from: c */
    public LayoutInflater f511c;

    /* renamed from: d */
    public Configuration f512d;

    /* renamed from: e */
    public Resources f513e;

    @RequiresApi(17)
    /* renamed from: androidx.appcompat.view.c$a */
    /* loaded from: classes.dex */
    public static class C0182a {
        @DoNotInline
        /* renamed from: a */
        public static Context m12895a(C0181c c0181c, Configuration configuration) {
            return c0181c.createConfigurationContext(configuration);
        }
    }

    public C0181c() {
        super(null);
    }

    public C0181c(Context context, @StyleRes int i) {
        super(context);
        this.f509a = i;
    }

    public C0181c(Context context, Resources.Theme theme) {
        super(context);
        this.f510b = theme;
    }

    /* renamed from: a */
    public final void m12897a(Configuration configuration) {
        if (this.f513e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f512d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f512d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m12896b() {
        boolean z;
        if (this.f510b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f510b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f510b.setTo(theme);
            }
        }
        this.f510b.applyStyle(this.f509a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r0.equals(androidx.appcompat.view.C0181c.f508f) != false) goto L14;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f513e
            if (r0 != 0) goto L36
            android.content.res.Configuration r0 = r3.f512d
            if (r0 == 0) goto L30
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = androidx.appcompat.view.C0181c.f508f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            androidx.appcompat.view.C0181c.f508f = r1
        L1c:
            android.content.res.Configuration r1 = androidx.appcompat.view.C0181c.f508f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L30
        L25:
            android.content.res.Configuration r0 = r3.f512d
            android.content.Context r0 = androidx.appcompat.view.C0181c.C0182a.m12895a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            goto L34
        L30:
            android.content.res.Resources r0 = super.getResources()
        L34:
            r3.f513e = r0
        L36:
            android.content.res.Resources r0 = r3.f513e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.C0181c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f511c == null) {
                this.f511c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f511c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f510b;
        if (theme != null) {
            return theme;
        }
        if (this.f509a == 0) {
            this.f509a = 2132017829;
        }
        m12896b();
        return this.f510b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f509a != i) {
            this.f509a = i;
            m12896b();
        }
    }
}
