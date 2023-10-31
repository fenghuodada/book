package androidx.datastore.core;

import androidx.datastore.core.C1096h;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "androidx.datastore.core.DataMigrationInitializer$Companion", m453f = "DataMigrationInitializer.kt", m452i = {0, 1}, m451l = {42, 57}, m450m = "runMigrations", m449n = {"cleanUps", "cleanUpFailure"}, m448s = {"L$0", "L$0"})
/* renamed from: androidx.datastore.core.f */
/* loaded from: classes.dex */
public final class C1093f<T> extends AbstractC10786c {

    /* renamed from: a */
    public Serializable f2801a;

    /* renamed from: b */
    public Iterator f2802b;

    /* renamed from: c */
    public /* synthetic */ Object f2803c;

    /* renamed from: d */
    public final /* synthetic */ C1096h.C1097a f2804d;

    /* renamed from: e */
    public int f2805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1093f(C1096h.C1097a c1097a, InterfaceC10772d<? super C1093f> interfaceC10772d) {
        super(interfaceC10772d);
        this.f2804d = c1097a;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f2803c = obj;
        this.f2805e |= Integer.MIN_VALUE;
        return C1096h.C1097a.m11199a(this.f2804d, null, null, this);
    }
}
