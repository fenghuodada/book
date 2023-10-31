package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;

/* renamed from: androidx.datastore.preferences.b */
/* loaded from: classes.dex */
public final class C1131b extends AbstractC10844k implements InterfaceC10809a<File> {

    /* renamed from: a */
    public final /* synthetic */ Context f2920a;

    /* renamed from: b */
    public final /* synthetic */ C1132c f2921b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1131b(Context context, C1132c c1132c) {
        super(0);
        this.f2920a = context;
        this.f2921b = c1132c;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    public final File invoke() {
        Context applicationContext = this.f2920a;
        C10843j.m431e(applicationContext, "applicationContext");
        String name = this.f2921b.f2922a;
        C10843j.m430f(name, "name");
        String fileName = C10843j.m425k(".preferences_pb", name);
        C10843j.m430f(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), C10843j.m425k(fileName, "datastore/"));
    }
}
