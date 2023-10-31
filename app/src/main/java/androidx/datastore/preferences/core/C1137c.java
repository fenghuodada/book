package androidx.datastore.preferences.core;

import androidx.datastore.preferences.C1131b;
import java.io.File;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10929r;

/* renamed from: androidx.datastore.preferences.core.c */
/* loaded from: classes.dex */
public final class C1137c extends AbstractC10844k implements InterfaceC10809a<File> {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10809a<File> f2934a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1137c(C1131b c1131b) {
        super(0);
        this.f2934a = c1131b;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    public final File invoke() {
        File invoke = this.f2934a.invoke();
        C10843j.m430f(invoke, "<this>");
        String name = invoke.getName();
        C10843j.m431e(name, "name");
        if (C10843j.m435a(C10929r.m382J(name, ""), "preferences_pb")) {
            return invoke;
        }
        throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
