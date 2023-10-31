package androidx.core.view;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.C0214i;
import androidx.appcompat.view.menu.SubMenuC0236s;

/* renamed from: androidx.core.view.b */
/* loaded from: classes.dex */
public abstract class AbstractC0893b {

    /* renamed from: a */
    public InterfaceC0894a f2624a;

    /* renamed from: androidx.core.view.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0894a {
    }

    /* renamed from: a */
    public boolean mo11535a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo11534b() {
        return true;
    }

    @NonNull
    /* renamed from: c */
    public abstract View mo11533c();

    @NonNull
    /* renamed from: d */
    public View mo11532d(@NonNull MenuItem menuItem) {
        return mo11533c();
    }

    /* renamed from: e */
    public boolean mo11531e() {
        return false;
    }

    /* renamed from: f */
    public void mo11530f(@NonNull SubMenuC0236s subMenuC0236s) {
    }

    /* renamed from: g */
    public boolean mo11529g() {
        return false;
    }

    /* renamed from: h */
    public void mo11528h(@Nullable C0214i.C0215a c0215a) {
        if (this.f2624a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2624a = c0215a;
    }
}
