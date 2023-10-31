package androidx.datastore.preferences;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.C1092e;
import androidx.datastore.core.C1107q;
import androidx.datastore.core.InterfaceC1091d;
import androidx.datastore.core.InterfaceC1099i;
import androidx.datastore.core.handlers.C1098a;
import androidx.datastore.preferences.core.AbstractC1138d;
import androidx.datastore.preferences.core.C1135b;
import androidx.datastore.preferences.core.C1137c;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import kotlin.collections.C10752h;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10843j;
import kotlin.properties.InterfaceC10869a;
import kotlin.reflect.InterfaceC10891h;
import kotlinx.coroutines.InterfaceC10976e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.datastore.preferences.c */
/* loaded from: classes.dex */
public final class C1132c implements InterfaceC10869a<Context, InterfaceC1099i<AbstractC1138d>> {
    @NotNull

    /* renamed from: b */
    public final InterfaceC10820l<Context, List<InterfaceC1091d<AbstractC1138d>>> f2923b;
    @NotNull

    /* renamed from: c */
    public final InterfaceC10976e0 f2924c;
    @GuardedBy("lock")
    @Nullable

    /* renamed from: e */
    public volatile C1135b f2926e;
    @NotNull

    /* renamed from: a */
    public final String f2922a = SessionsSettings.SESSION_CONFIGS_NAME;
    @NotNull

    /* renamed from: d */
    public final Object f2925d = new Object();

    public C1132c(@NotNull InterfaceC10820l interfaceC10820l, @NotNull InterfaceC10976e0 interfaceC10976e0) {
        this.f2923b = interfaceC10820l;
        this.f2924c = interfaceC10976e0;
    }

    @Override // kotlin.properties.InterfaceC10869a
    /* renamed from: a */
    public final C1135b mo417a(Object obj, InterfaceC10891h property) {
        C1135b c1135b;
        Context thisRef = (Context) obj;
        C10843j.m430f(thisRef, "thisRef");
        C10843j.m430f(property, "property");
        C1135b c1135b2 = this.f2926e;
        if (c1135b2 == null) {
            synchronized (this.f2925d) {
                if (this.f2926e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    InterfaceC10820l<Context, List<InterfaceC1091d<AbstractC1138d>>> interfaceC10820l = this.f2923b;
                    C10843j.m431e(applicationContext, "applicationContext");
                    List<InterfaceC1091d<AbstractC1138d>> migrations = interfaceC10820l.invoke(applicationContext);
                    InterfaceC10976e0 scope = this.f2924c;
                    C1131b c1131b = new C1131b(applicationContext, this);
                    C10843j.m430f(migrations, "migrations");
                    C10843j.m430f(scope, "scope");
                    this.f2926e = new C1135b(new C1107q(new C1137c(c1131b), C10752h.m486c(new C1092e(migrations, null)), new C1098a(), scope));
                }
                c1135b = this.f2926e;
                C10843j.m433c(c1135b);
            }
            return c1135b;
        }
        return c1135b2;
    }
}
