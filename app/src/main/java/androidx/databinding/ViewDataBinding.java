package androidx.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.InterfaceC1481l;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewbinding.InterfaceC1805a;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public abstract class ViewDataBinding extends C1082a implements InterfaceC1805a {

    /* renamed from: b */
    public static final /* synthetic */ int f2789b = 0;

    /* loaded from: classes.dex */
    public static class OnStartListener implements InterfaceC1481l {
        @OnLifecycleEvent(AbstractC1464h.EnumC1465a.ON_START)
        public void onStart() {
            throw null;
        }
    }

    static {
        new ReferenceQueue();
    }

    @Override // androidx.viewbinding.InterfaceC1805a
    @NonNull
    public final View getRoot() {
        return null;
    }
}
