package com.google.firebase.sessions;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.time.C10931a;
import kotlin.time.C10933c;
import kotlin.time.EnumC10934d;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m508d2 = {"Lcom/google/firebase/sessions/Time;", "Lcom/google/firebase/sessions/TimeProvider;", "Lkotlin/time/a;", "elapsedRealtime-UwyO8pc", "()J", "elapsedRealtime", "", "currentTimeUs", "<init>", "()V", "Companion", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class Time implements TimeProvider {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long US_PER_MILLIS = 1000;

    @Metadata(m509d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m508d2 = {"Lcom/google/firebase/sessions/Time$Companion;", "", "()V", "US_PER_MILLIS", "", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    @Override // com.google.firebase.sessions.TimeProvider
    public long currentTimeUs() {
        return System.currentTimeMillis() * US_PER_MILLIS;
    }

    @Override // com.google.firebase.sessions.TimeProvider
    /* renamed from: elapsedRealtime-UwyO8pc  reason: not valid java name */
    public long mo13079elapsedRealtimeUwyO8pc() {
        int i = C10931a.f21479d;
        return C10933c.m357c(SystemClock.elapsedRealtime(), EnumC10934d.MILLISECONDS);
    }
}
