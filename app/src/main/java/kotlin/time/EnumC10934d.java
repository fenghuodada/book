package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = {ExperimentalTime.class})
/* renamed from: kotlin.time.d */
/* loaded from: classes3.dex */
public enum EnumC10934d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    @NotNull

    /* renamed from: a */
    public final TimeUnit f21489a;

    EnumC10934d(TimeUnit timeUnit) {
        this.f21489a = timeUnit;
    }
}
