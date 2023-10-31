package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(api = 28)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.app.CoreComponentFactory$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0598a {
        /* renamed from: a */
        Object m12104a();
    }

    /* renamed from: a */
    public static <T> T m12105a(T t) {
        T t2;
        return (!(t instanceof InterfaceC0598a) || (t2 = (T) ((InterfaceC0598a) t).m12104a()) == null) ? t : t2;
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public final Activity instantiateActivity(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) m12105a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public final Application instantiateApplication(@NonNull ClassLoader classLoader, @NonNull String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) m12105a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public final ContentProvider instantiateProvider(@NonNull ClassLoader classLoader, @NonNull String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) m12105a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public final BroadcastReceiver instantiateReceiver(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) m12105a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public final Service instantiateService(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) m12105a(super.instantiateService(classLoader, str, intent));
    }
}
