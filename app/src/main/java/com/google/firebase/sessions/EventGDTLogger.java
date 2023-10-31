package com.google.firebase.sessions;

import android.util.Log;
import com.adcolony.sdk.C2362x3;
import com.google.android.datatransport.C6428a;
import com.google.android.datatransport.C6429b;
import com.google.android.datatransport.EnumC6464d;
import com.google.android.datatransport.InterfaceC6467g;
import com.google.android.exoplayer2.analytics.C6662w;
import com.google.firebase.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10910b;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m508d2 = {"Lcom/google/firebase/sessions/EventGDTLogger;", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "Lcom/google/firebase/sessions/SessionEvent;", "value", "", "encode", "sessionEvent", "Lkotlin/p;", "log", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/g;", "transportFactoryProvider", "Lcom/google/firebase/inject/Provider;", "<init>", "(Lcom/google/firebase/inject/Provider;)V", "Companion", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class EventGDTLogger implements EventGDTLoggerInterface {
    @NotNull
    private static final String AQS_LOG_SOURCE = "FIREBASE_APPQUALITY_SESSION";
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String TAG = "EventGDTLogger";
    @NotNull
    private final Provider<InterfaceC6467g> transportFactoryProvider;

    @Metadata(m509d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m508d2 = {"Lcom/google/firebase/sessions/EventGDTLogger$Companion;", "", "()V", "AQS_LOG_SOURCE", "", "TAG", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    public EventGDTLogger(@NotNull Provider<InterfaceC6467g> transportFactoryProvider) {
        C10843j.m430f(transportFactoryProvider, "transportFactoryProvider");
        this.transportFactoryProvider = transportFactoryProvider;
    }

    public final byte[] encode(SessionEvent sessionEvent) {
        String encode = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(sessionEvent);
        C10843j.m431e(encode, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d(TAG, "Session Event: ".concat(encode));
        byte[] bytes = encode.getBytes(C10910b.f21450b);
        C10843j.m431e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public void log(@NotNull SessionEvent sessionEvent) {
        C10843j.m430f(sessionEvent, "sessionEvent");
        this.transportFactoryProvider.get().mo6273a(AQS_LOG_SOURCE, new C6429b("json"), new C6662w(this)).m6272a(new C6428a(sessionEvent, EnumC6464d.DEFAULT), new C2362x3());
    }
}
