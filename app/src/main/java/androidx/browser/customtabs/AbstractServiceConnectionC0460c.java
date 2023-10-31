package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.support.customtabs.InterfaceC0003b;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.browser.customtabs.c */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC0460c implements ServiceConnection {
    @Nullable
    private Context mApplicationContext;

    /* renamed from: androidx.browser.customtabs.c$a */
    /* loaded from: classes.dex */
    public class C0461a extends C0459b {
        public C0461a(InterfaceC0003b interfaceC0003b, ComponentName componentName) {
            super(interfaceC0003b, componentName);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull C0459b c0459b);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        InterfaceC0003b c0005a;
        if (this.mApplicationContext != null) {
            int i = InterfaceC0003b.AbstractBinderC0004a.f0a;
            if (iBinder == null) {
                c0005a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0003b)) {
                    c0005a = (InterfaceC0003b) queryLocalInterface;
                } else {
                    c0005a = new InterfaceC0003b.AbstractBinderC0004a.C0005a(iBinder);
                }
            }
            onCustomTabsServiceConnected(componentName, new C0461a(c0005a, componentName));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public void setApplicationContext(@NonNull Context context) {
        this.mApplicationContext = context;
    }
}
