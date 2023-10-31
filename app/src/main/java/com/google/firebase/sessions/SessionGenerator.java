package com.google.firebase.sessions;

import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10842i;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10925n;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\n¨\u0006 "}, m508d2 = {"Lcom/google/firebase/sessions/SessionGenerator;", "", "", "generateSessionId", "Lcom/google/firebase/sessions/SessionDetails;", "generateNewSession", "", "collectEvents", "Z", "getCollectEvents", "()Z", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "Lkotlin/Function0;", "Ljava/util/UUID;", "uuidGenerator", "Lkotlin/jvm/functions/a;", "firstSessionId", "Ljava/lang/String;", "", "sessionIndex", "I", "<set-?>", "currentSession", "Lcom/google/firebase/sessions/SessionDetails;", "getCurrentSession", "()Lcom/google/firebase/sessions/SessionDetails;", "getHasGenerateSession", "hasGenerateSession", "<init>", "(ZLcom/google/firebase/sessions/TimeProvider;Lkotlin/jvm/functions/a;)V", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SessionGenerator {
    private final boolean collectEvents;
    private SessionDetails currentSession;
    @NotNull
    private final String firstSessionId;
    private int sessionIndex;
    @NotNull
    private final TimeProvider timeProvider;
    @NotNull
    private final InterfaceC10809a<UUID> uuidGenerator;

    @Metadata(m507k = 3, m506mv = {1, 7, 1}, m504xi = 48)
    /* renamed from: com.google.firebase.sessions.SessionGenerator$1 */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C85711 extends C10842i implements InterfaceC10809a<UUID> {
        public static final C85711 INSTANCE = new C85711();

        public C85711() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // kotlin.jvm.functions.InterfaceC10809a
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public SessionGenerator(boolean z, @NotNull TimeProvider timeProvider, @NotNull InterfaceC10809a<UUID> uuidGenerator) {
        C10843j.m430f(timeProvider, "timeProvider");
        C10843j.m430f(uuidGenerator, "uuidGenerator");
        this.collectEvents = z;
        this.timeProvider = timeProvider;
        this.uuidGenerator = uuidGenerator;
        this.firstSessionId = generateSessionId();
        this.sessionIndex = -1;
    }

    public /* synthetic */ SessionGenerator(boolean z, TimeProvider timeProvider, InterfaceC10809a interfaceC10809a, int i, C10839f c10839f) {
        this(z, timeProvider, (i & 4) != 0 ? C85711.INSTANCE : interfaceC10809a);
    }

    private final String generateSessionId() {
        String uuid = this.uuidGenerator.invoke().toString();
        C10843j.m431e(uuid, "uuidGenerator().toString()");
        String lowerCase = C10925n.m394i(uuid, "-", "").toLowerCase(Locale.ROOT);
        C10843j.m431e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @NotNull
    public final SessionDetails generateNewSession() {
        int i = this.sessionIndex + 1;
        this.sessionIndex = i;
        this.currentSession = new SessionDetails(i == 0 ? this.firstSessionId : generateSessionId(), this.firstSessionId, this.sessionIndex, this.timeProvider.currentTimeUs());
        return getCurrentSession();
    }

    public final boolean getCollectEvents() {
        return this.collectEvents;
    }

    @NotNull
    public final SessionDetails getCurrentSession() {
        SessionDetails sessionDetails = this.currentSession;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        C10843j.m424l("currentSession");
        throw null;
    }

    public final boolean getHasGenerateSession() {
        return this.currentSession != null;
    }
}
