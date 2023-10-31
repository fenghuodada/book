package okhttp3.internal.http2;

import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0000R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001f"}, m508d2 = {"Lokhttp3/internal/http2/Settings;", "", "Lkotlin/p;", "clear", "", FacebookAdapter.KEY_ID, "value", "set", "", "isSet", "get", "size", "defaultValue", "getEnablePush", "getMaxConcurrentStreams", "getMaxFrameSize", "getMaxHeaderListSize", "other", "merge", "I", "", "values", "[I", "getHeaderTableSize", "()I", "headerTableSize", "getInitialWindowSize", "initialWindowSize", "<init>", "()V", "Companion", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Settings {
    public static final int COUNT = 10;
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values = new int[10];

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m508d2 = {"Lokhttp3/internal/http2/Settings$Companion;", "", "()V", "COUNT", "", "DEFAULT_INITIAL_WINDOW_SIZE", "ENABLE_PUSH", "HEADER_TABLE_SIZE", "INITIAL_WINDOW_SIZE", "MAX_CONCURRENT_STREAMS", "MAX_FRAME_SIZE", "MAX_HEADER_LIST_SIZE", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    public final void clear() {
        this.set = 0;
        int[] iArr = this.values;
        int length = iArr.length;
        C10843j.m430f(iArr, "<this>");
        Arrays.fill(iArr, 0, length, 0);
    }

    public final int get(int i) {
        return this.values[i];
    }

    public final boolean getEnablePush(boolean z) {
        return (this.set & 4) != 0 ? this.values[2] == 1 : z;
    }

    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        return (this.set & 128) != 0 ? this.values[7] : DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public final int getMaxConcurrentStreams() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int i) {
        return (this.set & 32) != 0 ? this.values[5] : i;
    }

    public final int getMaxHeaderListSize(int i) {
        return (this.set & 64) != 0 ? this.values[6] : i;
    }

    public final boolean isSet(int i) {
        return ((1 << i) & this.set) != 0;
    }

    public final void merge(@NotNull Settings other) {
        C10843j.m430f(other, "other");
        for (int i = 0; i < 10; i++) {
            if (other.isSet(i)) {
                set(i, other.get(i));
            }
        }
    }

    @NotNull
    public final Settings set(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.values;
            if (i < iArr.length) {
                this.set = (1 << i) | this.set;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }
}
